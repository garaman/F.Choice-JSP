<%@ page contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="../header.jsp" %>
<script>
	function company_view(type){
		var com = document.getElementById('company');
		if(type == '기업'){
			com.style.display = 'block';
		}else if(type == '일반'){
			com.style.display = 'none';
		}
	}
</script>

   <div id="member">
   <section class="register">
	<form action="/FChoice/member/register.do" method="POST">		
			<table>
				<tr>
					<td>회원구분</td>
					<td>
						<input type="radio" name="fc_seller" value="0" onclick="company_view('일반');" checked="checked">개인회원
						<input type="radio" name="fc_seller" value="1" onclick="company_view('기업');">기업회원
					</td>
				</tr>
			</table>
		<section>							
			<table>
				<caption>사이트 이용정보 입력</caption>							
				<tr>
					<td>아이디</td>
					<td>
						<input type="text" name="fc_id" placeholder="아이디를 입력" required />
						<span class="resultId"></span>
					</td>
				</tr>
				<tr>
					<td>비밀번호</td>
					<td><input type="password" name="fc_pw" placeholder="비밀번호를 입력" required /></td>
				</tr>
				<tr>
					<td>비밀번호확인</td>
					<td><input type="password" name="fc_pw2" placeholder="비밀번호를 확인" required /></td>
				</tr>
			</table>
		</section>
		<section id="company" style="display:none;">
			<table>
				<caption>기업정보 입력</caption>							
				<tr>
					<td>회사명</td>
					<td>
						<input type="text" name="fcs_company" placeholder="회사명를 입력" />
						<span class="resultId"></span>
					</td>
				</tr>
				<tr>
					<td>대표자명</td>
					<td><input type="text" name="fcs_ceo"  placeholder="대표자를 입력" /></td>
				</tr>
				<tr>
					<td>사업자등록번호</td>
					<td><input type="text" name="fcs_corp_reg" placeholder="사업자 등록번호" /></td>
				</tr>
				<tr>
					<td>통신판매신고번호</td>
					<td><input type="text" name="fcs_online_reg"  placeholder="통신판매신고번호"  /></td>
				</tr>
				<tr>
					<td>팩스 전화번호</td>
					<td><input type="text" name="fcs_fax"  placeholder="-포함 13자리를 입력" maxlength="13"  /></td>
				</tr>
				<tr>
					<td>회사 전화번호</td>
					<td><input type="text" name="fcs_tel"  placeholder="-포함 13자리를 입력" maxlength="13"  /></td>
				</tr>
			</table>
		</section>
		<section>
			<table>
				<caption>개인정보 입력</caption>
				<tr>
					<td>이름</td>
					<td><input type="text" name="fc_name" placeholder="이름을 입력" required /></td>
				</tr>							
				<tr>
					<td>EMAIL</td>
					<td><input type="email" name="fc_email" placeholder="이메일을 입력" 	required /></td>
				</tr>
				<tr>
					<td>휴대폰</td>
					<td><input type="text" name="fc_hp" placeholder="-포함 13자리를 입력" maxlength="13" required /></td>
				</tr>
				<tr>
					<td>주소</td>					
					<td>
						<div>
							<input type="text" name="fc_zip" id="zip" placeholder="우편번호" readonly />
							<button type="button" class="btnFind">주소검색</button>
						</div>
						<div>
							<input type="text" name="fc_addr1" id="addr1" size="50" placeholder="주소를 검색하세요." readonly />
						</div>
						<div>
							<input type="text" name="fc_addr2" id="addr2" size="50" placeholder="상세주소를 입력하세요." />
						</div>
					</td>
				</tr>
			</table>
		</section>
		<div>
			<a href="/FChoice/index.do" class="cancel">취소</a>
			<input type="submit" class="join" value="회원가입" />
		</div>
	</form>
</section>
	</div>


<%@ include file="../footer.jsp" %>
