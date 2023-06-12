package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

    //ATRIBUTOS PARA OPERACIONES PARA LA BD
    Connection con;
    PreparedStatement ps; //ppreparacion de la sentencia
    ResultSet rs; // almacena las consultas
    String sql=null;
    int r; //cantidad de filas que devuelve una sentencia

    public int ingresar (UsuarioVO usuario) throws SQLException{
        sql="INSERT* FROM Usuario(nombreUsuario,apellidoUsuario,tipodocumento,numeroDocumento,celular,clave, estado ) values(?,?,?,?,?,?,?)";
        try{
            con=Conexion.conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1, usuario.getNombreUsuario());
            ps.setInt(6, usuario.getClave());
            ps.setBoolean(7, usuario.getEstado());
            System.out.println(ps);
            ps.executeUpdate();
            ps.close();
        }catch(Exception e){
        }
        finally{
            con.close();//CIERRE DE CONEXION
        }
        return r;
    }

    public int registrarse (UsuarioVO usuario) throws SQLException{
        sql="INSERT INTO Usuario(nombreUsuario,apellidoUsuario,tipodocumento,numeroDocumento,celular,clave, estado ) values(?,?,?,?,?,?,?)";
        try{
            con=Conexion.conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1, usuario.getNombreUsuario());
            ps.setString(2, usuario.getApellidoUsuario());
            ps.setString(3, usuario.getTipodocumento());
            ps.setInt(4, usuario.getNumeroDocumento());
            ps.setInt(5, usuario.getCelular());
            ps.setInt(6, usuario.getClave());
            ps.setBoolean(7, usuario.getEstado());
            System.out.println(ps);
            ps.executeUpdate();
            ps.close();
        }catch(Exception e){
        }
        finally{
            con.close();//CIERRE DE CONEXION
        }
        return r;
    }

    public int editarU (UsuarioVO usuario) throws SQLException{
        sql="UPDATE Usuario SET  nombreUsuario=?,apellidoUsuario=?,tipodocumento=?,numeroDocumento=?,celular=?,clave=?, estado=? where IdUsuario= ?";
        try{
            con=Conexion.conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1, usuario.getNombreUsuario());
            ps.setString(2, usuario.getApellidoUsuario());
            ps.setString(3, usuario.getTipodocumento());
            ps.setInt(4, usuario.getNumeroDocumento());
            ps.setInt(5, usuario.getCelular());
            ps.setInt(6, usuario.getClave());
            ps.setBoolean(7, usuario.getEstado());
            ps.setInt(8, usuario.getIdUsuario());
            System.out.println(sql);
            ps.executeUpdate();//Ejecutar Sentencia
            ps.close();//cerrar sentencia
            System.out.println("Editar Dao abierto");
        }catch(Exception e){
            System.out.println("Error al actualizar DAO"+e.getMessage().toString());
        }
        finally{
            con.close();//CIERRE DE CONEXION
        }
        return r;
    }

    
/*    public int eliminarU (UsuarioVO usuario) throws SQLException{
        sql="DELETE FROM Usuario WHERE (idUsuario ) values(?)";
        try{
            con=Conexion.conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, usuario.getIdUsuario());
            
            System.out.println(ps);
            ps.executeUpdate();
            ps.close();
            System.out.println("Se elimino el usuario correctamente");
        }catch(Exception e){
            System.out.println("Error en la eliminacion "+e.getMessage().toString());
        }
        finally{
            con.close();//CIERRE DE CONEXION
        }
        return r;
    }
  */
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
            r.setCelular(rs.getInt("celular"));
            r.setClave(rs.getInt("clave"));
            r.setEstado(rs.getBoolean("estado"));
            usuario.add(r);
        }
        System.out.println(r);
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

}
