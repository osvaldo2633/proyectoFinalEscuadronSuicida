<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<h2>Formulario para el ingreso de eventos</h2>

<spring:url value="/resources/img" var="coreImg" />
<link rel="shortcut icon" type="image/x-icon" href="${coreImg}/favicon.png" />

<form name="insertar" action="insertar.htm" method="get">
	<table border="2px" >
		<tr>
			<td>nombre Evento</td>
			<td><input type="text" name="nombre" id="nombre"></td>
		</tr>
		
		<tr>
			<td>Fecha</td>
			<td><input type="text" name="fecha" id="fecha"></td>
		</tr>
		<tr>
			<td>direccion</td>
			<td><input type="text" name="direccion" id="direccion"></td>
		</tr>
		<tr>
			<td>Decripcion</td>
			<td><input type="text" name="descripcion" id="descripcion"></td>
		</tr>
		<tr>
			<td>imgen</td>
			<td><input type="text" name="imagen" id="imagen"></td>
		</tr>
	
	</table>
	<button type="submit">insertar</button>

</form>


<a href="prueba.htm">ingresar al controlador</a>