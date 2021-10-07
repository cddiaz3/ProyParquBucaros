package DAO;

import TO.TOPlazasNeway;
import TO.TOUsuarios;
import TO.TOVehiculos;
import db.ConexionDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



public class DAOVehiculos {

    private final ConexionDB con;
    private final String nombreTabla;
    private final String nombreVista;

    public DAOVehiculos() {
        con = new ConexionDB();
        this.nombreTabla = "vehiculos";
        this.nombreVista = "vistavehiculos";
    }

    public ArrayList<TOVehiculos> consultarVehiculos() {
        TOVehiculos vehiculo;
        ArrayList<TOVehiculos> vehiculos = new ArrayList<>();
        try {
            ResultSet rs = con.consultarVista(nombreVista);
            while (rs.next()) {
                vehiculo = new TOVehiculos();
                TOUsuarios usuario = new TOUsuarios();
                TOPlazasNeway plaza = new TOPlazasNeway();
                
                vehiculo.setIdVehiculos(rs.getInt("idvehiculos"));
                vehiculo.setPlaca(rs.getString("placa"));
                vehiculo.setTipoVehiculo(rs.getString("tipoVehiculo"));
                vehiculo.setHoraEntrada(rs.getTimestamp("horaEntrada"));
                vehiculo.setHoraSalida(rs.getTimestamp("horaSalida"));
                vehiculo.setValorMinuto(rs.getDouble("valorMinuto"));
                vehiculo.setValorPagar(rs.getDouble("valorPagar"));
                
                vehiculo.setIdPlazaVehiculo(rs.getInt("idPlazaVehiculo"));
                vehiculo.setIdUsuarioVehiculo(rs.getInt("idUsuarioVehiculo"));

                vehiculos.add(vehiculo); //  ¿qué se agrega acá o está bien?
            }
            return vehiculos;
        } catch (SQLException ex) {
            System.out.println("Error en DAO Users.consultarVehiculos: " + ex.getMessage());
            return null;
        }
    }
    
    public ArrayList<TOVehiculos> consultarvistaVehiculos() {
        TOVehiculos vehiculo;
        ArrayList<TOVehiculos> vehiculos = new ArrayList<>();
        try {
            ResultSet rs = con.consultarVista(nombreVista);
            while (rs.next()) {
                vehiculo = new TOVehiculos();
                TOUsuarios usuario = new TOUsuarios();
                TOPlazasNeway plaza = new TOPlazasNeway();
                
                vehiculo.setIdVehiculos(rs.getInt("idvehiculos"));
                vehiculo.setPlaca(rs.getString("placa"));
                vehiculo.setTipoVehiculo(rs.getString("tipoVehiculo"));
                vehiculo.setHoraEntrada(rs.getTimestamp("horaEntrada"));
                vehiculo.setHoraSalida(rs.getTimestamp("horaSalida"));
                vehiculo.setValorMinuto(rs.getDouble("valorMinuto"));
                vehiculo.setValorPagar(rs.getDouble("valorPagar"));
                
                vehiculo.setIdPlazaVehiculo(rs.getInt("idPlazaVehiculo"));
                vehiculo.setIdUsuarioVehiculo(rs.getInt("idUsuarioVehiculo"));
                
                //plaza.setIdPlazasNeway(rs.getInt("idPlazasneway"));
                plaza.setTipoPlaza(rs.getString("tipoPlaza"));
                plaza.setCodigoPlaza(rs.getString("codigoPlaza"));
                plaza.setEstadoPlaza(rs.getString("estadoPlaza"));
                
                //usuario.setIdUsers(rs.getInt("idUsuarios"));
                usuario.setUsuario(rs.getString("usuario"));
                usuario.setContraseña(rs.getString("contrasena"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setApellido(rs.getString("apellido"));
                usuario.setEmail(rs.getString("email"));
                usuario.setTipoDocumento(rs.getString("tipoDocumento"));
                usuario.setDocumento(rs.getString("documento"));
                usuario.setCelular(rs.getString("celular"));

                vehiculos.add(vehiculo); //  ¿qué se agrega acá o está bien?
            }
            return vehiculos;
        } catch (SQLException ex) {
            System.out.println("Error en DAO Users.consultarvistaVehiculos: " + ex.getMessage());
            return null;
        }
    }

    public int insertarVehiculos(TOVehiculos vehiculo) {
        String[] valores = {
            
            vehiculo.getPlaca(),
            vehiculo.getTipoVehiculo(),
            vehiculo.getHoraEntrada().toString(),
            vehiculo.getHoraSalida().toString(),
            vehiculo.getValorMinuto().toString(),
            vehiculo.getValorPagar().toString(),
            String.valueOf(vehiculo.getIdPlazaVehiculo()),
            String.valueOf(vehiculo.getIdUsuarioVehiculo()),
            
            vehiculo.getUsuario().getUsuario(),//hacer esto con todas los cambios
            vehiculo.getUsuario().getContrasena(), 
            vehiculo.getUsuario().getNombre(), 
            vehiculo.getUsuario().getApellido(), 
            vehiculo.getUsuario().getEmail(),
            vehiculo.getUsuario().getTipoDocumento(),
            vehiculo.getUsuario().getDocumento(),
            vehiculo.getUsuario().getCelular(),
            
            vehiculo.getPlaza().getTipoPlaza(),
            vehiculo.getPlaza().getCodigoPlaza(),
            vehiculo.getPlaza().getEstadoPlaza()};
        try {
            return con.insertar(nombreVista, valores);
        } catch (Exception ex) {
            System.out.println("Error en DAO Vehicles.insertarVehicles: " + ex.getMessage());
            return 0;
        }
    }

    public boolean modificarVehiculos(TOVehiculos vehicle) {
        String[] valores = {

            vehicle.getPlaca(),
            vehicle.getTipoVehiculo(),
            vehicle.getHoraEntrada().toString(),
            vehicle.getHoraSalida().toString(),
            vehicle.getValorMinuto().toString(),
            vehicle.getValorPagar().toString(),
            String.valueOf(vehicle.getIdPlazaVehiculo()),
            String.valueOf(vehicle.getIdUsuarioVehiculo()),
            
            vehicle.getUsuario().getUsuario(), 
            vehicle.getUsuario().getContrasena(), 
            vehicle.getUsuario().getNombre(), 
            vehicle.getUsuario().getApellido(), 
            vehicle.getUsuario().getEmail(),
            vehicle.getUsuario().getTipoDocumento(),
            vehicle.getUsuario().getDocumento(),
            vehicle.getUsuario().getApellido(),
            
            vehicle.getPlaza().getTipoPlaza(),
            vehicle.getPlaza().getCodigoPlaza(),
            vehicle.getPlaza().getEstadoPlaza()};
        try {
            return con.actualizar(nombreVista, valores, vehicle.getIdVehiculos());
        } catch (Exception ex) {
            System.out.println("Error en DAO Vehicles.modificarVehicles: " + ex.getMessage());
            return false;
        }
    }

    public boolean eliminarVehiculos(int id) {
        try {
            return con.eliminar(nombreVista, id);
        } catch (Exception ex) {
            System.out.println("Error en DAO Vehicles.eliminarVehicles: " + ex.getMessage());
            return false;
        }
    }

}
