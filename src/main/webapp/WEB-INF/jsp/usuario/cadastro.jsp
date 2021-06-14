<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>APP-AT-PB</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

	<div class="container">
		<form action="/usuario/incluir" method="post">
		
			<div class="form-group">
			  <label>Nome:</label>
			  <input type="text" class="form-control" name="nome" value="Elberth Moraes">
			</div>			
			
			<div class="form-group">
			  	<label>E-mail:</label>
				<input type="email" class="form-control" name="email" value="elberth.moraes@prof.infnet.edu.br">
			</div>
			
			<div class="form-group">
			  	<label>Senha:</label>
				<input type="password" class="form-control" name="senha" value="">
			</div>
				
			<button type="submit">Cadastro</button>
		</form>
		
		<c:if test="${not empty usuarios}">
		<h3>Cadastro de Usuários</h3>
		<table class="table table-striped">
		    <thead>
		      <tr>
		        <th>ID</th>
		        <th>Nome</th>
		        <th>Email</th>
		        <th>Ações</th>
		      </tr>
		    </thead>
		    <tbody>
		    <c:forEach var="u" items="${usuarios}">
		      <tr>
		        <td>${u.id}</td>
		        <td>${u.nome}</td>
		        <td>${u.email}</td>
		        <td><a href="/usuario/${u.id}/excluir">excluir</a></td>
		      </tr>
		    </c:forEach>
		    </tbody>
		 </table>
		</c:if>
		
		<c:if test="${empty usuarios}">
		<h3>Não existem usuários cadastrados!!!</h3>
		</c:if>
	</div>
	
</body>
</html>
