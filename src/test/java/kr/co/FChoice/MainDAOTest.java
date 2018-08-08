package kr.co.FChoice;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.FChoice.member.MemberDAO;
import kr.co.FChoice.vo.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class MainDAOTest {
	
	@Inject
	private MemberDAO dao;
	
	@Test
	public void test() {
		
		MemberVO mvo = new MemberVO();
		
		mvo.setFc_id("test");
		mvo.setFc_pw("123123");
		mvo.setFc_name("테스트");
		mvo.setFc_email("test@test.com");
		mvo.setFc_hp("123-1234-1234");
		mvo.setFc_ip("192.192.192.192");
		
		dao.register_user(mvo);
	}

}
