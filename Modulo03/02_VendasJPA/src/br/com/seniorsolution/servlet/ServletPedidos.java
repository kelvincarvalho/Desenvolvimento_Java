package br.com.seniorsolution.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.seniorsolution.dao.GenericDao;
import br.com.seniorsolution.entidades.Cliente;
import br.com.seniorsolution.entidades.Endereco;
import br.com.seniorsolution.entidades.Pedido;
import br.com.seniorsolution.entidades.PedidoPK;


@WebServlet("/pedidos")
public class ServletPedidos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public ServletPedidos() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.sendRedirect("cadPedidos.jsp");
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		try {
			
			int idCliente =Integer.parseInt(request.getParameter("cliente"));
			Date dataPedido = new SimpleDateFormat("dd/MM/yyyy").parse(request.getParameter("dataPedido"));
			int numeropedido = Integer.parseInt(request.getParameter("numeropedido"));
			String categoria = request.getParameter("categoria");
	

			PedidoPK pk = new PedidoPK();
			pk.setCodigo(numeropedido);
			pk.setCategoria(categoria);
			
			Pedido pedido = new Pedido();
			pedido.setDataPedido(dataPedido);
			pedido.setPedidoPK(pk);
			
			
			GenericDao<Cliente> dao = new GenericDao<>(Cliente.class);			
			dao.adicionarPedido(idCliente, pedido);
			
			request.setAttribute("mensagem", "Pedido Adicionado com Sucesso!!!");
			request.getRequestDispatcher("cadPedidos.jsp").forward(request, response);
			
			
		} catch (Exception e) {
			 out.print("ERRO: "+ e.getMessage());
			e.printStackTrace();
		}
	

}}