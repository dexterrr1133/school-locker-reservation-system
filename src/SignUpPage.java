import java.awt.Color;
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
        ImageIcon reservebg = new ImageIcon("src\\img\\SignUpBackground.png");
        SignUpBackground.setIcon(reservebg);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CancelBtn = new javax.swing.JButton();
        FirstNameTF = new javax.swing.JTextField();
        LastNameTF = new javax.swing.JTextField();
        EmailTF = new javax.swing.JTextField();
        StudentIDTF = new javax.swing.JTextField();
        PhoneNumTF = new javax.swing.JTextField();
        ProgramCourseTF = new javax.swing.JTextField();
        ReEnterShowHide = new javax.swing.JLabel();
        PasswordShowHide = new javax.swing.JLabel();
        ReEnterPassTF = new javax.swing.JPasswordField();
        PasswordTF = new javax.swing.JPasswordField();
        CreateBtn = new javax.swing.JButton();
        SignUpBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(CancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 982, 530, 40));

        FirstNameTF.setBackground(new java.awt.Color(242, 242, 242));
        FirstNameTF.setForeground(new java.awt.Color(153, 153, 153));
        FirstNameTF.setText("Enter First Name");
        FirstNameTF.setBorder(null);
        FirstNameTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FirstNameTFMouseEntered(evt);
            }
        });
        jPanel1.add(FirstNameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 291, 510, 35));

        LastNameTF.setBackground(new java.awt.Color(242, 242, 242));
        LastNameTF.setForeground(new java.awt.Color(153, 153, 153));
        LastNameTF.setText("Enter Last Name");
        LastNameTF.setBorder(null);
        LastNameTF.setPreferredSize(new java.awt.Dimension(106, 26));
        LastNameTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LastNameTFMouseClicked(evt);
            }
        });
        LastNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastNameTFActionPerformed(evt);
            }
        });
        jPanel1.add(LastNameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 372, 510, 35));

        EmailTF.setBackground(new java.awt.Color(242, 242, 242));
        EmailTF.setForeground(new java.awt.Color(153, 153, 153));
        EmailTF.setText("Enter Email");
        EmailTF.setBorder(null);
        EmailTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmailTFMouseClicked(evt);
            }
        });
        jPanel1.add(EmailTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 617, 510, 35));

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
        jPanel1.add(StudentIDTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 454, 510, 35));

        PhoneNumTF.setBackground(new java.awt.Color(242, 242, 242));
        PhoneNumTF.setForeground(new java.awt.Color(153, 153, 153));
        PhoneNumTF.setText("Enter Phone Number");
        PhoneNumTF.setBorder(null);
        PhoneNumTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PhoneNumTFMouseClicked(evt);
            }
        });
        jPanel1.add(PhoneNumTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 698, 510, 35));

        ProgramCourseTF.setBackground(new java.awt.Color(242, 242, 242));
        ProgramCourseTF.setForeground(new java.awt.Color(153, 153, 153));
        ProgramCourseTF.setText("Enter Program and Course");
        ProgramCourseTF.setBorder(null);
        ProgramCourseTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProgramCourseTFMouseClicked(evt);
            }
        });
        jPanel1.add(ProgramCourseTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 535, 510, 35));

        ReEnterShowHide.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ReEnterShowHide.setForeground(new java.awt.Color(0, 0, 0));
        ReEnterShowHide.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ReEnterShowHide.setText("Show");
        ReEnterShowHide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReEnterShowHideMouseClicked(evt);
            }
        });
        jPanel1.add(ReEnterShowHide, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 860, 80, 40));

        PasswordShowHide.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PasswordShowHide.setForeground(new java.awt.Color(0, 0, 0));
        PasswordShowHide.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PasswordShowHide.setText("Show");
        PasswordShowHide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PasswordShowHideMouseClicked(evt);
            }
        });
        jPanel1.add(PasswordShowHide, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 780, 80, 40));

        ReEnterPassTF.setBackground(new java.awt.Color(242, 242, 242));
        ReEnterPassTF.setBorder(null);
        jPanel1.add(ReEnterPassTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(679, 860, 450, 35));

        PasswordTF.setBackground(new java.awt.Color(242, 242, 242));
        PasswordTF.setBorder(null);
        jPanel1.add(PasswordTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(679, 780, 450, 35));

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
        jPanel1.add(CreateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 922, 530, 42));

        SignUpBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SignUpBackground.png"))); // NOI18N
        jPanel1.add(SignUpBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

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
        String student_id, first_name, last_name, program, email, phone_num,password, query;

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
            } else if ("".equals(EmailTF.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "Email is required", "Dialog", JOptionPane.ERROR_MESSAGE);
            } else if (!(EmailTF.getText().contains("@")) || !(EmailTF.getText().contains(".com"))){
                JOptionPane.showMessageDialog(new JFrame(), "Invalid email format", "Dialog", JOptionPane.ERROR_MESSAGE);
            } else if ("".equals(PhoneNumTF.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "Phone Number is required", "Dialog", JOptionPane.ERROR_MESSAGE);
            } else if (!(PhoneNumTF.getText().length() == 11)) {
                JOptionPane.showMessageDialog(new JFrame(), "Phone Number is must be 11 characters long", "Dialog", JOptionPane.ERROR_MESSAGE);
            } else if ("".equals(new String(PasswordTF.getPassword()))) {
                JOptionPane.showMessageDialog(new JFrame(), "Password is required", "Dialog", JOptionPane.ERROR_MESSAGE);
            } else if (!(new String(PasswordTF.getPassword())).equals(new String(ReEnterPassTF.getPassword()))) {
                JOptionPane.showMessageDialog(new JFrame(), "Password does not match", "Dialog", JOptionPane.ERROR_MESSAGE);
            } else if (!(StudentIDTF.getText().contains("-"))){
                JOptionPane.showMessageDialog(new JFrame(), "Student ID must contain '-'", "Dialog", JOptionPane.ERROR_MESSAGE);
            } else if (!(StudentIDTF.getText().length() == 12)){
                JOptionPane.showMessageDialog(new JFrame(), "Student ID must be 12 characters long", "Dialog", JOptionPane.ERROR_MESSAGE);
            } else {
                first_name = FirstNameTF.getText();
                last_name = LastNameTF.getText();
                student_id = StudentIDTF.getText();
                program = ProgramCourseTF.getText();
                email = EmailTF.getText();
                phone_num = PhoneNumTF.getText();
                password = new String(PasswordTF.getPassword());
                
                String hashedPassword = CryptoUtils.hashPassword(password);

                query = "INSERT INTO student (student_id, first_name, last_name , program, email, phone_num, password) VALUES ('" + student_id + "','" + first_name + "','" + last_name + "','" + program + "','" + email + "','" + phone_num + "','" + hashedPassword + "')";
 
                st.executeUpdate(query);

                FirstNameTF.setText("");
                LastNameTF.setText("");
                EmailTF.setText("");
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
        FirstNameTF.setForeground(Color.BLACK);
    }//GEN-LAST:event_FirstNameTFMouseEntered

    private void LastNameTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LastNameTFMouseClicked
        LastNameTF.setText("");
        LastNameTF.setForeground(Color.BLACK);
    }//GEN-LAST:event_LastNameTFMouseClicked

    private void EmailTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmailTFMouseClicked
        EmailTF.setText("");
        EmailTF.setForeground(Color.BLACK);
    }//GEN-LAST:event_EmailTFMouseClicked

    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnActionPerformed
        LoginPage GoToLoginPage = new LoginPage();
        GoToLoginPage.setVisible(true);
        dispose();
    }//GEN-LAST:event_CancelBtnActionPerformed

    private void StudentIDTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentIDTFMouseClicked
        StudentIDTF.setText("");
        StudentIDTF.setForeground(Color.BLACK);
    }//GEN-LAST:event_StudentIDTFMouseClicked

    private void PhoneNumTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PhoneNumTFMouseClicked
        PhoneNumTF.setText("");
        PhoneNumTF.setForeground(Color.BLACK);
    }//GEN-LAST:event_PhoneNumTFMouseClicked

    private void ProgramCourseTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProgramCourseTFMouseClicked
        ProgramCourseTF.setText("");
        ProgramCourseTF.setForeground(Color.BLACK);
    }//GEN-LAST:event_ProgramCourseTFMouseClicked

    private void ReEnterShowHideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReEnterShowHideMouseClicked
        passwordVisible = !passwordVisible; // Toggle the password visibility
        if (passwordVisible) {
            ReEnterPassTF.setEchoChar((char) 0);
            ReEnterShowHide.setText("Hide");
        } else {
            ReEnterPassTF.setEchoChar('*');
            ReEnterShowHide.setText("Show");
        }
    }//GEN-LAST:event_ReEnterShowHideMouseClicked

    private void PasswordShowHideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordShowHideMouseClicked
        passwordVisible = !passwordVisible; // Toggle the password visibility
        if (passwordVisible) {
            PasswordTF.setEchoChar((char) 0);
            PasswordShowHide.setText("Hide");
        } else {
            PasswordTF.setEchoChar('*');
            PasswordShowHide.setText("Show");
        }
    }//GEN-LAST:event_PasswordShowHideMouseClicked

    private void LastNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastNameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastNameTFActionPerformed

    private void setStudentIDTextFieldFilter() {
    StudentIDTF.addKeyListener(new KeyAdapter() {
        @Override
        public void keyTyped(KeyEvent e) {
            char c = e.getKeyChar();
            if (!((c >= '0' && c <= '9') || c == KeyEvent.VK_MINUS) || EmailTF.getText().length() >= 12 || (c == KeyEvent.VK_MINUS && EmailTF.getText().contains("-"))) {
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
    private javax.swing.JTextField EmailTF;
    private javax.swing.JTextField FirstNameTF;
    private javax.swing.JTextField LastNameTF;
    private javax.swing.JLabel PasswordShowHide;
    private javax.swing.JPasswordField PasswordTF;
    private javax.swing.JTextField PhoneNumTF;
    private javax.swing.JTextField ProgramCourseTF;
    private javax.swing.JPasswordField ReEnterPassTF;
    private javax.swing.JLabel ReEnterShowHide;
    private javax.swing.JLabel SignUpBackground;
    private javax.swing.JTextField StudentIDTF;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
