package br.usjt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Formulario04
 */
@WebServlet("/Formulario04")
public class Formulario04 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Formulario04() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
	try (PrintWriter out = response.getWriter()) {
		
		int multiplicador = Integer.parseInt(request.getParameter("multiplicador"));
		int resultado01;

		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title> Servlet Kaique </title>");
		out.println("<body>");
		out.println("<h1> Tabuada! Multiplos e seus resultados </h1> <br>");
		out.println("<table>"
				+ "<tr>"
				+ "<td> 1 x " + multiplicador + " = " + (resultado01 = (multiplicador*1))
				+ "</tr>"
				+ "<tr>"
				+ "<td> 2 x " + multiplicador + " = " + (resultado01 = (multiplicador*2))
				+ "</tr>"
				+ "<tr>"
				+ "<td> 3 x " + multiplicador + " = " + (resultado01 = (multiplicador*3))
				+ "</tr>"
				+ "<tr>"
				+ "<td> 4 x " + multiplicador + " = " + (resultado01 = (multiplicador*4))
				+ "</tr>"
				+ "<tr>"
				+ "<td> 5 x " + multiplicador + " = " + (resultado01 = (multiplicador*5))
				+ "</tr>"
				+ "<tr>"
				+ "<td> 6 x " + multiplicador + " = " + (resultado01 = (multiplicador*6))
				+ "</tr>"
				+ "<tr>"
				+ "<td> 7 x " + multiplicador + " = " + (resultado01 = (multiplicador*7))
				+ "</tr>"
				+ "<tr>"
				+ "<td> 8 x " + multiplicador + " = " + (resultado01 = (multiplicador*8))
				+ "</tr>"
				+ "<tr>"
				+ "<td> 9 x " + multiplicador + " = " + (resultado01 = (multiplicador*9))
				+ "</tr>"
				+ "</table>");
		out.println("</body>");
		out.println("</head>");
		out.println("</html>");

		}
	}

}
