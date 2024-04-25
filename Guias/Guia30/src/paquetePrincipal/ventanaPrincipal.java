/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package paquetePrincipal;

import javax.swing.JOptionPane;

/**
 *
 * @author alvar
 */
public class ventanaPrincipal extends javax.swing.JFrame {
    
salaCine central;
salaCine vo;

    
    public ventanaPrincipal() {
        initComponents();
        
    central = new salaCine();
    vo = new salaCine();
    
    central.setaforo(500);
    central.setentrada(8);
    
    vo.setaforo(80);
    vo.setentrada(6);
        
    }
    
   

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelVOriginal = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        etiOriginalPelicula = new javax.swing.JLabel();
        botonOriginalCambiar = new javax.swing.JButton();
        botonOriginalNueva = new javax.swing.JButton();
        botonOriginalOcupacion = new javax.swing.JButton();
        botonOriginalVaciar = new javax.swing.JButton();
        botonOriginalIngresos = new javax.swing.JButton();
        panelCentral = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        etiCentralPelicula = new javax.swing.JLabel();
        botonCentralCambiar = new javax.swing.JButton();
        botonCentralNueva = new javax.swing.JButton();
        botonCentralOcupacion = new javax.swing.JButton();
        botonCentralVaciar = new javax.swing.JButton();
        botonCentralIngresos = new javax.swing.JButton();
        botonIngresosTotales = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Salas de cine");

        panelVOriginal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("SALA VERSION ORIGINAL");

        jLabel4.setText("Pelicula:");

