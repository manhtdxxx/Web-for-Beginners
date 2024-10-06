<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product</title>
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
<style type="text/css">
.rq {
	color: red;
}
</style>
<script type="text/javascript">
	function my_submit() {
		// Initialize error variable
		let error = "";

		// Retrieve values
		let maSanPham = document.getElementById("maSanPham").value;
		let giaBan = parseFloat(document.getElementById("giaBan").value);

		// Validate input
		if (maSanPham.length == 0) {
			error = "Bạn phải nhập mã sản phẩm!";
		}
		if (isNaN(giaBan) || giaBan <= 0) {
			let error_giaBan = document.getElementById("error_giaBan");
			error_giaBan.innerHTML = "<span class='rq'>Bạn cần nhập giá bán hợp lệ!</span>";
		}

		// If there are errors, display them
		if (error.length > 0) {
			alert(error);
			return;
		} else {
			// Submit the form if no errors
			let my_form = document.getElementById("my-form");
			my_form.submit();
		}
	}
</script>
</head>

<body>
	<%
	String e_maSanPham = request.getAttribute("e_maSanPham") + "";
	e_maSanPham = e_maSanPham.equals("null") ? "" : e_maSanPham;

	String value_maSanPham = request.getAttribute("value_maSanPham") + "";
	value_maSanPham = value_maSanPham.equals("null") ? "" : value_maSanPham;

	String value_tenSanPham = request.getAttribute("value_tenSanPham") + "";
	value_tenSanPham = value_tenSanPham.equals("null") ? "" : value_tenSanPham;

	String value_giaBan = request.getAttribute("value_giaBan") + "";
	value_giaBan = value_giaBan.equals("null") ? "" : value_giaBan;

	String value_giaNhap = request.getAttribute("value_giaNhap") + "";
	value_giaNhap = value_giaNhap.equals("null") ? "" : value_giaNhap;

	String value_hanSuDung = request.getAttribute("value_hanSuDung") + "";
	value_hanSuDung = value_hanSuDung.equals("null") ? "" : value_hanSuDung;

	String value_vat = request.getAttribute("value_vat") + "";
	value_vat = value_vat.equals("null") ? "" : value_vat;

	String value_moTa = request.getAttribute("value_moTa") + "";
	value_moTa = value_moTa.equals("null") ? "" : value_moTa;
	%>

	<div class="container mt-3">
		<form class="row g-3 needs-validation" action="save-product"
			method="get" id="my-form">
			<div class="row mt-1">
				<div class="col-6">
					<label for="maSanPham" class="form-label">Mã sản phẩm<span
						class="rq">*</span></label> <input type="text" class="form-control"
						id="maSanPham" name="maSanPham" value="<%=value_maSanPham%>"
						required>
					<div class="rq"><%=e_maSanPham%></div>
				</div>
				<div class="col-6">
					<label for="tenSanPham" class="form-label">Tên sản phẩm<span
						class="rq">*</span></label> <input type="text" class="form-control"
						id="tenSanPham" name="tenSanPham" value="<%=value_tenSanPham%>"
						required>
				</div>
			</div>
			<div class="row mt-1">
				<div class="col-6">
					<label for="giaNhap" class="form-label">Giá nhập<span
						class="rq">*</span></label> <input type="number" step="0.01"
						class="form-control" id="giaNhap" name="giaNhap"
						value="<%=value_giaNhap%>" required>
				</div>
				<div class="col-6">
					<label for="giaBan" class="form-label">Giá bán<span
						class="rq">*</span></label> <input type="text" class="form-control"
						id="giaBan" name="giaBan" value="<%=value_giaBan%>" required>
					<div id="error_giaBan"></div>
				</div>
			</div>
			<div class="row mt-1">
				<div class="col-6">
					<label for="hanSuDung" class="form-label">Hạn sử dụng</label> <input
						type="date" class="form-control" id="hanSuDung" name="hanSuDung"
						value="<%=value_hanSuDung%>">
				</div>
				<div class="col-6">
					<label for="vat" class="form-label">VAT</label> <input type="text"
						class="form-control" id="vat" name="vat" value="<%=value_vat%>">
				</div>
			</div>
			<div class="col-12">
				<label for="moTa" class="form-label">Mô tả sản phẩm</label>
				<textarea rows="3" cols="12" class="form-control" id="moTa"
					name="moTa"><%=value_moTa%></textarea>
			</div>
			<div class="col-12">
				<button class="btn btn-primary" type="button" onclick="my_submit()">Lưu
					sản phẩm</button>
			</div>
		</form>
	</div>
</body>
</html>