/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz_Admin;

import Gestion.GestionReportes1;
import Personas.Cliente;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sebas
 */

public class gestionClientes extends javax.swing.JFrame {
    public gestionClientes() {
        initComponents(); // Código generado por NetBeans
        
        configurarTabla(); // Configura las columnas (Arregla la tabla gris)
        listarClientes();  // Carga los datos del arreglo
        
        this.setTitle("Gestión de Clientes");
        this.setLocationRelativeTo(null); // Centra la ventana
    }
    // =======================================================
    // 1. CONFIGURAR TABLA (Para solucionar el error)
    // =======================================================
    private void configurarTabla() {
        DefaultTableModel modelo = new DefaultTableModel();
        
        // Aquí definimos los títulos de la tabla manualmente
        modelo.addColumn("DNI");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Dirección");
        modelo.addColumn("Teléfono");
        modelo.addColumn("Correo");
        
        // Asignamos el modelo a la tabla visual (tblClientes)
        tblClientes.setModel(modelo);
    }

    // =======================================================
    // 2. LISTAR CLIENTES (Llenar tabla con datos del arreglo)
    // =======================================================
    private void listarClientes() {
        DefaultTableModel modelo = (DefaultTableModel) tblClientes.getModel();
        modelo.setRowCount(0); // Limpiamos para no duplicar

        // Recorremos el arreglo hasta el contador actual
        for (int i = 0; i < GestionReportes1.getContClientes(); i++) {
            Cliente c = GestionReportes1.getListaClientes()[i];
            
            Object[] fila = {
                c.getDni(),
                c.getNombres(),
                c.getApellidoPaterno() + " " + c.getApellidoMaterno(),
                c.getDireccion(),
                c.getTelefono(),
                c.getCorreo()
            };
            modelo.addRow(fila);
        }
    }

    // Método auxiliar para limpiar las cajas
    private void limpiar() {
        txtDni.setText("");
        txtNombre.setText("");
        txtPaterno.setText("");
        txtMaterno.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        txtCorreo.setText("");
        
        txtDni.setEditable(true); // Desbloquea DNI
        txtDni.requestFocus();
    }
                                    

    // =======================================================
    // BOTÓN 2: BUSCAR
    // =======================================================
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        String dni = txtDni.getText();
        Cliente c = GestionReportes1.buscarCliente(dni);

        if (c != null) {
            txtNombre.setText(c.getNombres());
            txtPaterno.setText(c.getApellidoPaterno());
            txtMaterno.setText(c.getApellidoMaterno());
            txtDireccion.setText(c.getDireccion());
            txtTelefono.setText(c.getTelefono());
            txtCorreo.setText(c.getCorreo());
            
            txtDni.setEditable(false); // Bloqueamos el DNI para que no lo cambien
            JOptionPane.showMessageDialog(this, "Encontrado. Puede modificar y Guardar.");
        } else {
            JOptionPane.showMessageDialog(this, "No encontrado.");
        }
    }                                         

    // =======================================================
    // BOTÓN 3: GUARDAR (Funciona como Modificar)
    // =======================================================
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // Busamos al original usando el DNI que está en la caja (bloqueado)
        Cliente c = GestionReportes1.buscarCliente(txtDni.getText());

        if (c != null) {
            // Usamos SETTERS para actualizar los datos
            c.setNombres(txtNombre.getText());
            c.setApellidoPaterno(txtPaterno.getText());
            c.setApellidoMaterno(txtMaterno.getText());
            c.setDireccion(txtDireccion.getText());
            c.setTelefono(txtTelefono.getText());
            c.setCorreo(txtCorreo.getText());

            listarClientes(); // Refrescar tabla
            limpiar();        // Limpiar y desbloquear
            JOptionPane.showMessageDialog(this, "Cambios guardados.");
        } else {
            JOptionPane.showMessageDialog(this, "Error: Busque primero al cliente.");
        }
    }                                          

    // =======================================================
    // BOTÓN 4: ELIMINAR
    // =======================================================
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        String dni = txtDni.getText();
        
        if (JOptionPane.showConfirmDialog(this, "¿Eliminar?") == 0) {
            
            if (GestionReportes1.eliminarCliente(dni)) {
                listarClientes();
                limpiar();
                JOptionPane.showMessageDialog(this, "Cliente eliminado.");
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo eliminar.");
            }
        }
    }
    
    
    
    
    
    
    
    
    
    
    

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jblDni = new javax.swing.JLabel();
        jblNombre = new javax.swing.JLabel();
        jblPaterno = new javax.swing.JLabel();
        jblMaterno = new javax.swing.JLabel();
        jblDireccion = new javax.swing.JLabel();
        jblTelefono = new javax.swing.JLabel();
        jblCorreo = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        txtPaterno = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtMaterno = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnGuardad = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        btnRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jblDni.setText("DNI");

        jblNombre.setText("Nombre");

        jblPaterno.setText("Apellido Paterno");

        jblMaterno.setText("Apellido Materno");

        jblDireccion.setText("Direccion");

        jblTelefono.setText("Telefono");

        jblCorreo.setText("Correo");

        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");

        btnGuardad.setText("Guardar");

        btnEliminar.setText("Eliminar");

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Dni", "Nombre", "Apellidos", "Telefono", "Correo"
            }
        ));
        tblClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(tblClientes);

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jblNombre)
                                .addGap(67, 67, 67))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(188, 188, 188)
                                        .addComponent(jblPaterno))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(224, 224, 224)
                                        .addComponent(jblDni))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(215, 215, 215)
                                        .addComponent(jblDireccion))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(207, 207, 207)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jblCorreo)
                                            .addComponent(jblTelefono)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(188, 188, 188)
                                        .addComponent(jblMaterno)))
                                .addGap(44, 44, 44)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnGuardad)
                                .addComponent(btnBuscar)
                                .addComponent(btnRegistrar))
                            .addComponent(btnEliminar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(308, 308, 308)
                        .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(356, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegistrar)
                            .addComponent(jblDni))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jblNombre)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(btnBuscar)))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblPaterno)
                    .addComponent(txtPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardad)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblMaterno))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblDireccion)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jblTelefono)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblCorreo)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(432, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String dni = txtDni.getText();
        
        // Validación simple
        if (dni.isEmpty() || txtNombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Complete los datos.");
            return;
        }

        // Crear objeto
        Cliente nuevo = new Cliente(
            dni, txtNombre.getText(), txtPaterno.getText(), 
            txtMaterno.getText(), txtDireccion.getText(), 
            txtTelefono.getText(), txtCorreo.getText()
        );

        // Guardar y Actualizar
        GestionReportes1.agregarClientes(nuevo);
        listarClientes();
        limpiar();
        JOptionPane.showMessageDialog(this, "Registrado con éxito.");

// TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(gestionClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gestionClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gestionClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gestionClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gestionClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardad;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jblCorreo;
    private javax.swing.JLabel jblDireccion;
    private javax.swing.JLabel jblDni;
    private javax.swing.JLabel jblMaterno;
    private javax.swing.JLabel jblNombre;
    private javax.swing.JLabel jblPaterno;
    private javax.swing.JLabel jblTelefono;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtMaterno;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPaterno;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
