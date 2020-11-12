package proyecto_grupo2.demo.dao;

import proyecto_grupo2.demo.ConnectionManager;
import proyecto_grupo2.demo.dto.usuarioDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class usuarioDao {
    private Connection connection;

    public usuarioDao() throws SQLException {
        connection = ConnectionManager.obtenerConexion();
    }

    public List<usuarioDto> obtenerUsuarios() throws SQLException {
        String consulta = "SELECT nombre, apellido, correo, fecha_de_nac, region, comuna, genero, contraseña from usuariogrupo2";
        PreparedStatement ps = connection.prepareStatement(consulta);
        ResultSet rs = ps.executeQuery();
        List<usuarioDto> obtenidos = new ArrayList<usuarioDto>();
        while (rs.next()) {
            String nom = rs.getString("nombre");
            String ape = rs.getString("apellido");
            String cor = rs.getString("correo");
            String fec = rs.getString("fecha_de_nac");
            String reg = rs.getString("region");
            String com = rs.getString("comuna");
            String ge = rs.getString("genero");
            String cont = rs.getString("contraseña");

            usuarioDto nuevo = new usuarioDto(nom, ape, cor, fec, reg, com, ge, cont);
            obtenidos.add(nuevo);
        }
        return obtenidos;
    }

    public void borrarUsuario(String correo) throws SQLException {
        String consulta = "DELETE  from usuariogrupo2 where correo =?";
        PreparedStatement ps = connection.prepareStatement(consulta);
        ps.setString(1, correo);
        ps.execute();
    }

    public boolean vcorreo(String correo) throws SQLException {
        String sql = "select correo from usuariogrupo2 \n" +
                "WHERE correo = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, correo);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            return true;

        }
        return false;
    }

    public void ingresarUsuario(String nombre, String apellido, String correo, String fecha_nacimiento, String region, String comuna, String genero, String contra) throws SQLException {
        boolean validarcorreo = vcorreo(correo);
        String consulta = "INSERT INTO usuariogrupo2 (nombre,apellido,correo,fecha_de_nac,region,comuna,genero,contraseña) VALUES(?,?,?,?,?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(consulta);

        if (!validarcorreo) {
            ps.setString(1, nombre);
            ps.setString(2, apellido);
            ps.setString(3, correo);
            ps.setString(4, fecha_nacimiento);
            ps.setString(5, region);
            ps.setString(6, comuna);
            ps.setString(7, genero);
            ps.setString(8, contra);
            ps.execute();
        }}

    public void actualizarCorreo(String correo, String correo2) throws SQLException {
        String consulta = "update usuariogrupo2 set correo =? where correo =?";
        PreparedStatement ps = connection.prepareStatement(consulta);
        ps.setString(1,correo2);
        ps.setString(2,correo);
        ps.execute();
    }
}


