package br.com.seniorsolution.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter("/admin/*")
public class LoginFilter implements Filter {


    public LoginFilter() {
        // TODO Auto-generated constructor stub
    }

	public void destroy() {
	
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest requisicao =(HttpServletRequest)request;
		HttpServletResponse resposta =(HttpServletResponse)response;
		
		if(requisicao.getSession().getAttribute("user") == null) {
			resposta.sendRedirect("http://localhost:8080/01_LivrariaWeb/login.faces");
		}
		else {
			chain.doFilter(request, response);
		}
	
	}


	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
