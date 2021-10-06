package controller;

import DAO.DAOProfesores;
import TO.TOProfesores;
import TO.TOUsuarios;
import java.util.ArrayList;

public class CtrlProfesores {

    DAOProfesores profesoresDAO;
    CtrlUsuarios usuariosCtrl;

    public CtrlProfesores() {
        profesoresDAO = new DAOProfesores();
    }

    public ArrayList<TOProfesores> consultarProfesores() {
        return profesoresDAO.consultarProfesores();
    }

    public int insertarProfesores(TOUsuarios usuario, TOProfesores profesor) {
        usuariosCtrl = new CtrlUsuarios();
        usuario.setTipoUsuario("profesor");
        profesor.setIdUsuariosProfesores(usuariosCtrl.insertarUsuarios(usuario));
        return profesoresDAO.insertarProfesores(profesor);
    }

    public boolean modificarProfesores(TOUsuarios usuario, TOProfesores profesor) {
        usuariosCtrl = new CtrlUsuarios();
        usuario.setIdUsuarios(profesor.getIdUsuariosProfesores());
        usuariosCtrl.modificarUsuarios(usuario);
        return profesoresDAO.modificarProfesores(profesor);
    }

    public boolean eliminarProfesores(TOProfesores profesor) {
        profesoresDAO.eliminarProfesores(profesor.getIdProfesores());
        usuariosCtrl = new CtrlUsuarios();
        return usuariosCtrl.eliminarUsuarios(profesor.getIdUsuariosProfesores());      
    }

}
