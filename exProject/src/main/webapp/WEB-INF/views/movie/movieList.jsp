<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    

<!DOCTYPE html>          
<html>                   
<head>                   
<meta charset="UTF-8"> 
<title>L I S T</title>     
<style> a{text-decoration-line: none;} a:visited {color:red;} a:hover{color:pink;}
</style>
<link href="../resources/css/movie/list.css" rel="stylesheet">
</head>                  
<body>
<jsp:include page="/WEB-INF/views/menu.jsp" />
	<div id="container">
	
		<div>
			<div>
				<h1 id="title_movielist">MOVIE LIST</h1>
				<!-- <img src="D:\github\exproject\exProject\src\main\webapp\resources\upload\090e08ea-c7d1-45e7-ad33-ab4d937943f4.jpg"> -->
			</div>
			<div>
				<button class="button_list" id="add_list" onclick="location.href='add'">영화등록</button>
			</div>
			<div>
				<form action="${pageContext.request.contextPath}/movie/list">
				
				<input type="hidden" name="searchWord" value="${searchWord}" />
				<!-- <script>
				document.querySelector('[name="searchWord"]').value = ${searchWord}
				</script> -->
				
				<select class="button_list" id="range_list" name="range" onchange="this.form.submit()">
					<option value="">정렬선택</option>
					<option value="point">평점순</option>
					<option value="title">제목순</option>
					<option value="regist">등록순</option>
					<option value="release">개봉일순</option>
				</select>
				<script type="text/javascript">
					if('${range}' != "") { document.querySelector('[name="range"]').value = '${range}'; }
				</script>
				</form>
			</div>
		</div>
		
		<div id="list">
		<!-- https://roqkffhwk.tistory.com/44 -->
				<c:forEach var="vo" items="${movieList}" varStatus="status">
					<div id="item" onclick="location.href='edit?movieId=${vo.movieId}&userId=${loginUser.userId}'">
						<%-- ${vo.movieTitle} : ${vo.moviePoint} --%> <%-- : ${vo.moviePoint} --%>
						<div><img src="${pageContext.request.contextPath}/resources/upload/${vo.fileId}" width="200" height="260px"></div>
						<%-- <td><a href="${pageContext.request.contextPath}/movie/edit.do?movieId=<c:out value="${vo.movieId}" />"><c:out value="${vo.movieId}" /></a></td> --%>
						<div id="title"><c:out value="${vo.movieTitle}" /></div>
						<div id="point">${vo.moviePoint}%</div>
					</div>
				</c:forEach>
				
			<div>	
				<c:if test="${movieList.size() == 0}">
					<p>검색 된 영화가 없습니다</p>
				</c:if>
			</div>

		</div>
	</div>
</body>                 
</html>                  

