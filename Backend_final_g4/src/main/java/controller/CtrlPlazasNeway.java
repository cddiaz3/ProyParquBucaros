package controller;

import DAO.DAOPlazasNeway;
import TO.TOPlazasNeway;
import java.util.ArrayList;

public class CtrlPlazasNeway {

    DAOPlazasNeway plazasnewayDAO;
    
    public CtrlPlazasNeway() {
        plazasnewayDAO = new DAOPlazasNeway();
    }

        public CtrlPlazasNeway(DAOPlazasNeway plazasnewayDAO) {
        plazasnewayDAO = new DAOPlazasNeway();
    }

    public ArrayList<TOPlazasNeway> consultarUsuarios() {
        return plazasnewayDAO.consultarPlazasNeway();
    }

    public int insertarUsuarios(TOPlazasNeway plazaneway) {
        return plazasnewayDAO.insertarPlazasNeway(plazaneway);
    }

    public boolean modificarUsuarios(TOPlazasNeway plazaneway) {
        return plazasnewayDAO.modificarPlazasNeway(plazaneway);
    }

    public boolean eliminarUsuarios(int id) {
        return plazasnewayDAO.eliminarPlazasNeway(id);
    }

}
