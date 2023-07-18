<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>영화 리뷰 커뮤니티 - 마무리 : My Movie Library</title>
	<link href="resources/css/home.css" rel="stylesheet">
</head>
<body>
<jsp:include page="/WEB-INF/views/menu.jsp" />

<div class="container">
	<div id="contents">
	
    	<div id="box">
	        
	        <div id="slide">
		        <div id="poster_top10">
		        
		            <c:forEach var="vo" items="${movieList}" varStatus="status">
						<div class="movie_wrapper" onclick="location.href='movie/edit?movieId=${vo.movieId}'">
							<%-- ${vo.movieTitle} : ${vo.moviePoint} --%> <%-- : ${vo.moviePoint} --%>
							<div><img class="poster" src="http://localhost:8090/mmr/${vo.fileId}"></div>
							<%-- <td><a href="${pageContext.request.contextPath}/movie/edit.do?movieId=<c:out value="${vo.movieId}" />"><c:out value="${vo.movieId}" /></a></td> --%>
							<div class="title"><c:out value="${vo.movieTitle}" /></div>
							<div class="point">${vo.moviePoint}%</div>
						</div>
					</c:forEach>

		        </div>
	        </div>
	        	        
	       	<div class="button">
	            <button id="back">〈</button>
	        </div>
	        <div class="button">
	            <button id="next">〉</button>
	       	</div>
	       	
       	</div> 
        
        <div id="search">
            <form name="해당 폼의 이름" action="값을 보낼 주소" method="post">
            <input type="search" placeholder="검색어 입력">
            <!-- <img src="images/search.png"> -->
            </form>
        </div>

        <div class="total">
            <p><i>Total <span class="big" data-count="${moiveCount}">0</span> Movies , <span class="big" data-count="124">0</span> Reviews</i></p>
        </div>
        
        <br><br><br><br><br><br><br><br><br><br><br><br><br><br>
        
    </div>
</div>

    <footer>
        <p>
            <span>이메일 : bemovie87@naver.com</span><br/>
            <span>Copyright 2023. bemoive. All Rights Reserved.</span>
        </p>
    </footer>

    <!-- 이미지 슬라이드 -->
    <script src="resources/js/slide.js"></script>

    <!-- 숫자 올라감 -->
    <script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.6.0.min.js"></script>
    <script src="resources/js/count.js"></script>

    <!--
    <script>
        var burger = $('.menu');
        burger.each(function(index){
        var $this = $(this);
  
         $this.on('click', function(e){
         e.preventDefault();
         $(this).toggleClass('active-' + (index+1));
         })
        });
    </script>
    -->

</body>
</html>