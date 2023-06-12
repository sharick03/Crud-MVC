<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="UTF-8">
	<title>Dashboard</title>
	<link rel="stylesheet" href="assets/css/estilos.css">
</head>
<body>
    <header class="header">
        <nav>
			<ul class="nav-links">
				 <li><a href="usuario?accion=listar">Usuarios</a></li>
			</ul>
		 </nav>
        <a class="btn" href="usuario?accion=volver"><button>Volver</button></a>
    </header>
	<div class="container-card">
	<div class="card">
		<figure>
			<img src="assets/img/retirar.webp">
		</figure>
		<div class="contenido-card">
			<h3>Retirar Dinero</h3>
			<a input type="text" name="retirar" href="bolsillo?accion=retirarB">Retirar</a>
		</div>
	</div>
	<div class="card">
		<figure>
			<img src="assets/img/consultarsaldo.png">
		</figure>
		<div class="contenido-card">
			<h3>Consultar Saldo</h3>
			<a input type="text" name="consultar" href="bolsillo?accion=consultar">Consultar</a>
		</div>
	</div>
	<div class="card">
		<figure>
			<img src="assets/img/recargar.jpg">
		</figure>
		<div class="contenido-card">
			<h3>Recargar Cuenta</h3>
			<a input type="text" name="recargar" href="bolsillo?accion=recargarB">Recargar</a>
		</div>
	</div>
	</div>
</body>
</html>