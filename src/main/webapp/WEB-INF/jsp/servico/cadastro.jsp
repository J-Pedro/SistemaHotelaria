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
	<h3>Serviços</h3>
		
		
		<c:if test="${not empty servicos}">
		<h3>Serviços cadastradas:</h3>
		<table class="table table-striped">
		    <thead>
		      <tr>
		        <th>ID</th>
		        <th>Nome do serviço</th>
		        <th>Valor do serviço</th>
		        <th>Ações</th>
		        <th></th>
		        <th></th>
		      </tr>
		    </thead>
		    <tbody>
		    <c:forEach var="s" items="${servicos}">
		      <tr>
		        <td>${s.id}</td>
		        <td>${s.nomeServico}</td>
		        <td>${s.valorServico}</td>
		        <td><a href="/servico/${s.id}/excluir">excluir</a></td>
		        <td><a class="btn btn-success btn-sm" >Visualizar</a></td>
    			<td><a class="btn btn-warning btn-sm" >Editar</a></td>
		      </tr>
		    </c:forEach>
		    </tbody>
		 </table>
		</c:if>
		
		<c:if test="${empty servicos}">
		<h3>Não existem serviços cadastrados!!!</h3>
		</c:if>
	</div>
	
</body>
</html>
