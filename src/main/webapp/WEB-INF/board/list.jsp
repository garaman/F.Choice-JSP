<%@ page contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../header.jsp" %>

      <div id="sub">
        <nav class="list">
          <%@ include file="./aside.jsp" %>

          <div id="board">
            <img src="/FChoice/img/about_title.jpg" alt="회사 소개"/>
      		<h3>카테고리!</h3>
      			<!-- 리스트 -->
      			<div class="blist">
      				<table>
      					<tr>
      						<td>번호</td>
      						<td>제목</td>
      						<td>글쓴이</td>
      						<td>날짜</td>
      						<td>조회</td>
      					</tr>
      					<c:forEach var="l" items="${list}">
							<tr>
								<td>${l.total }</td>
								<td><a href="/FChoice/board/view.do?seq=${l.fc_seq}&pg=${page.pg}&cat=${cat}">${l.fc_subject }</a>&nbsp;[${l.fc_comment}]</td>
								<td>${l.fc_id }</td>
								<td>${l.fc_rdate.substring(2,10)}</td>
								<td>${l.fc_hit }</td>
							</tr>
						</c:forEach>
      				</table>
      			</div>
      			
      			<!-- 페이징 -->
      			<nav class="paging">
      				<span>
      				<a href="/FChoice/board/list.do?pg=${ page.pg-1 }&cat=${cat}" class="prev">이전</a>
						
							<c:forEach var="i" begin="${page.start_pg }" end="${page.end_pg }" step="1">
								<a href="/FChoice/board/list.do?pg=${ i }&cat=${cat}" class="num">${ i }</a>
							</c:forEach>
						
						<a href="/FChoice/board/list.do?pg=${ page.pg+1 }&cat=${cat}" class="next">다음</a>
      				</span>
      				<c:if test="${user.fc_id != null}">
      				<a href="/FChoice/board/write.do?cat=${cat}" class="btnWrite">글쓰기</a>	
      				</c:if>
      			</nav>
      			
      	  </div>
       </nav>
      </div>

<%@ include file="../footer.jsp" %>
