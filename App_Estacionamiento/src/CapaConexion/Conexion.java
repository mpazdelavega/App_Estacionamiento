/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaConexion;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Tomás
 */
public class Conexion {
    //VARIABLES DE ENTORNO LOCAL
    Connection con;
    private static String url = "jdbc:mysql://localhost:3306/webcompras";
    private static String user = "root";
    private static String pass = "";
    public Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=(Connection) DriverManager.getConnection(url,user,pass);
        } catch (Exception e) {
        }
        return con;
    }
}
