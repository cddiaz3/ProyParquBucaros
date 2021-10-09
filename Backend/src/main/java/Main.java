
import DAO.DAOPlazasNeway;
import DAO.DAOVehiculos;
import db.ConexionDB;

public class Main {
    
    public static void main (String[] args ){
        
        DAOVehiculos vehiculosDAO = new DAOVehiculos();
        ConexionDB condb = new ConexionDB();
        
        System.out.println(condb.consultarVista("vistavehiculos"));
        
        DAOPlazasNeway plazasDAO = new DAOPlazasNeway();
        ConexionDB condbplaza = new ConexionDB();
        
        System.out.println(condb.consultarVista("vistavehiculos"));
    }
    
}
