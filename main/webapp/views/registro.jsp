<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    <link rel="stylesheet" href="assets/css/estilos.css">
    <title>Login</title>
</head>
<body>
    <header class="header">
        <nav>
        <a class="btn" href="usuario?accion=volver"><button>Inicio</button></a>
    </header>
<form action="usuario" method="post">
    <div class="login-container">
        <div class="login-info-container">
            <h1 class="title">Registrarse</h1>
                <input class="input" type="text" name="nombreUsuario" id="nombreUsuario" placeholder="Nombre Usuario">
                <input class="input" type="text" name="apellidoUsuario" id="apellidoUsuario" placeholder="Apellido Usuario">
                <input class="input" type="text" name="tipodocumento" id="tipodocumento" placeholder="Tipo de documento">
                <input class="input" type="number" name="numeroDocumento" id="numeroDocumento" placeholder="Numero de documento">
                <input class="input" type="number" name="celular" id="celular" placeholder="Numero de Celular">
                <input class="input" type="number" name="clave" id="clave" placeholder="Contraseña">
                <input type="checkbox" name="estado" id="estado" checked class="form-check-input">
                <label for="estado"> Activo</label>
                <p><button class="botons" name="accion" value="registrarme" type="submit">registrarme</button></p>
        </div>
</form>
        

</body>
</html>