/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Asiento;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Edwin Fajardo
 */
public class VistaAsientos extends javax.swing.JFrame {

    int FILAS = 15;
    int COLUMNAS = 25;
    JButton[][] BUTACA;
    ArrayList<Asiento> listaAsientos = new ArrayList();

    //Clase que escucha si algun botón es presionado
    public class Boton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            int n = 0;
            ArrayList listaSeleccionadosLogicos = new ArrayList();
            ArrayList listaSeleccionadosFisicos = new ArrayList();

            //Aqui escucha todos los botones de asientos
            for (int i = 0; i < FILAS; i++) {
                for (int j = 0; j < COLUMNAS; j++) {

                    //Verifica que asiento se presiona
                    if (BUTACA[i][j] == ae.getSource()) {

                        //Si esta disponible lo selecciona y se guarda su id
                        if (listaAsientos.get(n).isDisponible()) {
                            establecerImagenSeleccion(BUTACA[i][j]);
                            listaSeleccionadosFisicos.add(BUTACA[i][j]);
                            listaSeleccionadosLogicos.add(listaAsientos.get(n));
                            System.out.println("FISICO: " + BUTACA[i][j]);
                        } else {
                            JOptionPane.showMessageDialog(null, "No disponible");
                        }

                    }
                    n++;
                }
            }

            //Cuando se da a aceptar se toman todos los asientos seleccionados y se marcan como ocupados
            if (getAceptar() == ae.getSource()) {
                System.out.println("Hey");

                //Se establecen los asientos fisicos seleccionados como ocupados
//                for (Object selectFis : listaSeleccionadosFisicos) {
//                    System.out.println("Seleccionado: " + selectFis);
//                    for (int i = 0; i < FILAS; i++) {
//                        for (int j = 0; j < COLUMNAS; j++) {
//                            if (BUTACA[i][j] == selectFis) {
//                                establecerImagenOcupado(BUTACA[i][j]);
//                            }
//                        }
//                    }
//                }

                //Se establecen los asientos logicos seleccionados como ocupados
//                for (Asiento asiento : listaAsientos) {
//                    for (int i = 0; i < listaSeleccionadosLogicos.size(); i++) {
//                        if (asiento == listaSeleccionadosLogicos.get(i)) {
//                            asiento.setDisponible(false);
//                            System.out.println("kkck");
//                        }
//
//                    }
//                }

            }

        }

    }

    public JButton getAceptar() {
        return Aceptar;
    }

    //Constructor de la vista, inicia la ventana y muestra los asientos
    public VistaAsientos() throws IOException {
        initComponents();
        crearAsientos();
    }

    //Se agregan un actionListener a cada boton para saber cuando es presionado
    public void agregarActionListeners(JButton[][] butaca) {
        Boton listen = new Boton();
        getAceptar().addActionListener(listen);
        int n = 0;
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                n++;
                ActionListener al = null;
                butaca[i][j].addActionListener(listen);
            }
        }

    }

    //Crea los asientos graficos como de instancia del objeto Asiento
    private void crearAsientos() throws IOException {
        BUTACA = new JButton[FILAS][COLUMNAS];
        int x = 10;
        int y = 10;
        int n = 0;

        //Por cada fila(25) y por cada columna(15) se crea un boton. (375)
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {

                //Creación del asiento grafico
                BUTACA[i][j] = new JButton();
                establecerImagenInicial(BUTACA[i][j]);
                BUTACA[i][j].setBounds(y, x, 40, 40);
                BUTACA[i][j].setBackground(Color.WHITE);
                butaca.add(BUTACA[i][j]);

                //Creacion del asiento de instancia de Asiento
                Asiento as = new Asiento(n, true);
                listaAsientos.add(as);
                y += 40;
                n++;
            }
            x += 40;
            y = 10;
        }

        agregarActionListeners(BUTACA);
//        System.out.println(listaAsientos);

    }

    public void establecerImagenInicial(JButton boton) {
        try {
            Image img = ImageIO.read(getClass().getResource("/Img/Asiento.png"));
            boton.setIcon(new ImageIcon(img));
        } catch (Exception ex) {
            System.out.println("No esta esa onda");
        }
    }

    public void establecerImagenSeleccion(JButton boton) {
        try {
            Image img = ImageIO.read(getClass().getResource("/Img/AsientoVerde.png"));
            boton.setIcon(new ImageIcon(img));
        } catch (Exception ex) {
            System.out.println("No esta esa onda");
        }
    }

    public void establecerImagenOcupado(JButton boton) {
        try {
            Image img = ImageIO.read(getClass().getResource("/Img/AsientoRojo.png"));
            boton.setIcon(new ImageIcon(img));
        } catch (Exception ex) {
            System.out.println("No esta esa onda");
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

        butaca = new javax.swing.JPanel();
        Aceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout butacaLayout = new javax.swing.GroupLayout(butaca);
        butaca.setLayout(butacaLayout);
        butacaLayout.setHorizontalGroup(
            butacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1024, Short.MAX_VALUE)
        );
        butacaLayout.setVerticalGroup(
            butacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 612, Short.MAX_VALUE)
        );

        Aceptar.setText("Aceptar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(butaca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Aceptar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(butaca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Aceptar))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(VistaAsientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaAsientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaAsientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaAsientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new VistaAsientos().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(VistaAsientos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JPanel butaca;
    // End of variables declaration//GEN-END:variables

//    @Override
//    public void actionPerformed(ActionEvent ae) {
//        System.out.println("Hey");
//    }
}
