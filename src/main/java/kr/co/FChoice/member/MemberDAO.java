package kr.co.FChoice.member;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.co.FChoice.vo.MemberVO;
import kr.co.FChoice.vo.Member_sellerVO;
import kr.co.FChoice.vo.TermsVO;

@Repository
public class MemberDAO {
	
	@Inject
	SqlSessionTemplate mybatis;
	
	public TermsVO terms() {
		return mybatis.selectOne("mapper.mapper_member.terms");
	}
	
	public MemberVO login(MemberVO mvo) {
		return mybatis.selectOne("mapper.mapper_member.login", mvo);
	}
	public Member_sellerVO getCompany(MemberVO mvo) {
		return mybatis.selectOne("mapper.mapper_member.company", mvo);
	}
	
	public void register_user(MemberVO mvo) {
		mybatis.insert("mapper.mapper_member.insertUser", mvo);
	}
	
	public void register_company(Member_sellerVO msvo) {
		mybatis.insert("mapper.mapper_member.insertCompany", msvo);
	}

}
