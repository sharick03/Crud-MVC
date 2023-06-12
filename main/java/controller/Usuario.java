package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.UsuarioDAO;
import model.UsuarioVO;

public class Usuario extends HttpServlet {
    UsuarioVO r=new UsuarioVO();
    UsuarioDAO rd=new UsuarioDAO();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Entró al DoGet");
        String a=req.getParameter("accion");
        switch (a){
            case "iniciarSesion":
                iniciarSesion(req, resp);
            break;
            case "registrarse":
                registrarse(req, resp);
            break;
            case "volver":
                volver(req, resp);
            break;
            case "listar":
                listar(req, resp);
            break;
            case "dashboard":
                dashboard(req, resp);
            break;
            case "usuario":
                usuario(req, resp);
            break;
            case "ForEditar":
                ForEditar (req, resp);
            break;

        }
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Entró al DoPost");
        String a=req.getParameter("accion");
        switch(a){
            case "ingresarB":
                ingresarB(req, resp);
            break;
            case "registrarme":
            registrarme(req, resp);
            dashboard(req, resp);
            break;
            case "editarU":
                editarU(req, resp);
            break;
            case "eliminarU":
           //     eliminarU(req, resp);
            break;
        }
    }

    private void iniciarSesion(HttpServletRequest req, HttpServletResponse resp) {
        try{
            req.getRequestDispatcher("views/login-add.jsp").forward(req, resp);
            System.out.println("Formulario login abierto");
        }catch(Exception e){
            System.out.println("Error al abrir el login");
        }
    }

    private void registrarse(HttpServletRequest req, HttpServletResponse resp) {
        try{
            req.getRequestDispatcher("views/registro.jsp").forward(req, resp);
            System.out.println("Formulario registro abierto");
        }catch(Exception e){
            System.out.println("Error al abrir el formulario de registro");
        }
    }

    private void volver(HttpServletRequest req, HttpServletResponse resp) {
        try{
            req.getRequestDispatcher("index.jsp").forward(req, resp);
            System.out.println("volver");
        }catch(Exception e){
            System.out.println("Error al volver");
        }
    }

    private void dashboard(HttpServletRequest req, HttpServletResponse resp) {
        try{
            req.getRequestDispatcher("views/dashboard.jsp").forward(req, resp);
            System.out.println("dashboard abierto");
        }catch(Exception e){
            System.out.println("Error al volver");
        }
    }
    private void usuario(HttpServletRequest req, HttpServletResponse resp) {
        try{
            req.getRequestDispatcher("views/listaU.jsp").forward(req, resp);
            System.out.println("Lista Abierta");
        }catch(Exception e){
            System.out.println("Error al abrir lista"+e.getMessage().toString());
        }
    }

    private void ForEditar(HttpServletRequest req, HttpServletResponse resp) {
        try{
            List usuario=rd.listar();
            req.setAttribute("usuarios", usuario);
            req.getRequestDispatcher("views/editarU.jsp").forward(req, resp);
            System.out.println("Formulario editar abierto");
        }catch(Exception e){
            System.out.println("Error al abrir formulario EDITAR"+e.getMessage().toString());
        }
    }

    private void ingresarB(HttpServletRequest req, HttpServletResponse resp) {
        if(req.getParameter("nombreUsuario")!=null){
            r.setNombreUsuario(req.getParameter("nombreUsuario"));
        }
        if(req.getParameter("clave")!=null){
            r.setClave(req.getIntHeader("clave"));
        }
        if(req.getParameter("estado")!=null){
            r.setEstado(true);
        }
        else{
            r.setEstado(false);
        }
        try {
            rd.ingresar(r);
            System.out.println("inicio correctamente");
            dashboard(req, resp);
        } catch (Exception e) {
            System.out.println("Error al iniciar"+e.getMessage().toString());
        }
    }
    
    private void registrarme(HttpServletRequest req, HttpServletResponse resp) {

        if(req.getParameter("nombreUsuario")!=null){
            r.setNombreUsuario(req.getParameter("nombreUsuario"));
        }
        if(req.getParameter("apellidoUsuario")!=null){
            r.setApellidoUsuario(req.getParameter("apellidoUsuario"));
        }
        if(req.getParameter("tipodocumento")!=null){
            r.setTipodocumento(req.getParameter("tipodocumento"));
        }
        if(req.getParameter("numeroDocumento")!=null){
            r.setNumeroDocumento(Integer.parseInt(req.getParameter("numeroDocumento")) );
            System.out.println(req.getIntHeader("numeroDocumento"));
        }
        if(req.getParameter("celular")!=null){
            r.setCelular(Integer.parseInt(req.getParameter("celular")) );
            System.out.println(req.getIntHeader("celular"));
        }
        if(req.getParameter("clave")!=null){
            r.setClave(Integer.parseInt(req.getParameter("clave")) );
            System.out.println(req.getIntHeader("clave"));
        }
        if(req.getParameter("estado")!=null){
            r.setEstado(true);
        }
        else{
            r.setEstado(false);
        }
        try {
            rd.registrarse(r);
            System.out.println("Registro insertado correctamente");
        } catch (Exception e) {
            System.out.println("Error en la inserción del registro "+e.getMessage().toString());
        }
    }

    private void editarU (HttpServletRequest req, HttpServletResponse resp) {

        if(req.getParameter("nombreUsuario")!=null){
            r.setNombreUsuario(req.getParameter("nombreUsuario"));
        }
        if(req.getParameter("apellidoUsuario")!=null){
            r.setApellidoUsuario(req.getParameter("apellidoUsuario"));
        }
        if(req.getParameter("tipodocumento")!=null){
            r.setTipodocumento(req.getParameter("tipodocumento"));
        }
        if(req.getParameter("numeroDocumento")!=null){
            r.setNumeroDocumento(Integer.parseInt(req.getParameter("numeroDocumento")));
        }
        if(req.getParameter("celular")!=null){
            r.setCelular(Integer.parseInt(req.getParameter("celular")));
        }
        if(req.getParameter("clave")!=null){
            r.setClave(Integer.parseInt(req.getParameter("clave")));
        }
        if(req.getParameter("estado")!=null){
            r.setEstado(true);
        }
        else{
            r.setEstado(false);
        }
            listar(req, resp);
        try {
            rd.editarU(r);
            System.out.println("Actualizado");
        } catch (Exception e) {
            System.out.println("Error en la inserción del registro "+e.getMessage().toString());
        }
    }

