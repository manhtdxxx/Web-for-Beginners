package controller;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MuaHang
 */
@WebServlet("/mua-hang")
public class MuaHang extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MuaHang() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");

		String soLuong = request.getParameter("soLuong");
		String soDienThoai = request.getParameter("soDienThoai");
		String email = request.getParameter("email");

		// init error
		boolean checkError = false;

		// check soLuong
		int value_soLuong = 0;
		try {
			value_soLuong = Integer.parseInt(soLuong);
			if (value_soLuong <= 0) {
				checkError = true;
				request.setAttribute("e_soLuong", "Vui lòng chọn số lượng lớn hơn 0!");
			}
		} catch (Exception e) {
			checkError = true;
			request.setAttribute("e_soLuong", "Nhập dữ liệu số lượng không đúng!");
		}

		// check SDT
		Pattern pattern_sdt = Pattern.compile("\\d{10}");
		Matcher matcher_sdt = pattern_sdt.matcher(soDienThoai);
		if (!matcher_sdt.matches()) {
			checkError = true;
			request.setAttribute("e_soDienThoai", "Số điện thoại bao gồm 10 kí tự!");
		}

		// check email
		Pattern pattern_email = Pattern.compile("\\w+@\\w+(\\.\\w+)+(\\.\\w+)*");
		Matcher matcher_email = pattern_email.matcher(email);
		if (!matcher_email.matches()) {
			checkError = true;
			request.setAttribute("e_email", "Cấu trúc của email chưa đúng!");
		}

		String url = "/success.jsp";
		if (checkError) {
			url = "/index.jsp";
		}
		RequestDispatcher rq = getServletContext().getRequestDispatcher(url);
		rq.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
