package controller;

import DAO.DAOVehiculos;
import TO.TOVehiculos;
import java.util.ArrayList;

public class CtrlVehiculos {
    
    DAOVehiculos vehiculosDAO;
    CtrlPlazasNeway plazasNewayCtrl;
    
    public CtrlVehiculos() {
        vehiculosDAO = new DAOVehiculos();
    }
               
    public ArrayList<TOVehiculos> consultarVehiculos() {
        return vehiculosDAO.consultarVehiculos();
    }    
    
    public int insertarVehiculos(TOVehiculos vehiculo) {    
        plazasNewayCtrl = new CtrlPlazasNeway();
        return vehiculosDAO.insertarVehiculos(vehiculo);        
    }
    
    public boolean modificarVehiculos(TOVehiculos vehiculo) {        
        return vehiculosDAO.modificarVehiculos(vehiculo);
    }
    
    public boolean eliminarVehiculos(int id) {
        return vehiculosDAO.eliminarVehiculos(id);        
    }
    
}
