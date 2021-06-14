<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HospeFast</title>
</head>
<body>
<h1>HospeFast</h1>
	<h2>Sistema de gerenciamento de hotel</h2>
	<h3>${user.nome}</h3>
	<h3>${user.email}</h3>
	
	<a href="/usuario" >Realize o cadastro de usuários</a>
	
	<a href="/cliente" >Realize o cadastro de clientes</a>
	

	<p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. 
		Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, 
		when an unknown printer took a galley of type and scrambled it to make a 
		type specimen book. It has survived not only five centuries, but also the 
		leap into electronic typesetting, remaining essentially unchanged. It was 
		popularised in the 1960s with the release of Letraset sheets containing 
		Lorem Ipsum passages, and more recently with desktop publishing 
		software like Aldus PageMaker including versions of Lorem Ipsum.
	</p>
	
	
</body>
</html>