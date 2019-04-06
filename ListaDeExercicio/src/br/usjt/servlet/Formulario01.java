package br.usjt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Formulario01")
public class Formulario01 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Formulario01() {
        super();
       
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
	try (PrintWriter out = response.getWriter()) {
		
		String nome = request.getParameter("nome");
		

		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title> Servlet Kaique </title>");
		out.println("<body>");
		if(nome == null) {
			out.println("<h1>Volte e insira seu nome! </h1>");
		} else {
			out.println("<h1>" + "Ola " + nome + "</h1>");
		}
		out.println("</body>");
		out.println("</head>");
		out.println("</html>");

		}
	}
}
