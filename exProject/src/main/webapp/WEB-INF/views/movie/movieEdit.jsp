<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    

<!DOCTYPE html>          
<html>                   
<head>                   
<meta charset="UTF-8"> 
<title>E D I T</title>     
<style> a{text-decoration-line: none;} a:visited {color:red;} a:hover{color:pink;}
</style>
<link href="../resources/css/movie/edit.css" rel="stylesheet">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">
</head>                  
<body>
<jsp:include page="/WEB-INF/views/menu.jsp" />
<div id="container">
	
		<div>
			<h1 id="title_info">MOVIE INFO</h1>
		</div>
		
		<section id="content_info">
			<div class="info">
				<div id="poster">
				<img src="${pageContext.request.contextPath}/resources/upload/${mvo.fileId}" width="400" height="520px">
				</div>
				<div id="point">
					${mvo.moviePoint}%
				</div>
				<div id="mypage_funclist">
					<form action="${pageContext.request.contextPath}/mypage/add" method="get">
						<input type="hidden" name="movieId" value="${mvo.movieId}" />
						<c:choose>
							<c:when test="${loginUser == null}">
								<input class="mypage_func" type="button" value="보고싶어요" onclick="location.href='${pageContext.request.contextPath}/user/login'" />
							</c:when>
							<c:otherwise>
								<input class="mypage_func" type="submit" value=${myList.movieTitle != null? '보고싶어요 취소' : '보고싶어요'} />						
							</c:otherwise>
						</c:choose>
					</form>
					<hr>
					<form action="${pageContext.request.contextPath}/mypage/add" method="get">
						<input type="hidden" name="movieId" value="${mvo.movieId}" />						
						평점 <input type="range" name="mypagePoint" min="0" max="100" value=${myList.mypagePoint >=0? '${myList.myapgePoint}' : '50'} oninput="document.getElementById('value1').innerHTML=this.value;"/>
       					<span id="value1">50</span>
						<input class="mypage_func" type="submit" value="등록" />
					</form>
				</div>
			</div>
			
			<div class="info">
				<div id="info_size">
					<div id="movietitle">
						${mvo.movieTitle}
					</div>
					<div>
						<i class="bi bi-calendar-check"> 개봉일</i>
						${mvo.release}
					</div>
					<div>
						<i class="bi bi-globe"> 제작국가</i>
						${mvo.nation}
					</div>
					<div>
						<i class="bi bi-film"> 장르</i>
						${mvo.genre}
					</div>
					<div>
						<i class="bi bi-clock"> 러닝타임</i> 
						${mvo.runningtime}분
					</div>
					<div>
						<i class="bi bi-r-circle"> 등급</i>
						${mvo.grade}</div>
					<div>
						<i class="bi bi-camera-reels"> 감독</i> 
						${mvo.director}
					</div>
					<div>
						<i class="bi bi-people"> 출연진</i> 
						${mvo.actor}
					</div>
					<div>
						<i class="bi bi-chat-square-text"> 줄거리</i> 
						${mvo.outline}
					</div>
					<div>
						<i class="bi bi-tv"> OTT</i>
						${mvo.ott}
					</div>
				
				</div>
			</div>
		
		</section>

</div>

</body>
</html>