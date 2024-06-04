import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Base64;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LoginPage extends javax.swing.JFrame {
    private boolean passwordVisible = false;
    
    public LoginPage() {
        initComponents();
        setStudentIDTextFieldFilter();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        showPasswordButton = new javax.swing.JButton();
        PasswordField = new javax.swing.JPasswordField();
        EnterStudentIDJField = new javax.swing.JTextField();
        CreateAccBtn = new javax.swing.JButton();
        SignInBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        showPasswordButton.setBackground(new java.awt.Color(242, 242, 242));
        showPasswordButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ShowPasswordIcon.png"))); // NOI18N
        showPasswordButton.setBorder(null);
        showPasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordButtonActionPerformed(evt);
            }
        });
        jPanel3.add(showPasswordButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 600, 100, 40));

        PasswordField.setBackground(new java.awt.Color(242, 242, 242));
        PasswordField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PasswordField.setText("Password");
        PasswordField.setBorder(null);
        PasswordField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PasswordFieldMouseClicked(evt);
            }
        });
        PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldActionPerformed(evt);
            }
        });
        jPanel3.add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 600, 550, 40));

        EnterStudentIDJField.setBackground(new java.awt.Color(242, 242, 242));
        EnterStudentIDJField.setColumns(1);
        EnterStudentIDJField.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 14)); // NOI18N
        EnterStudentIDJField.setForeground(new java.awt.Color(153, 153, 153));
        EnterStudentIDJField.setText("Enter Your Student ID");
        EnterStudentIDJField.setBorder(null);
        EnterStudentIDJField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        EnterStudentIDJField.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        EnterStudentIDJField.setMinimumSize(new java.awt.Dimension(63, 22));
        EnterStudentIDJField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EnterStudentIDJFieldMouseClicked(evt);
            }
        });
        jPanel3.add(EnterStudentIDJField, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 500, 560, 50));

        CreateAccBtn.setBackground(new java.awt.Color(204, 204, 204));
        CreateAccBtn.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        CreateAccBtn.setText("Create An Account");
        CreateAccBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateAccBtnActionPerformed(evt);
            }
        });
        jPanel3.add(CreateAccBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 740, 280, 60));

        SignInBtn.setBackground(new java.awt.Color(0, 51, 153));
        SignInBtn.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        SignInBtn.setForeground(new java.awt.Color(255, 255, 255));
        SignInBtn.setText("Sign In");
        SignInBtn.setBorder(null);
        SignInBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignInBtnActionPerformed(evt);
            }
        });
        jPanel3.add(SignInBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 740, 280, 60));

        jLabel1.setForeground(new java.awt.Color(49, 112, 143));
        jLabel1.setText("Forgot Password");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 650, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EnterStudentIDJFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnterStudentIDJFieldMouseClicked
        EnterStudentIDJField.setText("");
        EnterStudentIDJField.setForeground(Color.BLACK);
    }//GEN-LAST:event_EnterStudentIDJFieldMouseClicked

    private void SignInBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignInBtnActionPerformed
        loginUser();
    }//GEN-LAST:event_SignInBtnActionPerformed

    private void CreateAccBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateAccBtnActionPerformed
        SignUpPage GoToSignUpPage = new SignUpPage();
        GoToSignUpPage.setVisible(true);
        dispose();
    }//GEN-LAST:event_CreateAccBtnActionPerformed

    private void PasswordFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordFieldMouseClicked
        PasswordField.setText("");
    }//GEN-LAST:event_PasswordFieldMouseClicked

    private void showPasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPasswordButtonActionPerformed
        ImageIcon hidePasswordIcon = new ImageIcon("C:\\Users\\linus\\Documents\\NetBeansProjects\\school-locker-reservation-system\\src\\img\\HidePasswordIcon.png");
        ImageIcon showPasswordIcon = new ImageIcon("C:\\Users\\linus\\Documents\\NetBeansProjects\\school-locker-reservation-system\\src\\img\\ShowPasswordIcon.png");
        passwordVisible = !passwordVisible; // Toggle the password visibility
                if (passwordVisible) {
                    PasswordField.setEchoChar((char) 0);
                    showPasswordButton.setIcon(hidePasswordIcon);
                } else {
                    PasswordField.setEchoChar('*');
                    showPasswordButton.setIcon(showPasswordIcon);
                }
    }//GEN-LAST:event_showPasswordButtonActionPerformed

    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordFieldActionPerformed

    public void loginUser() {
        String student_id;
        char[] password;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/locker_reservation";
            String user = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();

            if ("".equals(EnterStudentIDJField.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "Username is required", "Dialog", JOptionPane.ERROR_MESSAGE);
            } else if (PasswordField.getPassword().length == 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Password is required", "Dialog", JOptionPane.ERROR_MESSAGE);
            } else {
                student_id = EnterStudentIDJField.getText();
                password = PasswordField.getPassword();

                // Retrieve the plain text password from the database
                String query = "SELECT pass_word FROM user WHERE student_id = '" + student_id + "'";
                ResultSet rs = st.executeQuery(query);

                if (rs.next()) {
                    String storedHashedPassword = rs.getString("pass_word");

                    String enteredPassword = new String(password);
                    String hashedEnteredPassword = CryptoUtils.hashPassword(enteredPassword);

                    if (storedHashedPassword.equals(hashedEnteredPassword)) {
                        if (EnterStudentIDJField.getText().equals("1900-202024")){
                            JOptionPane.showMessageDialog(null, "Login successful!");

                            AdminMainWindow GoToMainWindow = new AdminMainWindow();
                            GoToMainWindow.setVisible(true);
                            dispose();
                        } else {
                            JOptionPane.showMessageDialog(null, "Login successful!");

                            StudentMainWindow GoToStudentMainWindow = new StudentMainWindow();
                            GoToStudentMainWindow.setVisible(true);
                            dispose();
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid username or password", "Dialog", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Student ID not found", "Dialog", JOptionPane.ERROR_MESSAGE);
                }
                con.close();
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }
   
    public class CryptoUtils {
    
    private static final String ALGORITHM = "SHA-256";

    public static String hashPassword(String password) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance(ALGORITHM);
        byte[] hashedBytes = md.digest(password.getBytes());
        return Base64.getEncoder().encodeToString(hashedBytes);
    }
}
    private void setStudentIDTextFieldFilter() {
    EnterStudentIDJField.addKeyListener(new KeyAdapter() {
        @Override
        public void keyTyped(KeyEvent e) {
            char c = e.getKeyChar();
            if (!((c >= '0' && c <= '9') || c == KeyEvent.VK_MINUS) || EnterStudentIDJField.getText().length() >= 12 || (c == KeyEvent.VK_MINUS && EnterStudentIDJField.getText().contains("-"))) {
                e.consume();
            }
        }
    });
}
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new LoginPage().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateAccBtn;
    private javax.swing.JTextField EnterStudentIDJField;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JButton SignInBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton showPasswordButton;
    // End of variables declaration//GEN-END:variables

}
