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
        this.nombreTabla = "Usuarios";
        con = new ConexionDB();
    }

    public ArrayList<TOUsuarios> consultarUsuarios() {
        TOUsuarios usuario;
        ArrayList<TOUsuarios> usuarios = new ArrayList<>();
        try {
            ResultSet rs = con.consultar(nombreTabla);
            while (rs.next()) {
                usuario = new TOUsuarios();
                usuario.setApellidos(rs.getString("apellidos"));
                usuario.setClave(rs.getString("clave"));
                usuario.setCorreoInstitucional(rs.getString("correoInstitucional"));
                usuario.setCorreoPersonal(rs.getString("correoPersonal"));
                usuario.setDireccion(rs.getString("direccion"));
                usuario.setDocumento(rs.getString("documento"));
                usuario.setEstadoCivil(rs.getString("estadoCivil"));
                usuario.setFechaNacimiento(rs.getString("fechaNacimiento"));
                usuario.setIdUsuarios(rs.getInt("idUsuarios"));
                usuario.setNombres(rs.getString("nombres"));
                usuario.setTelefono(rs.getString("telefono"));
                usuario.setTipoDocumento(rs.getString("tipoDocumento"));
                usuario.setTipoUsuario(rs.getString("tipoUsuario"));
                usuario.setUsuario(rs.getString("usuario"));

                usuarios.add(usuario);
            }
            return usuarios;
        } catch (SQLException ex) {
            System.out.println("Error en DAOUsuarios.consultarUsuarios: " + ex.getMessage());
            return null;
        }
    }

    public int insertarUsuarios(TOUsuarios usuario) {
        try {
            if(usuario.getFechaNacimiento() == null)
                usuario.setFechaNacimiento("1900-01-01");
            String[] valores = {usuario.getNombres(), usuario.getApellidos(), usuario.getUsuario(), usuario.getClave(), usuario.getTipoDocumento(), usuario.getDocumento(), usuario.getDireccion(), usuario.getTelefono(), usuario.getCorreoPersonal(), usuario.getCorreoInstitucional(), usuario.getTipoUsuario(), usuario.getFechaNacimiento(), usuario.getEstadoCivil()};
        
            return con.insertar(nombreTabla, valores);
        } catch (Exception ex) {
            System.out.println("Error en DAOUsuarios.insertarUsuarios: " + ex.getMessage());
            return 0;
        }
    }
    
    public boolean modificarUsuarios(TOUsuarios usuario) {
        String[] valores = {usuario.getNombres(), usuario.getApellidos(), usuario.getUsuario(), usuario.getClave(), usuario.getTipoDocumento(), usuario.getDocumento(), usuario.getDireccion(), usuario.getTelefono(), usuario.getCorreoPersonal(), usuario.getCorreoInstitucional(), usuario.getTipoUsuario(), usuario.getFechaNacimiento().toString(), usuario.getEstadoCivil()};
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
    
    public TOUsuarios verificarUsuario(String usuario, String clave) {
        TOUsuarios usuarioTo = new TOUsuarios();
        try {
            ResultSet rs = con.consultarWhere(nombreTabla, " usuario = '" + usuario + "' AND clave = '" + clave + "'");
            while (rs.next()) {
                usuarioTo.setApellidos(rs.getString("apellidos"));
                usuarioTo.setClave(rs.getString("clave"));
                usuarioTo.setCorreoInstitucional(rs.getString("correoInstitucional"));
                usuarioTo.setCorreoPersonal(rs.getString("correoPersonal"));
                usuarioTo.setDireccion(rs.getString("direccion"));
                usuarioTo.setDocumento(rs.getString("documento"));
                usuarioTo.setEstadoCivil(rs.getString("estadoCivil"));
                usuarioTo.setFechaNacimiento(rs.getString("fechaNacimiento"));
                usuarioTo.setIdUsuarios(rs.getInt("idUsuarios"));
                usuarioTo.setNombres(rs.getString("nombres"));
                usuarioTo.setTelefono(rs.getString("telefono"));
                usuarioTo.setTipoDocumento(rs.getString("tipoDocumento"));
                usuarioTo.setTipoUsuario(rs.getString("tipoUsuario"));
                usuarioTo.setUsuario(rs.getString("usuario"));
            }
            return usuarioTo;
        } catch (SQLException ex) {
            System.out.println("Error en DAOUsuarios.verificarUsuario: " + ex.getMessage());
            return null;
        }
    }
}
