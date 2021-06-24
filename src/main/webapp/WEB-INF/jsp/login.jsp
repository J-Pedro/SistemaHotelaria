<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Tela de Login</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
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
	

	<div class="container mt-4" >
	
	<div class="row justify-content-center ">
		<div class="form-group col-md-4 col-md-offset-5 border border-primary rounded">
		   <h2 class="text-center">Login</h2>
			  
		<c:if test="${not empty mensagem}">
				<div class="container ">
				  <div class="alert alert-danger">
				    <strong>Problema!</strong> ${mensagem} 
				  </div>
				</div>
		</c:if>
			  
				<form action="/usuario/login" method="post">
				  <div class="form-group">
				    <input type="email" class="form-control" id="email" placeholder="E-mail" name="email">
				  </div>
				
				  <div class="form-group">
				    <input type="password" class="form-control" id="senha" placeholder="Senha" name="senha">
				  </div>
				
				  <div class="form-group align-items-center">	
				  <button type="submit" class="btn btn-primary btn-block">Acessar</button>
				  </div>
				  <a href="/usuario" class="text-center">Clique aqui para se cadastrar</a>
				</form>	
			</div>
		</div>
	</div>

</body>
</html>