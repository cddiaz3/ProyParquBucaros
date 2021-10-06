<%@page import="TO.TOUsuarios"%>
<%@page import="com.google.gson.Gson"%>
<%@page import="TO.TOProfesores"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controller.CtrlProfesores"%>
<%CtrlProfesores profesoresCtrl = new CtrlProfesores();
String opcion = request.getParameter("opcion");
if("listar".equals(opcion)){
    ArrayList<TOProfesores> profesores = profesoresCtrl.consultarProfesores();
    out.print(new Gson().toJson(profesores));
}else if("insertar".equals(opcion)){
    String datos = request.getParameter("data");
    TOUsuarios usuariosTo = new Gson().fromJson(datos, TOUsuarios.class);
    TOProfesores profesorTo = new Gson().fromJson(datos, TOProfesores.class);
    profesoresCtrl.insertarProfesores(usuariosTo, profesorTo);
}else if("actualizar".equals(opcion)){
    String datos = request.getParameter("data");
    TOUsuarios usuariosTo = new Gson().fromJson(datos, TOUsuarios.class);
    TOProfesores profesorTo = new Gson().fromJson(datos, TOProfesores.class);
    profesoresCtrl.modificarProfesores(usuariosTo, profesorTo);
}else if("eliminar".equals(opcion)){
    String datos = request.getParameter("data");
    TOProfesores profesorTo = new Gson().fromJson(datos, TOProfesores.class);
    profesoresCtrl.eliminarProfesores(profesorTo);
}else{
    out.print("Opcion no valida");
}

%>
