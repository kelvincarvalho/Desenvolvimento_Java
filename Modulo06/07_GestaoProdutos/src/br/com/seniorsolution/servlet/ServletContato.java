package br.com.seniorsolution.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.seniorsolution.dao.GenericDao;
import br.com.seniorsolution.entity.Contato;


@WebServlet("/ServletContato")
public class ServletContato extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ServletContato() {
        super();
     
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("http://localhost:8080/07_GestaoProdutos/");
	}


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String nome = request.getParameter("nome");
			String telefone = request.getParameter("telefone");
			int idade = Integer.parseInt(request.getParameter("idade"));
			String email = request.getParameter("email");
			
			Contato contato = new Contato();
			contato.setNome(nome);
			contato.setTelefone(telefone);
			contato.setIdade(idade);
			contato.setEmail(email);
			
			new GenericDao<>(Contato.class).adicionar(contato);
			
			request.setAttribute("mensagem", "Contato inclu�do com sucesso!");
		} catch (Exception e) {
			request.setAttribute("mensagem", e.getMessage());
		} finally {
			request.getRequestDispatcher("index.jsp?opcao=cadastro").forward(request, response);
		}
		
	}

}