package proyecto_grupo2.demo.dto;

public class Actualizardescripcion {
    private int id;
    private String descripcion;

    public Actualizardescripcion(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Actualizardescripcion{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}

