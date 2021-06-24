<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>APP-AT-PB</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-dark bg-dark ">
 <div class="container">
  <a class="navbar-brand mx-auto" href="/" >HospeFast</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
  </div>
 </div>
</nav>

	<div class="container">
		<form action="/usuario/incluir" method="post">
		
			<div class="form-group">
			  <label>Nome:</label>
			  <input type="text" class="form-control" name="nome">
			</div>			
			
			<div class="form-group">
			  	<label>E-mail:</label>
				<input type="email" class="form-control" name="email">
			</div>
			
			<div class="form-group">
			  	<label>Senha:</label>
				<input type="password" class="form-control" name="senha" value="">
			</div>
				
			<button type="submit" class="btn btn-primary">Cadastro</button>
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
