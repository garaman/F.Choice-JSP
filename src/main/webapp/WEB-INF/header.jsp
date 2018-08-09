<%@ page contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
  <head>
    <meta charset="utf-8">
    <title>F.Choice</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="/FChoice/js/slider.js"></script>
    <link rel="stylesheet" href="/FChoice/css/indexStyle.css"/>
    <link rel="stylesheet" href="/FChoice/css/boardStyle.css"/>
    <link rel="stylesheet" href="/FChoice/css/memberStyle.css"/>
    <link rel="stylesheet" href="/FChoice/css/sub.css"/>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.0/css/all.css" integrity="sha384-lKuwvrZot6UHsBSfcMvOkWwlCMgc0TaWr+30HWe3a4ltaBwTZhyTEggF5tJv8tbt" crossorigin="anonymous">
  </head>
  <body>
    <div id="IndexView">
      <header>
        <a href="/FChoice/index.do" class="logo"><img src="/FChoice/img/logo2.jpg" alt="로고"></a>
        <c:choose>
        	<c:when test="${Glogin == false}">
		        <p>
		          <a href="/FChoice/sub/userinfo.do">${user.fc_id}${company.fcs_id}</a>        
		          <a href="/FChoice/member/login.do">로그인</a>
		          <a href="/FChoice/member/terms.do">회원가입</a>
		          <a href="/FChoice/sub/guid.do">고객센터</a>
		        </p>
		    </c:when>
		    <c:when test="${Glogin == true}">
		    	<c:choose>
                  <c:when test="${user.fc_seller == 0 }">
                  <p>       
                    <a href="/FChoice/sub/mypage.do">마이페이지</a>
                    <a href="/FChoice/sub/cart.do">장바구니</a>
                    <a href="/FChoice/sub/guid.do">고객센터</a>
                    <a href="/FChoice/member/logout.do">로그아웃</a>
                  </p>
               </c:when>
               <c:when test="${user.fc_seller == 1 }">
                  <p>       
                    <a href="/FChoice/sub/mypage.do">마이페이지</a>
                    <a href="/FChoice/sub/cart.do">상품관리</a>
                    <a href="/FChoice/sub/guid.do">고객센터</a>
                    <a href="/FChoice/member/logout.do">로그아웃</a>
                  </p>
               </c:when>
               </c:choose>
		    </c:when>
        </c:choose>
        <ul class="menu">
          <li><a href="/FChoice/index.do">Home</a></li>
          <li><a href="/FChoice/sub/aboutus.do">About Us</a></li>
          <li><a href="/FChoice/sub/products.do">Products</a></li>
        </ul>
      </header>