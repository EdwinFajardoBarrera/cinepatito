/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Funcion;
import Model.Pelicula;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Esthefany
 */
public class VistaInicio extends javax.swing.JFrame {
    DefaultTableModel modelo;
    vistaCrearFuncion funciones = new vistaCrearFuncion();
    static Funcion funcionSelected;
    
    /**
     * Creates new form VistaInicio
     */
    public VistaInicio() throws IOException {
        initComponents();
        cargar();
    }
    public void cargar() throws IOException{
        String [] titulos = {"No.De Pelicula","Pelicula","Hora","Sala"};
        String[] datos;
        int contador;
        modelo = new  DefaultTableModel(null,titulos);
        
        ArrayList<Funcion> funcion= funciones.ArrayFunciones;
        
//        contador=funcion.size();
//        System.out.println(contador);
        datos= new String[4];
        System.out.println(titulos.length);
        for(int i=0;i<funcion.size();i++){
            datos[0]=String.valueOf(funcion.get(i).getIdFuncion());
            datos[1]=String.valueOf(funcion.get(i).getPeli().getNombre());
            datos[2]=String.valueOf(funcion.get(i).getHora());
            datos[3]=String.valueOf(funcion.get(i).getSala());
            
            modelo.addRow(datos);
        }
        jTableFunciones.setModel(modelo);
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
        AgFuncionBoton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFunciones = new javax.swing.JTable();
        AgrPeliculaBoton = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();
        jButtonComprarBoletos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CINE");

        AgFuncionBoton.setText("Agregar Funcion");
        AgFuncionBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgFuncionBotonActionPerformed(evt);
            }
        });

        jTableFunciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Pelicula", "Pelicula", "Hora", "Sala"
            }
        ));
        jScrollPane1.setViewportView(jTableFunciones);

        AgrPeliculaBoton.setText("Agregar pelicula");
        AgrPeliculaBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgrPeliculaBotonActionPerformed(evt);
            }
        });

        jButtonActualizar.setText("Actualizar Funciones");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });

        jButtonComprarBoletos.setText("Comprar Boletos");
        jButtonComprarBoletos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonComprarBoletosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jButtonActualizar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButtonComprarBoletos)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(AgFuncionBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(AgrPeliculaBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(AgFuncionBoton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AgrPeliculaBoton)
                        .addGap(50, 50, 50)
                        .addComponent(jButtonComprarBoletos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonActualizar)
                        .addGap(29, 29, 29))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgrPeliculaBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgrPeliculaBotonActionPerformed
        vistaAgregarPelicula vstpel = new vistaAgregarPelicula();
        vstpel.setVisible(true);
        
        
        
    }//GEN-LAST:event_AgrPeliculaBotonActionPerformed

    private void AgFuncionBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgFuncionBotonActionPerformed
        vistaCrearFuncion vst = new vistaCrearFuncion();
        vst.setVisible(true);
        
    }//GEN-LAST:event_AgFuncionBotonActionPerformed

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        try {
            // TODO add your handling code here:
            cargar();
        } catch (IOException ex) {
            Logger.getLogger(VistaInicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jButtonComprarBoletosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonComprarBoletosActionPerformed
        
        try {
            // TODO add your handling code here:
            funcionSelected = funciones.ArrayFunciones.get(jTableFunciones.getSelectedRow());
            System.out.println(funcionSelected.getIdFuncion());
            
            VistaAsientos vistaAsientos = new VistaAsientos();
            
            
            vistaAsientos.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(VistaInicio.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_jButtonComprarBoletosActionPerformed

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
            java.util.logging.Logger.getLogger(VistaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new VistaInicio().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(VistaInicio.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgFuncionBoton;
    private javax.swing.JButton AgrPeliculaBoton;
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonComprarBoletos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableFunciones;
    // End of variables declaration//GEN-END:variables
}
