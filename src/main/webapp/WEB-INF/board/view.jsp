<%@ page contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="../header.jsp" %>

      <div id="sub">
        <nav class="list">
          <%@ include file="./aside.jsp" %>

          <div id="board">
            <img src="/FChoice/img/about_title.jpg" alt="회사 소개"/>
      			<h3>카테고리!</h3>
      			<!-- 리스트 -->
      			<div class="bview">
				<form action="#" method="post">
					<table>
						<tr>
							<td>제목</td>
							<td><input type="text" name="subject" value="${view.fc_subject}" readonly />
							</td>
						</tr>
						
						<tr>
							<td>첨부파일</td>
							<td>
								<a href="#">${file.fcf_oldName}</a>
								<span>${file.fcf_download}회 다운로드</span>
							</td>
						</tr>
						
						<tr>
							<td>내용</td>
							<td>
								<textarea name="content" rows="20" readonly>${view.fc_content}</textarea>
							</td>
						</tr>
					</table>
					<div class="btns">
						<c:if test="${user.fc_id == view.fc_id}">
						<a href="/FChoice/board/delete.do?seq=${view.fc_seq}&pg=${pg}&cat=${cat}" class="cancel del">삭제</a>
						<a href="/FChoice/board/modify.do?seq=${view.fc_seq}&pg=${pg}&cat=${cat}" class="cancel mod">수정</a>
						</c:if>
						<a href="/FChoice/board/list.do?pg=${pg}&cat=${cat}" class="cancel">목록</a>
					</div>
				</form>
			</div>
			<!-- view 끝 -->
			
			<!-- 댓글리스트 -->
			<section class="comments">
				<h3>댓글목록</h3>
				
				<div class="comment">
					<c:forEach var="co" items="${comment}">
					<div class="co">
						<span>
							<span>${co.fc_id }</span>
							<span>${co.fc_rdate.substring(2,10) }</span>
						</span>
						<textarea>${co.fc_content}</textarea>
					</div>					
					<c:if test="${user.fc_id == co.fc_id}">
					<div>						
						<a href="/FChoice/board/delete.do?seq=${co.fc_seq}&pg=${pg}&cat=${cat}" class="del">삭제</a>				
					</div>
					</c:if>
					</c:forEach>
				</div>
				
				<c:if test="${ empty comment }">
				<p class="empty">
					등록된 댓글이 없습니다.
				</p>
				</c:if>
				
			</section>
			<c:if test="${user.fc_id != null}">
			<!-- 댓글쓰기 -->
			<section class="comment_write">
				<h3>댓글쓰기</h3>
				<div>
					<form action="/FChoice/board/comment.do" method="post">
						<input type="hidden" name="fc_seq" value="${view.fc_seq }" />
						<input type="hidden" name="pg" value="${pg }" />
						<input type="hidden" name="fc_comment" value="${view.fc_comment}" />
						<input type="hidden" name="cat" value="${cat}" />
						<textarea name="commenttxt" rows="5"></textarea>
						<div class="btns">
							<a href="#" class="cancel">취소</a>
							<input type="submit" class="submit" value="작성완료" />
						</div>
					</form>
				</div>
			</section>	
			</c:if>
      	  </div>
       </nav>
      </div>

<%@ include file="../footer.jsp" %>
