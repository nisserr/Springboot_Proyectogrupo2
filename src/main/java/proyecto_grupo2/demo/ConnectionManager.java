package proyecto_grupo2.demo;

import java.sql.Connection;import java.sql.*;

public class ConnectionManager {
    private static Connection conn = null;
    private static String connectionString = "jdbc:postgresql://forgedb.netbyteoss.com:5443/forge_alumnos";

    public static Connection obtenerConexion() throws SQLException {
        if (conn == null) {
            //conn = DriverManager.getConnection(connectionString, "alumno1", "alumno.01");
            conn = DriverManager.getConnection(connectionString, "nargueta", "A25.48");
        }
        return conn;
    }
}
