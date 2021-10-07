<%@page import="TO.TOPlazasNeway"%>
<%@page import="com.google.gson.Gson"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controller.CtrlPlazasNeway"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%CtrlPlazasNeway plazasCtrl = new CtrlPlazasNeway();
String opcion = request.getParameter("opcion");
if("listar".equals(opcion)){
    ArrayList<TOPlazasNeway> plazas = plazasCtrl.consultarPlazasNeway();
    out.print(new Gson().toJson(plazas));
} else {
    System.out.println("opcion no valida");
}
%>