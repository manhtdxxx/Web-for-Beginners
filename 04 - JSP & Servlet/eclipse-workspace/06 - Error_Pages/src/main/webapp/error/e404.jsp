<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String path = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ request.getContextPath();
	%>


	<h1>Rất tiếc, trang bạn truy cập không tồn tại!</h1>
	<%=path%>
	<br>
	<img alt="Error 404" src="../images/e404.png">
</body>
</html>