        etiOriginalPelicula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        botonOriginalCambiar.setText("Cambiar");
        botonOriginalCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOriginalCambiarActionPerformed(evt);
            }
        });

        botonOriginalNueva.setText("Nueva Venta");
        botonOriginalNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOriginalNuevaActionPerformed(evt);
            }
        });

        botonOriginalOcupacion.setText("% Ocupacion");
        botonOriginalOcupacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOriginalOcupacionActionPerformed(evt);
            }
        });

        botonOriginalVaciar.setText("Vaciar");
        botonOriginalVaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOriginalVaciarActionPerformed(evt);
            }
        });

        botonOriginalIngresos.setText("Ingresos");
        botonOriginalIngresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOriginalIngresosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelVOriginalLayout = new javax.swing.GroupLayout(panelVOriginal);
        panelVOriginal.setLayout(panelVOriginalLayout);
        panelVOriginalLayout.setHorizontalGroup(
            panelVOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVOriginalLayout.createSequentialGroup()
                .addGroup(panelVOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelVOriginalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(panelVOriginalLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel4)
                        .addGap(26, 26, 26)
                        .addComponent(etiOriginalPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonOriginalCambiar))
                    .addGroup(panelVOriginalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botonOriginalNueva)
                        .addGap(18, 18, 18)
                        .addComponent(botonOriginalOcupacion)
                        .addGap(18, 18, 18)
                        .addComponent(botonOriginalVaciar)
                        .addGap(18, 18, 18)
                        .addComponent(botonOriginalIngresos)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        panelVOriginalLayout.setVerticalGroup(
            panelVOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVOriginalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(panelVOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(etiOriginalPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonOriginalCambiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(panelVOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonOriginalNueva)
                    .addComponent(botonOriginalOcupacion)
                    .addComponent(botonOriginalVaciar)
                    .addComponent(botonOriginalIngresos))
                .addGap(16, 16, 16))
        );

        panelCentral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("SALA CENTRAL");

        jLabel3.setText("Pelicula:");

        etiCentralPelicula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        botonCentralCambiar.setText("Cambiar");
        botonCentralCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCentralCambiarActionPerformed(evt);
            }
        });

        botonCentralNueva.setText("Nueva Venta");
        botonCentralNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCentralNuevaActionPerformed(evt);
            }
        });

        botonCentralOcupacion.setText("% Ocupacion");
        botonCentralOcupacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCentralOcupacionActionPerformed(evt);
            }
        });

        botonCentralVaciar.setText("Vaciar");
        botonCentralVaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCentralVaciarActionPerformed(evt);
            }
        });

        botonCentralIngresos.setText("Ingresos");
        botonCentralIngresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCentralIngresosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCentralLayout = new javax.swing.GroupLayout(panelCentral);
        panelCentral.setLayout(panelCentralLayout);
        panelCentralLayout.setHorizontalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCentralLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(35, 35, 35))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCentralLayout.createSequentialGroup()
                                .addComponent(botonCentralNueva)
                                .addGap(18, 18, 18)))
                        .addComponent(botonCentralOcupacion)
                        .addGap(18, 18, 18)
                        .addComponent(botonCentralVaciar)
                        .addGap(18, 18, 18)
                        .addComponent(botonCentralIngresos))
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel3)
                        .addGap(29, 29, 29)
                        .addComponent(etiCentralPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonCentralCambiar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCentralLayout.setVerticalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonCentralCambiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiCentralPelicula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonCentralOcupacion)
                            .addComponent(botonCentralNueva)
                            .addComponent(botonCentralVaciar)
                            .addComponent(botonCentralIngresos))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        botonIngresosTotales.setText("Ingresos Totales");
        botonIngresosTotales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresosTotalesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonIngresosTotales)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(panelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelVOriginal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelVOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonIngresosTotales)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCentralNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCentralNuevaActionPerformed
    central.entraUno();
    }//GEN-LAST:event_botonCentralNuevaActionPerformed

    private void botonCentralCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCentralCambiarActionPerformed
    String titulo;
    
    titulo = JOptionPane.showInputDialog(null," Introduce el titulo de la pelicula: ");
    central.setpelicula(titulo);
    etiCentralPelicula.setText(titulo);
    }//GEN-LAST:event_botonCentralCambiarActionPerformed

    private void botonCentralOcupacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCentralOcupacionActionPerformed
    String info;
    
    info = " Sala central\n";
    info = info + "Peliculas: " + central.getpelicula()+"\n";
    info = info + "Ocupadas: " + central.getocupadas()+"\n";
    info = info + "Libres: " + central.getlibres()+"\n";
    info = info + "Porcentaje Ocupacion: " + central.getporcentaje()+"\n";
    
    JOptionPane.showMessageDialog(null,info);
    
    
    
    
    
    }//GEN-LAST:event_botonCentralOcupacionActionPerformed

    private void botonCentralVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCentralVaciarActionPerformed
    central.vaciar();
    etiCentralPelicula.setText("");
    }//GEN-LAST:event_botonCentralVaciarActionPerformed

    private void botonCentralIngresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCentralIngresosActionPerformed
    String info;
        info = "Ingresos de la sala: " + central.getingresos()+ " euros";
    JOptionPane.showMessageDialog(null,info);
        
    }//GEN-LAST:event_botonCentralIngresosActionPerformed

    private void botonOriginalNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOriginalNuevaActionPerformed
    vo.entraUno();
    }//GEN-LAST:event_botonOriginalNuevaActionPerformed

    private void botonOriginalOcupacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOriginalOcupacionActionPerformed
    String info;
    
    info = " Sala version original\n";
    info = info + "Peliculas: " + vo.getpelicula()+"\n";
    info = info + "Ocupadas: " + vo.getocupadas()+"\n";
    info = info + "Libres: " + vo.getlibres()+"\n";
    info = info + "Porcentaje Ocupacion: " + vo.getporcentaje()+"\n";
    
    JOptionPane.showMessageDialog(null,info);
    }//GEN-LAST:event_botonOriginalOcupacionActionPerformed

    private void botonOriginalVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOriginalVaciarActionPerformed
    vo.vaciar();
    etiOriginalPelicula.setText("");
    }//GEN-LAST:event_botonOriginalVaciarActionPerformed

    private void botonOriginalIngresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOriginalIngresosActionPerformed
    String info;
        info = "Ingresos de la sala: " + vo.getingresos()+ " euros";
    JOptionPane.showMessageDialog(null,info);
    }//GEN-LAST:event_botonOriginalIngresosActionPerformed

    private void botonOriginalCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOriginalCambiarActionPerformed
    String titulo;
    
    titulo = JOptionPane.showInputDialog(null," Introduce el titulo de la pelicula: ");
    vo.setpelicula(titulo);
    etiOriginalPelicula.setText(titulo);
    }//GEN-LAST:event_botonOriginalCambiarActionPerformed

    private void botonIngresosTotalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresosTotalesActionPerformed
    double total = 0;
    
    String info;
    
    info = "El ingreso total de ambas salas es de: ";
    
    total = central.getingresos() + vo.getingresos();
    
    JOptionPane.showMessageDialog(null,info + total + (" euros"));
    }//GEN-LAST:event_botonIngresosTotalesActionPerformed

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
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCentralCambiar;
    private javax.swing.JButton botonCentralIngresos;
    private javax.swing.JButton botonCentralNueva;
    private javax.swing.JButton botonCentralOcupacion;
    private javax.swing.JButton botonCentralVaciar;
    private javax.swing.JButton botonIngresosTotales;
    private javax.swing.JButton botonOriginalCambiar;
    private javax.swing.JButton botonOriginalIngresos;
    private javax.swing.JButton botonOriginalNueva;
    private javax.swing.JButton botonOriginalOcupacion;
    private javax.swing.JButton botonOriginalVaciar;
    private javax.swing.JLabel etiCentralPelicula;
    private javax.swing.JLabel etiOriginalPelicula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel panelCentral;
    private javax.swing.JPanel panelVOriginal;
    // End of variables declaration//GEN-END:variables
}
