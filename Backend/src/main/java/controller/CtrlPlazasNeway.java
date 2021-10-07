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

    public ArrayList<TOPlazasNeway> consultarPlazasNeway() {
        return plazasnewayDAO.consultarPlazasNeway();
    }

    public int insertarPlazasNeway(TOPlazasNeway plazaneway) {
        return plazasnewayDAO.insertarPlazasNeway(plazaneway);
    }

    public boolean modificarPlazasNeway(TOPlazasNeway plazaneway) {
        return plazasnewayDAO.modificarPlazasNeway(plazaneway);
    }

    public boolean eliminarPlazasNeway(int id) {
        return plazasnewayDAO.eliminarPlazasNeway(id);
    }

}
