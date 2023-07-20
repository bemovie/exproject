<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    

<!DOCTYPE html>          
<html>                   
<head>                   
<meta charset="UTF-8"> 
<title>J O I N</title>     
<style> a{text-decoration-line: none;} a:visited {color:red;} a:hover{color:pink;}
</style>
<link href="../resources/css/join.css" rel="stylesheet">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">
</head>                  
<body>
<jsp:include page="/WEB-INF/views/menu.jsp" />
<div id="container">
	
	<div>
		<h1 id="title_join">USER JOIN</h1>
	</div>
	
	<form action="${pageContext.request.contextPath}/user/join" method="post">
	<section id="content_join">

		<table id="join">
			<tbody>
				<tr>
					<th><label for="userId"><i class="bi bi-person"> 회원ID</i></label></th>
					<td>
					<input class="input_join" type="text" id="userId" name="userId" value="" required />
					</td>
				</tr>
				<tr>
					<th><label for="userPass"><i class="bi bi-lock"> 비밀번호</i></label></th>
					<td>
					<input class="input_join" type="password" id="userPass" name="userPass" value="" required />
					</td>
				</tr>
				<tr>
					<th><label for="userName"><i class="bi bi-tag"> 이름</i></label></th>
					<td>
					<input class="input_join" type="text" id="userName" name="userName" value="" required />
					</td>
				</tr>
				<tr>
					<th><label for="email"><i class="bi bi-envelope"> 이메일</i></label></th>
					<td>
					<input class="input_join" type="text" id="email" name="email" value="" required />
					</td>
				</tr>
				<tr>
					<td colspan="2">
					<input class="input_join" id="submit_join" type="submit" value="가입" />
					</td>
				</tr>
			</tbody>
		</table>
			
<!-- 		<div class="submit">
			
		</div> -->
	</section>
	</form>
		
</div>		

</body>
</html>