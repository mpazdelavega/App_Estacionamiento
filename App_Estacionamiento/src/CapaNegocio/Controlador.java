/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import CapaConexion.Conexion;
import CapaDTO.Vehiculo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author manue
 */
public class Controlador {
    Connection con;
    Vehiculo v = new Vehiculo();
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    public boolean AgregarVehiculo(Vehiculo v) {
        String sql="Insert into registro_vehiculos values(?,?,?,?,?)";        
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1,0);
            ps.setString(2, v.getPatente());
            ps.setString(3, "15:15");
            ps.setString(4, "15:30");
            ps.setInt(5, 15000);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;        
    }
}
