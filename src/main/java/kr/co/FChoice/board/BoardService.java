package kr.co.FChoice.board;

import java.util.List;

import kr.co.FChoice.vo.BoardVO;
import kr.co.FChoice.vo.FileVO;
import kr.co.FChoice.vo.PageVO;


public interface BoardService {
	
	public List<BoardVO> list(BoardVO bvo);
	
	public int renew(int seq);
	
	public int write(BoardVO bvo);
	
	public void fileupload(FileVO fvo);
	
	public FileVO fileDown(int parent);
	
	public int findseq();
	
	public PageVO page(String pg,String cat);
	
	public BoardVO view(int seq);
	
	public void hit(int seq);
	
	public void delete(int seq);
	
	public void modify(BoardVO mo);
	
	public void comment(BoardVO co);
	
	public List<BoardVO> commentview(int seq);

}
