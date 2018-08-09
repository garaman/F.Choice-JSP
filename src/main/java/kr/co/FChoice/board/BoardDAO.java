package kr.co.FChoice.board;

import java.util.List;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.co.FChoice.vo.BoardVO;
import kr.co.FChoice.vo.FileVO;
import kr.co.FChoice.vo.PageVO;


@Repository
public class BoardDAO {
	
	@Inject
	private SqlSessionTemplate mybatis;
	
	public List<BoardVO> list(BoardVO bvo) {
		return mybatis.selectList("mapper.mapper_board.list", bvo);
	}
	
	public int write(BoardVO bvo) {
		return mybatis.insert("mapper.mapper_board.write",bvo);
	}
	
	public void fileupload(FileVO fvo) {
		mybatis.insert("mapper.mapper_board.fileupload",fvo);
	}
	
	public int findseq() {
		return mybatis.selectOne("mapper.mapper_board.findseq");
	}
	

	
	public BoardVO view(int fc_seq) {
		return mybatis.selectOne("mapper.mapper_board.view", fc_seq);
	}
	
	public void hit(int fc_seq) {
		mybatis.update("mapper.mapper_board.hit", fc_seq);
	}
	
	public FileVO fileDown(int fc_seq) {
		return mybatis.selectOne("mapper.mapper_board.fileDown", fc_seq);
	}
	
	public void delete(int fc_seq) {
		mybatis.delete("mapper.mapper_board.delete", fc_seq);
	}
	
	public void modify(BoardVO bvo) {
		mybatis.update("mapper.mapper_board.modify", bvo);
	}
	
	public void comment(BoardVO bvo) {
		mybatis.update("mapper.mapper_board.commentupdate", bvo);
		mybatis.insert("mapper.mapper_board.comment",bvo);
	}
	
	public List<BoardVO> commentview(int fc_seq) {
		return mybatis.selectList("mapper.mapper_board.commentview", fc_seq);
	}
	public int commentrenew(int fc_seq) {
		return mybatis.selectOne("mapper.mapper_board.commentrenew", fc_seq);
	}
	
	public PageVO page(String pg, String fc_cat) {
		int limit = 0;
		int paging = 1;
		int pg_total = 0;
		int total = 0;
		int start_pg = 0 , end_pg = 0;
		int count_pg = 10;
		
		if(pg != null){
			paging = Integer.valueOf(pg);		
		}
		
		total = mybatis.selectOne("mapper.mapper_board.total",fc_cat);
		
		//하단 페이징 계산
		if(total%10 == 0){
			pg_total = total/10;
		}else{
			pg_total = total/10 + 1;
		}
		
		if(paging<=1){
			paging=1;
		}else if(paging >= pg_total){
			paging=pg_total;
		}	
		
		limit = (paging - 1) * 10;
		
		total -= limit;
		
		
		start_pg = ((paging-1)/count_pg) * count_pg + 1;
		end_pg = start_pg + count_pg - 1;
		
		if(end_pg > pg_total){
			end_pg = pg_total;
		}
		
		PageVO pvo = new PageVO();
		pvo.setLimit(limit);
		pvo.setStart_pg(start_pg);
		pvo.setEnd_pg(end_pg);
		pvo.setPg(paging);
		pvo.setTotal(total);
		
		return pvo;		
	}
}
