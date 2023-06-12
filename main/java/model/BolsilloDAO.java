package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class BolsilloDAO {
    Connection con;
    PreparedStatement ps; //ppreparacion de la sentencia
    ResultSet rs; // almacena las consultas
    String sql=null;
    int r; //cantidad de filas que devuelve una sentencia

    public int recargar (BolsilloVO recargar) throws SQLException{
        sql="INSERT INTO Daviplata (recargar ) values(?)";
        try{
            con=Conexion.conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(3, recargar.getDinero());
            System.out.println(ps);
            ps.executeUpdate();
            ps.close();
            System.out.println("Recarga realizada correctamente");
        }catch(Exception e){
            System.out.println("Error en la recarga "+e.getMessage().toString());
        }
        finally{
            con.close();//CIERRE DE CONEXION
        }
        return r;
    }

    public int retiro (BolsilloVO retirar) throws SQLException{
        sql="INSERT INTO Daviplata (retirar) values(?)";
        try{
            con=Conexion.conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(4, retirar.getDinero());
            System.out.println(ps);
            ps.executeUpdate();
            ps.close();
            System.out.println("retiro correctamente");
        }catch(Exception e){
            System.out.println("Error en el retiro "+e.getMessage().toString());
        }
        finally{
            con.close();//CIERRE DE CONEXION
        }
        return r;
    }

    
    public int dinero (BolsilloVO consultar) throws SQLException{
        sql="INSERT INTO Daviplata (dinero) values(?)";
        try{
            con=Conexion.conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(4, consultar.getDinero());
            System.out.println(ps);
            ps.executeUpdate();
            ps.close();
            System.out.println("retiro correctamente");
        }catch(Exception e){
            System.out.println("Error en el retiro "+e.getMessage().toString());
        }
        finally{
            con.close();//CIERRE DE CONEXION
        }
        return r;
    }

public List<UsuarioVO> listar() throws SQLException{
    List<UsuarioVO> usuario=new ArrayList<>();
    sql="SELECT *from Usuario";
    try {
        con=Conexion.conectar();
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery(sql);
        while(rs.next()){
            UsuarioVO r=new UsuarioVO();
            //Escribir  en el setter cada valor encontrado
            r.setIdUsuario(rs.getInt("idUsuario"));
            r.setNombreUsuario(rs.getString("nombreUsuario"));
            r.setApellidoUsuario(rs.getString("apellidoUsuario"));
            r.setTipodocumento(rs.getString("tipodocumento"));
            r.setNumeroDocumento(rs.getInt("numeroDocumento"));
            r.setCelular(rs.getInt("numcelular"));
            r.setClave(rs.getInt("contraseña"));
            r.setEstado(rs.getBoolean("estado"));
            usuario.add(r);
        }

        ps.close();
        System.out.println("consulta exitosa");
    } catch (Exception e) {
        System.out.println("La consulta no pudo ser ejecutado "+e.getMessage().toString());
    }
    finally{
        con.close();
    }

    return usuario;
}

public int consultar (BolsilloVO dinero) throws SQLException{
    sql="INSERT INTO Daviplata (dinero) values(?)";
    try{
        con=Conexion.conectar();
        ps=con.prepareStatement(sql);
        ps.setInt(4, dinero.getDinero());
        System.out.println(ps);
        ps.executeUpdate();
        ps.close();
        System.out.println("consulta correctamente");
    }catch(Exception e){
        System.out.println("Error en la consulta "+e.getMessage().toString());
    }
    finally{
        con.close();//CIERRE DE CONEXION
    }
    return r;
}

}
