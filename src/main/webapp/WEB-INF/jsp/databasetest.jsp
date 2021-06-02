<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.example.demo.entities.Reparto"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>database test is working</title>
</head>
<body>
	<h1>database test is working!...</h1>

	<%
	Reparto reparto = (Reparto) request.getAttribute("reparto");
	%>
	<div>
		<p>Reparto</p>
		<p>
			Descrizione
			<%=reparto.getDescrizione()%></p>
		<p>
			Sigla
			<%=reparto.getSigla()%></p>
		<p>
			Posizione
			<%=reparto.getPosizione()%></p>

	</div>

	<div>

		<h1>
			<a href="demo">Homepage</a>


		</h1>


	</div>


</body>
</html>