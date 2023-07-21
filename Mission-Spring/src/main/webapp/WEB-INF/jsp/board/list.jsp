<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>전체게시글 조회</h2>
	<table>
		<tr>
			<th>No</th>
			<th>Title</th>
			<th>Writer</th>
			<th>Date</th>
		</tr>
		<c:forEach items="${ boardList }" var="board" >
		<tr>	
			<td>${ board.no }</td>
			<td>${ board.title }</td>
			<td>${ board.writer }</td>
			<td>${ board.regDate }</td>
		</tr>
		</c:forEach>	
	</table>
</body>
</html>