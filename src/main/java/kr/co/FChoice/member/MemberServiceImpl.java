package kr.co.FChoice.member;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.FChoice.vo.MemberVO;
import kr.co.FChoice.vo.Member_sellerVO;
import kr.co.FChoice.vo.TermsVO;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Inject
	MemberDAO dao;

	@Override
	public TermsVO terms() {
		return dao.terms();
	}

	@Override
	public void register_user(MemberVO mvo) {
		dao.register_user(mvo);
	}

	@Override
	public void register_company(Member_sellerVO msvo) {
		dao.register_company(msvo);
	}

	@Override
	public MemberVO login(MemberVO mvo) {
		return dao.login(mvo);
	}

	@Override
	public Member_sellerVO getCompany(MemberVO mvo) {
		return dao.getCompany(mvo);
	}

}
