<%@page import="com.google.gson.Gson"%>
<%@page import="TO.TOVehiculos"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controller.CtrlVehiculos"%><%@page contentType="text/html" pageEncoding="UTF-8"%>
<%CtrlVehiculos vehiculosCtrl = new CtrlVehiculos(); 
String opcion = request.getParameter("opcion");
if("listar".equals(opcion)){
    ArrayList<TOVehiculos> vehiculos =vehiculosCtrl.consultarVehiculos();
    out.print(new Gson().toJson(vehiculos));
} else {
    System.out.println("opcion no valida");
}
%>
