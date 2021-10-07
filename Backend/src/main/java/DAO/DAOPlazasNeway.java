package DAO;

import TO.TOPlazasNeway;
import db.ConexionDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAOPlazasNeway {

    private final ConexionDB con;
    private final String nombreTabla;

    public DAOPlazasNeway() {
        con = new ConexionDB();
        this.nombreTabla = "plazasneway";
    }

    public ArrayList<TOPlazasNeway> consultarPlazasNeway() {
        TOPlazasNeway plazaneway;
        ArrayList<TOPlazasNeway> plazasNeway = new ArrayList<>();
        try {
            ResultSet rs = con.consultar(nombreTabla);
            while (rs.next()) {

                plazaneway = new TOPlazasNeway();
                
                plazaneway.setIdPlazasNeway(rs.getInt("idPlazasNeway")); ///
                plazaneway.setTipoPlaza(rs.getString("tipoPlaza"));
                plazaneway.setCodigoPlaza(rs.getString("codigoPlaza"));
                plazaneway.setEstadoPlaza(rs.getString("estadoPlaza"));

                plazasNeway.add(plazaneway);
            }
            return plazasNeway;
        } catch (SQLException ex) {
            System.out.println("Error en DAO PlazasNeway.consultarPlazasNeay: " + ex.getMessage());
            System.out.println(ex.getMessage());
            return null;
        }
    }

    public int insertarPlazasNeway(TOPlazasNeway plazaneway) {
        String[] valores = {
            plazaneway.getTipoPlaza(),
            plazaneway.getCodigoPlaza(),
            plazaneway.getEstadoPlaza()};

        try {
            return con.insertar(nombreTabla, valores);
        } catch (Exception ex) {
            System.out.println("Error en DAO PlazasNeway.insertarPlazasNeway: " + ex.getMessage());
            return 0;
        }
    }

    public boolean modificarPlazasNeway(TOPlazasNeway plazaneway) {
        String[] valores = {
            plazaneway.getTipoPlaza(),
            plazaneway.getCodigoPlaza(),
            plazaneway.getEstadoPlaza()};
        try {
            return con.actualizar(nombreTabla, valores, plazaneway.getIdPlazasNeway());
        } catch (Exception ex) {
            System.out.println("Error en DAO PlazasNeway.modificarPlazasNeway: " + ex.getMessage());
            return false;
        }
    }

    public boolean eliminarPlazasNeway(int id) {
        try {
            return con.eliminar(nombreTabla, id);
        } catch (Exception ex) {
            System.out.println("Error en DAO PlazasNeway.eliminarPlazasNeway: " + ex.getMessage());
            return false;
        }
    }

}
