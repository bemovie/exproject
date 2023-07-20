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
<link href="../resources/css/board/edit.css" rel="stylesheet">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">
</head>                  
<body>
<jsp:include page="/WEB-INF/views/menu.jsp" />
<div id="container">
	
	<div>
		<h1 id="title_info">BOARD INFO</h1>
	</div>
	
	<div>
		<form action="${pageContext.request.contextPath}/board/edit" method="post">
			<section id="content_info">
				<div class="info">
					<div id="info_size">
							<input type="hidden" name="boardId" value="${bvo.boardId}" />
						<div>
							제목 | 
							<input class="input_info" type="text" name="boardTitle" value="${bvo.boardTitle}" />
						</div>
						<div>
							구분 |
							<select class="button_list" id="range_list" name="boardCategory">
								<option value="talk" ${bvo.boardCategory == 'talk'? 'selected' : ''}>수다</option>
								<option value="review" ${bvo.boardCategory == 'review'? 'selected' : ''}>리뷰</option>
								<option value="info" ${bvo.boardCategory == 'info'? 'selected' : ''}>정보</option>
								<option value="news" ${bvo.boardCategory == 'news'? 'selected' : ''}>뉴스</option>
								<option value="goods" ${bvo.boardCategory == 'goods'? 'selected' : ''}>굿즈</option>
							</select>
						</div>
						<div>
							<span id="content">내용 |</span>
							<textarea class="input_info" name="boardContent" rows="10" cols="30"><c:out value="${bvo.boardContent}" /></textarea>
						</div>
					</div>
				</div>
					
				<div class="submit">
					<input class="input_info" id="submit_info" type="submit" value="수정" />
					<input class="input_info" id="submit_info" type="button" value="삭제" onclick="location.href='${pageContext.request.contextPath}/board/del?boardId=${bvo.boardId}'"/>
					<input class="input_info" id="submit_info" type="button" value="취소" onclick="location.href='${pageContext.request.contextPath}/board/list'"/>
				</div>
			</section>
		</form>
	</div>
</div>

</body>
</html>