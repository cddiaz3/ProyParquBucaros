package DAO;

import TO.TOUsuarios;
import db.ConexionDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAOUsuarios {

    private final ConexionDB con;
    private final String nombreTabla;

    public DAOUsuarios() {
        con = new ConexionDB();
        this.nombreTabla = "usuarios";
    }

    public ArrayList<TOUsuarios> consultarUsuarios() {
        TOUsuarios usuario;
        ArrayList<TOUsuarios> usuarios = new ArrayList<>();
        try {
            ResultSet rs = con.consultar(nombreTabla);
            while (rs.next()) {
                
                usuario = new TOUsuarios();
                
                usuario.setIdUsuarios(rs.getInt("idUsuarios"));
                usuario.setUsuario(rs.getString("usuario"));
                usuario.setContraseña(rs.getString("contrasena"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setApellido(rs.getString("apellido"));
                usuario.setEmail(rs.getString("email"));
                usuario.setTipoDocumento(rs.getString("tipoDocumento"));
                usuario.setDocumento(rs.getString("documento"));
                usuario.setCelular(rs.getString("celular"));  

                usuarios.add(usuario);
            }
            return usuarios;
        } catch (SQLException ex) {
            System.out.println("Error en DAOUsuarios.consultarUsuarios: " + ex.getMessage());
            return null;
        }
    }

    public int insertarUsuarios(TOUsuarios usuario) {
        String[] valores = {usuario.getUsuario(), usuario.getContrasena(), usuario.getNombre(), usuario.getApellido(), usuario.getEmail(), usuario.getTipoDocumento(), usuario.getDocumento(), usuario.getCelular()};
        try {
            return con.insertar(nombreTabla, valores);
        } catch (Exception ex) {
            System.out.println("Error en DAOUsuarios.insetarUsuarios: " + ex.getMessage());
            return 0;
        }
    }
    
    public boolean modificarUsuarios(TOUsuarios usuario) {
        String[] valores = {usuario.getUsuario(), usuario.getContrasena(), usuario.getNombre(), usuario.getApellido(), usuario.getEmail(), usuario.getTipoDocumento(), usuario.getDocumento(), usuario.getCelular()};
        try {
            return con.actualizar(nombreTabla, valores, usuario.getIdUsuarios());
        } catch (Exception ex) {
            System.out.println("Error en DAOUsuarios.modificarUsuarios: " + ex.getMessage());
            return false;
        }
    }
    
    public boolean eliminarUsuarios(int id) {
        try {
            return con.eliminar(nombreTabla, id);
        } catch (Exception ex) {
            System.out.println("Error en DAOUsuarios.eliminarUsuarios: " + ex.getMessage());
            return false;
        }
    }
    
    public TOUsuarios verificarUsuario(String usuario, String contrasena) {
        TOUsuarios usuarioTo = new TOUsuarios();
        try {
            ResultSet rs = con.consultarWhere(nombreTabla, " usuario = '" + usuario + "' AND contrasena = '" + contrasena + "'");
            while (rs.next()) {
                usuarioTo.setIdUsuarios(rs.getInt("idUsuarios"));
                usuarioTo.setUsuario(rs.getString("usuario"));
                usuarioTo.setContraseña(rs.getString("contrasena"));
                usuarioTo.setNombre(rs.getString("nombre"));
                usuarioTo.setApellido(rs.getString("apellido"));
                usuarioTo.setEmail(rs.getString("email"));
                usuarioTo.setTipoDocumento(rs.getString("tipoDocumento"));
                usuarioTo.setDocumento(rs.getString("documento"));
                usuarioTo.setCelular(rs.getString("celular"));
               
            }
            return usuarioTo;
        } catch (SQLException ex) {
            System.out.println("Error en DAOUsuarios.verificarUsuario: " + ex.getMessage());
            return null;
        }
    }
}
