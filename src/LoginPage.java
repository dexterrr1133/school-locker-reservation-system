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
    private static String loggedInStudentId;
    
    public LoginPage() {
        initComponents();
        setStudentIDTextFieldFilter();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        ShowHide = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        EnterStudentIDJField = new javax.swing.JTextField();
        CreateAccBtn = new javax.swing.JButton();
        SignInBtn = new javax.swing.JButton();
        ForgotPassword = new javax.swing.JLabel();
        LoginBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ShowHide.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ShowHide.setForeground(new java.awt.Color(0, 0, 0));
        ShowHide.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ShowHide.setText("Show");
        ShowHide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShowHideMouseClicked(evt);
            }
        });
        jPanel3.add(ShowHide, new org.netbeans.lib.awtextra.AbsoluteConstraints(1079, 600, 80, 40));

        PasswordField.setBackground(new java.awt.Color(242, 242, 242));
        PasswordField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PasswordField.setText(null);
        PasswordField.setBorder(null);
        PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldActionPerformed(evt);
            }
        });
        jPanel3.add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 600, 460, 40));

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
        SignInBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignInBtnActionPerformed(evt);
            }
        });
        jPanel3.add(SignInBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(888, 740, 280, 60));

        ForgotPassword.setForeground(new java.awt.Color(49, 112, 143));
        ForgotPassword.setText("Forgot Password");
        ForgotPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ForgotPasswordMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ForgotPasswordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ForgotPasswordMouseExited(evt);
            }
        });
        jPanel3.add(ForgotPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 650, -1, -1));

        LoginBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login.png"))); // NOI18N
        jPanel3.add(LoginBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
        if(EnterStudentIDJField.getText().equals("1900-202024")){
            loginAdminUser();
        } else {
            loginStudentUser();
        }
    }//GEN-LAST:event_SignInBtnActionPerformed

    private void CreateAccBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateAccBtnActionPerformed
        SignUpPage GoToSignUpPage = new SignUpPage();
        GoToSignUpPage.setVisible(true);
        dispose();
    }//GEN-LAST:event_CreateAccBtnActionPerformed

    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed
        
    }//GEN-LAST:event_PasswordFieldActionPerformed

    private void ShowHideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowHideMouseClicked
        passwordVisible = !passwordVisible; // Toggle the password visibility
        if (passwordVisible) {
            PasswordField.setEchoChar((char) 0);
            ShowHide.setText("Hide");
        } else {
            PasswordField.setEchoChar('*');
            ShowHide.setText("Show");
        }
    }//GEN-LAST:event_ShowHideMouseClicked

    private void ForgotPasswordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ForgotPasswordMouseEntered
        ForgotPassword.setText("<html><u>" + "Forgot Password" + "</u></html>");
    }//GEN-LAST:event_ForgotPasswordMouseEntered

    private void ForgotPasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ForgotPasswordMouseExited
        ForgotPassword.setText("Forgot Password");
    }//GEN-LAST:event_ForgotPasswordMouseExited

    private void ForgotPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ForgotPasswordMouseClicked
        ForgotPasswordWindow goToForgotPasswordWindow = new ForgotPasswordWindow();
        goToForgotPasswordWindow.setVisible(true);
        dispose();
    }//GEN-LAST:event_ForgotPasswordMouseClicked
    
    public static void setLoggedInStudentId(String studentId) {
        loggedInStudentId = studentId;
    }
    
    public static String getLoggedInStudentId() {
        return loggedInStudentId;
    }
    
    public void loginStudentUser() {
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
            }else if (!(EnterStudentIDJField.getText().contains("-"))){
                JOptionPane.showMessageDialog(new JFrame(), "Student ID must contain '-'", "Dialog", JOptionPane.ERROR_MESSAGE); 
            }else {
                student_id = EnterStudentIDJField.getText();
                password = PasswordField.getPassword();
                
                String query = "SELECT password FROM student WHERE student_id = '" + student_id + "'";
                ResultSet rs = st.executeQuery(query);

                if (rs.next()) {
                    String storedHashedPassword = rs.getString("password");

                    String enteredPassword = new String(password);
                    String hashedEnteredPassword = CryptoUtils.hashPassword(enteredPassword);

                    if (storedHashedPassword.equals(hashedEnteredPassword)) {
                            JOptionPane.showMessageDialog(null, "Login successful!");
                            setLoggedInStudentId(student_id);
                            StudentMainWindow GoToStudentMainWindow = new StudentMainWindow();
                            GoToStudentMainWindow.setVisible(true);
                            dispose();
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
    
    public void loginAdminUser() {
        String admin_id;
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
            }else if (!(EnterStudentIDJField.getText().contains("-"))){
                JOptionPane.showMessageDialog(new JFrame(), "Admin ID must contain '-'", "Dialog", JOptionPane.ERROR_MESSAGE); 
            }else {
                admin_id = EnterStudentIDJField.getText();
                password = PasswordField.getPassword();
                
                String query = "SELECT pass_word FROM admin WHERE admin_id = '" + admin_id + "'";
                ResultSet rs = st.executeQuery(query);

                if (rs.next()) {
                    String storedHashedPassword = rs.getString("pass_word");

                    String enteredPassword = new String(password);

                    if (storedHashedPassword.equals(enteredPassword)) {
                            JOptionPane.showMessageDialog(null, "Login successful! Hello Admin!");
                            AdminMainWindow GoToAdminMainWindow = new AdminMainWindow();
                            GoToAdminMainWindow.setVisible(true);
                            dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid username or password", "Dialog", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Admin ID not found", "Dialog", JOptionPane.ERROR_MESSAGE);
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
            if (!((c >= '0' && c <= '9') || c == KeyEvent.VK_MINUS) || EnterStudentIDJField.getText().length() >= 11 || (c == KeyEvent.VK_MINUS && EnterStudentIDJField.getText().contains("-"))) {
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
    private javax.swing.JLabel ForgotPassword;
    private javax.swing.JLabel LoginBackground;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel ShowHide;
    private javax.swing.JButton SignInBtn;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables

}
