<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
	integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
	crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js"
	integrity="sha384-0pUGZvbkm6XF6gxjEnlmuGrJXVbNuzT9qBBavbLwCsOGabYfZo0T0to5eqruptLy"
	crossorigin="anonymous"></script>
</head>
<body>
	<%
	String hoVaTen = request.getParameter("hoVaTen");
	String email = request.getParameter("email");
	String soLuong = request.getParameter("soLuong");

	int soLuongSanPham = 0;
	try {
		soLuongSanPham = Integer.parseInt(soLuong);
	} catch (Exception e) {

	}
	%>
	<h1>Xác nhận đặt hàng</h1>
	<p>
		Xin cảm ơn bạn <b><%=hoVaTen%></b> đã đặt <b><%=soLuongSanPham%></b> sản phẩm.<br /> Số tiền bạn
		cần thanh toán là <b> <%=soLuongSanPham * 5%>$
		</b>.<br /> Bạn sẽ nhận được thông báo qua email: <b><%=email%></b>.
	</p>
</body>
</html>