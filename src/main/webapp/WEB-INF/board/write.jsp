<%@ page contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="../header.jsp" %>

      <div id="sub">
        <nav class="list">
          <%@ include file="./aside.jsp" %>

          <div id="board">
            <img src="/FChoice/img/about_title.jpg" alt="회사 소개"/>
      			<h3>카테고리!</h3>
      			<!-- 리스트 -->
      			<div class="write">
				<form action="/FChoice/board/write.do" method="post" enctype="multipart/form-data">
				<input type="hidden" name="cat" value="${cat}">
					<table>
						<tr>
							<td>제목</td>
							<td><input type="text" name="fc_subject" placeholder="제목을 입력하세요." required /></td>
						</tr>				
						<tr>
							<td>내용</td>
							<td>
								<textarea name="fc_content" rows="20" required></textarea>
							</td>
						</tr>
						<tr>
							<td>첨부</td>
							<td>
								<input type="file" name="fileName" />
							</td>
						</tr>
					</table>
					<div class="btns">
						<a href="/FChoice/board/list.do?cat=${cat}" class="cancel">취소</a>
						<input type="submit" class="submit" value="작성완료" />
					</div>
				</form>
			</div>
      		</div>
       </nav>
      </div>

<%@ include file="../footer.jsp" %>
