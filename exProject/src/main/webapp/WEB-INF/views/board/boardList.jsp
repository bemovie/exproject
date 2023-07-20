<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>          
<html>                   
<head>                   
<meta charset="UTF-8"> 
<title>C O M M U N I T Y</title>     
<style> a{text-decoration-line: none;} a:visited {color:red;} a:hover{color:pink;}
</style>
<link href="../resources/css/board/list.css" rel="stylesheet">
</head>                  
<body>
<jsp:include page="/WEB-INF/views/menu.jsp" />
	<div id="container">
	
		<div>
			<div>
				<h1 id="title_boardlist">COMMNUNITY</h1>
			</div>
			<div>
				<button class="button_list" id="add_list" onclick="location.href='add'">글쓰기</button>
			</div>
			<form action="${pageContext.request.contextPath}/board/list">
				
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
			<div>
				<table>
					<thead>
						<tr>
							<th id="board_id">번호</th>	
							<th id="board_title">제목</th>
							<th id="board_writer">작성자</th>
							<th id="board_date">등록일시</th>
							<!-- <th>조회수</th> -->
						</tr>
					</thead>
					<tbody>
						<c:forEach var="vo" items="${boardList}"> <!-- 게시글 하나가 하나의 tr임 => 한줄 차지 -->
							<tr>
								<td>${vo.boardId}</td>
								<td>
									<a href="${pageContext.request.contextPath}/board/edit?boardId=${vo.boardId}">
									<strong><c:out value="${vo.boardTitle}" /></strong>
									</a>
								</td>
								<td><c:out value="${vo.boardWriter}" /></td>
								
								<td>
									<%-- <c:out value="${vo.boardDate}" /> --%>
									<fmt:formatDate value="${vo.boardDate}" pattern="yyyy/MM/dd HH:mm:ss"/>
									<!-- 등록일시가 2023/06/29 14:00:12 형식으로 출력되도록 변경 -->
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				
				
				
			</div>
		</div>
	</div>
</body>                 
</html>                  

