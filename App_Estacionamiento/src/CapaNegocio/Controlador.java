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
import java.sql.SQLException;
import java.util.ArrayList;

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
        String sql = "Insert into registro_vehiculos values(?,?,?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, 0);
            ps.setString(2, v.getPatente());
            ps.setString(3, v.getHora_Entrada());
            ps.setString(4, v.getHora_Salida());
            ps.setInt(5, v.getMonto_Total());
            ps.setString(6, v.getFecha());
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    public boolean IngresarHoraSalida(Vehiculo v) {
        try {
            String sql = "UPDATE registro_vehiculos SET Hora_Salida = ? WHERE ID_Vehiculo = ?";
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, v.getHora_Salida());
            ps.setInt(2, v.getID_Vehiculo());
            
            if(ps.executeUpdate() > 0)
            {
                return true;
            }
        } catch (Exception e) {
//            System.out.println(e);
            return false;
        }
        return false;
    }

    public String CalcularTotal(String p) {
//        String patenteSalida = "";
        String total = "";
        ResultSet rs = null;
        String sql = "SELECT (FLOOR(TIMESTAMPDIFF(minute, Hora_Entrada, Hora_Salida)/10)*100)+300 as Total FROM registro_vehiculos WHERE ID_Vehiculo = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, p);
            rs = ps.executeQuery();
            while (rs.next()) {
//                patenteSalida = rs.getString("Patente");
                total = rs.getString("Total");
                System.out.println(total);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return total;
    }
    
     public boolean EgresoVehiculo(Vehiculo v) {
        try {
            String sql = "UPDATE registro_vehiculos SET Monto_Total = ? WHERE ID_Vehiculo = ?";
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, v.getMonto_Total());
            ps.setInt(2, v.getID_Vehiculo());
            
            if(ps.executeUpdate() > 0)
            {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

     public ArrayList<Vehiculo> listarVehiculos() {
        ArrayList<Vehiculo> vehiculo = new ArrayList<>();
        try
        {
            String sql = "SELECT * FROM registro_vehiculos order by ID_Vehiculo DESC";
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next())
            {
                vehiculo.add(new Vehiculo(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4), rs.getInt(5)));
            }
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
            return null;
        }

        return vehiculo;
    }
     
     public boolean eliminarVehiculo(Object key) {
        try
        {
            String sql = "DELETE FROM registro_vehiculos WHERE Id_Vehiculo = ?";
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, (String) key);
            if(ps.executeUpdate() > 0 )
            {
                return true;
            }
        }
        catch(SQLException ex)
        {
            return false;
        }

        return false;
    }
}
