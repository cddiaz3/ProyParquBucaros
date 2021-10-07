package DAO;

import TO.TOProfesores;
import db.ConexionDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAOProfesores {

    private final ConexionDB con;
    private final String nombreTabla;
    private final String nombreVista;

    public DAOProfesores() {
        this.nombreTabla = "Profesores";
        this.nombreVista = "vistaprofesores";
        con = new ConexionDB();
    }

    public ArrayList<TOProfesores> consultarProfesores() {
        TOProfesores profesor;
        ArrayList<TOProfesores> profesores = new ArrayList<>();
        try {
            ResultSet rs = con.consultar(nombreVista);
            while (rs.next()) {
                profesor = new TOProfesores();
                profesor.setApellidos(rs.getString("apellidos"));
                profesor.setClave(rs.getString("clave"));
                profesor.setCorreoInstitucional(rs.getString("correoInstitucional"));
                profesor.setCorreoPersonal(rs.getString("correoPersonal"));
                profesor.setDireccion(rs.getString("direccion"));
                profesor.setDocumento(rs.getString("documento"));
                profesor.setEstadoCivil(rs.getString("estadoCivil"));
                profesor.setFechaNacimiento(rs.getString("fechaNacimiento"));
                profesor.setIdUsuarios(rs.getInt("idUsuarios"));
                profesor.setNombres(rs.getString("nombres"));
                profesor.setTelefono(rs.getString("telefono"));
                profesor.setTipoDocumento(rs.getString("tipoDocumento"));
                profesor.setTipoUsuario(rs.getString("tipoUsuario"));
                profesor.setUsuario(rs.getString("usuario"));
                profesor.setIdProfesores(rs.getInt("idProfesores"));
                profesor.setIdUsuariosProfesores(rs.getInt("idUsuariosProfesores"));
                profesor.setSalario(rs.getDouble("salario"));
                profesor.setTipoContrato(rs.getString("tipoContrato"));
                profesor.setTitulo(rs.getString("titulo"));
                profesor.setCategoria(rs.getString("categoria"));
                profesores.add(profesor);
            }
            return profesores;
        } catch (SQLException ex) {
            System.out.println("Error en DAOProfesores.consultarProfesores: " + ex.getMessage());
            return null;
        }
    }

    public int insertarProfesores(TOProfesores profesor) {
        String[] valores = {String.valueOf(profesor.getIdUsuariosProfesores()), profesor.getTipoContrato(), String.valueOf(profesor.getSalario()), profesor.getTitulo(), profesor.getCategoria()};
        try {
            return con.insertar(nombreTabla, valores);
        } catch (Exception ex) {
            System.out.println("Error en DAOProfesores.insertarProfesores: " + ex.getMessage());
            return 0;
        }
    }
    
    public boolean modificarProfesores(TOProfesores profesor) {
        String[] valores = {String.valueOf(profesor.getIdUsuariosProfesores()), profesor.getTipoContrato(), String.valueOf(profesor.getSalario()), profesor.getTitulo(), profesor.getCategoria()};
        try {
            return con.actualizar(nombreTabla, valores, profesor.getIdProfesores());
        } catch (Exception ex) {
            System.out.println("Error en DAOProfesores.modificarProfesores: " + ex.getMessage());
            return false;
        }
    }
    
    public boolean eliminarProfesores(int id) {
        try {
            return con.eliminar(nombreTabla, id);
        } catch (Exception ex) {
            System.out.println("Error en DAOProfesores.eliminarProfesores: " + ex.getMessage());
            return false;
        }
    }
}
