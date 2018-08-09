package kr.co.FChoice.member;

import kr.co.FChoice.vo.MemberVO;
import kr.co.FChoice.vo.Member_sellerVO;
import kr.co.FChoice.vo.TermsVO;

public interface MemberService {
	
	public TermsVO terms();
	public MemberVO login(MemberVO mvo);
	public Member_sellerVO getCompany(MemberVO mvo);
	public void register_user(MemberVO mvo);
	public void register_company(Member_sellerVO msvo);

}
