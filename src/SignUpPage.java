import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Base64;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class SignUpPage extends javax.swing.JFrame {

    private boolean passwordVisible = false;
    public SignUpPage() {
        initComponents();
        setStudentIDTextFieldFilter();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        showReEnterPasswordBtn = new javax.swing.JButton();
        showPasswordBtn = new javax.swing.JButton();
        CancelBtn = new javax.swing.JButton();
        FirstNameTF = new javax.swing.JTextField();
        LastNameTF = new javax.swing.JTextField();
        StudentIDTF = new javax.swing.JTextField();
        ReEnterPassTF = new javax.swing.JPasswordField();
        PasswordTF = new javax.swing.JPasswordField();
        CreateBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        showReEnterPasswordBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Screenshot 2024-06-03 211835.png"))); // NOI18N
        showReEnterPasswordBtn.setBorder(null);
        showReEnterPasswordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showReEnterPasswordBtnActionPerformed(evt);
            }
        });
        jPanel1.add(showReEnterPasswordBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 830, 80, 30));

        showPasswordBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Screenshot 2024-06-03 211835.png"))); // NOI18N
        showPasswordBtn.setBorder(null);
        showPasswordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordBtnActionPerformed(evt);
            }
        });
        jPanel1.add(showPasswordBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 730, 80, 30));

        CancelBtn.setBackground(new java.awt.Color(153, 153, 153));
        CancelBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        CancelBtn.setForeground(new java.awt.Color(255, 255, 255));
        CancelBtn.setText("Cancel");
        CancelBtn.setPreferredSize(new java.awt.Dimension(211, 36));
        CancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBtnActionPerformed(evt);
            }
        });
        jPanel1.add(CancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 940, 530, 40));

        FirstNameTF.setText("Enter First Name");
        FirstNameTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FirstNameTFMouseEntered(evt);
            }
        });
        jPanel1.add(FirstNameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 420, 530, 50));

        LastNameTF.setText("Enter Last Name");
        LastNameTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LastNameTFMouseClicked(evt);
            }
        });
        jPanel1.add(LastNameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 520, 530, 50));

        StudentIDTF.setText("Enter Student ID");
        StudentIDTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StudentIDTFMouseClicked(evt);
            }
        });
        jPanel1.add(StudentIDTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 620, 530, 50));

        ReEnterPassTF.setText("jPasswordField1");
        ReEnterPassTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReEnterPassTFMouseClicked(evt);
            }
        });
        jPanel1.add(ReEnterPassTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 820, 530, 50));

        PasswordTF.setText("jPasswordField1");
        PasswordTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PasswordTFMouseClicked(evt);
            }
        });
        jPanel1.add(PasswordTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 720, 530, 50));

        CreateBtn.setBackground(new java.awt.Color(53, 64, 142));
        CreateBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        CreateBtn.setForeground(new java.awt.Color(255, 255, 255));
        CreateBtn.setText("Create Account");
        CreateBtn.setPreferredSize(new java.awt.Dimension(211, 36));
        CreateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateBtnActionPerformed(evt);
            }
        });
        jPanel1.add(CreateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 895, 530, 42));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/signup.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CreateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateBtnActionPerformed
        String student_id, first_name, last_name, password, query;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/locker_reservation";
            String user = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();

            if ("".equals(FirstNameTF.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "First Name is required", "Dialog", JOptionPane.ERROR_MESSAGE);
            } else if ("".equals(LastNameTF.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "Last Name is required", "Dialog", JOptionPane.ERROR_MESSAGE);
            } else if ("".equals(StudentIDTF.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "Student ID is required", "Dialog", JOptionPane.ERROR_MESSAGE);
            } else if ("".equals(new String(PasswordTF.getPassword()))) {
                JOptionPane.showMessageDialog(new JFrame(), "Password is required", "Dialog", JOptionPane.ERROR_MESSAGE);
            } else if (!(new String(PasswordTF.getPassword())).equals(new String(ReEnterPassTF.getPassword()))) {
                JOptionPane.showMessageDialog(new JFrame(), "Password does not match", "Dialog", JOptionPane.ERROR_MESSAGE);
            } else if (!(StudentIDTF.getText().contains("-"))){
                JOptionPane.showMessageDialog(new JFrame(), "Student ID must contain '-'", "Dialog", JOptionPane.ERROR_MESSAGE);
            } else if (!(StudentIDTF.getText().length() != 12)){
                JOptionPane.showMessageDialog(new JFrame(), "Student ID must be 12 characters long", "Dialog", JOptionPane.ERROR_MESSAGE);
            } else {
                first_name = FirstNameTF.getText();
                last_name = LastNameTF.getText();
                student_id = StudentIDTF.getText();
                password = new String(PasswordTF.getPassword());
                
                String hashedPassword = CryptoUtils.hashPassword(password);

                query = "INSERT INTO student (student_id, first_name, last_name, password) VALUES ('" + student_id + "','" + first_name + "','" + last_name + "','" + hashedPassword + "')";

                st.executeUpdate(query);

                FirstNameTF.setText("");
                LastNameTF.setText("");
                StudentIDTF.setText("");
                PasswordTF.setText("");
                ReEnterPassTF.setText("");

                JOptionPane.showMessageDialog(null, "Successfully registered.");
                con.close();
                LoginPage GoToLoginPage = new LoginPage();
                GoToLoginPage.setVisible(true);
                dispose();
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }//GEN-LAST:event_CreateBtnActionPerformed

    private void FirstNameTFMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FirstNameTFMouseEntered
        FirstNameTF.setText("");
    }//GEN-LAST:event_FirstNameTFMouseEntered

    private void LastNameTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LastNameTFMouseClicked
        LastNameTF.setText("");
    }//GEN-LAST:event_LastNameTFMouseClicked

    private void StudentIDTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentIDTFMouseClicked
        StudentIDTF.setText("");
    }//GEN-LAST:event_StudentIDTFMouseClicked

    private void PasswordTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordTFMouseClicked
        PasswordTF.setText("");
    }//GEN-LAST:event_PasswordTFMouseClicked

    private void ReEnterPassTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReEnterPassTFMouseClicked
        ReEnterPassTF.setText("");
    }//GEN-LAST:event_ReEnterPassTFMouseClicked

    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnActionPerformed
        LoginPage GoToLoginPage = new LoginPage();
        GoToLoginPage.setVisible(true);
        dispose();
    }//GEN-LAST:event_CancelBtnActionPerformed

    private void showPasswordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPasswordBtnActionPerformed
        ImageIcon hidePasswordIcon = new ImageIcon("C:\\Users\\linus\\Documents\\NetBeansProjects\\school-locker-reservation-system\\src\\img\\HidePasswordIcon.png");
        ImageIcon showPasswordIcon = new ImageIcon("C:\\Users\\linus\\Documents\\NetBeansProjects\\school-locker-reservation-system\\src\\img\\ShowPasswordIcon.png");
        passwordVisible = !passwordVisible; // Toggle the password visibility
                if (passwordVisible) {
                    PasswordTF.setEchoChar((char) 0);
                    showPasswordBtn.setIcon(hidePasswordIcon);
                } else {
                    PasswordTF.setEchoChar('*');
                    showPasswordBtn.setIcon(showPasswordIcon);
                }
    }//GEN-LAST:event_showPasswordBtnActionPerformed

    private void showReEnterPasswordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showReEnterPasswordBtnActionPerformed
        ImageIcon hidePasswordIcon = new ImageIcon("C:\\Users\\linus\\Documents\\NetBeansProjects\\school-locker-reservation-system\\src\\img\\HidePasswordIcon.png");
        ImageIcon showPasswordIcon = new ImageIcon("C:\\Users\\linus\\Documents\\NetBeansProjects\\school-locker-reservation-system\\src\\img\\ShowPasswordIcon.png");
        passwordVisible = !passwordVisible; // Toggle the password visibility
                if (passwordVisible) {
                    ReEnterPassTF.setEchoChar((char) 0);
                    showReEnterPasswordBtn.setIcon(hidePasswordIcon);
                } else {
                    ReEnterPassTF.setEchoChar('*');
                    showReEnterPasswordBtn.setIcon(showPasswordIcon);
                }
    }//GEN-LAST:event_showReEnterPasswordBtnActionPerformed

    private void setStudentIDTextFieldFilter() {
    StudentIDTF.addKeyListener(new KeyAdapter() {
        @Override
        public void keyTyped(KeyEvent e) {
            char c = e.getKeyChar();
            if (!((c >= '0' && c <= '9') || c == KeyEvent.VK_MINUS) || StudentIDTF.getText().length() >= 12 || (c == KeyEvent.VK_MINUS && StudentIDTF.getText().contains("-"))) {
                e.consume();
            } 
        }
    });
}
    
    public class CryptoUtils {

        private static final String ALGORITHM = "SHA-256";

    public static String hashPassword(String password) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance(ALGORITHM);
        byte[] hashedBytes = md.digest(password.getBytes());
        return Base64.getEncoder().encodeToString(hashedBytes);
    }
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
            java.util.logging.Logger.getLogger(SignUpPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelBtn;
    private javax.swing.JButton CreateBtn;
    private javax.swing.JTextField FirstNameTF;
    private javax.swing.JTextField LastNameTF;
    private javax.swing.JPasswordField PasswordTF;
    private javax.swing.JPasswordField ReEnterPassTF;
    private javax.swing.JTextField StudentIDTF;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton showPasswordBtn;
    private javax.swing.JButton showReEnterPasswordBtn;
    // End of variables declaration//GEN-END:variables
}
