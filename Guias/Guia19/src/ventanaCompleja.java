/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author alvar
 */
public class ventanaCompleja extends javax.swing.JFrame {

    /**
     * Creates new form ventanaCompleja
     */
    public ventanaCompleja() {
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

        panelTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelDatos = new javax.swing.JPanel();
        etiqueta1 = new javax.swing.JPanel();
        panelEtiqueta1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        etiqueta2 = new javax.swing.JPanel();
        panelCuadro1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        etiqueta3 = new javax.swing.JPanel();
        panelEtiqueta2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        etiqueta4 = new javax.swing.JPanel();
        panelCuadro2 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        panelEstado = new javax.swing.JPanel();
        panelBotonera = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panelVerificacion = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                formComponentAdded(evt);
            }
        });

        jLabel1.setText("Ejercicio de distribucion de paneles layout");
        panelTitulo.add(jLabel1);

        jLabel2.setText("Por Alvaro Pernett");
        panelTitulo.add(jLabel2);

        getContentPane().add(panelTitulo, java.awt.BorderLayout.PAGE_START);

        panelDatos.setLayout(new java.awt.GridLayout(2, 2, 2, 2));

        jLabel6.setText("Dato 1");

        javax.swing.GroupLayout panelEtiqueta1Layout = new javax.swing.GroupLayout(panelEtiqueta1);
        panelEtiqueta1.setLayout(panelEtiqueta1Layout);
        panelEtiqueta1Layout.setHorizontalGroup(
            panelEtiqueta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEtiqueta1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(242, Short.MAX_VALUE))
        );
        panelEtiqueta1Layout.setVerticalGroup(
            panelEtiqueta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEtiqueta1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel6)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout etiqueta1Layout = new javax.swing.GroupLayout(etiqueta1);
        etiqueta1.setLayout(etiqueta1Layout);
        etiqueta1Layout.setHorizontalGroup(
            etiqueta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEtiqueta1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        etiqueta1Layout.setVerticalGroup(
            etiqueta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, etiqueta1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelEtiqueta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelDatos.add(etiqueta1);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCuadro1Layout = new javax.swing.GroupLayout(panelCuadro1);
        panelCuadro1.setLayout(panelCuadro1Layout);
        panelCuadro1Layout.setHorizontalGroup(
            panelCuadro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuadro1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(234, Short.MAX_VALUE))
        );
        panelCuadro1Layout.setVerticalGroup(
            panelCuadro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuadro1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout etiqueta2Layout = new javax.swing.GroupLayout(etiqueta2);
        etiqueta2.setLayout(etiqueta2Layout);
        etiqueta2Layout.setHorizontalGroup(
            etiqueta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 311, Short.MAX_VALUE)
            .addGroup(etiqueta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelCuadro1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        etiqueta2Layout.setVerticalGroup(
            etiqueta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 152, Short.MAX_VALUE)
            .addGroup(etiqueta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelCuadro1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelDatos.add(etiqueta2);

        jLabel7.setText("jLabel7");

        javax.swing.GroupLayout panelEtiqueta2Layout = new javax.swing.GroupLayout(panelEtiqueta2);
        panelEtiqueta2.setLayout(panelEtiqueta2Layout);
        panelEtiqueta2Layout.setHorizontalGroup(
            panelEtiqueta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEtiqueta2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(244, Short.MAX_VALUE))
        );
        panelEtiqueta2Layout.setVerticalGroup(
            panelEtiqueta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEtiqueta2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel7)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout etiqueta3Layout = new javax.swing.GroupLayout(etiqueta3);
        etiqueta3.setLayout(etiqueta3Layout);
        etiqueta3Layout.setHorizontalGroup(
            etiqueta3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 311, Short.MAX_VALUE)
            .addGroup(etiqueta3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelEtiqueta2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        etiqueta3Layout.setVerticalGroup(
            etiqueta3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 152, Short.MAX_VALUE)
            .addGroup(etiqueta3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelEtiqueta2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelDatos.add(etiqueta3);

        javax.swing.GroupLayout panelCuadro2Layout = new javax.swing.GroupLayout(panelCuadro2);
        panelCuadro2.setLayout(panelCuadro2Layout);
        panelCuadro2Layout.setHorizontalGroup(
            panelCuadro2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuadro2Layout.createSequentialGroup()
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 240, Short.MAX_VALUE))
        );
        panelCuadro2Layout.setVerticalGroup(
            panelCuadro2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuadro2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout etiqueta4Layout = new javax.swing.GroupLayout(etiqueta4);
        etiqueta4.setLayout(etiqueta4Layout);
        etiqueta4Layout.setHorizontalGroup(
            etiqueta4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 311, Short.MAX_VALUE)
            .addGroup(etiqueta4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelCuadro2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        etiqueta4Layout.setVerticalGroup(
            etiqueta4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 152, Short.MAX_VALUE)
            .addGroup(etiqueta4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelCuadro2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelDatos.add(etiqueta4);

        getContentPane().add(panelDatos, java.awt.BorderLayout.CENTER);

        panelBotonera.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("jButton1");
        panelBotonera.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jButton2.setText("jButton2");
        panelBotonera.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jButton3.setText("jButton3");
        panelBotonera.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jButton4.setText("jButton4");
        panelBotonera.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jLabel3.setText("jLabel3");

        jLabel4.setText("jLabel4");

        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout panelEstadoLayout = new javax.swing.GroupLayout(panelEstado);
        panelEstado.setLayout(panelEstadoLayout);
        panelEstadoLayout.setHorizontalGroup(
            panelEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstadoLayout.createSequentialGroup()
                .addComponent(panelBotonera, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 306, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(263, 263, 263))
        );
        panelEstadoLayout.setVerticalGroup(
            panelEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEstadoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelBotonera, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEstadoLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(panelEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panelEstado, java.awt.BorderLayout.SOUTH);

        panelVerificacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCheckBox1.setText("jCheckBox1");
        panelVerificacion.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 12, 85, -1));

        jCheckBox2.setText("jCheckBox2");
        panelVerificacion.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 58, 85, -1));

        jCheckBox3.setText("jCheckBox3");
        panelVerificacion.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 113, 85, -1));

        jCheckBox4.setText("jCheckBox4");
        panelVerificacion.add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 163, 85, -1));

        getContentPane().add(panelVerificacion, java.awt.BorderLayout.EAST);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentAdded

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(ventanaCompleja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaCompleja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaCompleja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaCompleja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaCompleja().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel etiqueta1;
    private javax.swing.JPanel etiqueta2;
    private javax.swing.JPanel etiqueta3;
    private javax.swing.JPanel etiqueta4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel panelBotonera;
    private javax.swing.JPanel panelCuadro1;
    private javax.swing.JPanel panelCuadro2;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelEstado;
    private javax.swing.JPanel panelEtiqueta1;
    private javax.swing.JPanel panelEtiqueta2;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JPanel panelVerificacion;
    // End of variables declaration//GEN-END:variables
}
