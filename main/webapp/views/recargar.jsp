<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <link rel="stylesheet" href="assets/css/estilos.css">
  <title>Recargar</title>
</head>
<body>
    <header class="header">
        <nav>
        <a class="btn" href="usuario?accion=dashboard"><button>Volver</button></a>
    </header>

    <form action="bolsillo" method="post">
        <div class="login-container">
            <div class="login-info-container">
              <h1 class="title">Recargar Cuenta</h1>
              <form class="inputs-container">
                  <input class="input" type="number" name="recargar" id="recargar" placeholder="Valor a recargar">
                  <button class="botons" type="submit" name="accion" value="recargar">Validar</button>
              </form>
            </div>
        </div>
</body>
</html>