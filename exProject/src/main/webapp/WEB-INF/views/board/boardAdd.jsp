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
<link href="../resources/css/board/add.css" rel="stylesheet">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">
<script src="../resources/js/preview.js"></script>
</head>                  
<body>
<jsp:include page="/WEB-INF/views/menu.jsp" />
<div id="container">
	
	<div>
		<h1 id="title_add">BOARD REGIST</h1>
	</div>
	
	<form action="${pageContext.request.contextPath}/board/add" method="post">
	<section id="content_add">
		<div class="add">
			<div id="add_size">
				<div>
					제목 | 
					<input class="input_add" type="text" name="boardTitle" value="" />
				</div>
				<div>
					비공개여부 | 
					<input type="radio" name="othbcAt" value="Y">예
					<input type="radio" name="othbcAt" value="N" checked="checked">아니오
				</div>
				<div>
					구분 |
					<select class="button_list" id="range_list" name="boardCategory">
						<option value="talk">수다</option>
						<option value="review">리뷰</option>
						<option value="info">정보</option>
						<option value="news">뉴스</option>
						<option value="goods">굿즈</option>
					</select>
				</div>
				<div>
					<span id="content">내용 |</span>
					<textarea class="input_add" name="boardContent" rows="10" cols="30"></textarea>
				</div>
			</div>
		</div>
			
		<div class="submit">
			<input class="input_add" id="submit_add" type="submit" value="등록" />
			<input class="input_add" id="submit_add" type="button" value="취소" onclick="location.href='${pageContext.request.contextPath}/board/list'"/>
		</div>
	</section>
	</form>
	
</div>		

</body>
</html>