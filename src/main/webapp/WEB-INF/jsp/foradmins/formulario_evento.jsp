<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page isELIgnored="false" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" dir="ltr" lang="en-US">
<head profile="http://gmpg.org/xfn/11">


<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

<spring:url value="/resources/css" var="coreCss" />
<spring:url value="/resources/dist" var="coreDist" />
<spring:url value="/resources/img" var="coreImg" />



<link rel="stylesheet" href="${coreCss}/style.css" type="text/css" media="screen" />
<link rel="stylesheet" href="${coreDist}/css/bootstrap.css" type="text/css" media="screen" />
<link rel="stylesheet" href="${coreDist}/css/bootstrap-datepicker.min.css" type="text/css" media="screen" />

<title>Eventos Vitivin&iacute;colas</title>
<link rel="shortcut icon" type="image/x-icon" href="${coreImg}/favicon.png" />


<spring:url value="/resources/img" var="coreImg" />
<% 
	

%>


</head>


<body>
<div id="pagina">
<div id="page-top"> 
      <div id="header"> 
        <div id="header-info">
          <h1><a href="#">Eventos Vitivinícolas </a></h1>
          <div class="description">Región de Ñuble, Valle del Itata
          </div>
          
        </div>
        <div id="header-menu">
          <ul>
            <li class="current_page_item"><a href="index.htm">Eventos</a></li>
            <li class="page_item"><a href="#">Buscar</a></li>
            <li class="page_item"><a href="#">Estadísticas</a></li>
            <li class="page_item"><a href="formulario_evento.htm">Publicar evento</a></li>
            <li class="page_item"><a href="#">Eventos pasados</a></li>
            <li class="page_item"><a href="<%=request.getContextPath() %>/j_spring_security_logout">(${user.getNombre()}) Logout</a></li>
          </ul>
        </div>
         </div>
      </div>
	  
	
  </div> 

	<div id="id-de-la-pagina">
	

	<!--Contenido de la pagina  -->
	

		
	<form action="insertar.htm" method="get">
	 <h2>Ingreso de eventos</h2>
	  <h3>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	  		${mensaje}
	  </h3>
	    <label for="inputEmail3" class="col-sm-2 control-label">NombreEvento</label>
	      <input type="text" class="form-control" name="nombre" id="nombre" placeholder="Nombre evento">
	  <br/>
	    <label for="inputEmail3" class="col-sm-2 control-label">Fecha</label>
	      <input class="datepicker" id="datepicker" data-provide="datepicker" name="fecha">

	   <br/><br/>
	  
	    <label for="inputPassword3" class="col-sm-2 control-label">Dirección</label>
	      <input type="text" class="form-control" id="direccion" name="direccion" placeholder="Ingrese dirección">
	      <br/> 
	    <label for="inputPassword3" class="col-sm-2 control-label">Descripción</label>
	      <textarea type="text" class="form-control" id="descripcion" name="descripcion" placeholder="Descripción del evento"></textarea>
	       <br/>
	  <input type="hidden" name="imagen" value="imagen" />
	   <br/>
	      <button type="submit" class="btn btn-default">Publicar</button>
	</form>
 </div>
 
	</div> 		
<!--fin de la pagina   -->	

<br/><br/><br/><br/>

<script src="${coreDist}/js/jquery-3.2.1.js "></script>
<script src="${coreDist}/js/bootstrap-datepicker.min.js "></script>

<script>
$(function () {
	$('#datepicker').datepicker({
	    format: 'yyyy/mm/dd',
	    startDate: '0d',
	    language: 'es'
	});
	
	
		  $.fn.datepicker.dates['es'] = {
		    days: ["Domingo", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"],
		    daysShort: ["Dom", "Lun", "Mar", "Mié", "Jue", "Vie", "Sáb", "Dom"],
		    daysMin: ["Do", "Lu", "Ma", "Mi", "Ju", "Vi", "Sa", "Do"],
		    months: ["Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"],
		    monthsShort: ["Ene", "Feb", "Mar", "Abr", "May", "Jun", "Jul", "Ago", "Sep", "Oct", "Nov", "Dic"],
		    today: "Hoy"
		  };
});

</script>

</body>
</html>

