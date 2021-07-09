/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaGUI;

import CapaDTO.Vehiculo;
import CapaNegocio.Controlador;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author manue
 */
public class Vista_Salida extends javax.swing.JFrame {

    /**
     * Creates new form Vista_Salida
     */
    public Vista_Salida() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtPatenteSalida = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        txtMontoTotal = new javax.swing.JTextField();
        btnFinalizar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableVehiculos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setText("Patente");

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnMenu.setText("Menu");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        btnFinalizar.setText("Finalizar");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        jLabel3.setText("Monto total");

        jTableVehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id_Vehiculo", "Patente", "Hora_Entrada", "Hora_Salida", "Monto_Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableVehiculos.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTableVehiculosComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(jTableVehiculos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPatenteSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1))
                    .addComponent(txtMontoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnFinalizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPatenteSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMontoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCalcular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnFinalizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMenu)))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        txtPatenteSalida.getAccessibleContext().setAccessibleName("txtPante");
        btnCalcular.getAccessibleContext().setAccessibleName("btnCalcular");
        btnMenu.getAccessibleContext().setAccessibleName("btnMenu");
        txtMontoTotal.getAccessibleContext().setAccessibleName("txtCalcular");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        Menu abrir = new Menu();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
//        int patente = Integer.parseInt(this.txtPatenteSalida.getText());
        actualizarHoraSalida();
        String patente2 = this.txtPatenteSalida.getText();
        Controlador c = new Controlador();
        String montoTotal = c.CalcularTotal(patente2);
        this.txtMontoTotal.setText(montoTotal);
        cargarListaVehiculos();
//        this.txtMontoTotal.setText(montoTotal);
//        this.txtMontoTotal.setText(c.BuscarPatente(patente));
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        EgresarVehiculo();
        cargarListaVehiculos();
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void jTableVehiculosComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTableVehiculosComponentShown

    }//GEN-LAST:event_jTableVehiculosComponentShown

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        cargarListaVehiculos();
    }//GEN-LAST:event_formComponentShown

    public void actualizarHoraSalida() {
        try {
            Date d = new Date();
            GregorianCalendar gc = new GregorianCalendar();
            gc.setTime(d);
            SimpleDateFormat ff = new SimpleDateFormat("hh:mm:ss");
            String horaActual = ff.format(d);

            Controlador c = new Controlador();
            String patente = this.txtPatenteSalida.getText();
            Vehiculo v = new Vehiculo(horaActual, patente);

            c.IngresarHoraSalida(v);


        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Problemas de conexión con la Base de Datos",
                    "Mensajes", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void EgresarVehiculo() {
        try {
            int Monto_Total = Integer.parseInt(this.txtMontoTotal.getText());
            Controlador c = new Controlador();
            String patente = this.txtPatenteSalida.getText();
            Vehiculo v = new Vehiculo(Monto_Total, patente);

            c.EgresoVehiculo(v);

            JOptionPane.showMessageDialog(this, "Vehiculo egresado correctamente",
                    "Mensajes", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Problemas de conexión con la Base de Datos",
                    "Mensajes", JOptionPane.ERROR_MESSAGE);
        }

    }
    
    public void cargarListaVehiculos(){
        try
        {
            Controlador c = new Controlador();
            DefaultTableModel modelo = (DefaultTableModel) this.jTableVehiculos.getModel();
            modelo.setRowCount(0);
            ArrayList<Vehiculo> vehiculo = c.listarVehiculos();
            for(Vehiculo v : vehiculo)
            {
                Object fila[] = new Object[5];
                fila[0] = v.getID_Vehiculo();
                fila[1] = v.getPatente();
                fila[2] = v.getHora_Entrada();
                fila[3] = v.getHora_Salida();
                fila[4] = v.getMonto_Total();
                modelo.addRow(fila);
            }
            this.jTableVehiculos.setModel(modelo);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Problemas de conexión con la Base de Datos", 
                        "Mensajes", JOptionPane.ERROR_MESSAGE);     
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableVehiculos;
    private javax.swing.JTextField txtMontoTotal;
    private javax.swing.JTextField txtPatenteSalida;
    // End of variables declaration//GEN-END:variables
}
