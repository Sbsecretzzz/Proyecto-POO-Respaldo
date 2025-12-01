/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


package Interfaz_Admin;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Vehiculos.Vehiculo;
import Vehiculos.EstadoVehiculo;
import Vehiculos.GestionVehiculo;  // <-- esta es la clase lógica, la creamos ahorita


/**
 *
 * @author Leonardo
 */
public class gestionVehiculo extends javax.swing.JFrame {

    private GestionVehiculo gestionVehiculo = new GestionVehiculo();

    /**
     * Creates new form gestionVehiculo
     */
    public gestionVehiculo() {
        initComponents();
        setLocationRelativeTo(null);
        configurarTabla();
        listarVehiculos();
    }
    
    private void configurarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) tbLibro.getModel();
        modelo.setColumnIdentifiers(new String[]{
            "Código", "Marca", "Modelo", "Año", "Tipo", "Color", "Precio Base", "Estado"
        });
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnActualizar = new javax.swing.JButton();
        lblPrecio1 = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        lblPrecio2 = new javax.swing.JLabel();
        lblAutor = new javax.swing.JLabel();
        lblPrecio3 = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblPrecio4 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtCodigo1 = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JTextField();
        txtCodigo2 = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        txtCodigo3 = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtCodigo4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbLibro = new javax.swing.JTable();
        btnRegistrar = new javax.swing.JButton();
        lblCodigo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        lblPrecio1.setText("Tipo");

        lblTitulo.setText("Marca");

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        lblPrecio2.setText("Color");

        lblAutor.setText("Modelo");

        lblPrecio3.setText("Precio Base:");

        lblPrecio.setText("Año");

        lblPrecio4.setText("Estado:");

        txtCodigo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigo3ActionPerformed(evt);
            }
        });

        tbLibro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbLibro);

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        lblCodigo.setText("Código Vehiculo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCodigo)
                                    .addComponent(lblTitulo)
                                    .addComponent(lblAutor)
                                    .addComponent(lblPrecio)
                                    .addComponent(lblPrecio1)
                                    .addComponent(lblPrecio2)
                                    .addComponent(lblPrecio4)
                                    .addComponent(lblPrecio3))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtCodigo3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                                        .addComponent(txtCodigo2, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtCodigo4, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtCodigo1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtPrecio, javax.swing.GroupLayout.Alignment.LEADING)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAutor)
                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecio)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecio1)
                    .addComponent(txtCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPrecio2)
                        .addGap(63, 63, 63)
                        .addComponent(lblPrecio4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtCodigo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPrecio3))
                        .addGap(18, 18, 18)
                        .addComponent(txtCodigo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRegistrar)
                            .addComponent(btnActualizar)
                            .addComponent(btnEliminar))))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void listarVehiculos() {
    DefaultTableModel modelo = (DefaultTableModel) tbLibro.getModel();
    modelo.setRowCount(0); // limpiar tabla

    for (Vehiculo v : gestionVehiculo.getListaVehiculos()) {
        Object[] fila = new Object[8];
        fila[0] = v.getCodigo();
        fila[1] = v.getMarca();
        fila[2] = v.getModelo();
        fila[3] = v.getAnioFabricacion();
        fila[4] = v.getTipo();
        fila[5] = v.getColor();
        fila[6] = v.getPrecioBase();
        fila[7] = v.getEstado();
        modelo.addRow(fila);
    }
}   
    

private void limpiar() {
    txtCodigo.setText("");
    txtTitulo.setText("");
    txtAutor.setText("");
    txtPrecio.setText("");
    txtCodigo1.setText("");
    txtCodigo2.setText("");
    txtCodigo3.setText("");
    txtCodigo4.setText("");
    txtCodigo.requestFocus();
}

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
    try {
        String codigo = txtCodigo.getText().trim();
        String marca = txtTitulo.getText().trim();
        String modelo = txtAutor.getText().trim();
        int anioFabricacion = Integer.parseInt(txtPrecio.getText().trim());
        String tipo = txtCodigo1.getText().trim();
        String color = txtCodigo4.getText().trim();
        double precioBase = Double.parseDouble(txtCodigo2.getText().trim());
        EstadoVehiculo estado = EstadoVehiculo.valueOf(txtCodigo3.getText().trim().toUpperCase());

        // Vehiculo es abstract: uso subclase anónima; si tienes Auto/Camioneta, pon esa clase aquí
        Vehiculo vehiculo = new Vehiculo(codigo, marca, modelo, color,
                                         anioFabricacion, tipo, precioBase, estado) { };

        if (gestionVehiculo.actualizar(vehiculo)) {
            listarVehiculos();
            JOptionPane.showMessageDialog(this, "Vehículo actualizado");
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró el vehículo a actualizar");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error en los datos: " + e.getMessage());
    }
        
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        String codigo = txtCodigo.getText().trim();

    if (gestionVehiculo.eliminar(codigo)) {
        listarVehiculos();
        limpiar();
        JOptionPane.showMessageDialog(this, "Vehículo eliminado");
    } else {
        JOptionPane.showMessageDialog(this, "No se encontró el vehículo a eliminar");
    }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
   
          try {
        String codigo = txtCodigo.getText().trim();
        String marca = txtTitulo.getText().trim();
        String modelo = txtAutor.getText().trim();
        int anioFabricacion = Integer.parseInt(txtPrecio.getText().trim());
        String tipo = txtCodigo1.getText().trim();
        String color = txtCodigo4.getText().trim();
        double precioBase = Double.parseDouble(txtCodigo2.getText().trim());
        EstadoVehiculo estado = EstadoVehiculo.valueOf(
                txtCodigo3.getText().trim().toUpperCase()
        );

        // Si luego tienes una clase concreta (Auto, Camioneta, etc.),
        // reemplaza "new Vehiculo(...){ }" por esa clase.
        Vehiculo vehiculo = new Vehiculo(
                codigo, marca, modelo, color,
                anioFabricacion, tipo, precioBase, estado
        ) { };

        if (gestionVehiculo.registrar(vehiculo)) {
           listarVehiculos();
    limpiar();
    JOptionPane.showMessageDialog(this, "Vehículo registrado correctamente");

    // 👇 ABRIR VENTANA DE PROMO CON LOS DATOS DEL AUTO
    admin_Promo promo = new admin_Promo(marca, precioBase);
    promo.setVisible(true);
} else {
    JOptionPane.showMessageDialog(this, "No se pudo registrar el vehículo");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error en los datos: " + e.getMessage());
    } 
    }//GEN-LAST:event_btnRegistrarActionPerformed
    


    private void txtCodigo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigo3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    } catch (ClassNotFoundException ex) {
        java.util.logging.Logger.getLogger(gestionVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(gestionVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(gestionVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(gestionVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new gestionVehiculo().setVisible(true);
        }
    });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblPrecio1;
    private javax.swing.JLabel lblPrecio2;
    private javax.swing.JLabel lblPrecio3;
    private javax.swing.JLabel lblPrecio4;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tbLibro;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigo1;
    private javax.swing.JTextField txtCodigo2;
    private javax.swing.JTextField txtCodigo3;
    private javax.swing.JTextField txtCodigo4;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables

}
