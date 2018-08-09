<%@ page contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="../header.jsp" %>

      <div id="member">
  			<section class="login">
  				<form action="/FChoice/member/login.do" method="post">
  					<table>
  						<tr>
  							<td><img src="/FChoice/img/login_ico_id.png" alt="아이디" /></td>
  							<td><input type="text" name="fc_id" required placeholder="아이디 입력" autocomplete="off" /></td>
  						</tr>
  						<tr>
  							<td><img src="/FChoice/img/login_ico_pw.png" alt="비밀번호" /></td>
  							<td><input type="password" name="fc_pw" required placeholder="비밀번호 입력" /></td>
  						</tr>
  					</table>
  					<input type="submit" class="btnLogin" value="로그인" />
  				</form>

  				<div class="info">
  					<h3>회원로그인 안내</h3>
  					<p>아직 회원이 아니시면 회원으로 가입하세요.</p>
  					<div><a href="/FChoice/member/terms.do">회원가입</a></div>
  				</div>
  			</section>
	  	</div>

 <%@ include file="../footer.jsp" %>
