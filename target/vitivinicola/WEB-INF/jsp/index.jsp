<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<spring:url value="/resources/css" var="coreCss" />
	<link href="${coreCss}/style.css" rel="stylesheet" />
	
	
	
	<title>Eventos Vitivin&iacute;colas</title>
<spring:url value="/resources/img" var="coreImg" />
<link rel="shortcut icon" type="image/x-icon" href="${coreImg}/favicon.png" />
</head>
<body>
<div id="pagina">
<div id="page-top"> 
      <div id="header"> 
        <div id="header-info">
          <h1><a href="#">Eventos Vitivinícolas </a></h1>
          <div class="description">Región de Ñuble, Valle del Itata</div>
        </div>
         <div id="header-menu">
          <ul>
            <li class="current_page_item"><a href="#">Eventos</a></li>
            <li class="page_item"><a href="#">Buscar</a></li>
            <li class="page_item"><a href="#">Eventos pasados</a></li>
            <li class="page_item"><a href="secured/access.htm">Login</a></li>
          </ul>
        </div>
         </div>
      </div>
	<%	if ( session.getAttribute("SPRING_SECURITY_LAST_EXCEPTION")!= null) { %>
		<label class="error">Error en proceso login</label>
		<%=session.getAttribute("SPRING_SECURITY_LAST_EXCEPTION") %>
	<%	} 
		session.removeAttribute("SPRING_SECURITY_LAST_EXCEPTION"); 
	%>
	
	<form class="navbar-form navbar-right" name="f" method="post" action="<%=request.getContextPath() %>/j_spring_security_check">
    <h2>Login</h2>
    	<div class="form-group">
            <input type="text" class="form-control"  id="j_username" name="j_username" placeholder="&#9000; Usuario"  />
        </div>
        <div class="form-group">
        	<input type="password"  class="form-control"  name="j_password" placeholder="&#128272; Contraseña"  >
        </div>
        <input type="submit" class="btn btn-success" value="Ingresar" >
    </form>
    </div>
    <br/><br/><br/><br/><br/><br/><br/>
    <div id="page-bottom">
     <div id="footer"> {Eventos vitivinícolas} Copyrights 2017 - All Rights reserved<br />
        Creado por Escuadrón Suicida<br />
        Universidad del Bío-Bío
      </div>
    </div>
</body>

</html>