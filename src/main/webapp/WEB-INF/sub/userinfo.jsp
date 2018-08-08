<%@ page contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="../header.jsp" %>

      <div id="sub">
        <nav class="list">
          <aside>
            <ul>
              <li><i class="fas fa-bars"></i><a href="#">고객센터</a></li>
              <li><a href="#">쇼핑가이드</a></li>
              <li><a href="#">AS안내</a></li>
              <li><a href="#">배송안내</a></li>
              <li><a href="#">자주하는 질문</a></li>
              <li><a href="#">문의 사항</a></li>
            </ul>
          </aside>

          <div id="board">
            <img src="/FChoice/img/about_title.jpg" alt="회사 소개"/>
      			<h3>글목록</h3>
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
      					<tr>
      						<td>1</td>
      						<td><a href="#">테스트 제목입니다.</a>&nbsp;[3]</td>
      						<td>홍길동</td>
      						<td>18-03-01</td>
      						<td>12</td>
      					</tr>
      				</table>
      			</div>
      			<!-- 페이징 -->
      			<nav class="paging">
      				<span>
      				<a href="#" class="prev">이전</a>
      				<a href="#" class="num">1</a>
      				<a href="#" class="next">다음</a>
      				</span>
      			</nav>
      			<a href="#" class="btnWrite">글쓰기</a>
      		</div>
       </nav>
      </div>

<%@ include file="../footer.jsp" %>
