<%@ page contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="../header.jsp" %>

      <div id="sub">
        <nav class="list">
          <aside>
            <ul>
              <li><i class="fas fa-bars"></i><a href="#">마이페이지</a></li>
              <li><a href="#">장바구니</a></li>
              <li><a href="#">주문배송조회</a></li>
              <li><a href="#">회원정보</a></li>
              <li><a href="#">비밀번호변경</a></li>
              <li><a href="#">회원탈퇴</a></li>
            </ul>
          </aside>
          <section class="cart">
                <nav>
                  <h1>장바구니</h1>
                </nav>
                <section>
                  <form action="#">
                    <table>
                      <thead>
                        <tr>
                          <th><input type="checkbox" name="all"></th>
                          <th>상품명</th>
                          <th>총수량</th>
                          <th>판매가</th>
                          <th>포인트</th>
                          <th>배송비</th>
                          <th>소계</th>
                        </tr>
                      </thead>
                      <tbody>
                        <tr class="empty">
                          <td colspan="7">장바구니에 상품이 없습니다.</td>
                        </tr>
                        <tr>
                          <td><input type="checkbox" name=""></td>
                          <td>
                            <article>
                              <a href="#"><img src="/FChoice/img/package_1.jpg" alt=""></a>
                              <div>
                                <h2><a href="#">TH-블락체크 셔츠-그레이2 [면세]</a></h2>
                                <p>SIZE:M / COLOR:블루 1개</p>
                              </div>
                            </article>
                          </td>
                          <td>1</td>
                          <td>27,000</td>
                          <td>270</td>
                          <td>무료배송</td>
                          <td>27,000</td>
                        </tr>
                        <tr>
                          <td><input type="checkbox" name=""></td>
                          <td>
                            <article>
                              <a href="#"><img src="/FChoice/img/package_1.jpg" alt=""></a>
                              <div>
                                <h2><a href="#">TH-블락체크 셔츠-그레이2 [면세]</a></h2>
                                <p>SIZE:M / COLOR:블루 1개</p>
                              </div>
                            </article>
                          </td>
                          <td>1</td>
                          <td>27,000</td>
                          <td>270</td>
                          <td>무료배송</td>
                          <td>27,000</td>
                        </tr>
                      </tbody>
                    </table>
                    <input type="button" name="del" value="선택삭제">
                  </form>
                </section>

                <div class="order">
                  <h2>전체합계</h2>
                  <table border="0">
                    <tr>
                      <td>상품수</td>
                      <td>1</td>
                    </tr>
                    <tr>
                      <td>상품금액</td>
                      <td>27,000</td>
                    </tr>
                    <tr>
                      <td>할인금액</td>
                      <td>-1,000</td>
                    </tr>
                    <tr>
                      <td>배송비</td>
                      <td>0</td>
                    </tr>
                    <tr>
                      <td>전체주문금액</td>
                      <td>26,000</td>
                    </tr>
                    <tr>
                      <td>포인트</td>
                      <td>260</td>
                    </tr>
                  </table>
                  <input type="button" name="" value="주문하기">
                </div>
          </section>
        </nav>
      </div>

<%@ include file="../footer.jsp" %>
