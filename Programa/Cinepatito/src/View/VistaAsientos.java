/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Asiento;
import Model.Funcion;
import java.awt.Button;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author erofa
 */
public class VistaAsientos extends javax.swing.JFrame implements ActionListener {

    int FILAS = 15;
    int COLUMNAS = 25;
    JButton[][] BUTACA;
    VistaInicio vistaInicio;
    Funcion funcion = vistaInicio.funcionSelected;
    Asiento asientos[][] = funcion.getAsientos();

    public VistaAsientos() throws IOException {
        initComponents();
        setMatriz();
        this.setLocationRelativeTo(null);
    }

    private void setMatriz() throws IOException {
        
        jLabelTitulo.setText(String.valueOf(funcion.getPeli().getNombre()));
        jLabelSala.setText("Sala: "+ String.valueOf(funcion.getSala()));
        jLabelIDFuncion.setText("Hora de Inicio: " +String.valueOf(funcion.getHora()));

        BUTACA = new JButton[FILAS][COLUMNAS];
        int x = 10;
        int y = 10;
        
//        Funcion funcionSelected = vistaInicio.funcionSelected;
//        Asiento asientos[][]= funcionSelected.getAsientos();
//        
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                
                BUTACA[i][j] = new JButton();
                if ((asientos[i][j].isDisponible()) == true) {
                establecerImagenInicial(BUTACA[i][j]);
                BUTACA[i][j].setBounds(y, x, 40, 40);
                BUTACA[i][j].setBackground(Color.WHITE);
                butaca.add(BUTACA[i][j]);
                } else {
                establecerImagenOcupado(BUTACA[i][j]);
                BUTACA[i][j].setBounds(y, x, 40, 40);
                BUTACA[i][j].setBackground(Color.WHITE);
                butaca.add(BUTACA[i][j]);
                }
                BUTACA[i][j].addActionListener(this);
           
                y += 40;
                
//                BUTACA[i][j] = new JButton();
//               
////                establecerImagenInicial(BUTACA[i][j]);
//                try {
//                    Image img = ImageIO.read(getClass().getResource("Asiento.png"));
//                    BUTACA[i][j].setIcon(new ImageIcon(img));
//                } catch (Exception ex) {
//                    System.out.println("No esta esa onda");
//                }
//                BUTACA[i][j].setBounds(y, x, 40, 40);
//                BUTACA[i][j].setBackground(Color.WHITE);
//                BUTACA[i][j].addActionListener(this);
//                butaca.add(BUTACA[i][j]);
//                y += 40;
            }
            x += 40;
            y = 10;
        }
        
        
    }
    //inicio codigo que modifica las butacas
        public void establecerImagenInicial(JButton boton) {
        try {
            Image img = ImageIO.read(getClass().getResource("/Img/Asiento.png"));
            boton.setIcon(new ImageIcon(img));
        } catch (Exception ex) {
            System.out.println("No se encuentra");
        }
    }

    public void establecerImagenSeleccion(JButton boton) {
        try {
            Image img = ImageIO.read(getClass().getResource("/Img/AsientoVerde.png"));
            boton.setIcon(new ImageIcon(img));
        } catch (Exception ex) {
            System.out.println("No se encuentra");
        }
    }

    public void establecerImagenOcupado(JButton boton) {
        try {
            Image img = ImageIO.read(getClass().getResource("/Img/AsientoRojo.png"));
            boton.setIcon(new ImageIcon(img));
        } catch (Exception ex) {
            System.out.println("No se encuentra");
        }
    }
    
    
    //fin codigo que modifica butacas
    //metodo para agregar actionlistener a las butacas
    
    
    @Override
  public void actionPerformed(ActionEvent e){
      for(int i = 0; i<FILAS; i++){
          for(int j=0; j<COLUMNAS; j++){
              if (e.getSource() == BUTACA[i][j]) {
                  try {
                      cambiarEstadoAsiento();
                  } catch (IOException ex) {
                     // Logger.getLogger(VistaAsientos.class.getName()).log(Level.SEVERE, null, ex);
                  }
                 
              }
          }
      }
      
  }
  
  public void cambiarEstadoAsiento() throws IOException{
    for(int i = 0; i<FILAS; i++){
          for(int j=0; j<COLUMNAS; j++){
              try {
                    Image imge = ImageIO.read(getClass().getResource("AsientoVerde.png"));
                    BUTACA[i][j].setIcon(new ImageIcon(imge));
                } catch (Exception e) {
                    System.out.println("No esta esa onda");
                }
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

        butaca = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelSala = new javax.swing.JLabel();
        jLabelIDFuncion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTitulo.setText("jLabel1");

        jLabelSala.setText("jLabel1");

        jLabelIDFuncion.setText("jLabel1");

        javax.swing.GroupLayout butacaLayout = new javax.swing.GroupLayout(butaca);
        butaca.setLayout(butacaLayout);
        butacaLayout.setHorizontalGroup(
            butacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, butacaLayout.createSequentialGroup()
                .addContainerGap(1073, Short.MAX_VALUE)
                .addGroup(butacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitulo)
                    .addComponent(jLabelSala)
                    .addComponent(jLabelIDFuncion))
                .addGap(181, 181, 181))
        );
        butacaLayout.setVerticalGroup(
            butacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(butacaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabelTitulo)
                .addGap(18, 18, 18)
                .addComponent(jLabelSala)
                .addGap(30, 30, 30)
                .addComponent(jLabelIDFuncion)
                .addContainerGap(563, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(butaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(butaca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    private javax.swing.JPanel butaca;
    private javax.swing.JLabel jLabelIDFuncion;
    private javax.swing.JLabel jLabelSala;
    private javax.swing.JLabel jLabelTitulo;
    // End of variables declaration//GEN-END:variables
}
