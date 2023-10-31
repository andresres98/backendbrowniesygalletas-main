package org.browniesygalletas.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBaseDatos {
    //Este es el patron Singlenton para la conexión a la base de datos.
    private static String url = "jdbc:mysql://localhost:3306/BROWNIES_Y_GALLETAS";
    private static String username = "root";
    private static String password = "dawe";
    private static Connection connection;

    public static Connection getInstance() throws SQLException {
        if(connection == null){
            connection = DriverManager.getConnection(url, username, password);
        }
        return connection;
    }

}
