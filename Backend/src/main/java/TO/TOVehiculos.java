package TO;

import java.sql.Timestamp;
import java.util.Date;

public class TOVehiculos{
    
    private int idVehiculos; 
    private String placa; 
    private String tipoVehiculo; 
    private Timestamp horaEntrada;
    private Timestamp horaSalida;
    private Double valorMinuto; 
    private Double valorPagar;
    
    private int idPlazaVehiculo; 
    private int idUsuarioVehiculo;
    
    
    private TOUsuarios usuario;
    private TOPlazasNeway plaza;
    
    
    /*private String tipoPlaza;
    private String codigoPlaza;
    private String estadoPlaza;*/

    public TOVehiculos() {
    }
    
    public int getIdVehiculos() {
        return idVehiculos;
    }

    public void setIdVehiculos(int idVehiculos) {
        this.idVehiculos = idVehiculos;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public Date getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Timestamp horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Date getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Timestamp horaSalida) {
        this.horaSalida = horaSalida;
    }

    public Double getValorMinuto() {
        return valorMinuto;
    }

    public void setValorMinuto(Double valorMinuto) {
        this.valorMinuto = valorMinuto;
    }

    public Double getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(Double valorPagar) {
        this.valorPagar = valorPagar;
    }

    public int getIdPlazaVehiculo() {
        return idPlazaVehiculo;
    }

    public void setIdPlazaVehiculo(int idPlazaVehiculo) {
        this.idPlazaVehiculo = idPlazaVehiculo;
    }

    public int getIdUsuarioVehiculo() {
        return idUsuarioVehiculo;
    }

    public void setIdUsuarioVehiculo(int idUsuarioVehiculo) {
        this.idUsuarioVehiculo = idUsuarioVehiculo;
    }

    public TOUsuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(TOUsuarios usuario) {
        this.usuario = usuario;
    }

    public TOPlazasNeway getPlaza() {
        return plaza;
    }

    public void setPlaza(TOPlazasNeway plaza) {
        this.plaza = plaza;
    }
    
    /*public String getTipoPlaza() {
        return tipoPlaza;
    }

    public void setTipoPlaza(String tipoPlaza) {
        this.tipoPlaza = tipoPlaza;
    }

    public String getCodigoPlaza() {
        return codigoPlaza;
    }

    public void setCodigoPlaza(String codigoPlaza) {
        this.codigoPlaza = codigoPlaza;
    }

    public String getEstadoPlaza() {
        return estadoPlaza;
    }

    public void setEstadoPlaza(String estadoPlaza) {
        this.estadoPlaza = estadoPlaza;
    }*/
   
}
