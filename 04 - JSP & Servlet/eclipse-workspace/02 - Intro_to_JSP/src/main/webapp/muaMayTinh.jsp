<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
	integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js"
	integrity="sha384-0pUGZvbkm6XF6gxjEnlmuGrJXVbNuzT9qBBavbLwCsOGabYfZo0T0to5eqruptLy"
	crossorigin="anonymous"></script>
</head>
<body>
	<div class="container">
		<h1>Chọn cấu hình máy tính bạn cần mua</h1>
		<hr />
		<form action="datMuaMayTinh.jsp">
			<h2>Processor</h2>
			<div class="form-check">
				<input class="form-check-input" type="radio" name="processor"
					value="Core I9" id="core-i9"> <label
					class="form-check-label" for="core-i9">Core I9</label>
			</div>
			<div class="form-check">
				<input class="form-check-input" type="radio" name="processor"
					value="Core I7" id="core-i7"> <label
					class="form-check-label" for="core-i7">Core I7</label>
			</div>
			<div class="form-check">
				<input class="form-check-input" type="radio" name="processor"
					value="Core I5" id="core-i5"> <label
					class="form-check-label" for="core-i5">Core I5</label>
			</div>

			<h2>RAM</h2>
			<div class="form-check">
				<input class="form-check-input" type="radio" name="ram"
					value="RAM 8GB" id="ram-8gb"> <label
					class="form-check-label" for="ram-8gb">RAM 8GB</label>
			</div>
			<div class="form-check">
				<input class="form-check-input" type="radio" name="ram"
					value="RAM 16GB" id="ram-16gb"> <label
					class="form-check-label" for="ram-16gb">RAM 16GB</label>
			</div>

			<h2>Monitor</h2>
			<div class="form-check">
				<input class="form-check-input" type="checkbox" name="monitor"
					value="Monitor" id="monitor"> <label
					class="form-check-label" for="monitor">Monitor</label>
			</div>

			<h2>Accessories</h2>
			<select class="form-select" multiple name="accessories"
				aria-label="Multiple select example">
				<option value="Camera">Camera</option>
				<option value="Printer">Printer</option>
				<option value="Scanner">Scanner</option>
			</select>

			<button type="submit" class="btn btn-primary mt-2">Buy</button>
		</form>
	</div>
</body>
</html>