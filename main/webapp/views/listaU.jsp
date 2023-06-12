<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="assets/css/estilos.css">
    <title>Proyecto Web</title>
</head>
<body>
	<header class="header">
        <nav>
            <ul class="nav-links">
                <li><a href="usuario?accion=iniciarSesion">Iniciar</a></li>
                <li><a href="usuario?accion=registrarse">Nuevo Registro</a></li>
            </ul>
        </nav>
            <a class="btn" href="usuario?accion=volver"><button>Volver</button></a>
    </header>
    
    <table>
        <tr>
			<th>ID</th>
			<th>Nombre</th>
			<th>Apellido </th>
            <th>Tipo documento</th>
            <th>Numero Documento</th>
            <th>Numero Celular</th>
            <th>Clave</th>
            <th>estado</th>
		</tr>

    <!-- Filas de datos generadas dinámicamente -->
    <c:forEach var="usuarios" items="${usuarios}">
    <tr>
        <td>${usuarios.getIdUsuario()}</td>
        <td>${usuarios.getNombreUsuario()}</td>
        <td>${usuarios.getApellidoUsuario()}</td>
        <td>${usuarios.getTipodocumento()}</td>
        <td>${usuarios.getNumeroDocumento()}</td>
        <td>${usuarios.getCelular()}</td>
        <td>${usuarios.getClave()}</td>
        <td>${usuarios.getEstado()}</td>
		<td>
            <a class="button" href="usuario?accion=ForEditar&id=${usuarios.idUsuario}">Editar</a>
            <a class="button" href="usuario?accion=ForEliminar">Eliminar</a>
    </td>
    </tr>
        </c:forEach>
    </table>
</body>
</html>
