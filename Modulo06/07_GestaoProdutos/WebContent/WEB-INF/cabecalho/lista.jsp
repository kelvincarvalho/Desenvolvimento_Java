<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<jsp:useBean id="bean" class="br.com.seniorsolution.bean.ProdutosBean"/>

<div class="container">
	<div class="margem">
		<h2>Lista de Produtos</h2>
	</div>
	<section>
<table class="table table-hover">
  <thead>
    <tr>
      <th>Código</th>
      <th>Descrição</th>
      <th>Preço</th>
      <th>Fabricante</th>
    </tr>
  </thead>
  <tbody>

	<c:forEach var="produto" items="${bean.listaProdutos}">	
    <tr>
      <th scope="row">${produto.codigo}</th>
      <td>${produto.descricao}</td>
      <td><fmt:formatNumber type="currency">${produto.preco}</fmt:formatNumber></td>
      <td>${produto.fabricante}</td>
    </tr>
	</c:forEach>
  </tbody>
</table>
	</section>
</div>