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
	<h3>Cadastro de Reservas</h3>
	
		<form action="/reserva/incluir" method="post">
		
	<div class="row">
	<div class="form-group col-md-6">
		<label>Cliente:</label>
		<select name="cliente.id" class="form-control">
		<c:forEach var="c" items="${clientes}">
			<option value="${c.id}">${c.nome}</option>
		</c:forEach>
		</select>
	</div>
	</div>
		
	
	<div class="row">
		<div class="form-group col-md-4">
				 <label>Dt.Reserva:</label>
				 <input type="date" class="form-control" name="dataReserva" >
		</div>	
		<div class="form-group col-md-4">
			<label>Local:</label>
			<select name="localHotel" class="form-control">
				<option value="1" selected>Rio de Janeiro</option>
				<option value="2">São Paulo</option>
			</select>
		</div>
	</div>
	
	<div class="form-group">
		<label>Gratuidade:</label>
		<input type="checkbox" name="gratuidade" value="true">
	</div>

		<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form>
		
	
		
		<c:if test="${not empty reservas}">
		<h3>Clientes cadastrados:</h3>
		<table class="table table-striped">
		    <thead>
		      <tr>
		        <th>ID</th>
		        <th>Nome</th>
		        <th>Data Reserva</th>
		        <th>Ações</th>
		      </tr>
		    </thead>
		    <tbody>
		    <c:forEach var="r" items="${reservas}">
		      <tr>
		        <td>${r.id}</td>
		        <td>${r.cliente.nome}</td>
		        <td>${r.dataReserva}</td>
		        <td><a href="/reserva/${r.id}/excluir">excluir</a></td>
		      </tr>
		    </c:forEach>
		    </tbody>
		 </table>
		</c:if>
		
		<c:if test="${empty reservas}">
		<h3>Não existe clientes cadastrados!!!</h3>
		</c:if>
	</div>
	
</body>
</html>
