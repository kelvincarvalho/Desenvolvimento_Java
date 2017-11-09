package br.com.seniorsolution.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.seniorsolution.dao.GenericDao;
import br.com.seniorsolution.entity.Produto;

@WebServlet("/produto")
public class ServletProduto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletProduto() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("http://localhost:8080/07_GestaoProdutos/");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			int codigo = Integer.parseInt(request.getParameter("codigo"));
			String descricao = request.getParameter("descricao");
			double preco = Double.parseDouble(request.getParameter("preco"));
			String fabricante = request.getParameter("fabricante");
			
			Produto produto = new Produto();
			produto.setCodigo(codigo);
			produto.setDescricao(descricao);
			produto.setPreco(preco);
			produto.setFabricante(fabricante);
			
			new GenericDao<>(Produto.class).adicionar(produto);
			
			request.setAttribute("mensagem", "Produto inclu�do com sucesso!");
		} catch (Exception e) {
			request.setAttribute("mensagem", e.getMessage());
		} finally {
			request.getRequestDispatcher("index.jsp?opcao=cadastro").forward(request, response);
		}
		
	}
}
