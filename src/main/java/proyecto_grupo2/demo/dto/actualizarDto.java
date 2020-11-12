package proyecto_grupo2.demo.dto;

public class actualizarDto {
    private String correo;
    private String correo2;

    public actualizarDto(String correo, String correo2) {
        this.correo = correo;
        this.correo2 = correo2;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCorreo2() {
        return correo2;
    }

    public void setCorreo2(String correo2) {
        this.correo2 = correo2;
    }

    @Override
    public String toString() {
        return "actualizarDto{" +
                "correo='" + correo + '\'' +
                ", correo2='" + correo2 + '\'' +
                '}';
    }
}
