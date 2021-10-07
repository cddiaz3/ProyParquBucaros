
import DAO.DAOVehiculos;
import db.ConexionDB;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christian Vargas
 */
public class Main {
    
    public static void main (String[] args ){
        
        DAOVehiculos vehiculosDAO = new DAOVehiculos();
        ConexionDB condb = new ConexionDB();
        
        System.out.println(condb.consultarVista("vistavehiculos"));
    }
    
}
