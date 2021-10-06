package TO;

public class TOEstudiantes extends TOUsuarios{
    
  private int idEstudiantes;
  private int idUsuariosEstudiantes;
  private int idGradosEstudiantes;
  private String nombreGrado;
  private String salon;
  private String jornada;

    public TOEstudiantes() {
    }

    public TOEstudiantes(String nombres, String apellidos, String usuario, String clave, String tipoDocumento, String documento) {
        super(nombres, apellidos, usuario, clave, tipoDocumento, documento);
    }

    public int getIdEstudiantes() {
        return idEstudiantes;
    }

    public void setIdEstudiantes(int idEstudiantes) {
        this.idEstudiantes = idEstudiantes;
    }

    public int getIdUsuariosEstudiantes() {
        return idUsuariosEstudiantes;
    }

    public void setIdUsuariosEstudiantes(int idUsuariosEstudiantes) {
        this.idUsuariosEstudiantes = idUsuariosEstudiantes;
    }

    public int getIdGradosEstudiantes() {
        return idGradosEstudiantes;
    }

    public void setIdGradosEstudiantes(int idGradosEstudiantes) {
        this.idGradosEstudiantes = idGradosEstudiantes;
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

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    
  
  
}
