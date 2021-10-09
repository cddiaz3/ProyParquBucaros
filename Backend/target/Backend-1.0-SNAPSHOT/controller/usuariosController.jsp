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
} else {
    System.out.println("opcion no valida");
}
%>
