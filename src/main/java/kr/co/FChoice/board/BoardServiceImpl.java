package kr.co.FChoice.board;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.FChoice.vo.BoardVO;
import kr.co.FChoice.vo.FileVO;
import kr.co.FChoice.vo.PageVO;



@Service
public class BoardServiceImpl implements BoardService{
	
	@Inject
	private BoardDAO dao;
	
	@Override
	public List<BoardVO> list(BoardVO bvo) {
		return dao.list(bvo);
	}

	@Override
	public int write(BoardVO bvo) {
		return dao.write(bvo);		
	}

	@Override
	public void fileupload(FileVO fvo) {
		dao.fileupload(fvo);		
	}

	@Override
	public int findseq() {
		return dao.findseq();		
	}

	@Override
	public PageVO page(String pg,String cat) {		
		return dao.page(pg,cat);
	}

	@Override
	public BoardVO view(int seq) {
		return dao.view(seq);
	}

	@Override
	public void hit(int seq) {
		dao.hit(seq);		
	}

	@Override
	public FileVO fileDown(int parent) {
		return dao.fileDown(parent);
	}

	@Override
	public void delete(int seq) {
		dao.delete(seq);		
	}

	@Override
	public void modify(BoardVO mo) {
		dao.modify(mo);		
	}

	@Override
	public void comment(BoardVO co) {
		dao.comment(co);	
	}

	@Override
	public List<BoardVO> commentview(int seq) {
		return dao.commentview(seq);
	}

	@Override
	public int renew(int seq) {
		return dao.commentrenew(seq);
	}

	
	

}
