<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Proyecto Web</title>
    <link rel="stylesheet" href="assets/css/estilos.css">
</head>
<body>
    <header class="header">
        <nav>
			<ul class="nav-links">
				<li><a href="usuario?accion=listar">Usuarios</a></li>
			</ul>
		 </nav>
        <a class="btn" href="usuario?accion=registrarse"><button>Registrarse</button></a>
    </header>

    <div class="container-card">
        <div class="card">
            <figure>
                <img src="assets/img/daviplata-logo.png">
            </figure>
            <div class="contenido-card">
                <a href="usuario?accion=iniciarSesion">Ingresar </a>
            </div>
        </div>
        <div class="card">
            <figure>
                <img src="assets/img/nequi-logo.png">
            </figure>
            <div class="contenido-card">
                <a href="usuario?accion=iniciarSesion">Ingresar </a>
            </div>
        </div>
    </div>

    <main>
        <section class="acerca-de">
            <div class="contenedor">
                <h2 class="sobre-nosotros">Sobre nosotros</h2>
                <h3 class="slogan">Bienvenito a tu Bolsillo Digital</h3>
                <p class="parrafo">En Nequi & Daviplata, nos apasiona facilitar tu vida financiera y brindarte
                    soluciones innovadoras para que administres tu dinero de manera inteligente. Aquí tienes
                    un vistazo de quiénes somos y qué ofrecemos:</p>
                <p class="parrafo">Nuestra misión: Nuestra misión es empoderarte para que tomes personales
                    el control de tus finanzas de manera sencilla y segura. Queremos ser tu compañero
                    confiable en el camino hacia la libertad financiera.</p>
            </div>
        </section>
        <section class="miembros">
            <div class="contenedor">
                <h2 class="sobre-nosotros">Nuestro equipo</h2>
                <div class="cards">
                    <div class="card">
                        <img src="assets/img/bancolombia.png" alt="logo bancolombia">
                    </div>
                    <div class="card">
                        <img src="assets/img/davivienda.png" alt="logo davivienda">
                    </div>
                </div>
            </div>
        </section>
        
    </main>
    <footer>
        <div class="contenedor">
            <h2 class="titulo-footer">Contactanos</h2>
            <h3 class="subtitulo-footer">Lo apreciariamos mucho</h3>
            <div class="footer">
                <form action="">
                    <input type="text" name="" id="" placeholder="Nombre">
                    <input type="email" name="" id="" placeholder="Email">
                <p><a class="botons" href="#" type="submit">Ingresar</a></p>
                </form>
            </div>
        </div>
        </div>
    </footer>

</body>
</html>