package TO;

public class TOGrados{
    
  private int idGrados;
  private String nombreGrado;
  private String salon;
  private int cupoMaximo;
  private int idDirectorGrupo;
  private String jornada;
  private String nombreDirector;
  private String apellidoDirector;

    public TOGrados() {
    }

    public TOGrados(String nombreGrado, String salon, int cupoMaximo) {
        this.nombreGrado = nombreGrado;
        this.salon = salon;
        this.cupoMaximo = cupoMaximo;
    }

    public int getIdGrados() {
        return idGrados;
    }

    public void setIdGrados(int idGrados) {
        this.idGrados = idGrados;
    }

    public String getNombreGrado() {
        return nombreGrado;
    }

    public void setNombreGrado(String nombreGrado) {
        this.nombreGrado = nombreGrado;
    }

    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }

    public int getCupoMaximo() {
        return cupoMaximo;
    }

    public void setCupoMaximo(int cupoMaximo) {
        this.cupoMaximo = cupoMaximo;
    }

    public int getIdDirectorGrupo() {
        return idDirectorGrupo;
    }

    public void setIdDirectorGrupo(int idDirectorGrupo) {
        this.idDirectorGrupo = idDirectorGrupo;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public String getNombreDirector() {
        return nombreDirector;
    }

    public void setNombreDirector(String nombreDirector) {
        this.nombreDirector = nombreDirector;
    }

    public String getApellidoDirector() {
        return apellidoDirector;
    }

    public void setApellidoDirector(String apellidoDirector) {
        this.apellidoDirector = apellidoDirector;
    }
  
  
}
