<%@page import="com.google.gson.Gson"%>
<%@page import="TO.TOUsuarios"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controller.CtrlUsuarios"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%CtrlUsuarios usuariosCtrl = new CtrlUsuarios(); 
String opcion = request.getParameter("opcion");
if("listar".equals(opcion)){
    ArrayList<TOUsuarios> usuarios =usuariosCtrl.consultarUsuarios();
    out.print(new Gson().toJson(usuarios));
}else if("login".equals(opcion)){
   String datos = request.getParameter("data");
   TOUsuarios usuario = new Gson().fromJson(datos, TOUsuarios.class);
   usuario = usuariosCtrl.verificarUsuario(usuario.getUsuario(), usuario.getContrasena());
   out.print(new Gson().toJson(usuario));
}else if("registrar".equals(opcion)){
    String usuario = request.getParameter("data");
    TOUsuarios usuariosTO = new Gson().fromJson(usuario, TOUsuarios.class);
    usuariosCtrl.insertarUsuarios(usuariosTO);
}else if("actualizar".equals(opcion)){

}else if("eliminar".equals(opcion)){

} else {
    System.out.println("opcion no valida");
}
%>
