package proyecto_grupo2.demo.dto;

public class producto {
    private String estado_prod;
    private String descripcion;
    private String nombre_prod;
    private int usuario;

    public producto(String estado_prod, String descripcion, String nombre_prod, int usuario) {
        this.estado_prod = estado_prod;
        this.descripcion = descripcion;
        this.nombre_prod = nombre_prod;
        this.usuario = usuario;
    }

    public String getEstado_prod() {
        return estado_prod;
    }

    public void setEstado_prod(String estado_prod) {
        this.estado_prod = estado_prod;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre_prod() {
        return nombre_prod;
    }

    public void setNombre_prod(String nombre_prod) {
        this.nombre_prod = nombre_prod;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "producto{" +
                "estado_prod='" + estado_prod + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", nombre_prod='" + nombre_prod + '\'' +
                ", usuario=" + usuario +
                '}';
    }
}