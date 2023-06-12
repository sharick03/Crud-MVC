<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="assets/css/estilos.css">
    <title>Proyecto Web</title>
</head>
<body>
    <header class="header">
        <a class="btn" href="usuario?accion=volver"><button>Volver</button></a>
        <nav>
			<ul class="nav-links">
				<li><a href="usuario?accion=registrarse">Registrarse</a></li>
			</ul>
		</nav>
    </header>

    <form action="usuario" method="post">
        <div class="login-container">
        <div class="login-info-container">
            <h1 class="title">Iniciar Sesion</h1>
            <form class="inputs-container">
                <input class="input" type="text" name="nombreUsuario" id="nombreUsuario" placeholder="Nombre Usuario">
                <input class="input" type="text" name="contraseña" id="contraseña" placeholder="Contraseña">
                <div class="form-check">
                    <input type="checkbox" name="chkestado" id="chkestado" checked class="form-check-input">
                    <label for="chkestado"> Activo</label>
                </div>
                <p><button type="submit" name="accion" value="ingresarB">Ingresar</button></p>
            </form>
        </div>
    </div>
</body>
</html>