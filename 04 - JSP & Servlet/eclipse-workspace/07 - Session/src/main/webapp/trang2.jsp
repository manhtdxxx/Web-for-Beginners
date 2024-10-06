<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String username = (String) session.getAttribute("username");
	%>

	Xin chào:
	<%=username%>
	<hr />
	<h1>ĐÂY LÀ TRANG 2</h1>
	<a href="trang1.jsp">Trang 1</a>
</body>
</html>