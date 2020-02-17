package br.com.alana.biblioteca.servlet.calculo;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class idadeServlet
 */
//@WebServlet("/idadeServlet")
// public class idadeServlet extends HttpServlet {
public class IdadeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public IdadeServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected IdadeServlet(HttpServletRequest request, HttpServlet response) throws SecurityException, IOException {

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		System.err.println("get ....");
//		// TODO Auto-generated method stub
////		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.err.println("post ... " + request.getParameter("data"));

		String data = request.getParameter("data");

		long idade = calcularIdade(data);
		request.setAttribute("idade", idade);

		request.getRequestDispatcher("idade.jsp").forward(request, response);
	}

	private long calcularIdade(String data) {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		return Period.between(LocalDate.parse(data, formato), LocalDate.now()).getYears();

//		return 10;

//		try {
//		LocalDate dataAtual = LocalDate.now();
//		long idade = ChronoUnit.YEARS.between(data, dataAtual);
//		return idade;
//		}catch{
//			
//		}
	}

}
