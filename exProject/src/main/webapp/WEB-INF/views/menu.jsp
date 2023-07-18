<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<link href="http://localhost:8090/mmr/resources/css/menu.css" rel="stylesheet">



<nav id="top">
	<ul id="main-nav">
	<!-- <a class="menu" href="#">❑</a> -->
		<li>
		    <header class="hero">
		        <img class="icon" src="http://localhost:8090/mmr/resources/images/Film-icon1.png">
		        <a class="logotitle" href="<%=request.getContextPath()%>/home"><h1>마<span class="small">이&nbsp;</span>무<span class="small">비&nbsp;</span>리<span class="small">뷰</span></h1></a>
		        <!-- <h3>my movie review</h3> -->
		    </header> 
		</li>
		<li>| <a href="<%=request.getContextPath()%>/movie/list">L&nbsp;&nbsp;I&nbsp;&nbsp;S&nbsp;&nbsp;T</a> |</li>				
		<li>| <a href="#review">REVIEW</a> |</li>
		<li>| <a href="#news">COMMUNITY</a> |</li>
	</ul>
	
	<ul id="sub-nav">   
	    <li><a class="login" href="#login">로그인</a></li>
	    <li><a class="join" href="#join">회원가입</a></li> 
	</ul> 

</nav>