/*   private void eliminarU(HttpServletRequest req, HttpServletResponse resp) {

        if(req.getParameter("nombreUsuario")!=null){
            r.setNombreUsuario(req.getParameter("nombreUsuario"));
        }
        if(req.getParameter("apellidoUsuario")!=null){
            r.setApellidoUsuario(req.getParameter("apellidoUsuario"));
        }
        if(req.getParameter("tipodocumento")!=null){
            r.setTipodocumento(req.getParameter("tipodocumento"));
        }
        if(req.getParameter("numerodocumento")!=null){
            r.setNumeroDocumento(req.getIntHeader("numerodocumento"));
        }
        if(req.getParameter("celular")!=null){
            r.setCelular(req.getIntHeader("celular"));
        }
        if(req.getParameter("clave")!=null){
            r.setClave(req.getIntHeader("clave"));
        }
        if(req.getParameter("estado")!=null){
            r.setEstado(true);
        }
        else{
            r.setEstado(false);
        }
        try {
            rd.eliminarU(r);
            eliminarU(req, resp);
            System.out.println("Registro insertado correctamente");
        } catch (Exception e) {
            System.out.println("Error en la inserción del registro "+e.getMessage().toString());
        }
    }
*/
    private void listar(HttpServletRequest req, HttpServletResponse resp) {
        try {
            List usuario=rd.listar();
            req.setAttribute("usuarios", usuario);
            usuario(req, resp);
            System.out.println("Datos listados correctamente");
        } catch (Exception e) {
            System.out.println("Hay problemas al listar los datos "+e.getMessage().toString());
        }
    }

}