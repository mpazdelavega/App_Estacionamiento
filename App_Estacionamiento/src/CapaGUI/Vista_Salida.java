/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaGUI;

import CapaDTO.Vehiculo;
import CapaNegocio.Controlador;
import java.awt.Color;
import java.awt.HeadlessException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
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
        this.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/car.png")).getImage());
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
        jLabel2 = new javax.swing.JLabel();
        txtId_Vehiculo = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtFiltro = new javax.swing.JTextField();
        btnClean = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Salida Vehículos");
        setLocation(new java.awt.Point(150, 150));
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setText("Patente");

        txtPatenteSalida.setEditable(false);
        txtPatenteSalida.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/calcular.png"))); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home.png"))); // NOI18N
        btnMenu.setText("Menu");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        txtMontoTotal.setEditable(false);
        txtMontoTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnFinalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/finalizar.png"))); // NOI18N
        btnFinalizar.setText("Finalizar");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        jLabel3.setText("Monto total");

        jTableVehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Patente", "Hora Entrada", "Hora Salida", "Monto Total", "Pagado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableVehiculos.getTableHeader().setReorderingAllowed(false);
        jTableVehiculos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableVehiculosMouseClicked(evt);
            }
        });
        jTableVehiculos.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTableVehiculosComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(jTableVehiculos);
        if (jTableVehiculos.getColumnModel().getColumnCount() > 0) {
            jTableVehiculos.getColumnModel().getColumn(0).setPreferredWidth(20);
            jTableVehiculos.getColumnModel().getColumn(4).setPreferredWidth(30);
            jTableVehiculos.getColumnModel().getColumn(5).setPreferredWidth(2);
        }

        jLabel2.setText("Codigo Vehículo");

        txtId_Vehiculo.setEditable(false);
        txtId_Vehiculo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/basura.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("*Seleccione una fila de la tabla para porder Calcular MontoTotal, Finalizar Salida o Eliminar Registro*");

        txtFiltro.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtFiltro.setForeground(new java.awt.Color(204, 204, 204));
        txtFiltro.setText("Escribe aqui para buscar Patente");
        txtFiltro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFiltroFocusGained(evt);
            }
        });
        txtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFiltroKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFiltroKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFiltroKeyTyped(evt);
            }
        });

        btnClean.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clean.png"))); // NOI18N
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnClean))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPatenteSalida, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMenu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtId_Vehiculo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMontoTotal, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFinalizar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCalcular, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFiltro)
                    .addComponent(btnClean, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(4, 4, 4)
                        .addComponent(txtId_Vehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(4, 4, 4)
                        .addComponent(txtPatenteSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMontoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCalcular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFinalizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMenu))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(31, 31, 31))
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
        
        ValidarCalculo();
