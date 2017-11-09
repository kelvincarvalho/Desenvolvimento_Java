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
import br.com.seniorsolution.entidades.Item;
import br.com.seniorsolution.entidades.Pedido;
import br.com.seniorsolution.entidades.PedidoPK;

@WebServlet("/itens")
public class ServletItens extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public ServletItens() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("cadEnderecos.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		try {
			
			String pedidoPk =request.getParameter("pedido");
			
			String[] elementos = pedidoPk.split("-");
			int codigo = Integer.parseInt(elementos[0].trim());
			String categoria =elementos[1].trim();
	
			int quantidade = Integer.parseInt(request.getParameter("quantidade"));
			String descricao = request.getParameter("descricao");

			
			PedidoPK pk = new PedidoPK();
			pk.setCategoria(categoria);
			pk.setCodigo(codigo);
			
			Item item = new Item();
			item.setQuantidade(quantidade);
			item.setDescricao(descricao);

	
			new GenericDao<>(Pedido.class).adicionarItem(pk, item);
			
			request.setAttribute("mensagem", "Item adicionado com sucesso");
			request.getRequestDispatcher("cadItem.jsp").forward(request, response);
			
			
		} catch (Exception e) {
			 out.print("ERRO: "+ e.getMessage());
			e.printStackTrace();
		}
		
	}

}
