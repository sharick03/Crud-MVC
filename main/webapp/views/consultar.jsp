<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html> <!--Versión 5 HTML-->
<html>
<head>
	<title>Bolsillo Digital</title>
	<link rel="stylesheet" href="assets/css/estilos.css">
</head>
<body>
    <header class="header">
        <nav>
        <a class="btn" href="usuario?accion=dashboard"><button>Volver</button></a>
    </header>
    <div class="container-card">
        <div class="card">
            <div class="contenido-card">
                <h3>Su saldo disponible es: <%=request.getAttribute("dinero")%></h3>
            </div
        </div>
</body>
</html>