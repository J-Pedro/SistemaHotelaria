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
	
		<form action="/acomodacao/incluir" method="post">
		
	<div class="form-row">
		<div class="form-group col-md-6">
			 <label>Nome do serviço:</label>
			 <input type="text" class="form-control" name="nomeServico" readonly value="Acomodacao">
		</div>
		<div class="form-group col-md-4">
			 <label>Valor do serviço:</label>
			 <input type="text" class="form-control" name="valorServico" readonly value="100">
		</div>
		<div class="form-group col-md-2">
			 <label>Desconto do serviço:</label>
			 <input type="text" class="form-control" name="desconto" value="100">
		</div>
	</div>

	
	<div class="form-row">
		<div class="form-group col-md-6">
			<label>Tipo de Quarto:</label>
			<select name="tipoQuarto" class="form-control">
				<option value="Casal" selected>Casal</option>
				<option value="Solteiro">Solteiro</option>
			</select>
		</div>
		
		<div class="form-group col-md-6">
			 <label>Valor do quarto:</label>
			 <input type="text" class="form-control" name="valorQuarto" >
		</div>
		
	</div>
	
	<div class="form-row">
		<div class="form-group col-md-6">
			<label>Kit Higiene:</label>
			<input type="checkbox" name="kitHigiene" value="true">
		</div>
	</div>
	  
		<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form>

		

				
	
		
		<c:if test="${not empty acomodacoes}">
		<h3>Acomodacoes cadastradas:</h3>
		<table class="table table-striped">
		    <thead>
		      <tr>
		        <th>ID</th>
		        <th>Nome do serviço</th>
		        <th>Tipo de Quarto</th>
		        <th>Ações</th>
		      </tr>
		    </thead>
		    <tbody>
		    <c:forEach var="a" items="${acomodacoes}">
		      <tr>
		        <td>${a.id}</td>
		        <td>${a.nomeServico}</td>
		        <td>${a.tipoQuarto}</td>
		        <td><a href="/acomodacao/${a.id}/excluir">excluir</a></td>
		      </tr>
		    </c:forEach>
		    </tbody>
		 </table>
		</c:if>
		
		<c:if test="${empty acomodacoes}">
		<h3>Não existem acomodações cadastrados!!!</h3>
		</c:if>
	</div>
	
</body>
</html>
