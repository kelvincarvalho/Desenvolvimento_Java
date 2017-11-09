package br.com.seniorsolution.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.seniorsolution.dao.GenericDao;
import br.com.seniorsolution.entidades.Cliente;

@WebServlet("/clientes")
public class ServletClientes extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServletClientes() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		// EXECUTA UMA CHAMADA GET
		response.sendRedirect("cadClientes.jsp");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		try {
			int codigo = Integer.parseInt(request.getParameter("codigo"));
			String empresa = request.getParameter("empresa");

			Cliente cliente = new Cliente();
			cliente.setId(codigo);
			cliente.setEmpresa(empresa);

			GenericDao<Cliente> dao = new GenericDao<>(Cliente.class);
			dao.adicionar(cliente);
			// ADICIONANDO UM ATRIBUTO � REQUISI��O
			request.setAttribute("mensagem", "Cliente adicionado com sucesso");
			request.getRequestDispatcher("cadClientes.jsp").forward(request, response);;
			// out.print("<h2>Cliente adicionado com sucesso!</h2>");
			
		} catch (Exception e) {
			// out.print("ERRO: "+ e.getMessage());
			e.printStackTrace();
		}
	}

}