package proyecto_grupo2.demo.dao;

import proyecto_grupo2.demo.ConnectionManager;
import proyecto_grupo2.demo.dto.producto;
import proyecto_grupo2.demo.dto.usuarioDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class productoDao {
    private Connection connection;

    public productoDao() throws SQLException {
        connection = ConnectionManager.obtenerConexion();
    }
    public List<producto> obtenerProductos() throws SQLException {
        String consulta = "SELECT id, estado_producto,descripcion, nombre_prod, usuario from productogrupo2";
        PreparedStatement ps = connection.prepareStatement(consulta);
        ResultSet rs = ps.executeQuery();
        List<producto> obtenidos = new ArrayList<producto>();
        while (rs.next()) {
            String estado_prod = rs.getString("estado_producto");
            String desc = rs.getString("descripcion");
            String nom = rs.getString("nombre_prod");
            int user = rs.getInt("usuario");

            producto nuevo = new producto(estado_prod,desc,nom,user);
            obtenidos.add(nuevo);
        }
        return obtenidos;
    }

    public void borrarProducto(int id) throws SQLException {
        String consulta = "DELETE  from productogrupo2 where id =?";
        PreparedStatement ps = connection.prepareStatement(consulta);
        ps.setInt(1, id);
        ps.execute();
    }

    public void ingresarProducto(String estado_producto, String descripcion, String nombre_prod, int usuario) throws SQLException {
        String consulta = "INSERT INTO productogrupo2 (estado_producto,descripcion,nombre_prod,usuario) VALUES(?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(consulta);

            ps.setString(1, estado_producto);
            ps.setString(2, descripcion);
            ps.setString(3, nombre_prod);
            ps.setInt(4,usuario);
            ps.execute();
        }

    public void actualizarDescripcion(int id, String descripcion) throws SQLException {
        String sql = "update productogrupo2 \n" +
                "set descripcion = ? \n" +
                "where id= ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, descripcion);
        ps.setInt(2, id);
        ps.execute();
    }
}
