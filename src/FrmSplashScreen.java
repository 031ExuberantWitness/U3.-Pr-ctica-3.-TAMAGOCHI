
import Animacion.Fade;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;


public class FrmSplashScreen extends javax.swing.JFrame {
    int count = 0;
    Timer t;
    
    public FrmSplashScreen() {
        initComponents();
        setBackground(new Color(0,0,0,0));
        setLocationRelativeTo(null);
        
        pProgress.setBackground(new Color(0,0,0,0));
        pProgress.setColorSelBackground(new Color(0,0,0,0));
        pProgress.setColorBorde(new Color(0,0,0,0));
        
        t = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              count ++;
              pProgress.setValue(count);
              if(pProgress.getValue()==100){
                  fadeOut();
              }
            }
        });
        
        t.start();
    }
    
    private void fadeOut(){
        FrmMenu ds = new FrmMenu();
        ds.setVisible(true);
        t.stop();
        Fade.JFrameFadeOut(1f, 0f, 0.1f, 10, this, Fade.DISPOSE);
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        pProgress = new rojerusan.componentes.RSProgressBar();
        lblBackground = new rojerusan.RSLabelImage();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Inversionz", 0, 95)); // NOI18N
        jLabel1.setText("mASCOTA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, -1, -1));

        pProgress.setForeground(new java.awt.Color(42, 42, 42));
        pProgress.setValue(0);
        pProgress.setColorBorde(new java.awt.Color(255, 255, 255));
        pProgress.setColorSelForeground(new java.awt.Color(42, 42, 42));
        getContentPane().add(pProgress, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 364, 791, 30));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gfx/background/back_ground.png"))); // NOI18N
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 807, 411));

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmSplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmSplashScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private rojerusan.RSLabelImage lblBackground;
    private rojerusan.componentes.RSProgressBar pProgress;
    // End of variables declaration//GEN-END:variables
}
