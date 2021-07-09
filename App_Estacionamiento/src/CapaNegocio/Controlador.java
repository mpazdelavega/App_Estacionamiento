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
        String sql = "Insert into registro_vehiculos values(?,?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, 0);
            ps.setString(2, v.getPatente());
            ps.setString(3, v.getHora_Entrada());
            ps.setString(4, v.getHora_Salida());
            ps.setInt(5, v.getMonto_Total());
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    public boolean IngresarHoraSalida(Vehiculo v) {
        try {
            String sql = "UPDATE registro_vehiculos SET Hora_Salida = ? WHERE Patente = ?";
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, v.getHora_Salida());
            ps.setString(2, v.getPatente());
            
            if(ps.executeUpdate() > 0)
            {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public String CalcularTotal(String p) {
//        String patenteSalida = "";
        String total = "";
        ResultSet rs = null;
        String sql = "SELECT (FLOOR((Hora_Salida - Hora_Entrada)/1000)*100)+300 as Total FROM registro_vehiculos WHERE Patente = ?";
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
            String sql = "UPDATE registro_vehiculos SET Monto_Total = ? WHERE Patente = ?";
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, v.getMonto_Total());
            ps.setString(2, v.getPatente());
            
            if(ps.executeUpdate() > 0)
            {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

//    public String BuscarPatente(int id_patente) {
//        String patente="";
//        ResultSet rs = null;
//        String sql="SELECT Monto_Total FROM registro_vehiculos WHERE Id_Vehiculo = ?";        
//        try {
//            con = cn.getConnection();
//            ps = con.prepareStatement(sql);
//            ps.setInt(1,id_patente);
//            rs = ps.executeQuery();
//            while(rs.next()){
////                patenteSalida = rs.getString("Patente");
//                patente = rs.getString("Monto_Total");
//                System.out.println(patente);
//            }
//            
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        return patente;        
//    }
}
