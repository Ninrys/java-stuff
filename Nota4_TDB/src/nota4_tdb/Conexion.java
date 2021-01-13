/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nota4_tdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Ninry
 */
public class Conexion {

    public String user;
    private String pass;
    private static final String driver = "oracle.jdbc.OracleDriver";

    private static final String url = "jdbc:oracle:thin:@localhost:1521:XE";

    public Conexion(String user, String pass) {
        this.user = user;
        this.pass = pass;
        conn = null;

        try {
            Class.forName(driver);
            conn = (Connection) DriverManager.getConnection(url, user, pass);
            if (conn != null) {
                System.out.println("Conectado");
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar");
            System.out.println("Error" + e.toString());
            
        }

    }

    private static Connection conn;

    public Connection conectar() {
        return conn;
    }

    public void desconectar() {
        conn = null;
    }

}
