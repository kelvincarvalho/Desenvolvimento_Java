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
import br.com.seniorsolution.entidades.Endereco;
import br.com.seniorsolution.entidades.Pedido;

@WebServlet("/enderecos")
public class ServletEndereco extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletEndereco() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.sendRedirect("cadItem.jsp");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		try {
			
			int idCliente =Integer.parseInt(request.getParameter("cliente"));
			int pedido = Integer.parseInt(request.getParameter("pedido"));
			String cidade = request.getParameter("cidade");
			String cep = request.getParameter("cep");

			
			GenericDao<Cliente> dao = new GenericDao<>(Cliente.class);
			
			Endereco endereco = new Endereco();
			
			endereco.setCidade(cidade);
			endereco.setCep(cep);
			
						
			dao.adicionarEndereco(idCliente, endereco);
			
			request.setAttribute("mensagem", "Endereco adicionado com sucesso");
			request.getRequestDispatcher("cadEnderecos.jsp").forward(request, response);;
			
			
		} catch (Exception e) {
			 out.print("ERRO: "+ e.getMessage());
			e.printStackTrace();
		}
		
	}

}
