package proyecto_grupo2.demo.dto;

public class usuarioDto {
    private String nombre;
    private String apellido;
    private String correo;
    private String Fecha_nacimiento;
    private String Region;
    private String comuna;
    private String genero;
    private String contrasenha;

    public usuarioDto(String nombre, String apellido, String correo, String fecha_nacimiento, String region, String comuna, String genero, String contrasenha) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        Fecha_nacimiento = fecha_nacimiento;
        Region = region;
        this.comuna = comuna;
        this.genero = genero;
        this.contrasenha = contrasenha;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFecha_nacimiento() {
        return Fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        Fecha_nacimiento = fecha_nacimiento;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getContrasenha() {
        return contrasenha;
    }

    public void setContrasenha(String contrasenha) {
        this.contrasenha = contrasenha;
    }

    @Override
    public String toString() {
        return "usuarioDto{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", correo='" + correo + '\'' +
                ", Fecha_nacimiento='" + Fecha_nacimiento + '\'' +
                ", Region='" + Region + '\'' +
                ", comuna='" + comuna + '\'' +
                ", genero='" + genero + '\'' +
                ", contrasenha='" + contrasenha + '\'' +
                '}';
    }
}
