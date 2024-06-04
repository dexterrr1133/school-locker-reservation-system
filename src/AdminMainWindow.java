
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author linus
 */
public class AdminMainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public AdminMainWindow() {
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

        jPanel1 = new javax.swing.JPanel();
        ViewLockerPanel = new javax.swing.JPanel();
        ViewLockerText = new javax.swing.JLabel();
        LockerIcon = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ViewLockerPanel1 = new javax.swing.JPanel();
        ViewLockerText1 = new javax.swing.JLabel();
        LockerIcon1 = new javax.swing.JLabel();
        ViewLockerPanel2 = new javax.swing.JPanel();
        ViewLockerText2 = new javax.swing.JLabel();
        LockerIcon2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ViewLockerPanel.setBackground(new java.awt.Color(255, 255, 255));
        ViewLockerPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 204)));
        ViewLockerPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewLockerPanelMouseClicked(evt);
            }
        });

        ViewLockerText.setFont(new java.awt.Font("Helvetica Neue", 0, 28)); // NOI18N
        ViewLockerText.setForeground(new java.awt.Color(49, 112, 143));
        ViewLockerText.setText("View Locker");

        LockerIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/file (4).png"))); // NOI18N

        javax.swing.GroupLayout ViewLockerPanelLayout = new javax.swing.GroupLayout(ViewLockerPanel);
        ViewLockerPanel.setLayout(ViewLockerPanelLayout);
        ViewLockerPanelLayout.setHorizontalGroup(
            ViewLockerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewLockerPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(LockerIcon)
                .addGap(18, 18, 18)
                .addComponent(ViewLockerText)
                .addContainerGap(133, Short.MAX_VALUE))
        );
        ViewLockerPanelLayout.setVerticalGroup(
            ViewLockerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewLockerPanelLayout.createSequentialGroup()
                .addGroup(ViewLockerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ViewLockerPanelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(LockerIcon))
                    .addGroup(ViewLockerPanelLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(ViewLockerText)))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jPanel1.add(ViewLockerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, 430, 190));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1400, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 1400, 10));

        ViewLockerPanel1.setBackground(new java.awt.Color(255, 255, 255));
        ViewLockerPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 204)));
        ViewLockerPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewLockerPanel1MouseClicked(evt);
            }
        });

        ViewLockerText1.setFont(new java.awt.Font("Helvetica Neue", 0, 28)); // NOI18N
        ViewLockerText1.setForeground(new java.awt.Color(49, 112, 143));
        ViewLockerText1.setText("View Students");

        LockerIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/StudentListIcon.png"))); // NOI18N

        javax.swing.GroupLayout ViewLockerPanel1Layout = new javax.swing.GroupLayout(ViewLockerPanel1);
        ViewLockerPanel1.setLayout(ViewLockerPanel1Layout);
        ViewLockerPanel1Layout.setHorizontalGroup(
            ViewLockerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewLockerPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(LockerIcon1)
                .addGap(18, 18, 18)
                .addComponent(ViewLockerText1)
                .addContainerGap(105, Short.MAX_VALUE))
        );
        ViewLockerPanel1Layout.setVerticalGroup(
            ViewLockerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewLockerPanel1Layout.createSequentialGroup()
                .addGroup(ViewLockerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ViewLockerPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(LockerIcon1))
                    .addGroup(ViewLockerPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(ViewLockerText1)))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jPanel1.add(ViewLockerPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 440, 430, 190));

        ViewLockerPanel2.setBackground(new java.awt.Color(255, 255, 255));
        ViewLockerPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 204)));
        ViewLockerPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewLockerPanel2MouseClicked(evt);
            }
        });

        ViewLockerText2.setFont(new java.awt.Font("Helvetica Neue", 0, 28)); // NOI18N
        ViewLockerText2.setForeground(new java.awt.Color(49, 112, 143));
        ViewLockerText2.setText("Payment Status");

        LockerIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/payment.png"))); // NOI18N

        javax.swing.GroupLayout ViewLockerPanel2Layout = new javax.swing.GroupLayout(ViewLockerPanel2);
        ViewLockerPanel2.setLayout(ViewLockerPanel2Layout);
        ViewLockerPanel2Layout.setHorizontalGroup(
            ViewLockerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewLockerPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(LockerIcon2)
                .addGap(18, 18, 18)
                .addComponent(ViewLockerText2)
                .addContainerGap(95, Short.MAX_VALUE))
        );
        ViewLockerPanel2Layout.setVerticalGroup(
            ViewLockerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewLockerPanel2Layout.createSequentialGroup()
                .addGroup(ViewLockerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ViewLockerPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(LockerIcon2))
                    .addGroup(ViewLockerPanel2Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(ViewLockerText2)))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jPanel1.add(ViewLockerPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 440, 439, 190));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/AdminMainWindow.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ViewLockerPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewLockerPanelMouseClicked

    }//GEN-LAST:event_ViewLockerPanelMouseClicked

    private void ViewLockerPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewLockerPanel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ViewLockerPanel1MouseClicked

    private void ViewLockerPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewLockerPanel2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ViewLockerPanel2MouseClicked

    private void showLayeredViewLockerPane() {
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setPreferredSize(new Dimension(1700, 900));
        
        JLabel topLabel = new JLabel("");
        ImageIcon viewlockersrc = new ImageIcon("");
        topLabel.setOpaque(true);
        topLabel.setBackground(Color.YELLOW);
        topLabel.setBounds(0, 0, 1700, 900);
        topLabel.setIcon(viewlockersrc);
        
        layeredPane.add(topLabel, JLayeredPane.DEFAULT_LAYER);
        
        JButton backBtn = new JButton("Back");
        backBtn.setBounds(850, 800, 200, 50);
        backBtn.setVisible(true);
        
        layeredPane.add(backBtn, JLayeredPane.PALETTE_LAYER);
        
        JFrame layeredFrame = new JFrame();
        layeredFrame.setUndecorated(true);
        layeredFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        layeredFrame.add(layeredPane);
        layeredFrame.pack();
        layeredFrame.setLocationRelativeTo(this);
        layeredFrame.setVisible(true);
    }
    
    
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
            java.util.logging.Logger.getLogger(AdminMainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LockerIcon;
    private javax.swing.JLabel LockerIcon1;
    private javax.swing.JLabel LockerIcon2;
    private javax.swing.JPanel ViewLockerPanel;
    private javax.swing.JPanel ViewLockerPanel1;
    private javax.swing.JPanel ViewLockerPanel2;
    private javax.swing.JLabel ViewLockerText;
    private javax.swing.JLabel ViewLockerText1;
    private javax.swing.JLabel ViewLockerText2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
