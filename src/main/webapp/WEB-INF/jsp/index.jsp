<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HospeFast</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
</head>
<body>

<c:import url="/WEB-INF/jsp/header.jsp"/>

<div class="container  mt-4">

	<h2 class="text-center">Sistema de gerenciamento de hotel</h2>

<div class="card-deck">
  <div class="card">
    <div class="card-body">
      <h5 class="card-title">Acomodações</h5>
      <p class="card-text"><a href="acomodacao">Clique aqui para acessar as acomodações</a></p>
    </div>
    <div class="card-footer">
      <small class="text-muted">Quantidade: ${acomodacaoQtde}</small>
    </div>
  </div>
  
  <div class="card">
    <div class="card-body">
      <h5 class="card-title">Passeios</h5>
      <p class="card-text"><a href="passeio">Clique aqui para acessar os passeios</a></p>
    </div>
    <div class="card-footer">
      <small class="text-muted">Quantidade: ${passeioQtde}</small>
    </div>
  </div>
  
  <div class="card">
    <div class="card-body">
      <h5 class="card-title">Refeições</h5>
      <p class="card-text"><a href="alimentacao">Clique aqui para acessar as refeições</a></p>
    </div>
    <div class="card-footer">
      <small class="text-muted">Quantidade: ${alimentacaoQtde}</small>
    </div>
  </div>
  

</div>

	<p>Estamos falando do sistema de gestão hoteleira, uma ferramenta que veio para simplificar e auxiliar, 
	não somente na recepção, mas em diversos setores do seu hotel. 
	Não apenas para facilitar, o sistema hoteleiro serve para organizar os processos do 
	meio de hospedagem, e profissionalizar a gestão dos hoteleiros.
	</p>
</div>
	
</body>
</html>