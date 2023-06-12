<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html> <!--Versión 5 HTML-->
<html>
<head>
	<title>Bolsillo Digital</title>
	<link rel="stylesheet" href="css/estilos.css">
</head>
<body>
    <header class="header">
        <nav>
        <a class="btn" href="bolsillo?sc=dashboard"><button>Volver</button></a>
    </header>
    <div class="container-card">
        <div class="card">
            <div class="contenido-card">
                <h3>Retiro realizado con exito</h3>
                <h3>Su saldo es de <%=request.getAttribute("dinero")%></h3>
            </div>
        </div>
</body>
</html>