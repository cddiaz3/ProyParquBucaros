package TO;

public class TOProfesores extends TOUsuarios {
    
  private int idProfesores;
  private int idUsuariosProfesores;
  private String tipoContrato;
  private double salario;
  private String titulo;
  private String categoria;

    public TOProfesores() {
    }

    public TOProfesores(int idUsuariosProfesores, String nombres, String apellidos, String usuario, String clave, String tipoDocumento, String documento) {
        super(nombres, apellidos, usuario, clave, tipoDocumento, documento);
        this.idUsuariosProfesores = idUsuariosProfesores;
    }

    public int getIdProfesores() {
        return idProfesores;
    }

    public void setIdProfesores(int idProfesores) {
        this.idProfesores = idProfesores;
    }

    public int getIdUsuariosProfesores() {
        return idUsuariosProfesores;
    }

    public void setIdUsuariosProfesores(int idUsuariosProfesores) {
        this.idUsuariosProfesores = idUsuariosProfesores;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
  
}
