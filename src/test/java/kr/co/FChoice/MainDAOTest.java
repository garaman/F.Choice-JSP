package kr.co.FChoice;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.FChoice.board.BoardDAO;
import kr.co.FChoice.member.MemberDAO;
import kr.co.FChoice.vo.BoardVO;
import kr.co.FChoice.vo.FileVO;
import kr.co.FChoice.vo.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class MainDAOTest {
	
	@Inject
	private BoardDAO dao;
	
	@Test
	public void test() {
		
		BoardVO mvo = new BoardVO();
		FileVO fvo = new FileVO();
		mvo.setFc_id("test");
		mvo.setFc_cat("test");
		mvo.setFc_subject("테스트");
		mvo.setFc_content("test@test.com");
		mvo.setFc_parent(0);
		mvo.setFc_ip("192.192.192.192");
		
		List<BoardVO> co = dao.commentview(15);
		for(BoardVO c :co) {
			System.out.println("content: "+c.getFc_content());
		}
		
		
	}

}
