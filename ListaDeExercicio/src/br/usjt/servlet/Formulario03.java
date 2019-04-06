package br.usjt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Formulario03
 */
@WebServlet("/Formulario03")
public class Formulario03 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Formulario03() {
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
		
		float temperaturaCelsius = Float.parseFloat(request.getParameter("temperaturaCelsius"));

		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title> Servlet Kaique </title>");
		out.println("<body>");
		out.println("<h1> Resultado da Conversão de Temperatura </h1> <br>");
		out.println("<h2>" + "Temperatura em Celsius: "+ temperaturaCelsius + "</h2> <br>");
		float conversaoTemperaturaFahrenheit = (float) ((1.8 * temperaturaCelsius) + 32);
		out.println("<h2>" + "A temperatura em Fahrenheit  é : "+ conversaoTemperaturaFahrenheit + "</h2> <br>");
		out.println("</body>");
		out.println("</head>");
		out.println("</html>");

		}
	}

}
