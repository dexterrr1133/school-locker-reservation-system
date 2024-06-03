import java.awt.Color;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;


public class SignUpPage extends javax.swing.JFrame {

    
    public SignUpPage() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        FirstNameTF = new javax.swing.JTextField();
        LastNameTF = new javax.swing.JTextField();
        StudentIDTF = new javax.swing.JTextField();
        ReEnterPassTF = new javax.swing.JPasswordField();
        PasswordTF = new javax.swing.JPasswordField();
        CreateBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1600, 1080));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FirstNameTF.setText("Enter First Name");
        FirstNameTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FirstNameTFMouseEntered(evt);
            }
        });
        jPanel1.add(FirstNameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 420, 530, 50));

        LastNameTF.setText("Enter Last Name");
        LastNameTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LastNameTFMouseClicked(evt);
            }
        });
        jPanel1.add(LastNameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 520, 530, 50));

        StudentIDTF.setText("Enter Student ID");
        StudentIDTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StudentIDTFMouseClicked(evt);
            }
        });
        jPanel1.add(StudentIDTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 620, 530, 50));

        ReEnterPassTF.setText("jPasswordField1");
        ReEnterPassTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReEnterPassTFMouseClicked(evt);
            }
        });
        jPanel1.add(ReEnterPassTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 820, 530, 50));

        PasswordTF.setText("jPasswordField1");
        PasswordTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PasswordTFMouseClicked(evt);
            }
        });
        jPanel1.add(PasswordTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 720, 530, 50));

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
        jPanel1.add(CreateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 890, 530, 50));

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
            } else {
                first_name = FirstNameTF.getText();
                last_name = LastNameTF.getText();
                student_id = StudentIDTF.getText();
                password = new String(PasswordTF.getPassword());
                
                String hashedPassword = CryptoUtils.hashPassword(password);

                query = "INSERT INTO user (student_id, first_name, last_name, pass_word) VALUES ('" + student_id + "','" + first_name + "','" + last_name + "','" + hashedPassword + "')";

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
    private javax.swing.JButton CreateBtn;
    private javax.swing.JTextField FirstNameTF;
    private javax.swing.JTextField LastNameTF;
    private javax.swing.JPasswordField PasswordTF;
    private javax.swing.JPasswordField ReEnterPassTF;
    private javax.swing.JTextField StudentIDTF;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
