package TO;

public class TOUsuarios {
    
    private int idUsuarios;
    private String usuario;
    private String contrasena;
    private String nombre;
    private String apellido;
    private String email;
    private String tipoDocumento;
    private String documento;
    private String celular;

    public TOUsuarios() {
    }

    public TOUsuarios(int idUsuarios, String usuario, String contraseña, String nombre, String apellido, String tipoDocumento, String documento, String celular) {
        this.idUsuarios = idUsuarios;
        this.usuario = usuario;
        this.contrasena = contraseña;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoDocumento = tipoDocumento;
        this.documento = documento;
        this.celular = celular;
    }

    public TOUsuarios(int idUsuarios, String usuario, String contraseña, String nombre, String apellido, String email, String tipoDocumento, String documento, String celular) {
        this.idUsuarios = idUsuarios;
        this.usuario = usuario;
        this.contrasena = contraseña;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.tipoDocumento = tipoDocumento;
        this.documento = documento;
        this.celular = celular;
    }

    public int getIdUsuarios() {
        return idUsuarios;
    }

    public void setIdUsuarios(int idUsuarios) {
        this.idUsuarios = idUsuarios;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContraseña(String contraseña) {
        this.contrasena = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    

    
   
}
