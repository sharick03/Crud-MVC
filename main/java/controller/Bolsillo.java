package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BolsilloDAO;
import model.BolsilloVO;

public class Bolsillo extends HttpServlet {
    BolsilloVO r=new BolsilloVO();
    BolsilloDAO rd=new BolsilloDAO();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Entró al DoGet");
        String a=req.getParameter("accion");
        switch (a){
            case "recargarB":
                recargarB(req, resp);
            break;
            case "retirarB":
                retirarB(req, resp);
            break;
            case "consultar":
                consultar(req, resp);
            break;
            case "dashboard":
                dashboard(req, resp);
            break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Entró al DoPost");
        String a=req.getParameter("accion");
        switch(a){
            case "recargar":
                    recargar(req,resp);
            break;
            case "retirar":
                retirar(req, resp);
            break;
            case "consultar":
                consultar(req, resp);
            break;
        }
    }
    private void consultar(HttpServletRequest req, HttpServletResponse resp) {
        try{
            req.getRequestDispatcher("views/consultar.jsp").forward(req, resp);
        }catch(Exception e){
        }
    }

      private void retirarB(HttpServletRequest req, HttpServletResponse resp) {
        try{
            req.getRequestDispatcher("views/retirar.jsp").forward(req, resp);
            System.out.println("Formulario retirar abierto");
        }catch(Exception e){
            System.out.println("Error para abrir Formulario retirar ");
        }
    }
     private void recargarB(HttpServletRequest req, HttpServletResponse resp) {
        try{
            req.getRequestDispatcher("views/recargar.jsp").forward(req, resp);
            System.out.println("Formulario recargar abierto");
        }catch(Exception e){
            System.out.println("Error al abrir formulario recargar"+e.getMessage().toString());
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

    private void recargar(HttpServletRequest req, HttpServletResponse resp) {
        if(req.getParameter("recargar")!=null){
            r.setRecargar(req.getIntHeader("recargar"));
        }
        try {
            rd.recargar(r);
            System.out.println("recarga Realizada ");
        } catch (Exception e) {
            System.out.println("Error al recargar"+e.getMessage().toString());
        }
    }

    private void retirar(HttpServletRequest req, HttpServletResponse resp) {
        if(req.getParameter("retiro")!=null){
            r.setRecargar(req.getIntHeader("retiro"));
        }
        try {
            rd.retiro(r);
        } catch (Exception e) {
    }
    }
}