//        ValidarEgreso();
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void jTableVehiculosComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTableVehiculosComponentShown

    }//GEN-LAST:event_jTableVehiculosComponentShown

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        cargarListaVehiculos();
    }//GEN-LAST:event_formComponentShown

    private void jTableVehiculosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableVehiculosMouseClicked
        int seleccion = this.jTableVehiculos.rowAtPoint(evt.getPoint());
        int fila = this.jTableVehiculos.getSelectedRow();
        this.txtId_Vehiculo.setText(String.valueOf(this.jTableVehiculos.getValueAt(seleccion, 0)));
        this.txtPatenteSalida.setText(String.valueOf(this.jTableVehiculos.getValueAt(seleccion, 1)));
        this.txtMontoTotal.setText(String.valueOf(this.jTableVehiculos.getValueAt(seleccion, 4)));
    }//GEN-LAST:event_jTableVehiculosMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminarVehiculo();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtFiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyTyped
        buscarPatente();
    }//GEN-LAST:event_txtFiltroKeyTyped

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        limpiarFiltro();
        cargarListaVehiculos();
        this.txtFiltro.requestFocus();
        if (this.txtFiltro.getText().isEmpty() == true) {
            this.txtFiltro.setText("Escribe aqui para buscar Patente");
            this.txtFiltro.setCaretPosition(0);
            this.txtFiltro.setForeground(new java.awt.Color(204, 204, 204));
        }
    }//GEN-LAST:event_btnCleanActionPerformed

    private void txtFiltroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyPressed
        if (txtFiltro.getForeground() != Color.BLACK) {
            if (this.txtFiltro.getText().equals("Escribe aqui para buscar Patente")) {
                this.txtFiltro.setText("");
            }
        }
        this.txtFiltro.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtFiltroKeyPressed

    private void txtFiltroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFiltroFocusGained
        this.txtFiltro.setCaretPosition(0);
    }//GEN-LAST:event_txtFiltroFocusGained

    private void txtFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyReleased
        if (this.txtFiltro.getText().isEmpty() == true) {
            this.txtFiltro.setText("Escribe aqui para buscar Patente");
            this.txtFiltro.setCaretPosition(0);
            this.txtFiltro.setForeground(new java.awt.Color(204, 204, 204));
        }
    }//GEN-LAST:event_txtFiltroKeyReleased

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        ValidarEgreso();
    }//GEN-LAST:event_btnFinalizarActionPerformed

    public void actualizarHoraSalida() {
        try {
            Date d = new Date();
            GregorianCalendar gc = new GregorianCalendar();
            gc.setTime(d);
            SimpleDateFormat ff = new SimpleDateFormat("kk:mm:ss");
            String horaActual = ff.format(d);

            Controlador c = new Controlador();
            int idVehiculo = Integer.parseInt(this.txtId_Vehiculo.getText());

//            Vehiculo v = new Vehiculo(horaActual, idVehiculo);
            Vehiculo v = new Vehiculo(idVehiculo, horaActual, horaActual, horaActual, 0);
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
//            String patente = this.txtPatenteSalida.getText();
            int idVehiculo = Integer.parseInt(this.txtId_Vehiculo.getText());
            Vehiculo v = new Vehiculo(Monto_Total, idVehiculo);

            c.EgresoVehiculo(v);

            JOptionPane.showMessageDialog(this, "Vehiculo egresado correctamente",
                    "Mensajes", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Problemas de conexión con la Base de Datos",
                    "Mensajes", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void cargarListaVehiculos() {
        try {
            Controlador c = new Controlador();
            DefaultTableModel modelo = (DefaultTableModel) this.jTableVehiculos.getModel();
            modelo.setRowCount(0);
            ArrayList<Vehiculo> vehiculo = c.listarVehiculos();
            for (Vehiculo v : vehiculo) {
                Object fila[] = new Object[6];
                fila[0] = v.getID_Vehiculo();
                fila[1] = v.getPatente();
                fila[2] = v.getHora_Entrada();
                fila[3] = v.getHora_Salida();
                fila[4] = v.getMonto_Total();
                if(v.getEstado() == 1)
                {
                    fila[5] = true;
                }
                else
                {
                    fila[5] = false;
                }
                modelo.addRow(fila);
            }
            this.jTableVehiculos.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Problemas de conexión con la Base de Datos " + e,
                    "Mensajes", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void eliminarVehiculo() {
        try {
            Controlador c = new Controlador();
            int filaSeleccionada = this.jTableVehiculos.getSelectedRow();
            //JOptionPane.showMessageDialog(this, filaSeleccionada);
            if (filaSeleccionada > -1) {
                int respuesta = JOptionPane.showConfirmDialog(this, "Está seguro que deseas eliminar a esta Patente.",
                        "Mensajes", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (respuesta == JOptionPane.YES_OPTION) {
                    String id = this.jTableVehiculos.getModel().getValueAt(filaSeleccionada, 0).toString();
                    if (c.eliminarVehiculo(id)) {
                        JOptionPane.showMessageDialog(this, "Vehiculo eliminado.", "Mensajes", JOptionPane.INFORMATION_MESSAGE);
                        cargarListaVehiculos();
                        limpiar();
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Para eliminar un registro, debe seleccionar una fila", "Mensajes", JOptionPane.WARNING_MESSAGE);
                this.txtFiltro.requestFocus();
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Se ha producido un error.",
                    "Mensaje", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void ValidarCalculo() {
        try {
            
            Controlador c = new Controlador();
            int filaSeleccionada = this.jTableVehiculos.getSelectedRow();
            
            if (filaSeleccionada > -1) {
                actualizarHoraSalida();
                int idVehiculo = Integer.parseInt(this.txtId_Vehiculo.getText());
                String montoTotal = c.CalcularTotal(String.valueOf(idVehiculo));
                this.txtMontoTotal.setText(montoTotal);
                
            } else {
                JOptionPane.showMessageDialog(this, "Para calcular un registro, debe seleccionar una fila", "Mensajes", JOptionPane.WARNING_MESSAGE);
                this.txtFiltro.requestFocus();
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Se ha producido un error.",
                    "Mensaje", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void ValidarEgreso() {
        try {
            Controlador c = new Controlador();
            int filaSeleccionada = this.jTableVehiculos.getSelectedRow();
            if (this.txtMontoTotal.getText().equals("0") || this.txtMontoTotal.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Para finalizar el proceso, primero debe calcular el total", "Mensajes", JOptionPane.WARNING_MESSAGE);
                this.txtFiltro.requestFocus();
            } else {
                EgresarVehiculo();
                cargarListaVehiculos();
                limpiar();
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Se ha producido un error.",
                    "Mensaje", JOptionPane.ERROR_MESSAGE);
        }

    }
    
    public void limpiar() {
        this.txtId_Vehiculo.setText(null);
        this.txtMontoTotal.setText(null);
        this.txtPatenteSalida.setText(null);
    }

    public void limpiarFiltro() {
        this.txtFiltro.setText(null);
    }

    public void buscarPatente() {

        try {
            Controlador c = new Controlador();
            DefaultTableModel modelo = (DefaultTableModel) this.jTableVehiculos.getModel();
            modelo.setRowCount(0);
            ArrayList<Vehiculo> vehiculo = c.listarVehiculos();

            String filtro = this.txtFiltro.getText();
            for (Vehiculo v : vehiculo) {
                Object fila[] = new Object[8];
                fila[0] = v.getID_Vehiculo();
                fila[1] = v.getPatente();
                fila[2] = v.getHora_Entrada();
                fila[3] = v.getHora_Salida();
                fila[4] = v.getMonto_Total();

                if (v.getPatente().toLowerCase().contains(filtro.toLowerCase())) {
                    modelo.addRow(fila);
                }
            }
            this.jTableVehiculos.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Problemas de conexión con la Base de Datos",
                    "Mensajes", JOptionPane.ERROR_MESSAGE);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableVehiculos;
    private javax.swing.JTextField txtFiltro;
    private javax.swing.JTextField txtId_Vehiculo;
    private javax.swing.JTextField txtMontoTotal;
    private javax.swing.JTextField txtPatenteSalida;
    // End of variables declaration//GEN-END:variables
}
