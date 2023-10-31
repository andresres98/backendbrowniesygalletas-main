package org.browniesygalletas.Tests;

import org.browniesygalletas.util.ConexionBaseDatos;

import java.sql.*;

public class TestJDBC {
    public static void main(String[] args) throws SQLException {
        try {
            Connection conn = ConexionBaseDatos.getInstance();
            Statement stmt = conn.createStatement();
            ResultSet resultado = stmt.executeQuery("SELECT * FROM PRODUCTOS");
            while(resultado.next()){
                System.out.println(resultado.getString("Nombre"));
            }
            resultado.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
