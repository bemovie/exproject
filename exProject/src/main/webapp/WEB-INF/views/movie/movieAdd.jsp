<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    

<!DOCTYPE html>          
<html>                   
<head>                   
<meta charset="UTF-8"> 
<title>R E G I S T</title>     
<style> a{text-decoration-line: none;} a:visited {color:red;} a:hover{color:pink;}
</style>
<link href="../resources/css/add.css" rel="stylesheet">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">
<script src="../resources/js/preview.js"></script>
</head>                  
<body>
<jsp:include page="/WEB-INF/views/menu.jsp" />
<div id="container">
	
	<div>
		<h1 id="title_add">MOVIE REGIST</h1>
	</div>
	
	<form action="${pageContext.request.contextPath}/movie/add" method="post" enctype="multipart/form-data">
	<section id="content_add">
		<div class="add">
		
			<div id="poster">
			<%-- <img src="${pageContext.request.contextPath}/${mvo.fileId}" width="400px" height="520px"> --%>
			<img id="preview" width="400px" height="520px"/>
			</div>
			
			<div id="posterfile">
				<label for="file_add">
					<div>포스터 등록</div>
				</label>
				<input class="input_add" id="file_add" type="file" name="posterFile" onchange="readURL(this);">
			</div>
			
		</div>
			
		<div class="add">
			<div id="add_size">
				<div>
					<i class="bi bi-card-heading"> 영화제목</i>
					<input class="input_add" type="text" name="movieTitle" value="" />
				</div>
				<div>
					<i class="bi bi-calendar-check"> 개봉일</i>
					<input class="input_add" type="date" name="release" value="" />
				</div>
				<div>
					<i class="bi bi-globe"> 제작국가</i>
					<input class="input_add" type="text" name="nation" value="" />
				</div>
				<div>
					<i class="bi bi-film"> 장르</i>
					<input class="input_add" type="text" name="genre" value="" />
				</div>
				<div>
					<i class="bi bi-clock"> 러닝타임</i> 
					<input class="input_add" id="minute" type="number" name="runningtime" value="" placeholder="분"/>
				</div>
				<div>
					<i class="bi bi-r-circle"> 등급</i>
					<select class="input_add" id="select_add" name="grade">
						<option>전체 이용가</option>
						<option>12세 이용가</option>
						<option>15세 이용가</option>
						<option>청소년 이용불가</option>
					</select>
				</div>
				<div>
					<i class="bi bi-camera-reels"> 감독</i> 
					<input class="input_add" type="text" name="director" value="" />
				</div>
				<div>
					<i class="bi bi-people"> 출연진</i> 
					<input class="input_add" type="text" name="actor" value="" />
				</div>
				<div>
					<i class="bi bi-chat-square-text"> 줄거리</i><br> 
					<textarea class="input_add" name="outline" rows="3" cols="30"></textarea>
				</div>
				<div>
					<i class="bi bi-tv"> OTT</i><br>
					<label><input class="check_add" type="checkbox" name="ott" value="넷플릭스" />넷플릭스</label>
					<label><input class="check_add" type="checkbox" name="ott" value="티빙" /> 티빙</label>
					<label><input class="check_add" type="checkbox" name="ott" value="쿠팡플레이" /> 쿠팡플레이</label>
					<label><input class="check_add" type="checkbox" name="ott" value="웨이브" /> 웨이브</label>
					<label><input class="check_add" type="checkbox" name="ott" value="디즈니+" /> 디즈니+</label>
					<label><input class="check_add" type="checkbox" name="ott" value="왓챠" /> 왓챠</label>
					<label><input class="check_add" type="checkbox" name="ott" value="AppleTV" /> AppleTV</label>
					<label><input class="check_add" type="checkbox" name="ott" value="네이버시리즈온" /> 네이버시리즈온</label>
					<label><input class="check_add" type="checkbox" name="ott" value="U+모바일tv" /> U+모바일tv</label>
					<label><input class="check_add" type="checkbox" name="ott" value="씨네폭스" /> 씨네폭스</label>
				</div>
			
			</div>
		</div>
			
		<div class="submit">
			<input class="input_add" id="submit_add" type="submit" value="등록" />
		</div>
	</section>
	</form>
	
	<%-- <div>
		<form action="${pageContext.request.contextPath}/bbs/add.do" method="post" enctype="multipart/form-data">
			영화제목 <input type="text" name="movieTitle" value="" /> <br>
			개봉일 <input type="text" name="release" value="" /> <br>
			제작국가 <input type="text" name="nation" value="" /> <br>
			장르 <input type="text" name="genre" value="" /> <br>
			러닝타임 <input type="number" name="runningtime" value="" /> <br>
			등급 <input type="text" name="grade" value="" /> <br>
			감독 <input type="text" name="director" value="" /> <br>
			출연진 <input type="text" name="actor" value="" /> <br>
			줄거리 <input type="text" name="outline" value="" /> <br>
			OTT <input type="text" name="ott" value="" /> <br>
		<input type="submit" value="등록" />
		</form>
	</div> --%>
	
</div>		

</body>
</html>