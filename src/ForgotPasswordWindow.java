import java.sql.*;
import java.time.LocalDateTime;
import java.util.Properties;
import java.util.UUID;
import javax.mail.*;
import javax.mail.internet.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class ForgotPasswordWindow extends javax.swing.JFrame {

    private static String loggedInStudentId;
    
    public ForgotPasswordWindow() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        SendOTPToken = new javax.swing.JButton();
        CancelBtn = new javax.swing.JButton();
        StudentIDTF = new javax.swing.JTextField();
        EmailTF = new javax.swing.JTextField();
        ForgotPasswordBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SendOTPToken.setBackground(new java.awt.Color(53, 64, 142));
        SendOTPToken.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        SendOTPToken.setForeground(new java.awt.Color(255, 255, 255));
        SendOTPToken.setText("Send OTP Token");
        SendOTPToken.setFocusPainted(false);
        SendOTPToken.setPreferredSize(new java.awt.Dimension(211, 36));
        SendOTPToken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendOTPTokenActionPerformed(evt);
            }
        });
        jPanel1.add(SendOTPToken, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 740, 570, 60));

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
        jPanel1.add(CancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(597, 810, 570, 50));

        StudentIDTF.setBackground(new java.awt.Color(242, 242, 242));
        StudentIDTF.setForeground(new java.awt.Color(153, 153, 153));
        StudentIDTF.setText("Enter Student ID");
        StudentIDTF.setBorder(null);
        StudentIDTF.setMargin(new java.awt.Insets(6, 6, 2, 6));
        StudentIDTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StudentIDTFMouseClicked(evt);
            }
        });
        jPanel1.add(StudentIDTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 622, 550, 50));

        EmailTF.setBackground(new java.awt.Color(242, 242, 242));
        EmailTF.setForeground(new java.awt.Color(153, 153, 153));
        EmailTF.setText("Enter Email");
        EmailTF.setBorder(null);
        EmailTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmailTFMouseClicked(evt);
            }
        });
        jPanel1.add(EmailTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 500, 550, 50));

        ForgotPasswordBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ForgotPasswordBackground.png"))); // NOI18N
        jPanel1.add(ForgotPasswordBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void setLoggedInStudentId(String studentId) {
        loggedInStudentId = studentId;
    }
    
    public static String getLoggedInStudentId() {
        return loggedInStudentId;
    }
    
    private boolean handlePasswordReset(String studentId, String email) {
        if (studentId == null || studentId.isEmpty() || email == null || email.isEmpty()) {
            return false;
        }
        
        try  {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/locker_reservation";
            String user = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            
            setLoggedInStudentId(studentId);
            
            String selectUserQuery = "SELECT * FROM student WHERE student_id = '" + studentId + "' AND email = '" + email + "'";
            ResultSet rs = st.executeQuery(selectUserQuery);
            System.out.println(studentId);
            setLoggedInStudentId(studentId);
            System.out.println(email);
            if (rs.next()) {
                String student = rs.getString("student_id");
                String resetToken = UUID.randomUUID().toString(); 
                
                
                LocalDateTime now = LocalDateTime.now();
                LocalDateTime expiryTime = now.plusHours(1); 

                
                expiryTime = expiryTime.withNano(0); 

                Timestamp expiryTimestamp = Timestamp.valueOf(expiryTime);
                
                
                String insertTokenQuery = "INSERT INTO password_reset_tokens (student_id, token, expiry_time) " +
                                          "VALUES ('" + student + "', '" + resetToken + "', '" + expiryTimestamp + "')";
                st.executeUpdate(insertTokenQuery);
                
                
                sendResetEmail(email, resetToken);
                JOptionPane.showMessageDialog(new JFrame(), "Token was sent to your email successfully!", "Dialog", JOptionPane.INFORMATION_MESSAGE);
                String token = JOptionPane.showInputDialog(null, "Enter your token: ");
                verifyToken(token);
                
                return true; 
            } else {
                JOptionPane.showMessageDialog(new JFrame(), "Email or Student ID does not exist", "Dialog", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    private void sendResetEmail(String email, String resetToken) {
        String smtpHost = "smtp.gmail.com"; 
        String smtpPort = "587";
        String smtpUsername = "adnulocker@gmail.com";
        String smtpPassword = "nwok qxfd vtbb kvfp";

        String toEmail = email;
        String subject = "Password Reset Instructions";
        String content = "Dear User,\n\n"
                       + "Please copy the following token to reset your password:\n\n"
                       + resetToken + "\n\n"
                       + "This token is valid for one hour.\n\n"
                       + "Best regards,\n"
                       + "NU DASMA Locker Admin";
        
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", smtpHost);
        props.put("mail.smtp.port", smtpPort);
        props.put("mail.smtp.ssl.protocols", "TLSv1.2");

        // Create a Session object
        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(smtpUsername, smtpPassword);
                    }
                });
        
        session.setDebug(true); // Enable debugging

        try {
            // Create a MimeMessage object
            Message message = new MimeMessage(session);

            // Set From: header field of the header
            message.setFrom(new InternetAddress(smtpUsername));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
            message.setSubject(subject);
            message.setText(content);
            Transport.send(message);

            System.out.println("Email sent to " + email + " with reset token: " + resetToken);
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
    
    private boolean verifyToken(String token) {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/locker_reservation";
        String user = "root";
        String pass = "";

        Connection con = DriverManager.getConnection(url, user, pass);
        Statement st = con.createStatement();
        
        // Query to check if the token exists and is not expired
        String selectTokenQuery = "SELECT * FROM password_reset_tokens WHERE token = '" + token + "'";
        ResultSet rs = st.executeQuery(selectTokenQuery);

        if (rs.next()) {
            Timestamp expiryTime = rs.getTimestamp("expiry_time");
            LocalDateTime now = LocalDateTime.now();
            LocalDateTime expiryDateTime = expiryTime.toLocalDateTime();
            
            if (now.isBefore(expiryDateTime)) {
                JOptionPane.showMessageDialog(new JFrame(), "Token is valid", "Dialog", JOptionPane.INFORMATION_MESSAGE);
                ChangePasswordWindow goToChangePasswordWindow = new ChangePasswordWindow();
                goToChangePasswordWindow.setVisible(true);
                dispose();
                return true;
            } else {
                JOptionPane.showMessageDialog(new JFrame(), "Token has expired", "Dialog", JOptionPane.ERROR_MESSAGE);
                System.out.println("Token has expired");
                cleanupExpiredTokens();
                return false;
            }
        } else {
            JOptionPane.showMessageDialog(new JFrame(), "Token not found", "Dialog", JOptionPane.ERROR_MESSAGE);
            System.out.println("Token not found");
            return false;
        }
    } catch (Exception e) {
        e.printStackTrace();
        return false;
    }
}
    
    public static void cleanupExpiredTokens() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/locker_reservation";
            String user = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            
            String deleteQuery = "DELETE FROM password_reset_tokens WHERE expiry_time < NOW()";
            int rowsDeleted = st.executeUpdate(deleteQuery);

            System.out.println(rowsDeleted + " expired tokens deleted successfully.");
            st.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void SendOTPTokenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendOTPTokenActionPerformed
        String studentId = StudentIDTF.getText();
        String email = EmailTF.getText();
        handlePasswordReset(studentId, email);
    }//GEN-LAST:event_SendOTPTokenActionPerformed

    private void StudentIDTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentIDTFMouseClicked
        StudentIDTF.setText("");
    }//GEN-LAST:event_StudentIDTFMouseClicked

    private void EmailTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmailTFMouseClicked
        EmailTF.setText("");
    }//GEN-LAST:event_EmailTFMouseClicked

    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnActionPerformed
        LoginPage GoToLoginPage = new LoginPage();
        GoToLoginPage.setVisible(true);
        dispose();
    }//GEN-LAST:event_CancelBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ForgotPasswordWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPasswordWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPasswordWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPasswordWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPasswordWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelBtn;
    private javax.swing.JTextField EmailTF;
    private javax.swing.JLabel ForgotPasswordBackground;
    private javax.swing.JButton SendOTPToken;
    private javax.swing.JTextField StudentIDTF;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
