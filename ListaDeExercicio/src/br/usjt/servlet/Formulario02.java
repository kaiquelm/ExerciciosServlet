package br.usjt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Formulario02
 */
@WebServlet("/Formulario02")
public class Formulario02 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Formulario02() {
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
		
		int peso = Integer.parseInt(request.getParameter("peso"));
		float altura = Float.parseFloat(request.getParameter("altura"));

		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title> Servlet Kaique </title>");
		out.println("<body>");
		out.println("<h1> Resultado do IMC </h1> <br>");
		out.println("<h2>" + "Peso: "+ peso + "</h2> <br>");
		out.println("<h2>" + "Peso: "+ altura + "</h2> <br>");
		float resultIMC = (float) (peso / Math.pow(altura, 2));
		out.println("<h2>" + "Seu IMC é : "+ resultIMC + "</h2> <br>");
		out.println("</body>");
		out.println("</head>");
		out.println("</html>");

		}
	}

}
