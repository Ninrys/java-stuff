/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zoofinders;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Ninry
 */

    


public class Conexion {

    private static Connection conn;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String pass = "";
    private static final String url = "jdbc:mysql://localhost:3306/Zoologico";

    public Conexion() throws SQLException {
        conn = null;

        try {
            Class.forName(driver);
            conn = (Connection) DriverManager.getConnection(url,user,pass);
            if (conn !=null) {
                System.out.println("Conectado");
            }
        }catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null,"Error al conectar");
            System.out.println("Error"+e.toString());
        }

    }
    public Connection conectar () {
        return conn;
    }
    public void desconectar(){
        conn = null;
    }
}
    

