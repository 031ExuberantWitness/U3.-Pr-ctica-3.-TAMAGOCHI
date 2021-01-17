
import Animacion.Fade;
import java.awt.Color;
import static javax.swing.JOptionPane.showMessageDialog;

public class FrmMenu extends javax.swing.JFrame {

    
    public FrmMenu() {
        initComponents();
        setLocationRelativeTo(null);
        setBackground(new Color(0,0,0,0));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new rojerusan.RSButtonRound();
        btnVO2 = new rojerusan.RSButtonRound();
        btnVO1 = new rojerusan.RSButtonRound();
        btnSU = new rojerusan.RSButtonRound();
        lblBackground = new rojerusan.RSLabelImage();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setBackground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gfx/icons/icons8_x_30px.png"))); // NOI18N
        btnSalir.setColorHover(new java.awt.Color(245, 245, 245));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 370, 40, 40));

        btnVO2.setBackground(new java.awt.Color(42, 42, 42));
        btnVO2.setText("Proximamente");
        btnVO2.setColorHover(new java.awt.Color(102, 102, 102));
        btnVO2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVO2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnVO2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, -1, 190));

        btnVO1.setBackground(new java.awt.Color(42, 42, 42));
        btnVO1.setText("Proximamente");
        btnVO1.setColorHover(new java.awt.Color(102, 102, 102));
        btnVO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVO1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnVO1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, -1, 190));

        btnSU.setBackground(new java.awt.Color(42, 42, 42));
        btnSU.setText("SuperIntendent");
        btnSU.setColorHover(new java.awt.Color(102, 102, 102));
        btnSU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSUActionPerformed(evt);
            }
        });
        getContentPane().add(btnSU, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, 190));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gfx/background/back_ground.png"))); // NOI18N
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVO1ActionPerformed
        showMessageDialog(this, "Proximamente...");
    }//GEN-LAST:event_btnVO1ActionPerformed

    private void btnVO2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVO2ActionPerformed
        showMessageDialog(this, "Proximamente...");
    }//GEN-LAST:event_btnVO2ActionPerformed

    private void btnSUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSUActionPerformed
        FrmMascota fm = new FrmMascota();
        fm.setVisible(true);
        Fade.JFrameFadeIn(0f, 1f, 0.1f, 10, fm);
        Fade.JFrameFadeOut(1f, 0f, 0.1f, 10, this, Fade.DISPOSE);
    }//GEN-LAST:event_btnSUActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        Fade.JFrameFadeOut(1f, 0f, 0.1f, 10, this, Fade.EXIT);
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonRound btnSU;
    private rojerusan.RSButtonRound btnSalir;
    private rojerusan.RSButtonRound btnVO1;
    private rojerusan.RSButtonRound btnVO2;
    private rojerusan.RSLabelImage lblBackground;
    // End of variables declaration//GEN-END:variables
}
