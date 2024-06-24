import java.awt.Color;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.Base64;

public class ChangePasswordWindow extends javax.swing.JFrame {

    /**
     * Creates new form ChangePasswordWindow
     */
    public ChangePasswordWindow() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CancelBtn = new javax.swing.JButton();
        NewPassword = new javax.swing.JTextField();
        ReEnterNewPassword = new javax.swing.JTextField();
        PasswordReset = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CancelBtn.setBackground(new java.awt.Color(153, 153, 153));
        CancelBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        CancelBtn.setForeground(new java.awt.Color(255, 255, 255));
        CancelBtn.setText("Cancel");
        CancelBtn.setFocusPainted(false);
        CancelBtn.setPreferredSize(new java.awt.Dimension(211, 36));
        CancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBtnActionPerformed(evt);
            }
        });
        getContentPane().add(CancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(597, 810, 570, 50));

        NewPassword.setBackground(new java.awt.Color(242, 242, 242));
        NewPassword.setForeground(new java.awt.Color(153, 153, 153));
        NewPassword.setText("New Password");
        NewPassword.setBorder(null);
        NewPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NewPasswordMouseClicked(evt);
            }
        });
        getContentPane().add(NewPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 500, 550, 50));

        ReEnterNewPassword.setBackground(new java.awt.Color(242, 242, 242));
        ReEnterNewPassword.setForeground(new java.awt.Color(153, 153, 153));
        ReEnterNewPassword.setText("Confirm Password");
        ReEnterNewPassword.setBorder(null);
        ReEnterNewPassword.setMargin(new java.awt.Insets(6, 6, 2, 6));
        ReEnterNewPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReEnterNewPasswordMouseClicked(evt);
            }
        });
        getContentPane().add(ReEnterNewPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 622, 550, 50));

        PasswordReset.setBackground(new java.awt.Color(53, 64, 142));
        PasswordReset.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        PasswordReset.setForeground(new java.awt.Color(255, 255, 255));
        PasswordReset.setText("Reset Password");
        PasswordReset.setFocusPainted(false);
        PasswordReset.setPreferredSize(new java.awt.Dimension(211, 36));
        PasswordReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordResetActionPerformed(evt);
            }
        });
        getContentPane().add(PasswordReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 740, 570, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ForgotPasswordBackground.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnActionPerformed
        LoginPage GoToLoginPage = new LoginPage();
        GoToLoginPage.setVisible(true);
        dispose();
    }//GEN-LAST:event_CancelBtnActionPerformed

    private void ReEnterNewPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReEnterNewPasswordMouseClicked
        ReEnterNewPassword.setText("");
        ReEnterNewPassword.setForeground(Color.BLACK);
    }//GEN-LAST:event_ReEnterNewPasswordMouseClicked

    
    
    private void PasswordResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordResetActionPerformed
        String newPassword = NewPassword.getText();
        String confirmPassword = ReEnterNewPassword.getText();
        
        
    if (!newPassword.equals(confirmPassword)) {
        JOptionPane.showMessageDialog(new JFrame(), "Passwords do not match!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/locker_reservation";
        String user = "root";
        String pass = "";

        Connection con = DriverManager.getConnection(url, user, pass);
        Statement st = con.createStatement();

        ForgotPasswordWindow studentId = new ForgotPasswordWindow();
        String ID = studentId.getLoggedInStudentId();
        
        if ("".equals(ID)) {
            JOptionPane.showMessageDialog(new JFrame(), "ID is required", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            String sql = "SELECT * FROM student WHERE student_id = '" + ID+ "'";
            ResultSet rs = st.executeQuery(sql);
            String hashedPassword = CryptoUtils.hashPassword(newPassword);
            if (rs.next()) {
                // Update the password in the student table
                String updateSql = "UPDATE student SET password = '" + hashedPassword + "' WHERE student_id = '" + ID + "'";
                st.executeUpdate(updateSql);

                JOptionPane.showMessageDialog(new JFrame(), "Password updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                LoginPage goToLoginPage = new LoginPage();
                goToLoginPage.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(new JFrame(), "Student ID not found", "Error", JOptionPane.ERROR_MESSAGE);
            }
            con.close();
        }
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(new JFrame(), "Error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_PasswordResetActionPerformed

    private void NewPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewPasswordMouseClicked
        NewPassword.setText("");
        NewPassword.setForeground(Color.BLACK);
    }//GEN-LAST:event_NewPasswordMouseClicked

    public class CryptoUtils {

        private static final String ALGORITHM = "SHA-256";

    public static String hashPassword(String newPassword) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance(ALGORITHM);
        byte[] hashedBytes = md.digest(newPassword.getBytes());
        return Base64.getEncoder().encodeToString(hashedBytes);
    }
}
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
            java.util.logging.Logger.getLogger(ChangePasswordWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePasswordWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePasswordWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePasswordWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePasswordWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelBtn;
    private javax.swing.JTextField NewPassword;
    private javax.swing.JButton PasswordReset;
    private javax.swing.JTextField ReEnterNewPassword;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
