<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="assets/css/estilos.css">
    <title>Actualizar de Usuario</title>
</head>
<body>
    <header class="header">
        <nav>
        <a class="btn" href="usuario?accion=listar"><button>Volver</button></a>
    </header>
    <div class="login-container">
        <div class="login-info-container">
            <h1 class="title">Editar Usuario</h1>
        <c:forEach var="usuarios" items="${usuarios}">
        <form action="usuario" method="post">
            <div class="inputs-container">
                <input type="text" class="input" name="nombreUsuario" id="nombreUsuario" placeholder="Nombre Usuario" value="${usuarios.getNombreUsuario()}">
                <input type="text" class="input" name="apellidoUsuario" id="apellidoUsuario" placeholder="Apellido Usuario" value="${usuarios.getApellidoUsuario()}">
                <input type="text" class="input" name="tipodocumento" id="tipodocumento" placeholder="Tipo Documento Usuario" value="${usuarios.getTipodocumento()}">
                <input type="number" class="input" name="numeroDocumento" id="numeroDocumento" placeholder="Numero Documento Usuario" value="${usuarios.getNumeroDocumento()}">
                <input type="number" class="input" name="celular" id="celular" placeholder="Numero Celular" value="${usuarios.getCelular()}">
                <input type="number" class="input" name="clave" id="clave" placeholder="Clave" value="${usuarios.getClave()}">
                <input type="checkbox" class="input" name="estado" id="estado" placeholder="Estado" value="${usuarios.getEstado()}">
                <p><button class="botons" name="accion" value="editarU" type="submit">Editar</button></p>
            </div>
        </form>
    </c:forEach>
        </div>
    </div>
</body>
</html>

