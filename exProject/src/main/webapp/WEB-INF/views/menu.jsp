<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<link href="${pageContext.request.contextPath}/resources/css/menu.css" rel="stylesheet">



<nav id="top">
	<ul id="main-nav">
	<!-- <a class="menu" href="#">❑</a> -->
		<li>
		    <header id="hero" onclick="location.href='<%=request.getContextPath()%>/home'">
		        <img id="icon" src="${pageContext.request.contextPath}/resources/images/Film-icon1.png">
		        <h1 id="logotitle">마<span class="small">이&nbsp;</span>무<span class="small">비&nbsp;</span>리<span class="small">뷰</span></h1>
		        <!-- <h3>my movie review</h3> -->
		    </header> 
		</li>
		<li>| <a href="<%=request.getContextPath()%>/movie/list">L&nbsp;&nbsp;I&nbsp;&nbsp;S&nbsp;&nbsp;T</a> |</li>				
		<li>| <a href="#review">REVIEW</a> |</li>
		<li>| <a href="<%=request.getContextPath()%>/board/list">COMMUNITY</a> |</li>
	</ul>
	
	<ul id="sub-nav">
	<c:if test="${loginUser!=null}">
		<li id="welcome"><strong>${loginUser.userName}</strong> 님 환영합니다.</li>
		<li><a class="login" href="${pageContext.request.contextPath}/user/logout">로그아웃</a></li>
	    <li><a class="join" href="${pageContext.request.contextPath}/mypage/list">마이페이지</a></li>
	</c:if>
	<c:if test="${loginUser==null}">   
	    <li><a class="login" href="${pageContext.request.contextPath}/user/login">로그인</a></li>
	    <li><a class="join" href="${pageContext.request.contextPath}/user/join">회원가입</a></li>
	</c:if> 
	</ul> 

</nav>