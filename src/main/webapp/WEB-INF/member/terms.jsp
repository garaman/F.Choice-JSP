<%@ page contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="../header.jsp" %>
  	<script>
	  	$(function(){	  		
	  		var id = "${id}";
	  		var btnNext = $('#terms .btnNext');
	  		var agree1 = $('#terms input[name=agree1]');
	  		var agree2 = $('#terms input[name=agree2]');
	  		
	  		
	  		btnNext.click(function(){
	  				
	  			var rs1 = agree1.is(':checked');
	  			var rs2 = agree2.is(':checked');
	  			
	  			if(rs1 && rs2){  				
  					location.href="/FChoice/member/register.do"; 				
	  			}else{
	  				alert("모든 항목에 동의 하세요.");
	  			}	  			
	  		});
	  	});
  	</script>
      <div id="terms">
			<section>
				<table>
					<caption>사이트 이용약관</caption>
					<tr>
						<td>
							<textarea readonly>${ tvo.fc_term }</textarea>
							<div>
								<label><input type="checkbox" name="agree1" />&nbsp;동의합니다.</label>
							</div>
						</td>
					</tr>
				</table>
			</section>
			<section>
				<table>
					<caption>개인정보 취급방침</caption>
					<tr>
						<td>
							<textarea readonly>${ tvo.fc_privacy }</textarea>
							<div>
								<label><input type="checkbox" name="agree2" />&nbsp;동의합니다.</label>
							</div>
						</td>
					</tr>
				</table>
			</section>
     

			<div>
				<a href="/FChoice/" class="btnCancel">취소</a>
				<a href="#" class="btnNext">다음</a>
			</div>

		</div>
  <%@ include file="../footer.jsp" %>
