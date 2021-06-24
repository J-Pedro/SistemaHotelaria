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

<c:import url="/WEB-INF/jsp/header.jsp"/>
 
	<div class="container mt-4">
	<h3>Cadastro de acomodacao</h3>
	
		<form action="/passeio/incluir" method="post">
		
	<div class="form-row">
		<div class="form-group col-md-6">
			 <label>Nome do serviço:</label>
			 <input type="text" class="form-control" name="nomeServico" readonly value="Passeio">
		</div>
		<div class="form-group col-md-4">
			 <label>Valor do serviço:</label>
			 <input type="text" class="form-control" name="valorServico" readonly value="150">
		</div>
		<div class="form-group col-md-2">
			 <label>Desconto do serviço:</label>
			 <input type="text" class="form-control" name="desconto" value="0">
		</div>
	</div>

	
	<div class="form-row">
		<div class="form-group col-md-6">
			<label>Nome do passeio:</label>
			<select name="nomePasseio" class="form-control">
				<option value="Resort" selected>Resort</option>
				<option value="Barco">Barco</option>
			</select>
		</div>
		
		<div class="form-group col-md-6">
			 <label>Valor do passeio:</label>
			 <input type="text" class="form-control" name="valorPasseio" >
		</div>
		
	</div>
	
	<div class="form-row">
		<div class="form-group col-md-6">
			<label>Translado:</label>
			<input type="checkbox" name="translado" value="true">
		</div>
	</div>
	  
		<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form>

		

				
	
		
		<c:if test="${not empty passeios}">
		<h3>Passeios cadastrados:</h3>
		<table class="table table-striped">
		    <thead>
		      <tr>
		        <th>ID</th>
		        <th>Nome do serviço</th>
		        <th>Nome do passeio</th>
		        <th>Ações</th>
		      </tr>
		    </thead>
		    <tbody>
		    <c:forEach var="p" items="${passeios}">
		      <tr>
		        <td>${p.id}</td>
		        <td>${p.nomeServico}</td>
		        <td>${p.nomePasseio}</td>
		        <td><a href="/passeio/${p.id}/excluir">excluir</a></td>
		      </tr>
		    </c:forEach>
		    </tbody>
		 </table>
		</c:if>
		
		<c:if test="${empty passeios}">
		<h3>Não existem passeios cadastrados!!!</h3>
		</c:if>
	</div>
	
</body>
</html>
