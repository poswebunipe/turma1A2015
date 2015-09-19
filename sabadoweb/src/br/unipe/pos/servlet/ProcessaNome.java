package br.unipe.pos.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProcessaNome
 */
@WebServlet("/processaNome.do")
public class ProcessaNome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProcessaNome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		PrintWriter pw = response.getWriter();
		
		String nome = request.getParameter("nome");
		String idadeString = request.getParameter("idade");
		//converte a String em Inteiro
		int idade = Integer.parseInt(idadeString);
		
		pw.write("O nome do Usuário é: " + nome);
		pw.write("<BR/>");
		pw.write("A idade do Usuário é: " + idade);		
		
	}
	
	
	
	
	
	
	
	

}
