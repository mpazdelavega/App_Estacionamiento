/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDTO;

import java.sql.Date;

/**
 *
 * @author manue
 */
public class Vehiculo {

    private int ID_Vehiculo;
    private String Patente;
    private String Hora_Entrada;
    private String Hora_Salida;
    private int Monto_Total;
    private String Fecha;
    private int Estado;
    
    public Vehiculo() {
    }

    public Vehiculo(int ID_Vehiculo, String Patente, String Hora_Entrada, String Hora_Salida, int Monto_Total, String Fecha, int Estado) {
        this.ID_Vehiculo = ID_Vehiculo;
        this.Patente = Patente;
        this.Hora_Entrada = Hora_Entrada;
        this.Hora_Salida = Hora_Salida;
        this.Monto_Total = Monto_Total;
        this.Fecha = Fecha;
        this.Estado = Estado;
    }
    
    public Vehiculo(int ID_Vehiculo, String Patente, String Hora_Entrada, String Hora_Salida, int Monto_Total, int Estado) {
        this.ID_Vehiculo = ID_Vehiculo;
        this.Patente = Patente;
        this.Hora_Entrada = Hora_Entrada;
        this.Hora_Salida = Hora_Salida;
        this.Monto_Total = Monto_Total;
        this.Estado = Estado;
    }

    public Vehiculo(int ID_Vehiculo, String Patente, String Hora_Entrada, String Hora_Salida, int Monto_Total) {
        this.ID_Vehiculo = ID_Vehiculo;
        this.Patente = Patente;
        this.Hora_Entrada = Hora_Entrada;
        this.Hora_Salida = Hora_Salida;
        this.Monto_Total = Monto_Total;
    }

    public int getEstado() {
        return Estado;
    }

    public void setEstado(int Estado) {
        this.Estado = Estado;
    }

    
    
    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public Vehiculo(String Hora_Salida, String Patente) {
        this.Hora_Salida = Hora_Salida;
        this.Patente = Patente;
        
    }

    public Vehiculo(int Monto_Total, int ID_Vehiculo) {
        this.Monto_Total = Monto_Total;
        this.ID_Vehiculo = ID_Vehiculo;  
    }
    
    public Vehiculo(String Patente,int Monto_Total) {
        this.Patente = Patente;  
        this.Monto_Total = Monto_Total;
        
    }

    public Vehiculo(String Patente, String Hora_Entrada, String Hora_Salida, int Monto_Total) {
        this.Patente = Patente;
        this.Hora_Entrada = Hora_Entrada;
        this.Hora_Salida = Hora_Salida;
        this.Monto_Total = Monto_Total;
    }
    
    
    
    

    public void setID_Vehiculo(int ID_Vehiculo) {
        this.ID_Vehiculo = ID_Vehiculo;
    }

    public void setPatente(String Patente) {
        this.Patente = Patente;
    }

    public void setHora_Entrada(String Hora_Entrada) {
        this.Hora_Entrada = Hora_Entrada;
    }

    public void setHora_Salida(String Hora_Salida) {
        this.Hora_Salida = Hora_Salida;
    }

    public void setMonto_Total(int Monto_Total) {
        this.Monto_Total = Monto_Total;
    }

    public int getID_Vehiculo() {
        return ID_Vehiculo;
    }

    public String getPatente() {
        return Patente;
    }

    public String getHora_Entrada() {
        return Hora_Entrada;
    }

    public String getHora_Salida() {
        return Hora_Salida;
    }

    public int getMonto_Total() {
        return Monto_Total;
    }
    
}
