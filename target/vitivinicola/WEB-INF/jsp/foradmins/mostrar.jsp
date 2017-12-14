<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page isELIgnored="false" %>



    
<html xmlns="http://www.w3.org/1999/xhtml" dir="ltr" lang="en-US">
<head profile="http://gmpg.org/xfn/11">
<title>Ingreso de eventos</title>
<meta http-equiv="Content-Type" content="text/html; charset=unicode" />

<spring:url value="/resources/css" var="coreCss" />

<spring:url value="/resources/img" var="coreImg" />

<link rel="stylesheet" href="${coreCss}/style.css" type="text/css" media="screen" />
<script type="text/javascript" src="tcal.js"></script> 

<link rel="shortcut icon" type="image/x-icon" href="${coreImg}/favicon.png" />
    
</head>
    <body>  
   <div id="pagina">
        
<div id="page-top"> 
      <div id="header"> 
        <div id="header-info">
          <h1><a href="#">Eventos Vitivinícolas</a></h1>
          <div class="description">Región de Nuble, Valle del Itata</div>
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
        <div id="evento">
            <c:forEach items="${lista}" var="data">
            <div id="descripcion">
            


                
            <h2>${data.getNombre_evento()}</h2>
                <hr/>
                <div id="calendario">${data.getFecha()}</div>
                <br/><br/>
                <div id="ubicacion"> ${data.getDireccion()}</div>
            <br/>
            
            <p>${data.getDescripcion()} </p>
                </div>
            <br/>
                </c:forEach>
        </div>
        </div>
                
<div id="page-bottom">
     <div id="footer"> {Eventos vitivinícolas} Copyrights 2017 - All Rights reserved<br />
        Creado por Escuadrón Suicida<br />
        Universidad del Bío-Bío
      </div>
    </div>
    </body>
</html>