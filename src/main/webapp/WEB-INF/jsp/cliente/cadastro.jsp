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
 
	<div class="container  mt-4">
	<h3>Cadastro de cliente</h3>
	
		<form action="/cliente/incluir" method="post">
		
	<div class="form-row">
		<div class="form-group col-md-6">
			 <label>Nome:</label>
			 <input type="text" class="form-control" name="nome">
		</div>
		<div class="form-group col-md-4">
			 <label>CPF:</label>
			 <input type="text" class="form-control" name="cpf" >
		</div>
		<div class="form-group col-md-2">
			 <label>Dt.Nascimento:</label>
			 <input type="date" class="form-control" name="dataNasc" >
		</div>
	</div>

	
	<div class="form-row">
		<div class="form-group col-md-6">
			 <label>Email:</label>
			 <input type="email" class="form-control" name="email">
		</div>
		
		<div class="form-group col-md-6">
			 <label>Telefone:</label>
			 <input type="text" class="form-control" name="telefone" >
		</div>
		
	</div>
	
	<div class="form-row">
	    <div class="form-group col-md-6">
	      <label for="inputCity">Cidade</label>
	      <input type="text" class="form-control" id="inputCity">
	    </div>
	    <div class="form-group col-md-4">
	      <label for="inputState">Estado</label>
	      <select id="inputState" class="form-control">
	        <option selected>Choose...</option>
	        <option>...</option>
	      </select>
	    </div>
	    <div class="form-group col-md-2">
	      <label for="inputZip">CEP</label>
	      <input type="text" class="form-control" id="inputZip">
	    </div>
	  </div>
	  
	  	<div class="form-group">
		 <label>Endereço:</label>
		 <input type="text" class="form-control" name="endereco" >
	</div>

		<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form>

		

				
	
		
		<c:if test="${not empty clientes}">
		<h3>Clientes cadastrados:</h3>
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
		    <c:forEach var="c" items="${clientes}">
		      <tr>
		        <td>${c.id}</td>
		        <td>${c.nome}</td>
		        <td>${c.email}</td>
		        <td><a href="/usuario/${c.id}/excluir">excluir</a></td>
		      </tr>
		    </c:forEach>
		    </tbody>
		 </table>
		</c:if>
		
		<c:if test="${empty clientes}">
		<h3>Não existe clientes cadastrados!!!</h3>
		</c:if>
	</div>
	
</body>
</html>
