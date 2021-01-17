
import java.util.Random;

public class FrmMascota extends javax.swing.JFrame {
    Lienzo sf = new Lienzo(this);
    Random rand = new Random();
    
    public FrmMascota() {
        initComponents();
        
        sf.setSize(1280,640);
        sf.setLocation(0, 0);
        add(sf);
        
        this.setSize(1280,752);
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pSalud = new rojerusan.componentes.RSProgressCircle();
        lblSalud = new javax.swing.JLabel();
        pHambre = new rojerusan.componentes.RSProgressCircle();
        lblHambre = new javax.swing.JLabel();
        pCansancio = new rojerusan.componentes.RSProgressCircle();
        lblCansancio = new javax.swing.JLabel();
        pHigiene = new rojerusan.componentes.RSProgressCircle();
        lblHigiene = new javax.swing.JLabel();
        btnDormirDespertar = new rojerusan.RSButtonRound();
        btnLimpiar = new rojerusan.RSButtonRound();
        btnAlimentar = new rojerusan.RSButtonRound();
        btnSalud = new rojerusan.RSButtonRound();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pSalud.setForeground(new java.awt.Color(51, 153, 0));
        pSalud.setValue(100);
        pSalud.setFont(new java.awt.Font("Roboto Bold", 0, 14)); // NOI18N
        jPanel1.add(pSalud, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 50, 50));

        lblSalud.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblSalud.setText("Salud");
        jPanel1.add(lblSalud, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 69, -1));

        pHambre.setForeground(new java.awt.Color(181, 115, 1));
        pHambre.setValue(20);
        pHambre.setFont(new java.awt.Font("Roboto Bold", 0, 14)); // NOI18N
        jPanel1.add(pHambre, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, 50, 50));

        lblHambre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblHambre.setText("Hambre");
        jPanel1.add(lblHambre, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 84, -1));

        pCansancio.setForeground(new java.awt.Color(0, 255, 255));
        pCansancio.setValue(0);
        pCansancio.setFont(new java.awt.Font("Roboto Bold", 0, 14)); // NOI18N
        jPanel1.add(pCansancio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 0, 50, 72));

        lblCansancio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblCansancio.setText("Cansancio");
        jPanel1.add(lblCansancio, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, -1, -1));

        pHigiene.setValue(100);
        pHigiene.setFont(new java.awt.Font("Roboto Bold", 0, 14)); // NOI18N
        jPanel1.add(pHigiene, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 0, 50, 72));

        lblHigiene.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblHigiene.setText("Higiene");
        jPanel1.add(lblHigiene, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 10, -1, -1));

        btnDormirDespertar.setText("Dormir/Despertar");
        btnDormirDespertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDormirDespertarActionPerformed(evt);
            }
        });
        jPanel1.add(btnDormirDespertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 167, 32));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 110, 32));

        btnAlimentar.setText("Alimentar");
        btnAlimentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlimentarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAlimentar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 110, 32));

        btnSalud.setText("Curar");
        btnSalud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaludActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalud, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, 32));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(648, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlimentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlimentarActionPerformed
        pHambre.setValue(pHambre.getValue() - 7);
        sf.ms.hambre = pHambre.getValue();
    }//GEN-LAST:event_btnAlimentarActionPerformed

    private void btnDormirDespertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDormirDespertarActionPerformed
        if(sf.HiloMovimiento.est == 1){
            sf.HiloMovimiento.est = 0;
        }else{
            sf.HiloMovimiento.est = 1;
        }
    }//GEN-LAST:event_btnDormirDespertarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        pHigiene.setValue(pHigiene.getValue() + 10);
        sf.ms.higiene = pHigiene.getValue();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnSaludActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaludActionPerformed
        pSalud.setValue(pSalud.getValue() + 5);
        sf.ms.salud = pSalud.getValue();
    }//GEN-LAST:event_btnSaludActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmMascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMascota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonRound btnAlimentar;
    private rojerusan.RSButtonRound btnDormirDespertar;
    private rojerusan.RSButtonRound btnLimpiar;
    private rojerusan.RSButtonRound btnSalud;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCansancio;
    private javax.swing.JLabel lblHambre;
    private javax.swing.JLabel lblHigiene;
    private javax.swing.JLabel lblSalud;
    public rojerusan.componentes.RSProgressCircle pCansancio;
    public rojerusan.componentes.RSProgressCircle pHambre;
    public rojerusan.componentes.RSProgressCircle pHigiene;
    public rojerusan.componentes.RSProgressCircle pSalud;
    // End of variables declaration//GEN-END:variables
}
