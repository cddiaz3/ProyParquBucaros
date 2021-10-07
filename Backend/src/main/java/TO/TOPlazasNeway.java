package TO;

public class TOPlazasNeway {
    
    private int idPlazasNeway;
    private String tipoPlaza;
    private String codigoPlaza;
    private String estadoPlaza;

    public TOPlazasNeway() {
    }

    public TOPlazasNeway(String tipoPlaza, String codigoPlaza, String estadoPlaza) {
        this.tipoPlaza = tipoPlaza;
        this.codigoPlaza = codigoPlaza;
        this.estadoPlaza = estadoPlaza;
    }

    public TOPlazasNeway(int idPlazasNeway, String tipoPlaza, String codigoPlaza, String estadoPlaza) {
        this.idPlazasNeway = idPlazasNeway;
        this.tipoPlaza = tipoPlaza;
        this.codigoPlaza = codigoPlaza;
        this.estadoPlaza = estadoPlaza;
    }
    
    public int getIdPlazasNeway() {
        return idPlazasNeway;
    }

    public void setIdPlazasNeway(int idPlazasNeway) {
        this.idPlazasNeway = idPlazasNeway;
    }

    public String getTipoPlaza() {
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
    }

}
