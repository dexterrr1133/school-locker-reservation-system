import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JPanel;
import javax.swing.Timer;

public class StudentMainWindow extends javax.swing.JFrame {
    
    private HashMap<Integer, JPanel> lockers = new HashMap<>();
    
    public StudentMainWindow() {
        initComponents();
        checkAvailableLocker();
        clickedPanel();
        setIcons();
        autoSetStudentProfileDetails();
        ConfirmButton.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        AccountSettings = new javax.swing.JMenuItem();
        Logout = new javax.swing.JMenuItem();
        containerPanel = new javax.swing.JPanel();
        MainWindowPanel = new javax.swing.JPanel();
        GreetingsLabel = new javax.swing.JLabel();
        AccountLabel = new javax.swing.JLabel();
        ViewLockerPanel = new javax.swing.JPanel();
        ViewLockerText = new javax.swing.JLabel();
        LockerIcon = new javax.swing.JLabel();
        Line = new javax.swing.JPanel();
        Exclamation = new javax.swing.JLabel();
        Notice = new javax.swing.JLabel();
        MainWindowBackground = new javax.swing.JLabel();
        StudentProfilePanel = new javax.swing.JPanel();
        AccountLabel2 = new javax.swing.JLabel();
        EditFirstName = new javax.swing.JLabel();
        EditLastName = new javax.swing.JLabel();
        EditStudentID = new javax.swing.JLabel();
        EditCourse = new javax.swing.JLabel();
        EditEmail = new javax.swing.JLabel();
        EditMobileNumber = new javax.swing.JLabel();
        StudentProfFirstName = new javax.swing.JTextField();
        StudentProfLastName = new javax.swing.JTextField();
        StudentProfStudentID = new javax.swing.JTextField();
        StudentProfCourse = new javax.swing.JTextField();
        StudentProfEmail = new javax.swing.JTextField();
        StudentProfPhoneNum = new javax.swing.JTextField();
        ConfirmButton = new javax.swing.JButton();
        ProfilePicture = new javax.swing.JLabel();
        BackButton = new javax.swing.JLabel();
        StudentProfileBackground = new javax.swing.JLabel();
        SmallLockerPage = new javax.swing.JPanel();
        s1 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        s2 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        s3 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        s4 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        s5 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        s6 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        s7 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        s8 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        s9 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        s10 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        s11 = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        s12 = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        s13 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        s14 = new javax.swing.JPanel();
        jLabel69 = new javax.swing.JLabel();
        s15 = new javax.swing.JPanel();
        jLabel73 = new javax.swing.JLabel();
        s16 = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        s17 = new javax.swing.JPanel();
        jLabel71 = new javax.swing.JLabel();
        s18 = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        s19 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        s20 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        s21 = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        s22 = new javax.swing.JPanel();
        jLabel77 = new javax.swing.JLabel();
        s23 = new javax.swing.JPanel();
        jLabel78 = new javax.swing.JLabel();
        s24 = new javax.swing.JPanel();
        jLabel79 = new javax.swing.JLabel();
        s25 = new javax.swing.JPanel();
        jLabel80 = new javax.swing.JLabel();
        s26 = new javax.swing.JPanel();
        jLabel81 = new javax.swing.JLabel();
        s27 = new javax.swing.JPanel();
        jLabel82 = new javax.swing.JLabel();
        s28 = new javax.swing.JPanel();
        jLabel83 = new javax.swing.JLabel();
        s29 = new javax.swing.JPanel();
        jLabel84 = new javax.swing.JLabel();
        s30 = new javax.swing.JPanel();
        jLabel85 = new javax.swing.JLabel();
        s31 = new javax.swing.JPanel();
        jLabel144 = new javax.swing.JLabel();
        s32 = new javax.swing.JPanel();
        jLabel145 = new javax.swing.JLabel();
        s33 = new javax.swing.JPanel();
        jLabel146 = new javax.swing.JLabel();
        s34 = new javax.swing.JPanel();
        jLabel147 = new javax.swing.JLabel();
        s35 = new javax.swing.JPanel();
        jLabel148 = new javax.swing.JLabel();
        s36 = new javax.swing.JPanel();
        jLabel149 = new javax.swing.JLabel();
        s37 = new javax.swing.JPanel();
        jLabel150 = new javax.swing.JLabel();
        s38 = new javax.swing.JPanel();
        jLabel151 = new javax.swing.JLabel();
        s39 = new javax.swing.JPanel();
        jLabel152 = new javax.swing.JLabel();
        s40 = new javax.swing.JPanel();
        jLabel153 = new javax.swing.JLabel();
        s41 = new javax.swing.JPanel();
        jLabel155 = new javax.swing.JLabel();
        s42 = new javax.swing.JPanel();
        jLabel160 = new javax.swing.JLabel();
        s43 = new javax.swing.JPanel();
        jLabel162 = new javax.swing.JLabel();
        s45 = new javax.swing.JPanel();
        jLabel157 = new javax.swing.JLabel();
        s46 = new javax.swing.JPanel();
        jLabel154 = new javax.swing.JLabel();
        s50 = new javax.swing.JPanel();
        jLabel156 = new javax.swing.JLabel();
        s44 = new javax.swing.JPanel();
        jLabel158 = new javax.swing.JLabel();
        s47 = new javax.swing.JPanel();
        jLabel159 = new javax.swing.JLabel();
        s48 = new javax.swing.JPanel();
        jLabel161 = new javax.swing.JLabel();
        s49 = new javax.swing.JPanel();
        jLabel163 = new javax.swing.JLabel();
        AccountLabel3 = new javax.swing.JLabel();
        jLabel164 = new javax.swing.JLabel();
        HomeSmallLocker = new javax.swing.JLabel();
        jLabel166 = new javax.swing.JLabel();
        jLabel167 = new javax.swing.JLabel();
        smallLockerPage1 = new javax.swing.JLabel();
        smallLockerPage2 = new javax.swing.JLabel();
        smallLockerPage3 = new javax.swing.JLabel();
        smallLockerBackground = new javax.swing.JLabel();
        jLabel168 = new javax.swing.JLabel();
        MediumLockerPage = new javax.swing.JPanel();
        m1 = new javax.swing.JPanel();
        jLabel87 = new javax.swing.JLabel();
        m2 = new javax.swing.JPanel();
        jLabel88 = new javax.swing.JLabel();
        m3 = new javax.swing.JPanel();
        jLabel89 = new javax.swing.JLabel();
        m4 = new javax.swing.JPanel();
        jLabel90 = new javax.swing.JLabel();
        m5 = new javax.swing.JPanel();
        jLabel91 = new javax.swing.JLabel();
        m6 = new javax.swing.JPanel();
        jLabel92 = new javax.swing.JLabel();
        m7 = new javax.swing.JPanel();
        jLabel93 = new javax.swing.JLabel();
        m8 = new javax.swing.JPanel();
        jLabel94 = new javax.swing.JLabel();
        m9 = new javax.swing.JPanel();
        jLabel95 = new javax.swing.JLabel();
        m10 = new javax.swing.JPanel();
        jLabel96 = new javax.swing.JLabel();
        m11 = new javax.swing.JPanel();
        jLabel99 = new javax.swing.JLabel();
        m12 = new javax.swing.JPanel();
        jLabel103 = new javax.swing.JLabel();
        m13 = new javax.swing.JPanel();
        jLabel98 = new javax.swing.JLabel();
        m14 = new javax.swing.JPanel();
        jLabel97 = new javax.swing.JLabel();
        m15 = new javax.swing.JPanel();
        jLabel101 = new javax.swing.JLabel();
        m16 = new javax.swing.JPanel();
        jLabel106 = new javax.swing.JLabel();
        m17 = new javax.swing.JPanel();
        jLabel104 = new javax.swing.JLabel();
        m18 = new javax.swing.JPanel();
        jLabel105 = new javax.swing.JLabel();
        m19 = new javax.swing.JPanel();
        jLabel102 = new javax.swing.JLabel();
        m20 = new javax.swing.JPanel();
        jLabel100 = new javax.swing.JLabel();
        m21 = new javax.swing.JPanel();
        jLabel135 = new javax.swing.JLabel();
        m22 = new javax.swing.JPanel();
        jLabel131 = new javax.swing.JLabel();
        m23 = new javax.swing.JPanel();
        jLabel136 = new javax.swing.JLabel();
        m24 = new javax.swing.JPanel();
        jLabel137 = new javax.swing.JLabel();
        m25 = new javax.swing.JPanel();
        jLabel132 = new javax.swing.JLabel();
        m26 = new javax.swing.JPanel();
        jLabel130 = new javax.swing.JLabel();
        m27 = new javax.swing.JPanel();
        jLabel129 = new javax.swing.JLabel();
        m28 = new javax.swing.JPanel();
        jLabel133 = new javax.swing.JLabel();
        m29 = new javax.swing.JPanel();
        jLabel134 = new javax.swing.JLabel();
        m30 = new javax.swing.JPanel();
        jLabel110 = new javax.swing.JLabel();
        AccountLabel4 = new javax.swing.JLabel();
        mediumLockerPage1 = new javax.swing.JLabel();
        mediumLockerPage2 = new javax.swing.JLabel();
        mediumLockerPage3 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        HomeMediumLocker = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        mediumLockerBackground = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        LargeLockerPage = new javax.swing.JPanel();
        L1 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        L2 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        L3 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        L4 = new javax.swing.JPanel();
        jLabel86 = new javax.swing.JLabel();
        L5 = new javax.swing.JPanel();
        jLabel108 = new javax.swing.JLabel();
        L6 = new javax.swing.JPanel();
        jLabel111 = new javax.swing.JLabel();
        L7 = new javax.swing.JPanel();
        jLabel109 = new javax.swing.JLabel();
        L8 = new javax.swing.JPanel();
        jLabel107 = new javax.swing.JLabel();
        L9 = new javax.swing.JPanel();
        jLabel112 = new javax.swing.JLabel();
        L10 = new javax.swing.JPanel();
        jLabel113 = new javax.swing.JLabel();
        L11 = new javax.swing.JPanel();
        jLabel115 = new javax.swing.JLabel();
        L12 = new javax.swing.JPanel();
        jLabel122 = new javax.swing.JLabel();
        L13 = new javax.swing.JPanel();
        jLabel116 = new javax.swing.JLabel();
        L14 = new javax.swing.JPanel();
        jLabel117 = new javax.swing.JLabel();
        L15 = new javax.swing.JPanel();
        jLabel120 = new javax.swing.JLabel();
        L16 = new javax.swing.JPanel();
        jLabel119 = new javax.swing.JLabel();
        L17 = new javax.swing.JPanel();
        jLabel114 = new javax.swing.JLabel();
        L18 = new javax.swing.JPanel();
        jLabel123 = new javax.swing.JLabel();
        L19 = new javax.swing.JPanel();
        jLabel121 = new javax.swing.JLabel();
        L20 = new javax.swing.JPanel();
        jLabel118 = new javax.swing.JLabel();
        AccountLabel5 = new javax.swing.JLabel();
        largeLockerPage1 = new javax.swing.JLabel();
        largeLockerPage2 = new javax.swing.JLabel();
        largeLockerPage3 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        HomeLargeLocker = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        largeLockerBackground = new javax.swing.JLabel();
        ConfirmationPanel = new javax.swing.JPanel();
        PaymentDeadline = new javax.swing.JLabel();
        PaymentDeadline1 = new javax.swing.JLabel();
        LockerNumberSize = new javax.swing.JLabel();
        LockerPrice = new javax.swing.JLabel();
        ConfimationBackground = new javax.swing.JLabel();
        ReservationPanel = new javax.swing.JPanel();
        ReserveIcon = new javax.swing.JLabel();
        HomeLargeLocker1 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        LockerName = new javax.swing.JLabel();
        jLabel165 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        StudentIDTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        FirstNameTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        LastNameTF = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        StartDateTF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        EndDateTF = new javax.swing.JTextField();
        ReserveButton = new javax.swing.JButton();
        AccountLabel6 = new javax.swing.JLabel();
        reservePanelBackground = new javax.swing.JLabel();

        jPopupMenu1.setPreferredSize(new java.awt.Dimension(200, 56));

        AccountSettings.setText("Account Settings");
        AccountSettings.setPreferredSize(new java.awt.Dimension(128, 40));
        AccountSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccountSettingsActionPerformed(evt);
            }
        });
        jPopupMenu1.add(AccountSettings);

        Logout.setText("Logout");
        Logout.setPreferredSize(new java.awt.Dimension(128, 40));
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        jPopupMenu1.add(Logout);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1920, 1080));

        containerPanel.setMaximumSize(new java.awt.Dimension(1920, 1080));
        containerPanel.setLayout(new java.awt.CardLayout());

        MainWindowPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GreetingsLabel.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 36)); // NOI18N
        GreetingsLabel.setForeground(new java.awt.Color(255, 255, 255));
        GreetingsLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        GreetingsLabel.setText("Hi, Student!");
        MainWindowPanel.add(GreetingsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 40, 510, -1));

        AccountLabel.setForeground(new java.awt.Color(255, 255, 255));
        AccountLabel.setText(" ▼");
        AccountLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AccountLabelMouseClicked(evt);
            }
        });
        MainWindowPanel.add(AccountLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1810, 40, 70, 60));

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

        MainWindowPanel.add(ViewLockerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, 430, 190));

        javax.swing.GroupLayout LineLayout = new javax.swing.GroupLayout(Line);
        Line.setLayout(LineLayout);
        LineLayout.setHorizontalGroup(
            LineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1400, Short.MAX_VALUE)
        );
        LineLayout.setVerticalGroup(
            LineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        MainWindowPanel.add(Line, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 1400, 10));

        Exclamation.setBackground(new java.awt.Color(255, 0, 0));
        Exclamation.setFont(new java.awt.Font("Segoe UI Variable", 1, 36)); // NOI18N
        Exclamation.setForeground(new java.awt.Color(255, 255, 255));
        Exclamation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Exclamation.setText("!");
        Exclamation.setOpaque(true);
        MainWindowPanel.add(Exclamation, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 142, 40, 40));

        Notice.setBackground(new java.awt.Color(255, 0, 0));
        Notice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Notice.setForeground(new java.awt.Color(255, 255, 255));
        Notice.setText("jLabel1");
        Notice.setOpaque(true);
        MainWindowPanel.add(Notice, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 142, 1880, 40));

        MainWindowBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/StudentMainWindow.png"))); // NOI18N
        MainWindowPanel.add(MainWindowBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        containerPanel.add(MainWindowPanel, "card3");

        StudentProfilePanel.setForeground(new java.awt.Color(0, 0, 0));
        StudentProfilePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AccountLabel2.setForeground(new java.awt.Color(255, 255, 255));
        AccountLabel2.setText(" ▼");
        AccountLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AccountLabel2MouseClicked(evt);
            }
        });
        StudentProfilePanel.add(AccountLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1810, 40, 70, 60));

        EditFirstName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditFirstNameMouseClicked(evt);
            }
        });
        StudentProfilePanel.add(EditFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 460, 50, 50));

        EditLastName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditLastNameMouseClicked(evt);
            }
        });
        StudentProfilePanel.add(EditLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 558, 50, 50));

        EditStudentID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditStudentIDMouseClicked(evt);
            }
        });
        StudentProfilePanel.add(EditStudentID, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 642, 50, 50));

        EditCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditCourseMouseClicked(evt);
            }
        });
        StudentProfilePanel.add(EditCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 742, 50, 50));

        EditEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditEmailMouseClicked(evt);
            }
        });
        StudentProfilePanel.add(EditEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 840, 50, 50));

        EditMobileNumber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditMobileNumberMouseClicked(evt);
            }
        });
        StudentProfilePanel.add(EditMobileNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 940, 50, 50));

        StudentProfFirstName.setFont(new java.awt.Font("Segoe UI Variable", 1, 20)); // NOI18N
        StudentProfFirstName.setText("jTextField1");
        StudentProfFirstName.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        StudentProfFirstName.setEnabled(false);
        StudentProfFirstName.setMargin(new java.awt.Insets(2, 16, 2, 6));
        StudentProfilePanel.add(StudentProfFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 450, 330, 40));

        StudentProfLastName.setFont(new java.awt.Font("Segoe UI Variable", 1, 20)); // NOI18N
        StudentProfLastName.setText("jTextField1");
        StudentProfLastName.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        StudentProfLastName.setEnabled(false);
        StudentProfLastName.setMargin(new java.awt.Insets(2, 16, 2, 6));
        StudentProfilePanel.add(StudentProfLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 550, 330, 40));

        StudentProfStudentID.setFont(new java.awt.Font("Segoe UI Variable", 1, 20)); // NOI18N
        StudentProfStudentID.setText("jTextField1");
        StudentProfStudentID.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        StudentProfStudentID.setEnabled(false);
        StudentProfStudentID.setMargin(new java.awt.Insets(2, 16, 2, 6));
        StudentProfilePanel.add(StudentProfStudentID, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 650, 330, 40));

        StudentProfCourse.setFont(new java.awt.Font("Segoe UI Variable", 1, 20)); // NOI18N
        StudentProfCourse.setText("jTextField1");
        StudentProfCourse.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        StudentProfCourse.setEnabled(false);
        StudentProfCourse.setMargin(new java.awt.Insets(2, 16, 2, 6));
        StudentProfilePanel.add(StudentProfCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 750, 330, 40));

        StudentProfEmail.setFont(new java.awt.Font("Segoe UI Variable", 1, 20)); // NOI18N
        StudentProfEmail.setText("jTextField1");
        StudentProfEmail.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        StudentProfEmail.setEnabled(false);
        StudentProfEmail.setMargin(new java.awt.Insets(2, 16, 2, 6));
        StudentProfilePanel.add(StudentProfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 850, 330, 40));

        StudentProfPhoneNum.setFont(new java.awt.Font("Segoe UI Variable", 1, 20)); // NOI18N
        StudentProfPhoneNum.setText("jTextField1");
        StudentProfPhoneNum.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        StudentProfPhoneNum.setEnabled(false);
        StudentProfPhoneNum.setMargin(new java.awt.Insets(2, 16, 2, 6));
        StudentProfilePanel.add(StudentProfPhoneNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 950, 330, 40));

        ConfirmButton.setBackground(new java.awt.Color(53, 64, 142));
        ConfirmButton.setForeground(new java.awt.Color(255, 255, 255));
        ConfirmButton.setText("Confirm");
        ConfirmButton.setFocusPainted(false);
        ConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmButtonActionPerformed(evt);
            }
        });
        StudentProfilePanel.add(ConfirmButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 1010, 210, 40));

        ProfilePicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/StudentDetailProfilePic.jpg"))); // NOI18N
        StudentProfilePanel.add(ProfilePicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 200, 250, 250));

        BackButton.setFont(new java.awt.Font("Segoe UI Variable", 1, 24)); // NOI18N
        BackButton.setForeground(new java.awt.Color(0, 0, 0));
        BackButton.setText("< Back ");
        BackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackButtonMouseClicked(evt);
            }
        });
        StudentProfilePanel.add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        StudentProfileBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/StudentProfileBackground.png"))); // NOI18N
        StudentProfilePanel.add(StudentProfileBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        containerPanel.add(StudentProfilePanel, "card8");

        SmallLockerPage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        s1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel23.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel23.setText("1");

        javax.swing.GroupLayout s1Layout = new javax.swing.GroupLayout(s1);
        s1.setLayout(s1Layout);
        s1Layout.setHorizontalGroup(
            s1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel23)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        s1Layout.setVerticalGroup(
            s1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel23)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        SmallLockerPage.add(s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 160, 130));

        s2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel24.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel24.setText("2");

        javax.swing.GroupLayout s2Layout = new javax.swing.GroupLayout(s2);
        s2.setLayout(s2Layout);
        s2Layout.setHorizontalGroup(
            s2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, s2Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel24)
                .addGap(66, 66, 66))
        );
        s2Layout.setVerticalGroup(
            s2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, s2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel24)
                .addGap(23, 23, 23))
        );

        SmallLockerPage.add(s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 160, 130));

        s3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel28.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel28.setText("3");

        javax.swing.GroupLayout s3Layout = new javax.swing.GroupLayout(s3);
        s3.setLayout(s3Layout);
        s3Layout.setHorizontalGroup(
            s3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s3Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel28)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        s3Layout.setVerticalGroup(
            s3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel28)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        SmallLockerPage.add(s3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 160, 130));

        s4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel29.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel29.setText("4");

        javax.swing.GroupLayout s4Layout = new javax.swing.GroupLayout(s4);
        s4.setLayout(s4Layout);
        s4Layout.setHorizontalGroup(
            s4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s4Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel29)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        s4Layout.setVerticalGroup(
            s4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel29)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        SmallLockerPage.add(s4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 250, 160, 130));

        s5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel30.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel30.setText("5");

        javax.swing.GroupLayout s5Layout = new javax.swing.GroupLayout(s5);
        s5.setLayout(s5Layout);
        s5Layout.setHorizontalGroup(
            s5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s5Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel30)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        s5Layout.setVerticalGroup(
            s5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s5Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel30)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        SmallLockerPage.add(s5, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 250, 160, 130));

        s6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel32.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel32.setText("6");

        javax.swing.GroupLayout s6Layout = new javax.swing.GroupLayout(s6);
        s6.setLayout(s6Layout);
        s6Layout.setHorizontalGroup(
            s6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s6Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel32)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        s6Layout.setVerticalGroup(
            s6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s6Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel32)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        SmallLockerPage.add(s6, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 250, 160, 130));

        s7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel33.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel33.setText("7");

        javax.swing.GroupLayout s7Layout = new javax.swing.GroupLayout(s7);
        s7.setLayout(s7Layout);
        s7Layout.setHorizontalGroup(
            s7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s7Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel33)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        s7Layout.setVerticalGroup(
            s7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s7Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel33)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        SmallLockerPage.add(s7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 250, 160, 130));

        s8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel34.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel34.setText("8");

        javax.swing.GroupLayout s8Layout = new javax.swing.GroupLayout(s8);
        s8.setLayout(s8Layout);
        s8Layout.setHorizontalGroup(
            s8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s8Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel34)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        s8Layout.setVerticalGroup(
            s8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s8Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel34)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        SmallLockerPage.add(s8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 250, 160, 130));

        s9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel35.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel35.setText("9");

        javax.swing.GroupLayout s9Layout = new javax.swing.GroupLayout(s9);
        s9.setLayout(s9Layout);
        s9Layout.setHorizontalGroup(
            s9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s9Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel35)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        s9Layout.setVerticalGroup(
            s9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s9Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel35)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        SmallLockerPage.add(s9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 250, 160, 130));

        s10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel36.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel36.setText("10");

        javax.swing.GroupLayout s10Layout = new javax.swing.GroupLayout(s10);
        s10.setLayout(s10Layout);
        s10Layout.setHorizontalGroup(
            s10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s10Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel36)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        s10Layout.setVerticalGroup(
            s10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s10Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel36)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        SmallLockerPage.add(s10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1600, 250, 160, 130));

        s11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel74.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel74.setText("11");

        javax.swing.GroupLayout s11Layout = new javax.swing.GroupLayout(s11);
        s11.setLayout(s11Layout);
        s11Layout.setHorizontalGroup(
            s11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s11Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel74)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        s11Layout.setVerticalGroup(
            s11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s11Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel74)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        SmallLockerPage.add(s11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 160, 130));

        s12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel72.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel72.setText("12");

        javax.swing.GroupLayout s12Layout = new javax.swing.GroupLayout(s12);
        s12.setLayout(s12Layout);
        s12Layout.setHorizontalGroup(
            s12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s12Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel72)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        s12Layout.setVerticalGroup(
            s12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s12Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel72)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        SmallLockerPage.add(s12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 160, 130));

        s13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel39.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel39.setText("13");

        javax.swing.GroupLayout s13Layout = new javax.swing.GroupLayout(s13);
        s13.setLayout(s13Layout);
        s13Layout.setHorizontalGroup(
            s13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s13Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel39)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        s13Layout.setVerticalGroup(
            s13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s13Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel39)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        SmallLockerPage.add(s13, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, 160, 130));

        s14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel69.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel69.setText("14");

        javax.swing.GroupLayout s14Layout = new javax.swing.GroupLayout(s14);
        s14.setLayout(s14Layout);
        s14Layout.setHorizontalGroup(
            s14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s14Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel69)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        s14Layout.setVerticalGroup(
            s14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s14Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel69)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        SmallLockerPage.add(s14, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 380, 160, 130));

        s15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel73.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel73.setText("15");

        javax.swing.GroupLayout s15Layout = new javax.swing.GroupLayout(s15);
        s15.setLayout(s15Layout);
        s15Layout.setHorizontalGroup(
            s15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s15Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel73)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        s15Layout.setVerticalGroup(
            s15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s15Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel73)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        SmallLockerPage.add(s15, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 380, 160, 130));

        s16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel70.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel70.setText("16");

        javax.swing.GroupLayout s16Layout = new javax.swing.GroupLayout(s16);
        s16.setLayout(s16Layout);
        s16Layout.setHorizontalGroup(
            s16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s16Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel70)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        s16Layout.setVerticalGroup(
            s16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s16Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel70)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        SmallLockerPage.add(s16, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 380, 160, 130));

        s17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel71.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel71.setText("17");

        javax.swing.GroupLayout s17Layout = new javax.swing.GroupLayout(s17);
        s17.setLayout(s17Layout);
        s17Layout.setHorizontalGroup(
            s17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s17Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel71)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        s17Layout.setVerticalGroup(
            s17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s17Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel71)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        SmallLockerPage.add(s17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 380, 160, 130));

        s18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel75.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel75.setText("18");

        javax.swing.GroupLayout s18Layout = new javax.swing.GroupLayout(s18);
        s18.setLayout(s18Layout);
        s18Layout.setHorizontalGroup(
            s18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s18Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel75)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        s18Layout.setVerticalGroup(
            s18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s18Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel75)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        SmallLockerPage.add(s18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 380, 160, 130));

        s19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel37.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel37.setText("19");

        javax.swing.GroupLayout s19Layout = new javax.swing.GroupLayout(s19);
        s19.setLayout(s19Layout);
        s19Layout.setHorizontalGroup(
            s19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s19Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel37)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        s19Layout.setVerticalGroup(
            s19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s19Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel37)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        SmallLockerPage.add(s19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 380, 160, 130));

        s20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel38.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel38.setText("20");

        javax.swing.GroupLayout s20Layout = new javax.swing.GroupLayout(s20);
        s20.setLayout(s20Layout);
        s20Layout.setHorizontalGroup(
            s20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s20Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel38)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        s20Layout.setVerticalGroup(
            s20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s20Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel38)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        SmallLockerPage.add(s20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1600, 380, 160, 130));

        s21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel76.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel76.setText("21");

        javax.swing.GroupLayout s21Layout = new javax.swing.GroupLayout(s21);
        s21.setLayout(s21Layout);
        s21Layout.setHorizontalGroup(
            s21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, s21Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel76)
                .addGap(64, 64, 64))
        );
        s21Layout.setVerticalGroup(
            s21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, s21Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabel76)
                .addGap(30, 30, 30))
        );

        SmallLockerPage.add(s21, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 510, 160, 130));

        s22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel77.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel77.setText("22");

        javax.swing.GroupLayout s22Layout = new javax.swing.GroupLayout(s22);
        s22.setLayout(s22Layout);
        s22Layout.setHorizontalGroup(
            s22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s22Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel77)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        s22Layout.setVerticalGroup(
            s22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, s22Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel77)
                .addGap(32, 32, 32))
        );

        SmallLockerPage.add(s22, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 510, 160, 130));

        s23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel78.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel78.setText("23");

        javax.swing.GroupLayout s23Layout = new javax.swing.GroupLayout(s23);
        s23.setLayout(s23Layout);
        s23Layout.setHorizontalGroup(
            s23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, s23Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel78)
                .addGap(64, 64, 64))
        );
        s23Layout.setVerticalGroup(
            s23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, s23Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel78)
                .addGap(27, 27, 27))
        );

        SmallLockerPage.add(s23, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 510, 160, 130));

        s24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel79.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel79.setText("24");

        javax.swing.GroupLayout s24Layout = new javax.swing.GroupLayout(s24);
        s24.setLayout(s24Layout);
        s24Layout.setHorizontalGroup(
            s24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, s24Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel79)
                .addGap(57, 57, 57))
        );
        s24Layout.setVerticalGroup(
            s24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, s24Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel79)
                .addGap(30, 30, 30))
        );

        SmallLockerPage.add(s24, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 510, 160, 130));

        s25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel80.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel80.setText("25");

        javax.swing.GroupLayout s25Layout = new javax.swing.GroupLayout(s25);
        s25.setLayout(s25Layout);
        s25Layout.setHorizontalGroup(
            s25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s25Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel80)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        s25Layout.setVerticalGroup(
            s25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s25Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel80)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        SmallLockerPage.add(s25, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 510, 160, 130));

        s26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel81.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel81.setText("26");

        javax.swing.GroupLayout s26Layout = new javax.swing.GroupLayout(s26);
        s26.setLayout(s26Layout);
        s26Layout.setHorizontalGroup(
            s26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s26Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel81)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        s26Layout.setVerticalGroup(
            s26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s26Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel81)
                .addGap(31, 31, 31))
        );

        SmallLockerPage.add(s26, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 510, 160, 130));

        s27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel82.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel82.setText("27");

        javax.swing.GroupLayout s27Layout = new javax.swing.GroupLayout(s27);
        s27.setLayout(s27Layout);
        s27Layout.setHorizontalGroup(
            s27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s27Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel82)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        s27Layout.setVerticalGroup(
            s27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s27Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel82)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        SmallLockerPage.add(s27, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 510, 160, 130));

        s28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel83.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel83.setText("28");

        javax.swing.GroupLayout s28Layout = new javax.swing.GroupLayout(s28);
        s28.setLayout(s28Layout);
        s28Layout.setHorizontalGroup(
            s28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, s28Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel83)
                .addGap(59, 59, 59))
        );
        s28Layout.setVerticalGroup(
            s28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, s28Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel83)
                .addGap(30, 30, 30))
        );

        SmallLockerPage.add(s28, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 510, 160, 130));

        s29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel84.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel84.setText("29");

        javax.swing.GroupLayout s29Layout = new javax.swing.GroupLayout(s29);
        s29.setLayout(s29Layout);
        s29Layout.setHorizontalGroup(
            s29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, s29Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel84)
                .addGap(58, 58, 58))
        );
        s29Layout.setVerticalGroup(
            s29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, s29Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel84)
                .addGap(23, 23, 23))
        );

        SmallLockerPage.add(s29, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 510, 160, 130));

        s30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel85.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel85.setText("30");

        javax.swing.GroupLayout s30Layout = new javax.swing.GroupLayout(s30);
        s30.setLayout(s30Layout);
        s30Layout.setHorizontalGroup(
            s30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s30Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel85)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        s30Layout.setVerticalGroup(
            s30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s30Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel85)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        SmallLockerPage.add(s30, new org.netbeans.lib.awtextra.AbsoluteConstraints(1600, 510, 160, 130));

        s31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel144.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel144.setText("31");

        javax.swing.GroupLayout s31Layout = new javax.swing.GroupLayout(s31);
        s31.setLayout(s31Layout);
        s31Layout.setHorizontalGroup(
            s31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s31Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel144)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        s31Layout.setVerticalGroup(
            s31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s31Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel144)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        SmallLockerPage.add(s31, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 640, 160, 130));

        s32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel145.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel145.setText("32");

        javax.swing.GroupLayout s32Layout = new javax.swing.GroupLayout(s32);
        s32.setLayout(s32Layout);
        s32Layout.setHorizontalGroup(
            s32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, s32Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel145)
                .addGap(62, 62, 62))
        );
        s32Layout.setVerticalGroup(
            s32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s32Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel145)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        SmallLockerPage.add(s32, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 640, 160, 130));

        s33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel146.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel146.setText("33");

        javax.swing.GroupLayout s33Layout = new javax.swing.GroupLayout(s33);
        s33.setLayout(s33Layout);
        s33Layout.setHorizontalGroup(
            s33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s33Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel146)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        s33Layout.setVerticalGroup(
            s33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, s33Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel146)
                .addGap(32, 32, 32))
        );

        SmallLockerPage.add(s33, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 640, 160, 130));

        s34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel147.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel147.setText("34");

        javax.swing.GroupLayout s34Layout = new javax.swing.GroupLayout(s34);
        s34.setLayout(s34Layout);
        s34Layout.setHorizontalGroup(
            s34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, s34Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel147)
                .addGap(63, 63, 63))
        );
        s34Layout.setVerticalGroup(
            s34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, s34Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel147)
                .addGap(18, 18, 18))
        );

        SmallLockerPage.add(s34, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 640, 160, 130));

        s35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel148.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel148.setText("35");

        javax.swing.GroupLayout s35Layout = new javax.swing.GroupLayout(s35);
        s35.setLayout(s35Layout);
        s35Layout.setHorizontalGroup(
            s35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s35Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel148)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        s35Layout.setVerticalGroup(
            s35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s35Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel148)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        SmallLockerPage.add(s35, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 640, 160, 130));

        s36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel149.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel149.setText("36");

        javax.swing.GroupLayout s36Layout = new javax.swing.GroupLayout(s36);
        s36.setLayout(s36Layout);
        s36Layout.setHorizontalGroup(
            s36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s36Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel149)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        s36Layout.setVerticalGroup(
            s36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s36Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel149)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        SmallLockerPage.add(s36, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 640, 160, 130));

        s37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel150.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel150.setText("37");

        javax.swing.GroupLayout s37Layout = new javax.swing.GroupLayout(s37);
        s37.setLayout(s37Layout);
        s37Layout.setHorizontalGroup(
            s37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s37Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel150)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        s37Layout.setVerticalGroup(
            s37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, s37Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel150)
                .addGap(31, 31, 31))
        );

        SmallLockerPage.add(s37, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 640, 160, 130));

        s38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel151.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel151.setText("38");

        javax.swing.GroupLayout s38Layout = new javax.swing.GroupLayout(s38);
        s38.setLayout(s38Layout);
        s38Layout.setHorizontalGroup(
            s38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, s38Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(jLabel151)
                .addGap(53, 53, 53))
        );
        s38Layout.setVerticalGroup(
            s38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, s38Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel151)
                .addGap(32, 32, 32))
        );

        SmallLockerPage.add(s38, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 640, 160, 130));

        s39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel152.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel152.setText("39");

        javax.swing.GroupLayout s39Layout = new javax.swing.GroupLayout(s39);
        s39.setLayout(s39Layout);
        s39Layout.setHorizontalGroup(
            s39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s39Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel152)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        s39Layout.setVerticalGroup(
            s39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s39Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel152)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        SmallLockerPage.add(s39, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 640, 160, 130));

        s40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel153.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel153.setText("40");

        javax.swing.GroupLayout s40Layout = new javax.swing.GroupLayout(s40);
        s40.setLayout(s40Layout);
        s40Layout.setHorizontalGroup(
            s40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s40Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel153)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        s40Layout.setVerticalGroup(
            s40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s40Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel153)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        SmallLockerPage.add(s40, new org.netbeans.lib.awtextra.AbsoluteConstraints(1600, 640, 160, 130));

        s41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel155.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel155.setText("41");

        javax.swing.GroupLayout s41Layout = new javax.swing.GroupLayout(s41);
        s41.setLayout(s41Layout);
        s41Layout.setHorizontalGroup(
            s41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s41Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel155)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        s41Layout.setVerticalGroup(
            s41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s41Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel155)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        SmallLockerPage.add(s41, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 770, 160, 130));

        s42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel160.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel160.setText("42");

        javax.swing.GroupLayout s42Layout = new javax.swing.GroupLayout(s42);
        s42.setLayout(s42Layout);
        s42Layout.setHorizontalGroup(
            s42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, s42Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel160)
                .addGap(63, 63, 63))
        );
        s42Layout.setVerticalGroup(
            s42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, s42Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel160)
                .addGap(29, 29, 29))
        );

        SmallLockerPage.add(s42, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 770, 160, 130));

        s43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel162.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel162.setText("43");

        javax.swing.GroupLayout s43Layout = new javax.swing.GroupLayout(s43);
        s43.setLayout(s43Layout);
        s43Layout.setHorizontalGroup(
            s43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s43Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel162)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        s43Layout.setVerticalGroup(
            s43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s43Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel162)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        SmallLockerPage.add(s43, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 770, 160, 130));

        s45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel157.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel157.setText("45");

        javax.swing.GroupLayout s45Layout = new javax.swing.GroupLayout(s45);
        s45.setLayout(s45Layout);
        s45Layout.setHorizontalGroup(
            s45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s45Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel157)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        s45Layout.setVerticalGroup(
            s45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s45Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel157)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        SmallLockerPage.add(s45, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 770, 160, 130));

        s46.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel154.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel154.setText("46");

        javax.swing.GroupLayout s46Layout = new javax.swing.GroupLayout(s46);
        s46.setLayout(s46Layout);
        s46Layout.setHorizontalGroup(
            s46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, s46Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel154)
                .addGap(53, 53, 53))
        );
        s46Layout.setVerticalGroup(
            s46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s46Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel154)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        SmallLockerPage.add(s46, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 770, 160, 130));

        s50.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel156.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel156.setText("50");

        javax.swing.GroupLayout s50Layout = new javax.swing.GroupLayout(s50);
        s50.setLayout(s50Layout);
        s50Layout.setHorizontalGroup(
            s50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s50Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel156)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        s50Layout.setVerticalGroup(
            s50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, s50Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel156)
                .addGap(32, 32, 32))
        );

        SmallLockerPage.add(s50, new org.netbeans.lib.awtextra.AbsoluteConstraints(1600, 770, 160, 130));

        s44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel158.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel158.setText("44");

        javax.swing.GroupLayout s44Layout = new javax.swing.GroupLayout(s44);
        s44.setLayout(s44Layout);
        s44Layout.setHorizontalGroup(
            s44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s44Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel158)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        s44Layout.setVerticalGroup(
            s44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s44Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel158)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        SmallLockerPage.add(s44, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 770, 160, 130));

        s47.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel159.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel159.setText("47");

        javax.swing.GroupLayout s47Layout = new javax.swing.GroupLayout(s47);
        s47.setLayout(s47Layout);
        s47Layout.setHorizontalGroup(
            s47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, s47Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel159)
                .addGap(59, 59, 59))
        );
        s47Layout.setVerticalGroup(
            s47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, s47Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel159)
                .addGap(22, 22, 22))
        );

        SmallLockerPage.add(s47, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 770, 160, 130));

        s48.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel161.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel161.setText("48");

        javax.swing.GroupLayout s48Layout = new javax.swing.GroupLayout(s48);
        s48.setLayout(s48Layout);
        s48Layout.setHorizontalGroup(
            s48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s48Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel161)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        s48Layout.setVerticalGroup(
            s48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s48Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel161)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        SmallLockerPage.add(s48, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 770, 160, 130));

        s49.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel163.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel163.setText("49");

        javax.swing.GroupLayout s49Layout = new javax.swing.GroupLayout(s49);
        s49.setLayout(s49Layout);
        s49Layout.setHorizontalGroup(
            s49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s49Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel163)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        s49Layout.setVerticalGroup(
            s49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s49Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel163)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        SmallLockerPage.add(s49, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 770, 160, 130));

        AccountLabel3.setForeground(new java.awt.Color(255, 255, 255));
        AccountLabel3.setText(" ▼");
        AccountLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AccountLabel3MouseClicked(evt);
            }
        });
        SmallLockerPage.add(AccountLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1810, 40, 70, 60));

        jLabel164.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Locker.png"))); // NOI18N
        SmallLockerPage.add(jLabel164, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        HomeSmallLocker.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        HomeSmallLocker.setText("Home");
        HomeSmallLocker.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeSmallLockerMouseClicked(evt);
            }
        });
        SmallLockerPage.add(HomeSmallLocker, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        jLabel166.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel166.setText(">");
        SmallLockerPage.add(jLabel166, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        jLabel167.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel167.setForeground(new java.awt.Color(49, 112, 143));
        jLabel167.setText("Small Locker");
        SmallLockerPage.add(jLabel167, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, 40));

        smallLockerPage1.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        smallLockerPage1.setForeground(new java.awt.Color(49, 112, 143));
        smallLockerPage1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        smallLockerPage1.setText("1");
        smallLockerPage1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                smallLockerPage1MouseClicked(evt);
            }
        });
        SmallLockerPage.add(smallLockerPage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 959, 50, 70));

        smallLockerPage2.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        smallLockerPage2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        smallLockerPage2.setText("2");
        smallLockerPage2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                smallLockerPage2MouseClicked(evt);
            }
        });
        SmallLockerPage.add(smallLockerPage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 959, 50, 70));

        smallLockerPage3.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        smallLockerPage3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        smallLockerPage3.setText("3");
        smallLockerPage3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                smallLockerPage3MouseClicked(evt);
            }
        });
        SmallLockerPage.add(smallLockerPage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 960, 50, 70));

        smallLockerBackground.setForeground(new java.awt.Color(49, 112, 143));
        SmallLockerPage.add(smallLockerBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel168.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel168.setForeground(new java.awt.Color(49, 112, 143));
        jLabel168.setText("Small Locker");
        SmallLockerPage.add(jLabel168, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, 40));

        containerPanel.add(SmallLockerPage, "card6");

        MediumLockerPage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        m1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel87.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel87.setText("1");

        javax.swing.GroupLayout m1Layout = new javax.swing.GroupLayout(m1);
        m1.setLayout(m1Layout);
        m1Layout.setHorizontalGroup(
            m1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, m1Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(jLabel87)
                .addGap(65, 65, 65))
        );
        m1Layout.setVerticalGroup(
            m1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel87)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        MediumLockerPage.add(m1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 160, 220));

        m2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel88.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel88.setText("2");

        javax.swing.GroupLayout m2Layout = new javax.swing.GroupLayout(m2);
        m2.setLayout(m2Layout);
        m2Layout.setHorizontalGroup(
            m2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, m2Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(jLabel88)
                .addGap(65, 65, 65))
        );
        m2Layout.setVerticalGroup(
            m2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m2Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel88)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        MediumLockerPage.add(m2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 160, 220));

        m3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel89.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel89.setText("3");

        javax.swing.GroupLayout m3Layout = new javax.swing.GroupLayout(m3);
        m3.setLayout(m3Layout);
        m3Layout.setHorizontalGroup(
            m3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, m3Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel89)
                .addGap(53, 53, 53))
        );
        m3Layout.setVerticalGroup(
            m3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, m3Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel89)
                .addGap(67, 67, 67))
        );

        MediumLockerPage.add(m3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, 160, 220));

        m4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel90.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel90.setText("4");

        javax.swing.GroupLayout m4Layout = new javax.swing.GroupLayout(m4);
        m4.setLayout(m4Layout);
        m4Layout.setHorizontalGroup(
            m4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m4Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel90)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        m4Layout.setVerticalGroup(
            m4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m4Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel90)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        MediumLockerPage.add(m4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, 160, 220));

        m5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel91.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel91.setText("5");

        javax.swing.GroupLayout m5Layout = new javax.swing.GroupLayout(m5);
        m5.setLayout(m5Layout);
        m5Layout.setHorizontalGroup(
            m5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m5Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel91)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        m5Layout.setVerticalGroup(
            m5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m5Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel91)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        MediumLockerPage.add(m5, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 270, 160, 220));

        m6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel92.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel92.setText("6");

        javax.swing.GroupLayout m6Layout = new javax.swing.GroupLayout(m6);
        m6.setLayout(m6Layout);
        m6Layout.setHorizontalGroup(
            m6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m6Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel92)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        m6Layout.setVerticalGroup(
            m6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m6Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel92)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        MediumLockerPage.add(m6, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 270, 160, 220));

        m7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel93.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel93.setText("7");

        javax.swing.GroupLayout m7Layout = new javax.swing.GroupLayout(m7);
        m7.setLayout(m7Layout);
        m7Layout.setHorizontalGroup(
            m7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m7Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel93)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        m7Layout.setVerticalGroup(
            m7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m7Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel93)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        MediumLockerPage.add(m7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 270, 160, 220));

        m8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel94.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel94.setText("8");

        javax.swing.GroupLayout m8Layout = new javax.swing.GroupLayout(m8);
        m8.setLayout(m8Layout);
        m8Layout.setHorizontalGroup(
            m8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m8Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel94)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        m8Layout.setVerticalGroup(
            m8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m8Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel94)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        MediumLockerPage.add(m8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 270, 160, 220));

        m9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel95.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel95.setText("9");

        javax.swing.GroupLayout m9Layout = new javax.swing.GroupLayout(m9);
        m9.setLayout(m9Layout);
        m9Layout.setHorizontalGroup(
            m9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m9Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel95)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        m9Layout.setVerticalGroup(
            m9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, m9Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jLabel95)
                .addGap(75, 75, 75))
        );

        MediumLockerPage.add(m9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 270, 160, 220));

        m10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel96.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel96.setText("10");

        javax.swing.GroupLayout m10Layout = new javax.swing.GroupLayout(m10);
        m10.setLayout(m10Layout);
        m10Layout.setHorizontalGroup(
            m10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, m10Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel96)
                .addGap(53, 53, 53))
        );
        m10Layout.setVerticalGroup(
            m10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m10Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel96)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        MediumLockerPage.add(m10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1580, 270, 160, 220));

        m11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel99.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel99.setText("11");

        javax.swing.GroupLayout m11Layout = new javax.swing.GroupLayout(m11);
        m11.setLayout(m11Layout);
        m11Layout.setHorizontalGroup(
            m11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m11Layout.createSequentialGroup()
                .addGap(0, 52, Short.MAX_VALUE)
                .addComponent(jLabel99)
                .addGap(0, 52, Short.MAX_VALUE))
        );
        m11Layout.setVerticalGroup(
            m11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m11Layout.createSequentialGroup()
                .addGap(0, 79, Short.MAX_VALUE)
                .addComponent(jLabel99)
                .addGap(0, 80, Short.MAX_VALUE))
        );

        MediumLockerPage.add(m11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, 160, 220));

        m12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel103.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel103.setText("12");

        javax.swing.GroupLayout m12Layout = new javax.swing.GroupLayout(m12);
        m12.setLayout(m12Layout);
        m12Layout.setHorizontalGroup(
            m12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, m12Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel103)
                .addGap(59, 59, 59))
        );
        m12Layout.setVerticalGroup(
            m12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m12Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel103)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        MediumLockerPage.add(m12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 490, 160, 220));

        m13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel98.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel98.setText("13");

        javax.swing.GroupLayout m13Layout = new javax.swing.GroupLayout(m13);
        m13.setLayout(m13Layout);
        m13Layout.setHorizontalGroup(
            m13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m13Layout.createSequentialGroup()
                .addGap(0, 52, Short.MAX_VALUE)
                .addComponent(jLabel98)
                .addGap(0, 52, Short.MAX_VALUE))
        );
        m13Layout.setVerticalGroup(
            m13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m13Layout.createSequentialGroup()
                .addGap(0, 79, Short.MAX_VALUE)
                .addComponent(jLabel98)
                .addGap(0, 80, Short.MAX_VALUE))
        );

        MediumLockerPage.add(m13, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 490, 160, 220));

        m14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel97.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel97.setText("14");

        javax.swing.GroupLayout m14Layout = new javax.swing.GroupLayout(m14);
        m14.setLayout(m14Layout);
        m14Layout.setHorizontalGroup(
            m14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m14Layout.createSequentialGroup()
                .addGap(0, 52, Short.MAX_VALUE)
                .addComponent(jLabel97)
                .addGap(0, 52, Short.MAX_VALUE))
        );
        m14Layout.setVerticalGroup(
            m14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m14Layout.createSequentialGroup()
                .addGap(0, 79, Short.MAX_VALUE)
                .addComponent(jLabel97)
                .addGap(0, 80, Short.MAX_VALUE))
        );

        MediumLockerPage.add(m14, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 490, 160, 220));

        m15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel101.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel101.setText("15");

        javax.swing.GroupLayout m15Layout = new javax.swing.GroupLayout(m15);
        m15.setLayout(m15Layout);
        m15Layout.setHorizontalGroup(
            m15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m15Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel101)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        m15Layout.setVerticalGroup(
            m15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m15Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel101)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        MediumLockerPage.add(m15, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 490, 160, 220));

        m16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel106.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel106.setText("16");

        javax.swing.GroupLayout m16Layout = new javax.swing.GroupLayout(m16);
        m16.setLayout(m16Layout);
        m16Layout.setHorizontalGroup(
            m16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m16Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel106)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        m16Layout.setVerticalGroup(
            m16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m16Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel106)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        MediumLockerPage.add(m16, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 490, 160, 220));

        m17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel104.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel104.setText("17");

        javax.swing.GroupLayout m17Layout = new javax.swing.GroupLayout(m17);
        m17.setLayout(m17Layout);
        m17Layout.setHorizontalGroup(
            m17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m17Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel104)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        m17Layout.setVerticalGroup(
            m17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m17Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel104)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        MediumLockerPage.add(m17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 490, 160, 220));

        m18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel105.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel105.setText("18");

        javax.swing.GroupLayout m18Layout = new javax.swing.GroupLayout(m18);
        m18.setLayout(m18Layout);
        m18Layout.setHorizontalGroup(
            m18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m18Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel105)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        m18Layout.setVerticalGroup(
            m18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m18Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel105)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        MediumLockerPage.add(m18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 490, 160, 220));

        m19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel102.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel102.setText("19");

        javax.swing.GroupLayout m19Layout = new javax.swing.GroupLayout(m19);
        m19.setLayout(m19Layout);
        m19Layout.setHorizontalGroup(
            m19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m19Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel102)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        m19Layout.setVerticalGroup(
            m19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m19Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel102)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        MediumLockerPage.add(m19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 490, 160, 220));

        m20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel100.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel100.setText("20");

        javax.swing.GroupLayout m20Layout = new javax.swing.GroupLayout(m20);
        m20.setLayout(m20Layout);
        m20Layout.setHorizontalGroup(
            m20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, m20Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jLabel100)
                .addGap(52, 52, 52))
        );
        m20Layout.setVerticalGroup(
            m20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, m20Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel100)
                .addGap(69, 69, 69))
        );

        MediumLockerPage.add(m20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1580, 490, 160, 220));

        m21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel135.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel135.setText("21");

        javax.swing.GroupLayout m21Layout = new javax.swing.GroupLayout(m21);
        m21.setLayout(m21Layout);
        m21Layout.setHorizontalGroup(
            m21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m21Layout.createSequentialGroup()
                .addGap(0, 52, Short.MAX_VALUE)
                .addComponent(jLabel135)
                .addGap(0, 52, Short.MAX_VALUE))
        );
        m21Layout.setVerticalGroup(
            m21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m21Layout.createSequentialGroup()
                .addGap(0, 79, Short.MAX_VALUE)
                .addComponent(jLabel135)
                .addGap(0, 80, Short.MAX_VALUE))
        );

        MediumLockerPage.add(m21, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 710, 160, 220));

        m22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel131.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel131.setText("22");

        javax.swing.GroupLayout m22Layout = new javax.swing.GroupLayout(m22);
        m22.setLayout(m22Layout);
        m22Layout.setHorizontalGroup(
            m22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m22Layout.createSequentialGroup()
                .addGap(0, 52, Short.MAX_VALUE)
                .addComponent(jLabel131)
                .addGap(0, 52, Short.MAX_VALUE))
        );
        m22Layout.setVerticalGroup(
            m22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m22Layout.createSequentialGroup()
                .addGap(0, 79, Short.MAX_VALUE)
                .addComponent(jLabel131)
                .addGap(0, 80, Short.MAX_VALUE))
        );

        MediumLockerPage.add(m22, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 710, 160, 220));

        m23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel136.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel136.setText("23");

        javax.swing.GroupLayout m23Layout = new javax.swing.GroupLayout(m23);
        m23.setLayout(m23Layout);
        m23Layout.setHorizontalGroup(
            m23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m23Layout.createSequentialGroup()
                .addGap(0, 52, Short.MAX_VALUE)
                .addComponent(jLabel136)
                .addGap(0, 52, Short.MAX_VALUE))
        );
        m23Layout.setVerticalGroup(
            m23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m23Layout.createSequentialGroup()
                .addGap(0, 79, Short.MAX_VALUE)
                .addComponent(jLabel136)
                .addGap(0, 80, Short.MAX_VALUE))
        );

        MediumLockerPage.add(m23, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 710, 160, 220));

        m24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel137.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel137.setText("24");

        javax.swing.GroupLayout m24Layout = new javax.swing.GroupLayout(m24);
        m24.setLayout(m24Layout);
        m24Layout.setHorizontalGroup(
            m24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m24Layout.createSequentialGroup()
                .addGap(0, 52, Short.MAX_VALUE)
                .addComponent(jLabel137)
                .addGap(0, 52, Short.MAX_VALUE))
        );
        m24Layout.setVerticalGroup(
            m24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m24Layout.createSequentialGroup()
                .addGap(0, 79, Short.MAX_VALUE)
                .addComponent(jLabel137)
                .addGap(0, 80, Short.MAX_VALUE))
        );

        MediumLockerPage.add(m24, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 710, 160, 220));

        m25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel132.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel132.setText("25");

        javax.swing.GroupLayout m25Layout = new javax.swing.GroupLayout(m25);
        m25.setLayout(m25Layout);
        m25Layout.setHorizontalGroup(
            m25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m25Layout.createSequentialGroup()
                .addGap(0, 52, Short.MAX_VALUE)
                .addComponent(jLabel132)
                .addGap(0, 52, Short.MAX_VALUE))
        );
        m25Layout.setVerticalGroup(
            m25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m25Layout.createSequentialGroup()
                .addGap(0, 79, Short.MAX_VALUE)
                .addComponent(jLabel132)
                .addGap(0, 80, Short.MAX_VALUE))
        );

        MediumLockerPage.add(m25, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 710, 160, 220));

        m26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel130.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel130.setText("26");

        javax.swing.GroupLayout m26Layout = new javax.swing.GroupLayout(m26);
        m26.setLayout(m26Layout);
        m26Layout.setHorizontalGroup(
            m26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m26Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel130)
                .addGap(0, 52, Short.MAX_VALUE))
        );
        m26Layout.setVerticalGroup(
            m26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m26Layout.createSequentialGroup()
                .addGap(0, 79, Short.MAX_VALUE)
                .addComponent(jLabel130)
                .addGap(0, 80, Short.MAX_VALUE))
        );

        MediumLockerPage.add(m26, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 710, 160, 220));

        m27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel129.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel129.setText("27");

        javax.swing.GroupLayout m27Layout = new javax.swing.GroupLayout(m27);
        m27.setLayout(m27Layout);
        m27Layout.setHorizontalGroup(
            m27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m27Layout.createSequentialGroup()
                .addGap(0, 52, Short.MAX_VALUE)
                .addComponent(jLabel129)
                .addGap(0, 52, Short.MAX_VALUE))
        );
        m27Layout.setVerticalGroup(
            m27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m27Layout.createSequentialGroup()
                .addGap(0, 79, Short.MAX_VALUE)
                .addComponent(jLabel129)
                .addGap(0, 80, Short.MAX_VALUE))
        );

        MediumLockerPage.add(m27, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 710, 160, 220));

        m28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel133.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel133.setText("28");

        javax.swing.GroupLayout m28Layout = new javax.swing.GroupLayout(m28);
        m28.setLayout(m28Layout);
        m28Layout.setHorizontalGroup(
            m28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m28Layout.createSequentialGroup()
                .addGap(0, 52, Short.MAX_VALUE)
                .addComponent(jLabel133)
                .addGap(0, 52, Short.MAX_VALUE))
        );
        m28Layout.setVerticalGroup(
            m28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m28Layout.createSequentialGroup()
                .addGap(0, 79, Short.MAX_VALUE)
                .addComponent(jLabel133)
                .addGap(0, 80, Short.MAX_VALUE))
        );

        MediumLockerPage.add(m28, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 710, 160, 220));

        m29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel134.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel134.setText("29");

        javax.swing.GroupLayout m29Layout = new javax.swing.GroupLayout(m29);
        m29.setLayout(m29Layout);
        m29Layout.setHorizontalGroup(
            m29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m29Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel134)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        m29Layout.setVerticalGroup(
            m29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m29Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel134)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        MediumLockerPage.add(m29, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 710, 160, 220));

        m30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel110.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel110.setText("30");

        javax.swing.GroupLayout m30Layout = new javax.swing.GroupLayout(m30);
        m30.setLayout(m30Layout);
        m30Layout.setHorizontalGroup(
            m30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, m30Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel110)
                .addGap(64, 64, 64))
        );
        m30Layout.setVerticalGroup(
            m30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m30Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel110)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        MediumLockerPage.add(m30, new org.netbeans.lib.awtextra.AbsoluteConstraints(1580, 710, 160, 220));

        AccountLabel4.setForeground(new java.awt.Color(255, 255, 255));
        AccountLabel4.setText(" ▼");
        AccountLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AccountLabel4MouseClicked(evt);
            }
        });
        MediumLockerPage.add(AccountLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1810, 40, 70, 60));

        mediumLockerPage1.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        mediumLockerPage1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mediumLockerPage1.setText("1");
        mediumLockerPage1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mediumLockerPage1MouseClicked(evt);
            }
        });
        MediumLockerPage.add(mediumLockerPage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 959, 50, 70));

        mediumLockerPage2.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        mediumLockerPage2.setForeground(new java.awt.Color(49, 112, 143));
        mediumLockerPage2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mediumLockerPage2.setText("2");
        mediumLockerPage2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mediumLockerPage2MouseClicked(evt);
            }
        });
        MediumLockerPage.add(mediumLockerPage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 959, 50, 70));

        mediumLockerPage3.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        mediumLockerPage3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mediumLockerPage3.setText("3");
        mediumLockerPage3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mediumLockerPage3MouseClicked(evt);
            }
        });
        MediumLockerPage.add(mediumLockerPage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 960, 50, 70));

        jLabel139.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Locker.png"))); // NOI18N
        MediumLockerPage.add(jLabel139, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        HomeMediumLocker.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        HomeMediumLocker.setText("Home");
        HomeMediumLocker.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMediumLockerMouseClicked(evt);
            }
        });
        MediumLockerPage.add(HomeMediumLocker, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        jLabel141.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel141.setText(">");
        MediumLockerPage.add(jLabel141, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        jLabel142.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel142.setForeground(new java.awt.Color(49, 112, 143));
        jLabel142.setText("Medium Locker");
        MediumLockerPage.add(jLabel142, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, 40));
        MediumLockerPage.add(mediumLockerBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel143.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel143.setText("3");
        MediumLockerPage.add(jLabel143, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 960, 50, 70));

        containerPanel.add(MediumLockerPage, "card6");

        LargeLockerPage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        L1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel25.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel25.setText("1");

        javax.swing.GroupLayout L1Layout = new javax.swing.GroupLayout(L1);
        L1.setLayout(L1Layout);
        L1Layout.setHorizontalGroup(
            L1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, L1Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addGap(55, 55, 55))
        );
        L1Layout.setVerticalGroup(
            L1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(L1Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel25)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        LargeLockerPage.add(L1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 140, 320));

        L2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel26.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel26.setText("2");

        javax.swing.GroupLayout L2Layout = new javax.swing.GroupLayout(L2);
        L2.setLayout(L2Layout);
        L2Layout.setHorizontalGroup(
            L2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, L2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel26)
                .addGap(48, 48, 48))
        );
        L2Layout.setVerticalGroup(
            L2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, L2Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel26)
                .addGap(121, 121, 121))
        );

        LargeLockerPage.add(L2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 140, 320));

        L3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel27.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel27.setText("3");

        javax.swing.GroupLayout L3Layout = new javax.swing.GroupLayout(L3);
        L3.setLayout(L3Layout);
        L3Layout.setHorizontalGroup(
            L3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(L3Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(jLabel27)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        L3Layout.setVerticalGroup(
            L3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(L3Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel27)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        LargeLockerPage.add(L3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, 140, 320));

        L4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel86.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel86.setText("4");

        javax.swing.GroupLayout L4Layout = new javax.swing.GroupLayout(L4);
        L4.setLayout(L4Layout);
        L4Layout.setHorizontalGroup(
            L4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(L4Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel86)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        L4Layout.setVerticalGroup(
            L4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(L4Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel86)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        LargeLockerPage.add(L4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 280, 140, 320));

        L5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel108.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel108.setText("5");

        javax.swing.GroupLayout L5Layout = new javax.swing.GroupLayout(L5);
        L5.setLayout(L5Layout);
        L5Layout.setHorizontalGroup(
            L5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(L5Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel108)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        L5Layout.setVerticalGroup(
            L5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(L5Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel108)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        LargeLockerPage.add(L5, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 280, 140, 320));

        L6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel111.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel111.setText("6");

        javax.swing.GroupLayout L6Layout = new javax.swing.GroupLayout(L6);
        L6.setLayout(L6Layout);
        L6Layout.setHorizontalGroup(
            L6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(L6Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel111)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        L6Layout.setVerticalGroup(
            L6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(L6Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel111)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        LargeLockerPage.add(L6, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 280, 140, 320));

        L7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel109.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel109.setText("7");

        javax.swing.GroupLayout L7Layout = new javax.swing.GroupLayout(L7);
        L7.setLayout(L7Layout);
        L7Layout.setHorizontalGroup(
            L7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(L7Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel109)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        L7Layout.setVerticalGroup(
            L7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(L7Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel109)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        LargeLockerPage.add(L7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 280, 140, 320));

        L8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel107.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel107.setText("8");

        javax.swing.GroupLayout L8Layout = new javax.swing.GroupLayout(L8);
        L8.setLayout(L8Layout);
        L8Layout.setHorizontalGroup(
            L8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(L8Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel107)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        L8Layout.setVerticalGroup(
            L8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(L8Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel107)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        LargeLockerPage.add(L8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 280, 140, 320));

        L9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel112.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel112.setText("9");

        javax.swing.GroupLayout L9Layout = new javax.swing.GroupLayout(L9);
        L9.setLayout(L9Layout);
        L9Layout.setHorizontalGroup(
            L9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, L9Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel112)
                .addGap(46, 46, 46))
        );
        L9Layout.setVerticalGroup(
            L9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, L9Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel112)
                .addGap(120, 120, 120))
        );

        LargeLockerPage.add(L9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 280, 140, 320));

        L10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel113.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel113.setText("10");

        javax.swing.GroupLayout L10Layout = new javax.swing.GroupLayout(L10);
        L10.setLayout(L10Layout);
        L10Layout.setHorizontalGroup(
            L10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(L10Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel113)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        L10Layout.setVerticalGroup(
            L10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, L10Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel113)
                .addGap(128, 128, 128))
        );

        LargeLockerPage.add(L10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1520, 280, 140, 320));

        L11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel115.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel115.setText("11");

        javax.swing.GroupLayout L11Layout = new javax.swing.GroupLayout(L11);
        L11.setLayout(L11Layout);
        L11Layout.setHorizontalGroup(
            L11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, L11Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel115)
                .addGap(50, 50, 50))
        );
        L11Layout.setVerticalGroup(
            L11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(L11Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel115)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        LargeLockerPage.add(L11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 600, 140, 320));

        L12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel122.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel122.setText("12");

        javax.swing.GroupLayout L12Layout = new javax.swing.GroupLayout(L12);
        L12.setLayout(L12Layout);
        L12Layout.setHorizontalGroup(
            L12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(L12Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel122)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        L12Layout.setVerticalGroup(
            L12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(L12Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel122)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        LargeLockerPage.add(L12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 600, 140, 320));

        L13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel116.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel116.setText("13");

        javax.swing.GroupLayout L13Layout = new javax.swing.GroupLayout(L13);
        L13.setLayout(L13Layout);
        L13Layout.setHorizontalGroup(
            L13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(L13Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel116)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        L13Layout.setVerticalGroup(
            L13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(L13Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel116)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        LargeLockerPage.add(L13, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 600, 140, 320));

        L14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel117.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel117.setText("14");

        javax.swing.GroupLayout L14Layout = new javax.swing.GroupLayout(L14);
        L14.setLayout(L14Layout);
        L14Layout.setHorizontalGroup(
            L14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(L14Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel117)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        L14Layout.setVerticalGroup(
            L14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(L14Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel117)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        LargeLockerPage.add(L14, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 600, 140, 320));

        L15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel120.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel120.setText("15");

        javax.swing.GroupLayout L15Layout = new javax.swing.GroupLayout(L15);
        L15.setLayout(L15Layout);
        L15Layout.setHorizontalGroup(
            L15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(L15Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel120)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        L15Layout.setVerticalGroup(
            L15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(L15Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel120)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        LargeLockerPage.add(L15, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 600, 140, 320));

        L16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel119.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel119.setText("16");

        javax.swing.GroupLayout L16Layout = new javax.swing.GroupLayout(L16);
        L16.setLayout(L16Layout);
        L16Layout.setHorizontalGroup(
            L16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(L16Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel119)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        L16Layout.setVerticalGroup(
            L16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(L16Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel119)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        LargeLockerPage.add(L16, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 600, 140, 320));

        L17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel114.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel114.setText("17");

        javax.swing.GroupLayout L17Layout = new javax.swing.GroupLayout(L17);
        L17.setLayout(L17Layout);
        L17Layout.setHorizontalGroup(
            L17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(L17Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel114)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        L17Layout.setVerticalGroup(
            L17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(L17Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel114)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        LargeLockerPage.add(L17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 600, 140, 320));

        L18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel123.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel123.setText("18");

        javax.swing.GroupLayout L18Layout = new javax.swing.GroupLayout(L18);
        L18.setLayout(L18Layout);
        L18Layout.setHorizontalGroup(
            L18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, L18Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel123)
                .addGap(45, 45, 45))
        );
        L18Layout.setVerticalGroup(
            L18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(L18Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel123)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        LargeLockerPage.add(L18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 600, 140, 320));

        L19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel121.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel121.setText("19");

        javax.swing.GroupLayout L19Layout = new javax.swing.GroupLayout(L19);
        L19.setLayout(L19Layout);
        L19Layout.setHorizontalGroup(
            L19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(L19Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel121)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        L19Layout.setVerticalGroup(
            L19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(L19Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel121)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        LargeLockerPage.add(L19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 600, 140, 320));

        L20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel118.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel118.setText("20");

        javax.swing.GroupLayout L20Layout = new javax.swing.GroupLayout(L20);
        L20.setLayout(L20Layout);
        L20Layout.setHorizontalGroup(
            L20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(L20Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel118)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        L20Layout.setVerticalGroup(
            L20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(L20Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel118)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        LargeLockerPage.add(L20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1520, 600, 140, 320));

        AccountLabel5.setForeground(new java.awt.Color(255, 255, 255));
        AccountLabel5.setText(" ▼");
        AccountLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AccountLabel5MouseClicked(evt);
            }
        });
        LargeLockerPage.add(AccountLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1810, 40, 70, 60));

        largeLockerPage1.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        largeLockerPage1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        largeLockerPage1.setText("1");
        largeLockerPage1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                largeLockerPage1MouseClicked(evt);
            }
        });
        LargeLockerPage.add(largeLockerPage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 959, 50, 70));

        largeLockerPage2.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        largeLockerPage2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        largeLockerPage2.setText("2");
        largeLockerPage2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                largeLockerPage2MouseClicked(evt);
            }
        });
        LargeLockerPage.add(largeLockerPage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 959, 50, 70));

        largeLockerPage3.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        largeLockerPage3.setForeground(new java.awt.Color(49, 112, 143));
        largeLockerPage3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        largeLockerPage3.setText("3");
        largeLockerPage3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                largeLockerPage3MouseClicked(evt);
            }
        });
        LargeLockerPage.add(largeLockerPage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 960, 50, 70));

        jLabel125.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Locker.png"))); // NOI18N
        LargeLockerPage.add(jLabel125, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        HomeLargeLocker.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        HomeLargeLocker.setText("Home");
        HomeLargeLocker.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeLargeLockerMouseClicked(evt);
            }
        });
        LargeLockerPage.add(HomeLargeLocker, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        jLabel127.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel127.setText(">");
        LargeLockerPage.add(jLabel127, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        jLabel128.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel128.setForeground(new java.awt.Color(49, 112, 143));
        jLabel128.setText("Large Locker");
        LargeLockerPage.add(jLabel128, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, 40));
        LargeLockerPage.add(largeLockerBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        containerPanel.add(LargeLockerPage, "card6");

        ConfirmationPanel.setPreferredSize(new java.awt.Dimension(1920, 1080));
        ConfirmationPanel.setRequestFocusEnabled(false);
        ConfirmationPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PaymentDeadline.setBackground(new java.awt.Color(255, 0, 0));
        PaymentDeadline.setFont(new java.awt.Font("Segoe UI Variable", 1, 20)); // NOI18N
        PaymentDeadline.setForeground(new java.awt.Color(255, 255, 255));
        PaymentDeadline.setText("Payment Deadline: ");
        PaymentDeadline.setMaximumSize(new java.awt.Dimension(198, 27));
        PaymentDeadline.setMinimumSize(new java.awt.Dimension(198, 27));
        PaymentDeadline.setOpaque(true);
        PaymentDeadline.setPreferredSize(new java.awt.Dimension(198, 27));
        ConfirmationPanel.add(PaymentDeadline, new org.netbeans.lib.awtextra.AbsoluteConstraints(702, 830, 550, -1));

        PaymentDeadline1.setBackground(new java.awt.Color(255, 0, 0));
        PaymentDeadline1.setFont(new java.awt.Font("Segoe UI Variable", 1, 20)); // NOI18N
        PaymentDeadline1.setForeground(new java.awt.Color(255, 255, 255));
        PaymentDeadline1.setMaximumSize(new java.awt.Dimension(198, 27));
        PaymentDeadline1.setMinimumSize(new java.awt.Dimension(198, 27));
        PaymentDeadline1.setOpaque(true);
        PaymentDeadline1.setPreferredSize(new java.awt.Dimension(198, 27));
        ConfirmationPanel.add(PaymentDeadline1, new org.netbeans.lib.awtextra.AbsoluteConstraints(652, 830, 550, -1));

        LockerNumberSize.setFont(new java.awt.Font("Segoe UI Variable", 0, 20)); // NOI18N
        LockerNumberSize.setForeground(new java.awt.Color(0, 0, 0));
        LockerNumberSize.setText("Locker Number [ ] (Small,Medium, Large)");
        ConfirmationPanel.add(LockerNumberSize, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 460, -1, -1));

        LockerPrice.setFont(new java.awt.Font("Segoe UI Variable", 0, 20)); // NOI18N
        LockerPrice.setForeground(new java.awt.Color(0, 0, 0));
        LockerPrice.setText("Locker Price: []");
        ConfirmationPanel.add(LockerPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 500, -1, -1));

        ConfimationBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ConfimationImg.png"))); // NOI18N
        ConfimationBackground.setMaximumSize(new java.awt.Dimension(1920, 1080));
        ConfimationBackground.setMinimumSize(new java.awt.Dimension(1920, 1080));
        ConfimationBackground.setPreferredSize(new java.awt.Dimension(1920, 1080));
        ConfirmationPanel.add(ConfimationBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1910, -1));

        containerPanel.add(ConfirmationPanel, "card7");

        ReservationPanel.setBackground(new java.awt.Color(255, 255, 255));
        ReservationPanel.setMaximumSize(new java.awt.Dimension(1900, 1080));
        ReservationPanel.setPreferredSize(new java.awt.Dimension(1920, 1080));
        ReservationPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        ReservationPanel.add(ReserveIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        HomeLargeLocker1.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        HomeLargeLocker1.setText("Home");
        HomeLargeLocker1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeLargeLocker1MouseClicked(evt);
            }
        });
        ReservationPanel.add(HomeLargeLocker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        jLabel138.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel138.setText(">");
        ReservationPanel.add(jLabel138, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        LockerName.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        LockerName.setForeground(new java.awt.Color(49, 112, 143));
        LockerName.setText("Reservation Page");
        ReservationPanel.add(LockerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 190, -1, 40));

        jLabel165.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel165.setForeground(new java.awt.Color(49, 112, 143));
        jLabel165.setText("Reservation Page");
        ReservationPanel.add(jLabel165, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, 40));

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel5.setText("Student ID");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 25, -1, -1));

        StudentIDTF.setText(" ");
        StudentIDTF.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(StudentIDTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 75, 600, 50));

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel6.setText("First Name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 143, -1, -1));

        FirstNameTF.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(FirstNameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 193, 600, 50));

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel7.setText("Last Name");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 261, -1, -1));

        LastNameTF.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(LastNameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 311, 600, 50));

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel8.setText("Start Date");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 379, -1, -1));

        StartDateTF.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(StartDateTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 429, 600, 50));

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel9.setText("End Date");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 497, -1, -1));

        EndDateTF.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        EndDateTF.setEnabled(false);
        EndDateTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EndDateTFActionPerformed(evt);
            }
        });
        jPanel1.add(EndDateTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 547, 600, 50));

        ReserveButton.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        ReserveButton.setText("Reserve");
        jPanel1.add(ReserveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 630, 314, 48));

        ReservationPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 920, 720));

        AccountLabel6.setForeground(new java.awt.Color(255, 255, 255));
        AccountLabel6.setText(" ▼");
        AccountLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AccountLabel6MouseClicked(evt);
            }
        });
        ReservationPanel.add(AccountLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1810, 40, 70, 60));
        ReservationPanel.add(reservePanelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        containerPanel.add(ReservationPanel, "card8");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1920, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ViewLockerPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewLockerPanelMouseClicked
        containerPanel.removeAll();
        containerPanel.add(SmallLockerPage);
        containerPanel.repaint();
        containerPanel.revalidate();
    }//GEN-LAST:event_ViewLockerPanelMouseClicked

    private void mediumLockerPage1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mediumLockerPage1MouseClicked
        Page(1);
    }//GEN-LAST:event_mediumLockerPage1MouseClicked

    private void mediumLockerPage2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mediumLockerPage2MouseClicked
        Page(2);
    }//GEN-LAST:event_mediumLockerPage2MouseClicked

    private void mediumLockerPage3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mediumLockerPage3MouseClicked
        Page(3);
    }//GEN-LAST:event_mediumLockerPage3MouseClicked

    private void HomeMediumLockerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMediumLockerMouseClicked
        Home();
    }//GEN-LAST:event_HomeMediumLockerMouseClicked

    private void largeLockerPage1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_largeLockerPage1MouseClicked
        Page(1);
    }//GEN-LAST:event_largeLockerPage1MouseClicked

    private void largeLockerPage2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_largeLockerPage2MouseClicked
        Page(2);
    }//GEN-LAST:event_largeLockerPage2MouseClicked

    private void largeLockerPage3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_largeLockerPage3MouseClicked
        Page(3);
    }//GEN-LAST:event_largeLockerPage3MouseClicked

    private void HomeLargeLockerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeLargeLockerMouseClicked
        Home();
    }//GEN-LAST:event_HomeLargeLockerMouseClicked

    private void HomeSmallLockerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeSmallLockerMouseClicked
        Home();
    }//GEN-LAST:event_HomeSmallLockerMouseClicked

    private void smallLockerPage1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_smallLockerPage1MouseClicked
        Page(1);
    }//GEN-LAST:event_smallLockerPage1MouseClicked

    private void smallLockerPage2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_smallLockerPage2MouseClicked
        Page(2);
    }//GEN-LAST:event_smallLockerPage2MouseClicked

    private void smallLockerPage3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_smallLockerPage3MouseClicked
        Page(3);
    }//GEN-LAST:event_smallLockerPage3MouseClicked

    private void HomeLargeLocker1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeLargeLocker1MouseClicked
        Home();
    }//GEN-LAST:event_HomeLargeLocker1MouseClicked

    private void EndDateTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndDateTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EndDateTFActionPerformed

    private void AccountLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccountLabelMouseClicked
        jPopupMenu1.show(AccountLabel, 500, 30);
    }//GEN-LAST:event_AccountLabelMouseClicked

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        LoginPage returnToLoginPage = new LoginPage();
        returnToLoginPage.setVisible(true);
        dispose();
    }//GEN-LAST:event_LogoutActionPerformed

    private void AccountSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccountSettingsActionPerformed
        containerPanel.removeAll();
        containerPanel.add(StudentProfilePanel);
        containerPanel.repaint();
        containerPanel.revalidate();
    }//GEN-LAST:event_AccountSettingsActionPerformed

    private void EditFirstNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditFirstNameMouseClicked
        ConfirmButton.setVisible(true);
        StudentProfFirstName.setEnabled(true);
    }//GEN-LAST:event_EditFirstNameMouseClicked

    private void EditLastNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditLastNameMouseClicked
        ConfirmButton.setVisible(true);
        StudentProfLastName.setEnabled(true);
    }//GEN-LAST:event_EditLastNameMouseClicked

    private void EditStudentIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditStudentIDMouseClicked
        ConfirmButton.setVisible(true);
        StudentProfStudentID.setEnabled(true);
    }//GEN-LAST:event_EditStudentIDMouseClicked

    private void EditCourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditCourseMouseClicked
        ConfirmButton.setVisible(true);
        StudentProfCourse.setEnabled(true);
    }//GEN-LAST:event_EditCourseMouseClicked

    private void EditEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditEmailMouseClicked
        ConfirmButton.setVisible(true);
        StudentProfEmail.setEnabled(true);
    }//GEN-LAST:event_EditEmailMouseClicked

    private void EditMobileNumberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditMobileNumberMouseClicked
        ConfirmButton.setVisible(true);
        StudentProfPhoneNum.setEnabled(true);
    }//GEN-LAST:event_EditMobileNumberMouseClicked

    private void ConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmButtonActionPerformed
        ConfirmButton.setVisible(false);
        StudentProfFirstName.setEnabled(false);
        StudentProfLastName.setEnabled(false);
        StudentProfStudentID.setEnabled(false);
        StudentProfCourse.setEnabled(false);
        StudentProfEmail.setEnabled(false);
        StudentProfPhoneNum.setEnabled(false);
        
        int notFound = 0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:MySQL://localhost:3306/locker_reservation";
            String user = "root";
            String pass = "";
            
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            
            LoginPage studentId = new LoginPage();
            String ID = studentId.getLoggedInStudentId();
            System.out.print(ID);
            
            if("".equals(ID)){
                JOptionPane.showMessageDialog(new JFrame(), "ID is required", "Dialog", JOptionPane.ERROR_MESSAGE);
            }
            else{
                String sql = "SELECT * FROM student WHERE student_id = '" + ID + "'";;
                ResultSet rs = st.executeQuery(sql);
                while(rs.next()){
                    notFound = 1;
                    String first_name = StudentProfFirstName.getText();
                    String last_name = StudentProfLastName.getText();
                    String student_id = StudentProfStudentID.getText();
                    String course = StudentProfCourse.getText();
                    String email = StudentProfEmail.getText();
                    String phone_num = StudentProfPhoneNum.getText();
                    
                    String sql2 = "UPDATE student SET first_name='" + first_name + "', last_name='" + last_name + "', student_id='" + student_id + "', program='" + course + "', email='" + email + "', phone_num='" + phone_num + "' WHERE student_id='" + ID + "'";
                    st.executeUpdate(sql2);
                    
                    showMessageDialog(new JFrame(), "Successfully updated.", "Dialog" , JOptionPane.INFORMATION_MESSAGE);
                }
                if(notFound==0){
                    JOptionPane.showMessageDialog(new JFrame(), "Error", "Dialog", JOptionPane.ERROR_MESSAGE);
                }
            }
            con.close();
        }catch(Exception e){
            System.out.println("Error "+ e.getMessage());
        }
    }//GEN-LAST:event_ConfirmButtonActionPerformed

    private void AccountLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccountLabel2MouseClicked
        jPopupMenu1.show(AccountLabel2, 500, 30);
    }//GEN-LAST:event_AccountLabel2MouseClicked

    private void AccountLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccountLabel3MouseClicked
        jPopupMenu1.show(AccountLabel3, 500, 30);
    }//GEN-LAST:event_AccountLabel3MouseClicked

    private void AccountLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccountLabel4MouseClicked
        jPopupMenu1.show(AccountLabel4, 500, 30);
    }//GEN-LAST:event_AccountLabel4MouseClicked

    private void AccountLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccountLabel5MouseClicked
        jPopupMenu1.show(AccountLabel5, 500, 30);
    }//GEN-LAST:event_AccountLabel5MouseClicked

    private void AccountLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccountLabel6MouseClicked
        jPopupMenu1.show(AccountLabel6, 500, 30);
    }//GEN-LAST:event_AccountLabel6MouseClicked

    private void BackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseClicked
        containerPanel.removeAll();
        containerPanel.add(MainWindowPanel);
        containerPanel.repaint();
        containerPanel.revalidate();
    }//GEN-LAST:event_BackButtonMouseClicked

    private void lockerAssignment() {
        lockers.put(1, s1);
        lockers.put(2, s2);
        lockers.put(3, s3);
        lockers.put(4, s4);
        lockers.put(5, s5);
        lockers.put(6, s6);
        lockers.put(7, s7);
        lockers.put(8, s8);
        lockers.put(9, s9);
        lockers.put(10, s10);
        lockers.put(11, s11);
        lockers.put(12, s12);
        lockers.put(13, s13);
        lockers.put(14, s14);
        lockers.put(15, s15);
        lockers.put(16, s16);
        lockers.put(17, s17);
        lockers.put(18, s18);
        lockers.put(19, s19);
        lockers.put(20, s20);
        lockers.put(21, s21);
        lockers.put(22, s22);
        lockers.put(23, s23);
        lockers.put(24, s24);
        lockers.put(25, s25);
        lockers.put(26, s26);
        lockers.put(27, s27);
        lockers.put(28, s28);
        lockers.put(29, s29);
        lockers.put(30, s30);
        lockers.put(31, s31);
        lockers.put(32, s32);
        lockers.put(33, s33);
        lockers.put(34, s34);
        lockers.put(35, s35);
        lockers.put(36, s36);
        lockers.put(37, s37);
        lockers.put(38, s38);
        lockers.put(39, s39);
        lockers.put(40, s40);
        lockers.put(41, s41);
        lockers.put(42, s42);
        lockers.put(43, s43);
        lockers.put(44, s44);
        lockers.put(45, s45);
        lockers.put(46, s46);
        lockers.put(47, s47);
        lockers.put(48, s48);
        lockers.put(49, s49);
        lockers.put(50, s50);
        lockers.put(51, m1);
        lockers.put(52, m2);
        lockers.put(53, m3);
        lockers.put(54, m4);
        lockers.put(55, m5);
        lockers.put(56, m6);
        lockers.put(57, m7);
        lockers.put(58, m8);
        lockers.put(59, m9);
        lockers.put(60, m10);
        lockers.put(61, m11);
        lockers.put(62, m12);
        lockers.put(63, m13);
        lockers.put(64, m14);
        lockers.put(65, m15);
        lockers.put(66, m16);
        lockers.put(67, m17);
        lockers.put(68, m18);
        lockers.put(69, m19);
        lockers.put(70, m20);
        lockers.put(71, m21);
        lockers.put(72, m22);
        lockers.put(73, m23);
        lockers.put(74, m24);
        lockers.put(75, m25);
        lockers.put(76, m26);
        lockers.put(77, m27);
        lockers.put(78, m28);
        lockers.put(79, m29);
        lockers.put(80, m30);
        lockers.put(81, L1);
        lockers.put(82, L2);
        lockers.put(83, L3);
        lockers.put(84, L4);
        lockers.put(85, L5);
        lockers.put(86, L6);
        lockers.put(87, L7);
        lockers.put(88, L8);
        lockers.put(89, L9);
        lockers.put(90, L10);
        lockers.put(91, L11);
        lockers.put(92, L12);
        lockers.put(93, L13);
        lockers.put(94, L14);
        lockers.put(95, L15);
        lockers.put(96, L16);
        lockers.put(97, L17);
        lockers.put(98, L18);
        lockers.put(99, L19);
        lockers.put(100, L20);
    }
    
    private void setIcons() {
        ImageIcon reservebg = new ImageIcon("src\\img\\ReservationPanelBackground.png");
        ImageIcon smalllockerBackground = new ImageIcon("src\\img\\SmallLockerBackground.png");
        ImageIcon mediumlockerBackground = new ImageIcon("src\\img\\MediumLockerBackground.png");
        ImageIcon biglockerBackground = new ImageIcon("src\\img\\LargeLockerBackground.png");
        ImageIcon reserveicon = new ImageIcon("src\\img\\ReserveIcon.png");
        ImageIcon studentProfileBackground = new ImageIcon("src\\img\\StudentProfileBackground.png");
        ImageIcon profileIcon = new ImageIcon("src\\img\\ProfileIcon.jpg");
        
        reservePanelBackground.setIcon(reservebg);
        smallLockerBackground.setIcon(smalllockerBackground);
        mediumLockerBackground.setIcon(mediumlockerBackground);
        largeLockerBackground.setIcon(biglockerBackground);
        ReserveIcon.setIcon(reserveicon);
        StudentProfileBackground.setIcon(studentProfileBackground);
        AccountLabel.setIcon(profileIcon);
        AccountLabel2.setIcon(profileIcon);
        AccountLabel3.setIcon(profileIcon);
        AccountLabel4.setIcon(profileIcon);
        AccountLabel5.setIcon(profileIcon);
        AccountLabel6.setIcon(profileIcon);
    }
    
    private void setAutomaticallyStudentIDTextField(){
        LoginPage studentId = new LoginPage();
        String student_Id = studentId.getLoggedInStudentId();
        StudentIDTF.setText(student_Id);
    }
     
    public void changeButtonColorIfLockerNotAvailable(int locker_id, JPanel panel) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/locker_reservation";
            String user = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();

            String query = "SELECT is_available,is_pending FROM locker WHERE locker_id = '" + locker_id + "'";
            ResultSet rs = st.executeQuery(query);

            if (rs.next()) {
                boolean isAvailable = rs.getBoolean("is_available");
                boolean isPending = rs.getBoolean("is_pending");
                
                if (!isAvailable && isPending) {
                    panel.setBackground(Color.GRAY);
                } else if (isAvailable && !isPending) {
                    panel.setBackground(Color.GREEN);
                } else if (!isAvailable && !isPending){
                    panel.setBackground(Color.RED);
                }
            }

            con.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public void checkAvailableLocker(){
        lockerAssignment();
        for (Map.Entry<Integer, JPanel> entry : lockers.entrySet()) {
        Integer lockerId = entry.getKey();
        JPanel panel = entry.getValue();
        
        changeButtonColorIfLockerNotAvailable(lockerId, panel);
        checkLockerStatusAndUpdateButton(lockerId);
        }
    }
    
    private void checkLockerStatusAndUpdateButton(int lockerId) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/locker_reservation";
            String user = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();

            String query = "SELECT is_available, is_pending FROM locker WHERE locker_id = '" + lockerId + "'";
            ResultSet rs = st.executeQuery(query);

            if (rs.next()) {
                boolean isAvailable = rs.getBoolean("is_available");
                boolean isPending = rs.getBoolean("is_pending");
                
                ReserveButton.setEnabled(isAvailable && !isPending);
                StudentIDTF.setEnabled(isAvailable && !isPending);
                FirstNameTF.setEnabled(isAvailable && !isPending);
                LastNameTF.setEnabled(isAvailable && !isPending);
                StartDateTF.setEnabled(isAvailable && !isPending);
            }

            con.close();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public void Home() {
        containerPanel.removeAll();
        containerPanel.add(MainWindowPanel);
        containerPanel.repaint();
        containerPanel.revalidate();
    }
    
    private void Page(int pageNumber) {
    containerPanel.removeAll();
    switch (pageNumber) {
        case 1:
            containerPanel.add(SmallLockerPage);
            break;
        case 2:
            containerPanel.add(MediumLockerPage);
            break;
        case 3:
            containerPanel.add(LargeLockerPage);
            break;
        default:
            break;
    }
    containerPanel.repaint();
    containerPanel.revalidate();
}
    
    public void clickedPanel (){
    for (Map.Entry<Integer, JPanel> entry : lockers.entrySet()) {
        JPanel panel = entry.getValue();
        
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Integer clickedLockerId = entry.getKey();
                String LockerId = Integer.toString(clickedLockerId);

                containerPanel.removeAll();
                containerPanel.add(ReservationPanel);
                containerPanel.repaint();
                containerPanel.revalidate();

                LockerName.setText("Locker " + LockerId);
                if (panel.getBackground().equals(Color.GRAY) || panel.getBackground().equals(Color.RED)){
                    setLockerOwnerDetails(clickedLockerId);
                    checkLockerStatusAndUpdateButton(clickedLockerId);
                    
                } else {
                    setAutomaticallyStudentIDTextField();
                    autoSetDetailsReservationPanel(clickedLockerId);
                    checkLockerStatusAndUpdateButton(clickedLockerId);
                }
                
                for (ActionListener remove : ReserveButton.getActionListeners()) {
                    ReserveButton.removeActionListener(remove);
                }
                
                ReserveButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                            Class.forName("com.mysql.cj.jdbc.Driver");
                            String url = "jdbc:mysql://localhost:3306/locker_reservation";
                            String user = "root";
                            String pass = "";

                            Connection con = DriverManager.getConnection(url, user, pass);
                            Statement st = con.createStatement();

                            String query = "SELECT is_available, is_pending FROM locker WHERE locker_id = '" + clickedLockerId + "'";
                            ResultSet rs = st.executeQuery(query);

                            if (rs.next()) {
                                boolean isAvailable = rs.getBoolean("is_available");
                                boolean isPending = rs.getBoolean("is_pending");

                                if (isAvailable && !isPending) {
                                    String updateAvailabilityQuery = "UPDATE locker SET is_available = false, is_pending = true WHERE locker_id = '" + clickedLockerId + "'";
                                    st.executeUpdate(updateAvailabilityQuery);
                                    
                                    LoginPage studentId = new LoginPage();
                                    String student_Id = studentId.getLoggedInStudentId();
                                    String firstname = FirstNameTF.getText();
                                    String lastname = LastNameTF.getText();
                                    String startDate = getTodaysDateAsString();
                                    String endDate = getDateAfterAddingMonths(3);
                                    String payment_deadline = getDateAfterAddingDays(7);
                                    String insertReservationQuery = "INSERT INTO reservation (locker_id, student_id, first_name, last_name,  start_date, end_date, payment_deadline) VALUES ('" + clickedLockerId + "', '" + student_Id + "', '" + firstname + "', '"+ lastname +"', '" + startDate + "', '" + endDate + "', '" + payment_deadline +"')";
                                    st.executeUpdate(insertReservationQuery);
                                    String updateAssignedLockerStudent = "UPDATE student SET assigned_locker = '" + clickedLockerId + " (Pending)" + "' WHERE student_id = '" + student_Id + "'";
                                    st.executeUpdate(updateAssignedLockerStudent);
                                    
                                    setPriceLocker(clickedLockerId);
                                    PaymentDeadline.setText("Payment Deadline: " + payment_deadline);
                                    
                                    containerPanel.removeAll();
                                    containerPanel.add(ConfirmationPanel);
                                    containerPanel.repaint();
                                    containerPanel.revalidate();
                                    
                                    changeButtonColorIfLockerNotAvailable(clickedLockerId, panel);
                                    
                                    Timer timer = new Timer(100000, new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        LoginPage returnToLoginPage = new LoginPage();
                                        returnToLoginPage.setVisible(true);
                                        dispose();
                                    }
                                });
                                timer.setRepeats(false); // Ensure the timer only runs once
                                timer.start(); // Start the timer
                            
                                    
                                    
                                } else {
                                    String updateQuery = "UPDATE locker SET is_pending = true, is_available = false WHERE locker_id = '" + clickedLockerId + "'";
                                    st.executeUpdate(updateQuery);
                                    
                                    changeButtonColorIfLockerNotAvailable(clickedLockerId, panel);
                                }
                                
                                ReserveButton.setEnabled(false);
                            }

                            con.close();
                        } catch (Exception ex) {
                            System.out.println("Error: " + ex.getMessage());
                        }
                    }
                });
            }
        });
    }
}
    
    public void autoSetDetailsReservationPanel(int clickedLockerId) {
        int notFound = 0;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:MySQL://localhost:3306/locker_reservation";
            String user = "root";
            String pass = "";
            
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            
            
            LoginPage studentId = new LoginPage();
            String student_Id = studentId.getLoggedInStudentId();
            String startDate = getTodaysDateAsString();
            String endDate = getDateAfterAddingMonths(3);
            
            String sql = "SELECT * FROM student WHERE student_id ='" + student_Id+"'";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                FirstNameTF.setText(rs.getString("first_name"));
                LastNameTF.setText(rs.getString("last_name"));
                StartDateTF.setText(startDate);
                EndDateTF.setText(endDate);
                notFound = 1;
            }if(notFound==0){
                    JOptionPane.showMessageDialog(new JFrame(), "Error", "WARNING", JOptionPane.ERROR_MESSAGE);
            }
            con.close();
                
        }catch(Exception e){
            System.out.println("Error "+ e.getMessage());
        }
    }
    
    public void autoSetStudentProfileDetails() {
        int notFound = 0;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:MySQL://localhost:3306/locker_reservation";
            String user = "root";
            String pass = "";
            
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            
            
            LoginPage studentId = new LoginPage();
            String student_Id = studentId.getLoggedInStudentId();
            
            String sql = "SELECT * FROM student WHERE student_id ='" + student_Id+"'";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                StudentProfFirstName.setText(rs.getString("first_name"));
                StudentProfLastName.setText(rs.getString("last_name"));
                StudentProfStudentID.setText(rs.getString("student_id"));
                StudentProfCourse.setText(rs.getString("program"));
                StudentProfEmail.setText(rs.getString("email"));
                StudentProfPhoneNum.setText(rs.getString("phone_num"));
                String verifiedOwner = rs.getString("assigned_locker");
                String firstname = StudentProfFirstName.getText();
                
                GreetingsLabel.setText("Hi, "+ firstname +"!");
                if (!(verifiedOwner.contains("-"))){
                    Notice.setText("Hi "+ firstname +", your locker number is " + verifiedOwner + ".");
                    Notice.setVisible(true);
                    Exclamation.setVisible(true);
                } else {
                    Notice.setVisible(false);
                    Exclamation.setVisible(false);
                }
                notFound = 1;
            }if(notFound==0){
                    JOptionPane.showMessageDialog(new JFrame(), "Error", "WARNING", JOptionPane.ERROR_MESSAGE);
            }
            con.close();
                
        }catch(Exception e){
            System.out.println("Error "+ e.getMessage());
        }
    }
    
    public static String getTodaysDateAsString() {
        Date today = new Date(); 
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(today);
    }
    
    public static String getDateAfterAddingMonths(int monthsToAdd) {
      Date today = new Date(); // Get the current date and time
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // Choose your desired format

      Calendar calendar = Calendar.getInstance(); // Create a Calendar object
      calendar.setTime(today); // Set the Calendar object to the current date

      calendar.add(Calendar.MONTH, monthsToAdd); // Add the specified number of months

      return sdf.format(calendar.getTime()); // Format and return the new date
    }
    
    public static String getDateAfterAddingDays(int daysToAdd) {
      Date today = new Date(); // Get the current date and time
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // Choose your desired format

      Calendar calendar = Calendar.getInstance(); // Create a Calendar object
      calendar.setTime(today); // Set the Calendar object to the current date

      calendar.add(Calendar.DAY_OF_YEAR, daysToAdd); // Add the specified number of months

      return sdf.format(calendar.getTime()); // Format and return the new date
    }
    
    private void setPriceLocker(int clickedLockerId){
        if (clickedLockerId <= 50){
            LockerNumberSize.setText("Locker Number "+ clickedLockerId +" (Small)");
            LockerPrice.setText("Price: ₱200.00");
        } else if(clickedLockerId > 50 && clickedLockerId <= 80){
            LockerNumberSize.setText("Locker Number "+ clickedLockerId +" (Medium)");
            LockerPrice.setText("Price: ₱350.00");
        } else {
            LockerNumberSize.setText("Locker Number "+ clickedLockerId +" (Large)");
            LockerPrice.setText("Price: ₱450.00");
        }
    }
    
    public void setLockerOwnerDetails(int lockerId){
        int notFound = 0;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:MySQL://localhost:3306/locker_reservation";
            String user = "root";
            String pass = "";
            
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            
            
            LoginPage studentId = new LoginPage();
            String student_Id = studentId.getLoggedInStudentId();
            
            String sql = "SELECT * FROM reservation WHERE locker_id ='" + lockerId+"'";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                StudentIDTF.setText(rs.getString("student_id"));
                FirstNameTF.setText(rs.getString("first_name"));
                LastNameTF.setText(rs.getString("last_name"));
                StartDateTF.setText(rs.getString("start_date"));
                EndDateTF.setText(rs.getString("end_date"));
                notFound = 1;
            }if(notFound==0){
                    JOptionPane.showMessageDialog(new JFrame(), "Error", "WARNING", JOptionPane.ERROR_MESSAGE);
            }
            con.close();
                
        }catch(Exception e){
            System.out.println("Error "+ e.getMessage());
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentMainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccountLabel;
    private javax.swing.JLabel AccountLabel2;
    private javax.swing.JLabel AccountLabel3;
    private javax.swing.JLabel AccountLabel4;
    private javax.swing.JLabel AccountLabel5;
    private javax.swing.JLabel AccountLabel6;
    private javax.swing.JMenuItem AccountSettings;
    private javax.swing.JLabel BackButton;
    private javax.swing.JLabel ConfimationBackground;
    private javax.swing.JButton ConfirmButton;
    private javax.swing.JPanel ConfirmationPanel;
    private javax.swing.JLabel EditCourse;
    private javax.swing.JLabel EditEmail;
    private javax.swing.JLabel EditFirstName;
    private javax.swing.JLabel EditLastName;
    private javax.swing.JLabel EditMobileNumber;
    private javax.swing.JLabel EditStudentID;
    private javax.swing.JTextField EndDateTF;
    private javax.swing.JLabel Exclamation;
    private javax.swing.JTextField FirstNameTF;
    private javax.swing.JLabel GreetingsLabel;
    private javax.swing.JLabel HomeLargeLocker;
    private javax.swing.JLabel HomeLargeLocker1;
    private javax.swing.JLabel HomeMediumLocker;
    private javax.swing.JLabel HomeSmallLocker;
    private javax.swing.JPanel L1;
    private javax.swing.JPanel L10;
    private javax.swing.JPanel L11;
    private javax.swing.JPanel L12;
    private javax.swing.JPanel L13;
    private javax.swing.JPanel L14;
    private javax.swing.JPanel L15;
    private javax.swing.JPanel L16;
    private javax.swing.JPanel L17;
    private javax.swing.JPanel L18;
    private javax.swing.JPanel L19;
    private javax.swing.JPanel L2;
    private javax.swing.JPanel L20;
    private javax.swing.JPanel L3;
    private javax.swing.JPanel L4;
    private javax.swing.JPanel L5;
    private javax.swing.JPanel L6;
    private javax.swing.JPanel L7;
    private javax.swing.JPanel L8;
    private javax.swing.JPanel L9;
    private javax.swing.JPanel LargeLockerPage;
    private javax.swing.JTextField LastNameTF;
    private javax.swing.JPanel Line;
    private javax.swing.JLabel LockerIcon;
    private javax.swing.JLabel LockerName;
    private javax.swing.JLabel LockerNumberSize;
    private javax.swing.JLabel LockerPrice;
    private javax.swing.JMenuItem Logout;
    private javax.swing.JLabel MainWindowBackground;
    private javax.swing.JPanel MainWindowPanel;
    private javax.swing.JPanel MediumLockerPage;
    private javax.swing.JLabel Notice;
    private javax.swing.JLabel PaymentDeadline;
    private javax.swing.JLabel PaymentDeadline1;
    private javax.swing.JLabel ProfilePicture;
    private javax.swing.JPanel ReservationPanel;
    private javax.swing.JButton ReserveButton;
    private javax.swing.JLabel ReserveIcon;
    private javax.swing.JPanel SmallLockerPage;
    private javax.swing.JTextField StartDateTF;
    private javax.swing.JTextField StudentIDTF;
    private javax.swing.JTextField StudentProfCourse;
    private javax.swing.JTextField StudentProfEmail;
    private javax.swing.JTextField StudentProfFirstName;
    private javax.swing.JTextField StudentProfLastName;
    private javax.swing.JTextField StudentProfPhoneNum;
    private javax.swing.JTextField StudentProfStudentID;
    private javax.swing.JLabel StudentProfileBackground;
    private javax.swing.JPanel StudentProfilePanel;
    private javax.swing.JPanel ViewLockerPanel;
    private javax.swing.JLabel ViewLockerText;
    private javax.swing.JPanel containerPanel;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JLabel largeLockerBackground;
    private javax.swing.JLabel largeLockerPage1;
    private javax.swing.JLabel largeLockerPage2;
    private javax.swing.JLabel largeLockerPage3;
    private javax.swing.JPanel m1;
    private javax.swing.JPanel m10;
    private javax.swing.JPanel m11;
    private javax.swing.JPanel m12;
    private javax.swing.JPanel m13;
    private javax.swing.JPanel m14;
    private javax.swing.JPanel m15;
    private javax.swing.JPanel m16;
    private javax.swing.JPanel m17;
    private javax.swing.JPanel m18;
    private javax.swing.JPanel m19;
    private javax.swing.JPanel m2;
    private javax.swing.JPanel m20;
    private javax.swing.JPanel m21;
    private javax.swing.JPanel m22;
    private javax.swing.JPanel m23;
    private javax.swing.JPanel m24;
    private javax.swing.JPanel m25;
    private javax.swing.JPanel m26;
    private javax.swing.JPanel m27;
    private javax.swing.JPanel m28;
    private javax.swing.JPanel m29;
    private javax.swing.JPanel m3;
    private javax.swing.JPanel m30;
    private javax.swing.JPanel m4;
    private javax.swing.JPanel m5;
    private javax.swing.JPanel m6;
    private javax.swing.JPanel m7;
    private javax.swing.JPanel m8;
    private javax.swing.JPanel m9;
    private javax.swing.JLabel mediumLockerBackground;
    private javax.swing.JLabel mediumLockerPage1;
    private javax.swing.JLabel mediumLockerPage2;
    private javax.swing.JLabel mediumLockerPage3;
    private javax.swing.JLabel reservePanelBackground;
    private javax.swing.JPanel s1;
    private javax.swing.JPanel s10;
    private javax.swing.JPanel s11;
    private javax.swing.JPanel s12;
    private javax.swing.JPanel s13;
    private javax.swing.JPanel s14;
    private javax.swing.JPanel s15;
    private javax.swing.JPanel s16;
    private javax.swing.JPanel s17;
    private javax.swing.JPanel s18;
    private javax.swing.JPanel s19;
    private javax.swing.JPanel s2;
    private javax.swing.JPanel s20;
    private javax.swing.JPanel s21;
    private javax.swing.JPanel s22;
    private javax.swing.JPanel s23;
    private javax.swing.JPanel s24;
    private javax.swing.JPanel s25;
    private javax.swing.JPanel s26;
    private javax.swing.JPanel s27;
    private javax.swing.JPanel s28;
    private javax.swing.JPanel s29;
    private javax.swing.JPanel s3;
    private javax.swing.JPanel s30;
    private javax.swing.JPanel s31;
    private javax.swing.JPanel s32;
    private javax.swing.JPanel s33;
    private javax.swing.JPanel s34;
    private javax.swing.JPanel s35;
    private javax.swing.JPanel s36;
    private javax.swing.JPanel s37;
    private javax.swing.JPanel s38;
    private javax.swing.JPanel s39;
    private javax.swing.JPanel s4;
    private javax.swing.JPanel s40;
    private javax.swing.JPanel s41;
    private javax.swing.JPanel s42;
    private javax.swing.JPanel s43;
    private javax.swing.JPanel s44;
    private javax.swing.JPanel s45;
    private javax.swing.JPanel s46;
    private javax.swing.JPanel s47;
    private javax.swing.JPanel s48;
    private javax.swing.JPanel s49;
    private javax.swing.JPanel s5;
    private javax.swing.JPanel s50;
    private javax.swing.JPanel s6;
    private javax.swing.JPanel s7;
    private javax.swing.JPanel s8;
    private javax.swing.JPanel s9;
    private javax.swing.JLabel smallLockerBackground;
    private javax.swing.JLabel smallLockerPage1;
    private javax.swing.JLabel smallLockerPage2;
    private javax.swing.JLabel smallLockerPage3;
    // End of variables declaration//GEN-END:variables
}
