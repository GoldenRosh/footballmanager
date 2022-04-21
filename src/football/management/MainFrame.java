package football.management;

import com.jtattoo.plaf.hifi.HiFiLookAndFeel;
import java.awt.CardLayout;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import net.proteanit.sql.DbUtils;


public class MainFrame extends javax.swing.JFrame {

    
    
   
    public MainFrame() {
        initComponents();
        connection = startConnection();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LoginPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        userNameLabel = new javax.swing.JLabel();
        userNameTextField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        signInButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        MainMenu = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        playerButton = new javax.swing.JButton();
        teamButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        fixtureButton = new javax.swing.JButton();
        transferButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        fixtureLabel = new javax.swing.JLabel();
        SearchLabel = new javax.swing.JLabel();
        managePlayerLabel = new javax.swing.JLabel();
        transferLabel = new javax.swing.JLabel();
        ExitLabel = new javax.swing.JLabel();
        manageTeamLabel = new javax.swing.JLabel();
        teamManagePanel = new javax.swing.JPanel();
        teamManagementLabel = new javax.swing.JLabel();
        addTeamButton = new javax.swing.JButton();
        updateTeamButton = new javax.swing.JButton();
        deleteTeamButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        teamManagementTable = new javax.swing.JTable();
        teamComboBox = new javax.swing.JComboBox();
        jButton15 = new javax.swing.JButton();
        PlayerManagePanel = new javax.swing.JPanel();
        playerManagementLabel = new javax.swing.JLabel();
        addPlayerButton = new javax.swing.JButton();
        updatePlayerButton = new javax.swing.JButton();
        deletePlayerButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        playerTable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        playerComboBox = new javax.swing.JComboBox();
        jButton16 = new javax.swing.JButton();
        addPlayerPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        physicalComboBox = new javax.swing.JComboBox();
        speedComboBox = new javax.swing.JComboBox();
        mentalComboBox = new javax.swing.JComboBox();
        defendingComboBox = new javax.swing.JComboBox();
        attackingComboBox = new javax.swing.JComboBox();
        technicalComboBox = new javax.swing.JComboBox();
        jLabel79 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel80 = new javax.swing.JLabel();
        teamPreferenceComboBox = new javax.swing.JComboBox();
        addTeamPanel = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        teamNameLabel = new javax.swing.JLabel();
        teamNameTextField = new javax.swing.JTextField();
        yearFoundedLabel = new javax.swing.JLabel();
        yearFoundedTextField = new javax.swing.JTextField();
        valueLabel = new javax.swing.JLabel();
        valueTextField = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        playerProfilePanel = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        updatePlayerPanel = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        physicalComboBox1 = new javax.swing.JComboBox();
        speedComboBox1 = new javax.swing.JComboBox();
        mentalComboBox1 = new javax.swing.JComboBox();
        defendingComboBox1 = new javax.swing.JComboBox();
        attackingComboBox1 = new javax.swing.JComboBox();
        technicalComboBox1 = new javax.swing.JComboBox();
        updateTeamPanel = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        searchPanel = new javax.swing.JPanel();
        jTextField9 = new javax.swing.JTextField();
        transferPanel = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        teamTransferComboBox = new javax.swing.JComboBox();
        jButton8 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        playerTransferComboBox = new javax.swing.JComboBox();
        jButton14 = new javax.swing.JButton();
        fixturePanel = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        leagueTablePanel = new javax.swing.JPanel();
        jLabel81 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton20 = new javax.swing.JButton();
        matchResultPanel = new javax.swing.JPanel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox();
        jLabel85 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox();
        jLabel86 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox();
        jLabel89 = new javax.swing.JLabel();
        jComboBox8 = new javax.swing.JComboBox();
        jLabel90 = new javax.swing.JLabel();
        jComboBox9 = new javax.swing.JComboBox();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jLabel91 = new javax.swing.JLabel();
        jComboBox10 = new javax.swing.JComboBox();
        jLabel92 = new javax.swing.JLabel();
        jComboBox11 = new javax.swing.JComboBox();
        setMatch = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jComboBox12 = new javax.swing.JComboBox();
        jLabel93 = new javax.swing.JLabel();
        jComboBox13 = new javax.swing.JComboBox();
        jLabel94 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel95 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setLayout(new java.awt.CardLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Login");

        userNameLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        userNameLabel.setText("User name ");

        passwordLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        passwordLabel.setText("Password");

        signInButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        signInButton.setText("Sign in");
        signInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInButtonActionPerformed(evt);
            }
        });

        ExitButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passwordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(userNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(userNameTextField)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(signInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)
                        .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameLabel))
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
        LoginPanel.setLayout(LoginPanelLayout);
        LoginPanelLayout.setHorizontalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        LoginPanelLayout.setVerticalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(190, Short.MAX_VALUE))
        );

        jPanel1.add(LoginPanel, "loginPanelCard");

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 3, 36)); // NOI18N
        jLabel2.setText("FOOTBALL MANAGEMENT  SYSTEM");

        playerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/football/management/player.jpg"))); // NOI18N
        playerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerButtonActionPerformed(evt);
            }
        });

        teamButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/football/management/team.png"))); // NOI18N
        teamButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teamButtonActionPerformed(evt);
            }
        });

        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/football/management/search.png"))); // NOI18N
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        fixtureButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/football/management/icon-fixtures-football.png"))); // NOI18N
        fixtureButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fixtureButtonActionPerformed(evt);
            }
        });

        transferButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/football/management/rsz_transfer.png"))); // NOI18N
        transferButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferButtonActionPerformed(evt);
            }
        });

        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/football/management/denied_128px.png"))); // NOI18N
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        fixtureLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        fixtureLabel.setText("Fixtures\n");

        SearchLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SearchLabel.setText("Standing");

        managePlayerLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        managePlayerLabel.setText("Manage Players");

        transferLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        transferLabel.setText("Transfer");

        ExitLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ExitLabel.setText("Log out");

        manageTeamLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        manageTeamLabel.setText("Manage Teams");

        javax.swing.GroupLayout MainMenuLayout = new javax.swing.GroupLayout(MainMenu);
        MainMenu.setLayout(MainMenuLayout);
        MainMenuLayout.setHorizontalGroup(
            MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainMenuLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(fixtureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153)
                .addComponent(transferLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ExitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
            .addGroup(MainMenuLayout.createSequentialGroup()
                .addGroup(MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainMenuLayout.createSequentialGroup()
                        .addGroup(MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(MainMenuLayout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addGroup(MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fixtureButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(54, 54, 54)
                                .addGroup(MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(teamButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(transferButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(52, 52, 52))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainMenuLayout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(SearchLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(manageTeamLabel)
                                .addGap(98, 98, 98)))
                        .addGroup(MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(playerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(MainMenuLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(managePlayerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(MainMenuLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MainMenuLayout.setVerticalGroup(
            MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addGroup(MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(teamButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchButton)
                        .addComponent(playerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(managePlayerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manageTeamLabel))
                .addGap(54, 54, 54)
                .addGroup(MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(transferButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fixtureButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fixtureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(transferLabel)
                        .addComponent(ExitLabel)))
                .addGap(64, 64, 64))
        );

        jPanel1.add(MainMenu, "mainMenuCard");

        teamManagementLabel.setFont(new java.awt.Font("Nirmala UI", 1, 36)); // NOI18N
        teamManagementLabel.setText("Team Management");

        addTeamButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addTeamButton.setText("Add Team ");
        addTeamButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTeamButtonActionPerformed(evt);
            }
        });

        updateTeamButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        updateTeamButton.setText("Update Team");
        updateTeamButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateTeamButtonActionPerformed(evt);
            }
        });

        deleteTeamButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        deleteTeamButton.setText("Match Result");
        deleteTeamButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteTeamButtonActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        teamManagementTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Team ID", "Team Name", "Year Founded", "Value"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(teamManagementTable);
        if (teamManagementTable.getColumnModel().getColumnCount() > 0) {
            teamManagementTable.getColumnModel().getColumn(0).setResizable(false);
            teamManagementTable.getColumnModel().getColumn(1).setResizable(false);
            teamManagementTable.getColumnModel().getColumn(3).setResizable(false);
        }

        teamComboBox.setEditable(true);
        teamComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton15.setText("Search");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout teamManagePanelLayout = new javax.swing.GroupLayout(teamManagePanel);
        teamManagePanel.setLayout(teamManagePanelLayout);
        teamManagePanelLayout.setHorizontalGroup(
            teamManagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, teamManagePanelLayout.createSequentialGroup()
                .addContainerGap(199, Short.MAX_VALUE)
                .addComponent(teamManagementLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(182, 182, 182))
            .addGroup(teamManagePanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(teamManagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addTeamButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteTeamButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updateTeamButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(backButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(teamManagePanelLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(teamComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );
        teamManagePanelLayout.setVerticalGroup(
            teamManagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teamManagePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(teamManagementLabel)
                .addGap(20, 20, 20)
                .addGroup(teamManagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teamComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(teamManagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(teamManagePanelLayout.createSequentialGroup()
                        .addComponent(addTeamButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(updateTeamButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(deleteTeamButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(131, Short.MAX_VALUE))
        );

        jPanel1.add(teamManagePanel, "teamManageCard");

        playerManagementLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        playerManagementLabel.setText("PLAYER MANAGEMENT ");

        addPlayerButton.setText("ADD PLAYER");
        addPlayerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPlayerButtonActionPerformed(evt);
            }
        });

        updatePlayerButton.setText("UPDATE PLAYER");
        updatePlayerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePlayerButtonActionPerformed(evt);
            }
        });

        deletePlayerButton.setText("DELETE PLAYER");
        deletePlayerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePlayerButtonActionPerformed(evt);
            }
        });

        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        playerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Player ID ", "First Name", "Last Name", "Team Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(playerTable);

        jButton2.setText("PLAYER PROFILE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        playerComboBox.setEditable(true);
        playerComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton16.setText("Search");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PlayerManagePanelLayout = new javax.swing.GroupLayout(PlayerManagePanel);
        PlayerManagePanel.setLayout(PlayerManagePanelLayout);
        PlayerManagePanelLayout.setHorizontalGroup(
            PlayerManagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlayerManagePanelLayout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(playerManagementLabel)
                .addContainerGap(163, Short.MAX_VALUE))
            .addGroup(PlayerManagePanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(PlayerManagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(updatePlayerButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addPlayerButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deletePlayerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PlayerManagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PlayerManagePanelLayout.createSequentialGroup()
                        .addComponent(playerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PlayerManagePanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())))
        );
        PlayerManagePanelLayout.setVerticalGroup(
            PlayerManagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlayerManagePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(playerManagementLabel)
                .addGap(32, 32, 32)
                .addGroup(PlayerManagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PlayerManagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PlayerManagePanelLayout.createSequentialGroup()
                        .addComponent(addPlayerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(updatePlayerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(deletePlayerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        jPanel1.add(PlayerManagePanel, "playerManageCard");

        jLabel3.setBackground(java.awt.Color.lightGray);
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel3.setText("                ADD PLAYER");

        jLabel4.setText("First Name");

        jLabel5.setText("Last Name");

        jLabel6.setText("Registration Number");

        jLabel7.setText("Country");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bangladesh", "Nepal", "India", "Pakistan", "Sri-Lanka", "Bhutan", "Bhutan", "Japan", "China", "South-Korea", "North-Korea" }));

        jLabel9.setText("Team");

        jComboBox3.setEditable(true);
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Team", "CoreI7", "Chetona71", "Race71", " " }));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Attributes");

        jLabel11.setText("Physical");

        jLabel12.setText("Mental");

        jLabel13.setText("Attacking");

        jLabel8.setText("Speed");

        jLabel14.setText("Defending");

        jLabel15.setText("Technical");

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("ADD PLAYER");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setText("BACK");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        physicalComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5" }));

        speedComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5" }));

        mentalComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5" }));

        defendingComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5" }));

        attackingComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5" }));

        technicalComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5" }));

        jLabel79.setText("Position");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MID", "DEF", "ST", "GK" }));

        jLabel80.setText("Team Preference:");

        teamPreferenceComboBox.setEditable(true);
        teamPreferenceComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout addPlayerPanelLayout = new javax.swing.GroupLayout(addPlayerPanel);
        addPlayerPanel.setLayout(addPlayerPanelLayout);
        addPlayerPanelLayout.setHorizontalGroup(
            addPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPlayerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(120, 120, 120))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPlayerPanelLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(addPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addPlayerPanelLayout.createSequentialGroup()
                        .addGroup(addPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPlayerPanelLayout.createSequentialGroup()
                                .addGroup(addPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                                .addGroup(addPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(addPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(teamPreferenceComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, 119, Short.MAX_VALUE))))
                            .addGroup(addPlayerPanelLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(addPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(addPlayerPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPlayerPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(addPlayerPanelLayout.createSequentialGroup()
                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE))
                    .addGroup(addPlayerPanelLayout.createSequentialGroup()
                        .addComponent(jLabel80)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(addPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPlayerPanelLayout.createSequentialGroup()
                        .addGroup(addPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel9))
                        .addGroup(addPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addPlayerPanelLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(addPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mentalComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(physicalComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(attackingComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(addPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel15))
                                .addGap(22, 22, 22)
                                .addGroup(addPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(defendingComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(speedComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(technicalComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPlayerPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29))))
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(32, 32, 32))
        );
        addPlayerPanelLayout.setVerticalGroup(
            addPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPlayerPanelLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel8)
                    .addComponent(physicalComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(speedComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(addPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14)
                    .addComponent(mentalComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(defendingComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(addPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(addPlayerPanelLayout.createSequentialGroup()
                        .addGroup(addPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(addPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel15)
                            .addComponent(attackingComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(technicalComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addComponent(jLabel7))
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(addPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel79)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(addPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addPlayerPanelLayout.createSequentialGroup()
                        .addComponent(jLabel80)
                        .addGap(99, 99, 99)
                        .addGroup(addPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(addPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(teamPreferenceComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        jPanel1.add(addPlayerPanel, "card6");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel16.setText("ADD TEAM ");

        teamNameLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        teamNameLabel.setText("Team Name :");

        teamNameTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        yearFoundedLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        yearFoundedLabel.setText("Year Founded :");

        yearFoundedTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        valueLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        valueLabel.setText("Value :");

        valueTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setText("ADD TEAM");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.setText("BACK");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addTeamPanelLayout = new javax.swing.GroupLayout(addTeamPanel);
        addTeamPanel.setLayout(addTeamPanelLayout);
        addTeamPanelLayout.setHorizontalGroup(
            addTeamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addTeamPanelLayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(addTeamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearFoundedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teamNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(addTeamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(addTeamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(valueTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                        .addComponent(yearFoundedTextField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(teamNameTextField, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addTeamPanelLayout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 203, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(186, 186, 186))
        );
        addTeamPanelLayout.setVerticalGroup(
            addTeamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addTeamPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addGroup(addTeamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addTeamPanelLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(addTeamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(teamNameLabel)
                            .addComponent(teamNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(90, 90, 90)
                        .addGroup(addTeamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(yearFoundedLabel)
                            .addComponent(yearFoundedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(84, 84, 84)
                        .addGroup(addTeamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(valueLabel)
                            .addComponent(valueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 270, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addTeamPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(addTeamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(103, 103, 103))))
        );

        jPanel1.add(addTeamPanel, "card7");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel17.setText("PLAYER PROFILE");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("First Name :");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("f_name");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Last Name :");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("l_name");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setText("Country     :");

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("jLabel26");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setText("Team         :");

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setText("jLabel35");

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel36.setText("Attributes");

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel37.setText("Physical:");

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel38.setText("Speed:");

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel39.setText("Mental:");

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel40.setText("Defending:");

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel41.setText("Attacking: ");

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel42.setText("Technical:");

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel43.setText("Information");

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout playerProfilePanelLayout = new javax.swing.GroupLayout(playerProfilePanel);
        playerProfilePanel.setLayout(playerProfilePanelLayout);
        playerProfilePanelLayout.setHorizontalGroup(
            playerProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerProfilePanelLayout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(playerProfilePanelLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(playerProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(playerProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(playerProfilePanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(playerProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(playerProfilePanelLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(playerProfilePanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(144, 144, 144)
                .addGroup(playerProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(playerProfilePanelLayout.createSequentialGroup()
                        .addGroup(playerProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                        .addGap(89, 89, 89))
                    .addGroup(playerProfilePanelLayout.createSequentialGroup()
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(playerProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(playerProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                        .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, playerProfilePanelLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(161, 161, 161))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, playerProfilePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(193, 193, 193))
        );
        playerProfilePanelLayout.setVerticalGroup(
            playerProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerProfilePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addGap(32, 32, 32)
                .addGroup(playerProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(jLabel43))
                .addGap(34, 34, 34)
                .addGroup(playerProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37)
                    .addComponent(jLabel38))
                .addGap(54, 54, 54)
                .addGroup(playerProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39)
                    .addComponent(jLabel40))
                .addGap(59, 59, 59)
                .addGroup(playerProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26)
                    .addComponent(jLabel41)
                    .addComponent(jLabel42))
                .addGap(65, 65, 65)
                .addGroup(playerProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel35))
                .addGap(54, 54, 54)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(138, Short.MAX_VALUE))
        );

        jPanel1.add(playerProfilePanel, "playerProfile");

        jLabel22.setBackground(java.awt.Color.lightGray);
        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel22.setText("             UPDATE PLAYER");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("First Name");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Last Name");

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel28.setText("Attributes");

        jLabel29.setText("Physical");

        jLabel30.setText("Mental");

        jLabel31.setText("Attacking");

        jLabel32.setText("Speed");

        jLabel33.setText("Defending");

        jLabel34.setText("Technical");

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton9.setText("UPDATE PLAYER");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton10.setText("BACK");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        physicalComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5" }));

        speedComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5" }));

        mentalComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5" }));

        defendingComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5" }));

        attackingComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5" }));

        technicalComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5" }));

        javax.swing.GroupLayout updatePlayerPanelLayout = new javax.swing.GroupLayout(updatePlayerPanel);
        updatePlayerPanel.setLayout(updatePlayerPanelLayout);
        updatePlayerPanelLayout.setHorizontalGroup(
            updatePlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updatePlayerPanelLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(updatePlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(updatePlayerPanelLayout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, updatePlayerPanelLayout.createSequentialGroup()
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(updatePlayerPanelLayout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(58, 58, 58)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addGroup(updatePlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updatePlayerPanelLayout.createSequentialGroup()
                        .addGroup(updatePlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addComponent(jLabel30)
                            .addComponent(jLabel31))
                        .addGap(23, 23, 23)
                        .addGroup(updatePlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mentalComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(physicalComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(attackingComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(updatePlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel33)
                            .addComponent(jLabel32)
                            .addComponent(jLabel34))
                        .addGap(22, 22, 22)
                        .addGroup(updatePlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(defendingComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(speedComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(technicalComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(32, 32, 32))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updatePlayerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel28)
                .addGap(120, 120, 120))
        );
        updatePlayerPanelLayout.setVerticalGroup(
            updatePlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updatePlayerPanelLayout.createSequentialGroup()
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(updatePlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(jLabel32)
                    .addComponent(physicalComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(speedComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(updatePlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jLabel33)
                    .addComponent(mentalComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(defendingComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(updatePlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel24)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(updatePlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jLabel34)
                    .addComponent(attackingComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(technicalComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(205, 205, 205)
                .addGroup(updatePlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        jPanel1.add(updatePlayerPanel, "card_updateplayer");

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(0, 0, 255));
        jLabel44.setText("TEAM UPDATE");

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel45.setText("Team Name     :");

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel46.setText("Foundation Year:");

        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel47.setText("Value              :");

        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton11.setText("UPDATE");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton12.setText("BACK");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout updateTeamPanelLayout = new javax.swing.GroupLayout(updateTeamPanel);
        updateTeamPanel.setLayout(updateTeamPanelLayout);
        updateTeamPanelLayout.setHorizontalGroup(
            updateTeamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateTeamPanelLayout.createSequentialGroup()
                .addGroup(updateTeamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updateTeamPanelLayout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addGroup(updateTeamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(updateTeamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(jTextField6)
                            .addComponent(jTextField7)))
                    .addGroup(updateTeamPanelLayout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(251, Short.MAX_VALUE))
            .addGroup(updateTeamPanelLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142))
        );
        updateTeamPanelLayout.setVerticalGroup(
            updateTeamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateTeamPanelLayout.createSequentialGroup()
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addGroup(updateTeamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addGroup(updateTeamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83)
                .addGroup(updateTeamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel47)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addGroup(updateTeamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(113, 113, 113))
        );

        jPanel1.add(updateTeamPanel, "card10");

        jTextField9.setText("jTextField9");

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(560, Short.MAX_VALUE))
        );

        jPanel1.add(searchPanel, "card11");

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel48.setText("TRANSFER");

        jLabel49.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel49.setText("First Name:");

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel50.setText("jLabel50");

        jLabel51.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel51.setText("Last Name:");

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel52.setText("jLabel52");

        jLabel53.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel53.setText("Current Team ");

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel54.setText("current");

        jLabel55.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel55.setText("Transfer Team");

        teamTransferComboBox.setEditable(true);
        teamTransferComboBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        teamTransferComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        teamTransferComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teamTransferComboBoxActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setText("TRANSFER");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton13.setText("BACK");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        playerTransferComboBox.setEditable(true);
        playerTransferComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton14.setText("Search");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout transferPanelLayout = new javax.swing.GroupLayout(transferPanel);
        transferPanel.setLayout(transferPanelLayout);
        transferPanelLayout.setHorizontalGroup(
            transferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transferPanelLayout.createSequentialGroup()
                .addGroup(transferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(transferPanelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(transferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(transferPanelLayout.createSequentialGroup()
                                .addComponent(jLabel51)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(transferPanelLayout.createSequentialGroup()
                                .addComponent(jLabel49)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(transferPanelLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(transferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(transferPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(transferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, transferPanelLayout.createSequentialGroup()
                                .addGroup(transferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(teamTransferComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(188, 188, 188))
                            .addGroup(transferPanelLayout.createSequentialGroup()
                                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39))))
                    .addGroup(transferPanelLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(transferPanelLayout.createSequentialGroup()
                .addGroup(transferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(transferPanelLayout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(transferPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(playerTransferComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        transferPanelLayout.setVerticalGroup(
            transferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transferPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel48)
                .addGap(27, 27, 27)
                .addGroup(transferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playerTransferComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(transferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(transferPanelLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(transferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel49)
                            .addComponent(jLabel50))
                        .addGap(54, 54, 54))
                    .addGroup(transferPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel53)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)))
                .addGroup(transferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel55)
                    .addGroup(transferPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(transferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel51)
                            .addComponent(jLabel52))))
                .addGap(18, 18, 18)
                .addComponent(teamTransferComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(164, 164, 164)
                .addGroup(transferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(transferPanel, "transferCard");

        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel58.setText("FIXTURE");

        jLabel59.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel59.setText("Group A :");

        jLabel60.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel60.setText("jLabel60");

        jLabel61.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel61.setText("jLabel61");

        jLabel62.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel62.setText("jLabel62");

        jLabel63.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel63.setText("jLabel63");

        jLabel64.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel64.setText("Group B :");

        jLabel65.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel65.setText("jLabel65");

        jLabel66.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel66.setText("jLabel66");

        jLabel67.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel67.setText("jLabel67");

        jLabel68.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel68.setText("jLabel68");

        jLabel69.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel69.setText("Group C :");

        jLabel70.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel70.setText("jLabel70");

        jLabel71.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel71.setText("jLabel71");

        jLabel72.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel72.setText("jLabel72");

        jLabel73.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel73.setText("jLabel73");

        jLabel74.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel74.setText("Group D :");

        jLabel75.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel75.setText("jLabel75");

        jLabel76.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel76.setText("jLabel76");

        jLabel77.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel77.setText("jLabel77");

        jLabel78.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel78.setText("jLabel78");

        jButton17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton17.setText("Create Fixture");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton18.setText("Clear Fixture");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton19.setText("back");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton25.setText("Match Set");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fixturePanelLayout = new javax.swing.GroupLayout(fixturePanel);
        fixturePanel.setLayout(fixturePanelLayout);
        fixturePanelLayout.setHorizontalGroup(
            fixturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fixturePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fixturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fixturePanelLayout.createSequentialGroup()
                        .addGroup(fixturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel59)
                            .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(fixturePanelLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(fixturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fixturePanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(fixturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fixturePanelLayout.createSequentialGroup()
                                        .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(239, 239, 239))
                                    .addGroup(fixturePanelLayout.createSequentialGroup()
                                        .addGroup(fixturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel74)
                                            .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(131, 131, 131))))
                            .addGroup(fixturePanelLayout.createSequentialGroup()
                                .addGroup(fixturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(fixturePanelLayout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(fixturePanelLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(55, 55, 55)
                                        .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(54, Short.MAX_VALUE))))
                    .addGroup(fixturePanelLayout.createSequentialGroup()
                        .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        fixturePanelLayout.setVerticalGroup(
            fixturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fixturePanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(fixturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(jLabel64))
                .addGap(18, 18, 18)
                .addGroup(fixturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(jLabel65))
                .addGap(24, 24, 24)
                .addGroup(fixturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61)
                    .addComponent(jLabel66))
                .addGap(26, 26, 26)
                .addGroup(fixturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(jLabel67))
                .addGap(30, 30, 30)
                .addGroup(fixturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel63)
                    .addComponent(jLabel68))
                .addGap(71, 71, 71)
                .addGroup(fixturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel69)
                    .addComponent(jLabel74))
                .addGap(28, 28, 28)
                .addGroup(fixturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel70, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel75))
                .addGap(18, 18, 18)
                .addGroup(fixturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel76)
                    .addComponent(jLabel71))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fixturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel72)
                    .addComponent(jLabel77))
                .addGap(18, 18, 18)
                .addGroup(fixturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel73)
                    .addComponent(jLabel78))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(fixturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        jPanel1.add(fixturePanel, "card13");

        jLabel81.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel81.setText("LEAGUE TABLE");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        jButton20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton20.setText("BACK");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leagueTablePanelLayout = new javax.swing.GroupLayout(leagueTablePanel);
        leagueTablePanel.setLayout(leagueTablePanelLayout);
        leagueTablePanelLayout.setHorizontalGroup(
            leagueTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leagueTablePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(185, 185, 185))
            .addGroup(leagueTablePanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jButton20)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leagueTablePanelLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        leagueTablePanelLayout.setVerticalGroup(
            leagueTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leagueTablePanelLayout.createSequentialGroup()
                .addComponent(jLabel81)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(leagueTablePanel, "card14");

        jLabel82.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel82.setText("MATCH RESULT");

        jLabel83.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel83.setText("HOME");

        jLabel84.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel84.setText("Team");

        jComboBox4.setEditable(true);
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel85.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel85.setText("Result");

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Win", "Draw", "Loss" }));

        jLabel86.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel86.setText("Point");

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "3", "1", "0", " " }));

        jLabel87.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel87.setText("AWAY");

        jLabel88.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel88.setText("Team");

        jComboBox7.setEditable(true);
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel89.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel89.setText("Result");

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Win", "Draw", "Loss" }));

        jLabel90.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel90.setText("Point");

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "3", "1", "0" }));

        jButton21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton21.setText("BACK");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton22.setText("DONE");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jLabel91.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel91.setText("Goal");

        jComboBox10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jLabel92.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel92.setText("Goal");

        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        javax.swing.GroupLayout matchResultPanelLayout = new javax.swing.GroupLayout(matchResultPanel);
        matchResultPanel.setLayout(matchResultPanelLayout);
        matchResultPanelLayout.setHorizontalGroup(
            matchResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(matchResultPanelLayout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(201, Short.MAX_VALUE))
            .addGroup(matchResultPanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(matchResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(matchResultPanelLayout.createSequentialGroup()
                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(matchResultPanelLayout.createSequentialGroup()
                        .addGroup(matchResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(matchResultPanelLayout.createSequentialGroup()
                                .addGroup(matchResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, matchResultPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel88)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(matchResultPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel84)
                                        .addGap(28, 28, 28)
                                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(39, 39, 39)
                                .addGroup(matchResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel85)
                                    .addComponent(jLabel89))
                                .addGap(36, 36, 36)
                                .addGroup(matchResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(52, 52, 52)
                                .addGroup(matchResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel90)
                                    .addComponent(jLabel86))
                                .addGap(39, 39, 39)
                                .addGroup(matchResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(28, 28, 28)))
                .addGroup(matchResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel91, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(jLabel92, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(matchResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        matchResultPanelLayout.setVerticalGroup(
            matchResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, matchResultPanelLayout.createSequentialGroup()
                .addGroup(matchResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(matchResultPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(matchResultPanelLayout.createSequentialGroup()
                        .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(jLabel83)
                        .addGap(25, 25, 25)
                        .addGroup(matchResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel84)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel85)
                            .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel86)
                            .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel91)
                            .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(108, 108, 108)
                        .addComponent(jLabel87)
                        .addGap(18, 18, 18)
                        .addGroup(matchResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel88)
                            .addGroup(matchResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel89)
                                .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel90)
                                .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel92)
                                .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                        .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46))
        );

        jPanel1.add(matchResultPanel, "card15");

        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel56.setText("MATCH SET");

        jLabel57.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel57.setText("Home Team");

        jComboBox12.setEditable(true);
        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel93.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel93.setText("Away Team");

        jComboBox13.setEditable(true);
        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel94.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel94.setText("Match Date");

        jTextField10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField10.setText("yy-mm-dd");

        jLabel95.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel95.setText("Match Time ");

        jTextField11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField11.setText("hr:min-am/pm");

        jButton23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton23.setText("DONE");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton24.setText("BACK");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout setMatchLayout = new javax.swing.GroupLayout(setMatch);
        setMatch.setLayout(setMatchLayout);
        setMatchLayout.setHorizontalGroup(
            setMatchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setMatchLayout.createSequentialGroup()
                .addGroup(setMatchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(setMatchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(setMatchLayout.createSequentialGroup()
                            .addGap(253, 253, 253)
                            .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(setMatchLayout.createSequentialGroup()
                            .addGap(120, 120, 120)
                            .addGroup(setMatchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel57)
                                .addComponent(jLabel93)
                                .addComponent(jLabel94)
                                .addComponent(jLabel95))
                            .addGap(53, 53, 53)
                            .addGroup(setMatchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jComboBox12, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox13, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField10)
                                .addComponent(jTextField11, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))))
                    .addGroup(setMatchLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(216, Short.MAX_VALUE))
        );
        setMatchLayout.setVerticalGroup(
            setMatchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, setMatchLayout.createSequentialGroup()
                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(setMatchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(setMatchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel93)
                    .addComponent(jComboBox13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(setMatchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel94)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(setMatchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel95)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(setMatchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton24, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(jButton23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41))
        );

        jPanel1.add(setMatch, "card16");

        getContentPane().add(jPanel1, new java.awt.GridBagConstraints());

        pack();
    }// </editor-fold>//GEN-END:initComponents
int count=0;
    private void fixtureButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fixtureButtonActionPerformed
        try {
           
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM groupA");
            
             if(! resultSet.next()){
                    count=0;
        }else{
                 count=1;
             }
             
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
       
        if(count==0){
            
            
            jLabel60.setText("Group A1");
            jLabel61.setText("Group A2");
            jLabel62.setText("Group A3");
            jLabel63.setText("Group A4");
            
            
            jLabel65.setText("Group B1");
            jLabel66.setText("Group B2");
            jLabel67.setText("Group B3");
            jLabel68.setText("Group B4");
            
            
            jLabel70.setText("Group C1");
            jLabel71.setText("Group C2");
            jLabel72.setText("Group C3");
            jLabel73.setText("Group C4");
            
            
            jLabel75.setText("Group D1");
            jLabel76.setText("Group D2");
            jLabel77.setText("Group D3");
            jLabel78.setText("Group D4");
            
            
        }else if(count==1){
              try {
            statement=connection.createStatement();
            resultSet = statement.executeQuery("SELECT Team_Name FROM groupA");
           resultSet.next();
                jLabel60.setText(resultSet.getString("Team_Name"));
                
                resultSet.next();
                jLabel61.setText(resultSet.getString("Team_Name"));
                
                 resultSet.next();
                jLabel62.setText(resultSet.getString("Team_Name"));
                
                 resultSet.next();
                jLabel63.setText(resultSet.getString("Team_Name"));
            
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         try {
            statement=connection.createStatement();
            resultSet = statement.executeQuery("SELECT Team_Name FROM groupB");
           resultSet.next();
                jLabel65.setText(resultSet.getString("Team_Name"));
                
                resultSet.next();
                jLabel66.setText(resultSet.getString("Team_Name"));
                
                 resultSet.next();
                jLabel67.setText(resultSet.getString("Team_Name"));
                
                 resultSet.next();
                jLabel68.setText(resultSet.getString("Team_Name"));
            
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
                
         
          try {
            statement=connection.createStatement();
            resultSet = statement.executeQuery("SELECT Team_Name FROM groupC");
           resultSet.next();
                jLabel70.setText(resultSet.getString("Team_Name"));
                
                resultSet.next();
                jLabel71.setText(resultSet.getString("Team_Name"));
                
                 resultSet.next();
                jLabel72.setText(resultSet.getString("Team_Name"));
                
                 resultSet.next();
                jLabel73.setText(resultSet.getString("Team_Name"));
            
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         try {
            statement=connection.createStatement();
            resultSet = statement.executeQuery("SELECT Team_Name FROM groupD");
           resultSet.next();
                jLabel75.setText(resultSet.getString("Team_Name"));
                
                resultSet.next();
                jLabel76.setText(resultSet.getString("Team_Name"));
                
                 resultSet.next();
                jLabel77.setText(resultSet.getString("Team_Name"));
                
                 resultSet.next();
                jLabel78.setText(resultSet.getString("Team_Name"));
            
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        CardLayout card = (CardLayout) jPanel1.getLayout();
        
        card.show(jPanel1, "card13");
    }//GEN-LAST:event_fixtureButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        try {
          

            statement = connection.createStatement();
            resultSet=statement.executeQuery("SELECT Team_Name,Played,Win,Draw,Loss,Point FROM league_standing ORDER BY Point DESC");
            jTable1.setModel(DbUtils.resultSetToTableModel(resultSet));
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        CardLayout card = (CardLayout) jPanel1.getLayout();
        
        card.show(jPanel1, "card14");
        
    }//GEN-LAST:event_searchButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
         CardLayout card = (CardLayout) jPanel1.getLayout();
        
        card.show(jPanel1, "mainMenuCard");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        
         CardLayout card = (CardLayout) jPanel1.getLayout();
        
        card.show(jPanel1, "mainMenuCard");
    }//GEN-LAST:event_backButtonActionPerformed

    private void signInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInButtonActionPerformed
       
        
     
        try {
             
            statement = connection.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String userName = userNameTextField.getText();
        String Password = jPasswordField1.getText();
        
        System.out.println(userName+Password);
       try {
         resultSet= statement.executeQuery("SELECT username , password FROM user");
            resultSet.next();
    
            
            if(userName.equalsIgnoreCase(resultSet.getString("username")) && Password.equalsIgnoreCase(resultSet.getString("password"))){
                
                 CardLayout card = (CardLayout) jPanel1.getLayout();
                 card.show(jPanel1, "mainMenuCard");
                 userNameTextField.setText(null);
                jPasswordField1.setText(null);
                
                 createArrayListDB();
                 createArrayListDB2();
                 
                searchPlayer();
                searchCompany();
            }else{
                 JOptionPane.showMessageDialog(this," Please enter a valid user Name");
            }
           
              
        
       } catch (SQLException ex) {
           Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
        
        
    }//GEN-LAST:event_signInButtonActionPerformed

    private void teamButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teamButtonActionPerformed
        try {
            
            statement=connection.createStatement();
            resultSet=statement.executeQuery("SELECT * FROM team WHERE Value > 0");
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
            teamManagementTable.setModel(DbUtils.resultSetToTableModel(resultSet));
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
        
         CardLayout card = (CardLayout) jPanel1.getLayout();
        card.show(jPanel1, "teamManageCard");
    }//GEN-LAST:event_teamButtonActionPerformed

    private void playerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerButtonActionPerformed
        try {
            
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT Player_ID,First_name,Last_Name,Team_Name,Country_Name FROM player_info Natural join team WHERE team.`Team_ID`=player_info.`Team_ID`");
            
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        playerTable.setModel(DbUtils.resultSetToTableModel(resultSet));
         CardLayout card = (CardLayout) jPanel1.getLayout();
        card.show(jPanel1, "playerManageCard");
    }//GEN-LAST:event_playerButtonActionPerformed

    private void addPlayerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPlayerButtonActionPerformed
        
        
        CardLayout card = (CardLayout) jPanel1.getLayout();
        card.show(jPanel1, "card6");
    }//GEN-LAST:event_addPlayerButtonActionPerformed

    private void addTeamButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTeamButtonActionPerformed
        
        
        CardLayout card = (CardLayout) jPanel1.getLayout();
        card.show(jPanel1, "card7");
    }//GEN-LAST:event_addTeamButtonActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
         teamNameTextField.setText(null);
          yearFoundedTextField.setText(null);
          valueTextField.setText(null);
          try {
            
            statement = connection.createStatement();
              resultSet= statement.executeQuery("SELECT * FROM team");
            teamManagementTable.setModel(DbUtils.resultSetToTableModel(resultSet));
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        CardLayout card = (CardLayout) jPanel1.getLayout();
        card.show(jPanel1, "teamManageCard");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        
        String teamName =teamNameTextField.getText();
        String yearFoundation=(yearFoundedTextField.getText());
        String value=(valueTextField.getText());
        
        if(teamName.equalsIgnoreCase(null)){
            JOptionPane.showMessageDialog(this, "Insert A Team Name ");
        
    
        }else if(yearFoundation.equalsIgnoreCase(null)){
              JOptionPane.showMessageDialog(this, "Insert A Foundation Year ");
        } else if(value.equalsIgnoreCase(null)){
              JOptionPane.showMessageDialog(this, "Insert A Value ");
        }else{
             String query ="INSERT INTO team(Team_Name,Year_Founded,Value) values(" +
              "'"+  teamName+"' " +" ,"+Integer.parseInt(yearFoundation)+" ,"+ Integer.parseInt(value)+" )";
        
        System.out.println("query:"+query);
        
        
        try {
            statement=connection.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            statement.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
          JOptionPane.showMessageDialog(this, "Team has been inserted successfully ");
          teamNameTextField.setText(null);
          yearFoundedTextField.setText(null);
          valueTextField.setText(null);
        }
       
    }//GEN-LAST:event_jButton5ActionPerformed

    private void deleteTeamButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteTeamButtonActionPerformed
        
            CardLayout card = (CardLayout) jPanel1.getLayout();
        
        card.show(jPanel1, "card15");
             
    }//GEN-LAST:event_deleteTeamButtonActionPerformed

    int teamId;
    private void updateTeamButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateTeamButtonActionPerformed
        
        
         int row = teamManagementTable.getSelectedRow();
         int column = teamManagementTable.getColumnCount();
         int teamId=0;
           String teamName =null;
           int yearFounded=0;
           int value =0;
         try{
              teamId=(int) teamManagementTable.getValueAt(row, 0);
         teamName =(String) teamManagementTable.getValueAt(row,1);
         yearFounded=(int) teamManagementTable.getValueAt(row, 2);
         value=(int) teamManagementTable.getValueAt(row, 3);
             System.out.println("TeamId:"+teamId);
             }catch(Exception ex){
                 JOptionPane.showMessageDialog(this,"please select a Team");
                 return;
             }
       
         jTextField6.setText(teamName);
         jTextField7.setText(Integer.toString(yearFounded));
         jTextField8.setText(Integer.toString(value));
         
           
        CardLayout card = (CardLayout) jPanel1.getLayout();
        
        card.show(jPanel1, "card10");
    }//GEN-LAST:event_updateTeamButtonActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        
                String firstName=null;
                String lastName=null;
                String country=null;
                String team=null;
                
        int playerID;
        firstName=jTextField1.getText();
        lastName = jTextField2.getText();
        country = (String) jComboBox1.getSelectedItem();
        team = (String) jComboBox3.getSelectedItem();
        
        
        
        int physical,speed,mental,defending,attacking,technical;
        
        physical =  Integer.parseInt((String) physicalComboBox.getSelectedItem());
        speed=Integer.parseInt((String) speedComboBox.getSelectedItem());
        mental=Integer.parseInt((String) mentalComboBox.getSelectedItem());
        defending=Integer.parseInt((String) defendingComboBox.getSelectedItem());
        attacking=Integer.parseInt((String) attackingComboBox.getSelectedItem());
        technical=Integer.parseInt((String) technicalComboBox.getSelectedItem());
        
        
        try {
            statement = connection.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String insertQuery1=null;
        String insertAttributesQuery=null;
        if(firstName.length()==0){
            JOptionPane.showMessageDialog(this, "Insert A First Name");
            return;
        }else if(lastName.length()==0){
            JOptionPane.showMessageDialog(this, "Insert A Last Name");
            return;
        }else if(jTextField3.getText().length()==0){
             JOptionPane.showMessageDialog(this, "Insert A Registration Number");
             return;
        }
        
        try{
             playerID =Integer.parseInt(jTextField3.getText()) ;
        }catch(Exception ex){
             JOptionPane.showMessageDialog(this, "Insert A valid Registration Number");
             return;
        }
            
                try {
                    resultSet=  statement.executeQuery("SELECT Team_ID FROM team WHERE Team_name="+"'"+team+"'");
                    resultSet.next();
                    int id =resultSet.getInt("Team_ID");
                     insertQuery1 = "INSERT INTO player_info(Player_ID,Team_ID,First_Name,Last_Name,Country_Name,Position,Team_Preference) values("+
                playerID+","+id+","+"'"+firstName+"'"+","+"'"+lastName+"'"+","+"'"+country+"'"
                 +","+"'"+jComboBox2.getSelectedItem().toString()+"'"+","+"'"+teamPreferenceComboBox.getSelectedItem().toString()+"'"+")";
                     
                     insertAttributesQuery="INSERT INTO player_attributes values("+playerID+","+ physical+","+speed+","+mental+","+defending+","+attacking+","+technical
                +")";
                } catch (SQLException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
               
            
        try {
            statement.execute(insertQuery1);
            statement.execute(insertAttributesQuery);
              
       
            JOptionPane.showMessageDialog(this, "Player has benn inserted successfully");
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("insertQuery1:"+insertQuery1);
        System.out.println("insertAttributesQuery:"+insertAttributesQuery);
        
      
      
        jTextField1.setText(null);
        jTextField2.setText(null);
        jTextField3.setText(null);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
        try {
            
            statement = connection.createStatement();
              resultSet= statement.executeQuery("SELECT * FROM player_info");
            playerTable.setModel(DbUtils.resultSetToTableModel(resultSet));
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
         
          
        CardLayout card = (CardLayout) jPanel1.getLayout();
        
        card.show(jPanel1, "playerManageCard");
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void deletePlayerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePlayerButtonActionPerformed
        
        
             int row = playerTable.getSelectedRow();
             int column = playerTable.getColumnCount();
             int id=0;
             try{
                  id=(int) playerTable.getValueAt(row, 0);
             String name =(String) playerTable.getValueAt(row,1);
             }catch(Exception ex){
                  JOptionPane.showMessageDialog(this,"please select a Item");
             }
            
             
             String deletedString= "DELETE FROM player_info WHERE Player_ID="+id;
            
             
        try {
            statement = connection.createStatement();
            statement.executeUpdate(deletedString);
           
           
             
            resultSet= statement.executeQuery("SELECT * FROM player_info");
            playerTable.setModel(DbUtils.resultSetToTableModel(resultSet));
             JOptionPane.showMessageDialog(this,"Player has been deleted successfully");
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deletePlayerButtonActionPerformed
   int updateId;
    private void updatePlayerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePlayerButtonActionPerformed
        
        
         int row = playerTable.getSelectedRow();
         int column = playerTable.getColumnCount();
           String firstName =null;
           String lastName=null;
         try{
              updateId=(int) playerTable.getValueAt(row, 0);
         firstName =(String) playerTable.getValueAt(row,1);
         lastName=(String) playerTable.getValueAt(row, 2);
             }catch(Exception ex){
                 JOptionPane.showMessageDialog(this,"please select a Item");
                 return;
             }
             jTextField4.setText(firstName);
             jTextField5.setText(lastName);
        try {
            statement=connection.createStatement();
            resultSet=statement.executeQuery("SELECT * FROM player_attributes WHERE Player_ID="+updateId);
            resultSet.next();
            physicalComboBox1.setSelectedItem(Integer.toString(resultSet.getInt("Physical")));
            speedComboBox1.setSelectedItem(Integer.toString(resultSet.getInt("Speed")));
            mentalComboBox1.setSelectedItem(Integer.toString(resultSet.getInt("Mental")));
            defendingComboBox1.setSelectedItem(Integer.toString(resultSet.getInt("Defending")));
            attackingComboBox1.setSelectedItem(Integer.toString(resultSet.getInt("Attacking")));
            technicalComboBox1.setSelectedItem(Integer.toString(resultSet.getInt("Technical")));
           
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
           CardLayout card = (CardLayout) jPanel1.getLayout();
          card.show(jPanel1, "card_updateplayer");
             
        
    }//GEN-LAST:event_updatePlayerButtonActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        
        if(jTextField4.getText().length()==0){
             JOptionPane.showMessageDialog(this,"Insert a First Name");
             return ;
        }else if(jTextField5.getText().length()==0){
            JOptionPane.showMessageDialog(this,"Insert a Last Name");
            return ;
        }
              String firstName=null;
              String lastName=null;
                
                
        
        firstName=jTextField4.getText();
        lastName = jTextField5.getText();
        
        
        int physical,speed,mental,defending,attacking,technical;
        
        physical =  Integer.parseInt((String) physicalComboBox1.getSelectedItem());
        speed=Integer.parseInt((String) speedComboBox1.getSelectedItem());
        mental=Integer.parseInt((String) mentalComboBox1.getSelectedItem());
        defending=Integer.parseInt((String) defendingComboBox1.getSelectedItem());
        attacking=Integer.parseInt((String) attackingComboBox1.getSelectedItem());
        technical=Integer.parseInt((String) technicalComboBox1.getSelectedItem());
        
        String updateQueryInfo ="UPDATE player_info SET First_Name="+"'"+firstName+"', "+"Last_Name="+"'"+lastName+"' WHERE Player_id="+updateId;
        System.out.println("updateQueryInfo:"+updateQueryInfo);
        String updateQueryAttributes="UPDATE player_attributes SET Physical="+physical+", Speed="+speed+", Mental="+mental+
                ", Defending="+defending+", Attacking="+attacking+", Technical="+technical+" WHERE Player_ID="+updateId;
        System.out.println("updateQueryAttributes:"+updateQueryAttributes);
        try {
            statement = connection.createStatement();
            statement.executeUpdate(updateQueryInfo);
            statement.executeUpdate(updateQueryAttributes);
            JOptionPane.showMessageDialog(this,"Player has been updated successfully");
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         CardLayout card = (CardLayout) jPanel1.getLayout();
        
        card.show(jPanel1, "playerManageCard");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        
        
        
        try {
            
            statement = connection.createStatement();
              resultSet= statement.executeQuery("SELECT * FROM player_info");
            playerTable.setModel(DbUtils.resultSetToTableModel(resultSet));
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        CardLayout card = (CardLayout) jPanel1.getLayout();
        
        card.show(jPanel1, "playerManageCard");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
         int row = playerTable.getSelectedRow();
         int column = playerTable.getColumnCount();
         
           int id=0;
           String firstName =null;
           String lastName=null;
           String country=null;
           String team=null;
         try{
             id=(int) playerTable.getValueAt(row, 0);
             firstName =(String) playerTable.getValueAt(row,1);
             lastName=(String) playerTable.getValueAt(row, 2);
             country=(String) playerTable.getValueAt(row, 4);
             
             }catch(Exception ex){
                 JOptionPane.showMessageDialog(this,"please select a Item");
                 return;
             }
         
        
         
        try {
            statement = connection.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        int teamId;
        try {
            resultSet = statement.executeQuery("SELECT Team_ID FROM Player_info WHERE Player_ID= "+id);
            resultSet.next();
            teamId=resultSet.getInt("Team_Id");
            resultSet = statement.executeQuery("SELECT Team_Name FROM team WHERE Team_ID="+teamId);
            resultSet.next();
            team=resultSet.getString("Team_Name");
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
         jLabel19.setText(firstName);
         jLabel21.setText(lastName);
         jLabel26.setText(country);
        jLabel35.setText(team);
     
        
        try {
            

            resultSet = statement.executeQuery("SELECT * FROM player_attributes WHERE Player_ID="+id);
            resultSet.next();
            jLabel37.setText("Physical :"+Integer.toString(resultSet.getInt("Physical"))+"/5");
            jLabel38.setText("Speed :"+Integer.toString(resultSet.getInt("Speed"))+"/5");
            jLabel39.setText("Mental :"+Integer.toString(resultSet.getInt("Mental"))+"/5");
            jLabel40.setText("Defending :"+Integer.toString(resultSet.getInt("Defending"))+"/5");
            jLabel41.setText("Attacking :"+Integer.toString(resultSet.getInt("Attacking"))+"/5");
            jLabel42.setText("Technical :"+Integer.toString(resultSet.getInt("Technical"))+"/5");
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
         CardLayout card = (CardLayout) jPanel1.getLayout();
        
        card.show(jPanel1, "playerProfile");
         
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
         CardLayout card = (CardLayout) jPanel1.getLayout();
        
        card.show(jPanel1, "playerManageCard");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        
        String teamName=null;
        int foundationYear,value;
        teamName = jTextField6.getText();
        if(teamName.length()==0){
            JOptionPane.showMessageDialog(this, "Insert a Team name");
            return ;
        }else if(jTextField7.getText().length()==0){
            JOptionPane.showMessageDialog(this, "Insert a Foundation Year");
            return ;
        }else if(jTextField8.getText().length() ==0){
            JOptionPane.showMessageDialog(this, "Insert a Team Value");
            return ;
        }
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT Team_ID FROM team WHERE Team_Name ="+"'"+teamName+"'");
            resultSet.next();
            teamId=resultSet.getInt("Team_ID");
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        foundationYear = Integer.parseInt(jTextField7.getText());
        value = Integer.parseInt(jTextField8.getText());
        System.out.println("Foundation:"+foundationYear+" value: "+value+"teamId: "+teamId);
        try {
            statement = connection.createStatement();
            statement.executeUpdate("UPDATE team SET Team_Name = "+"'"+teamName+"', Year_Founded = "+foundationYear+", Value="+
                    value+" WHERE Team_ID ="+teamId);
           JOptionPane.showMessageDialog(this, "Team has benn updated successfully");
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         CardLayout card = (CardLayout) jPanel1.getLayout(); 
        card.show(jPanel1, "teamManageCard");
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        
         CardLayout card = (CardLayout) jPanel1.getLayout();
        
        card.show(jPanel1, "teamManageCard");
    }//GEN-LAST:event_jButton12ActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        
        closeConnection();
        System.exit(0);
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        
        CardLayout card = (CardLayout) jPanel1.getLayout();
        
        card.show(jPanel1, "loginPanelCard");
    }//GEN-LAST:event_exitButtonActionPerformed

    private void transferButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferButtonActionPerformed
        
        jLabel50.setText("");
         jLabel52.setText("");
          jLabel54.setText("");
        
         CardLayout card = (CardLayout) jPanel1.getLayout();
        card.show(jPanel1, "transferCard");
    }//GEN-LAST:event_transferButtonActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        
        String player=null;
        try{
            player=playerTransferComboBox.getSelectedItem().toString();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Please Select A Player");
            return;
        }
       
            String queryPlayerInfo="SELECT First_name,Last_Name,Team_Name FROM player_info, team "
                    + "WHERE team.`Team_ID`=(SELECT Team_ID FROM player_info WHERE First_Name ="+"'"+playerTransferComboBox.getSelectedItem().toString()+"'"+") "
                    +" AND player_info.`Team_ID`=(SELECT Team_ID FROM player_info WHERE First_Name ="+"'"+playerTransferComboBox.getSelectedItem().toString()+"'"+")"
                    +" AND player_info.`Team_ID`=team.`Team_ID` AND First_Name="+"'"+playerTransferComboBox.getSelectedItem().toString()+"' ";
            System.out.println("queryPlayerInfo:"+queryPlayerInfo);
            
            try {
                statement = connection.createStatement();
                resultSet=statement.executeQuery(queryPlayerInfo);
               resultSet.next();
               jLabel50.setText(resultSet.getString("First_Name"));
                 jLabel52.setText(resultSet.getString("Last_Name"));
                  jLabel54.setText(resultSet.getString("Team_Name"));
            } catch (SQLException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        
        
        CardLayout card = (CardLayout) jPanel1.getLayout();
        card.show(jPanel1, "mainMenuCard");
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
          
        try{
            teamTransferComboBox.getSelectedItem().toString();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Select a transfer Team");
            return;
        }
        String transferString="UPDATE player_info SET Team_ID ="
                + "(SELECT Team_ID FROM team WHERE Team_Name="+" '"+teamTransferComboBox.getSelectedItem().toString()+"'"+ ")  "
                + "WHERE First_Name ="+"'"+jLabel50.getText()+"' "
                + " AND Last_Name = "+"'"+jLabel52.getText()+"' ";
        System.out.println("transferString:"+transferString);
        try {
            statement = connection.createStatement();
            statement.executeUpdate(transferString);
            JOptionPane.showMessageDialog(this, "Player has been transfered successfully");
            jLabel50.setText("");
            jLabel52.setText("");
            jLabel54.setText("");
            playerTransferComboBox.setSelectedItem("");
            teamTransferComboBox.setSelectedItem("");
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        
        
        try{
            teamComboBox.getSelectedItem().toString();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Select a Team");
            return;
        }
        
        try {
            statement = connection.createStatement();
            resultSet=statement.executeQuery("SELECT * FROM team WHERE Team_Name="+"'"+teamComboBox.getSelectedItem().toString()+"' ");
            teamManagementTable.setModel(DbUtils.resultSetToTableModel(resultSet));
            
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        
        
          try{
            playerComboBox.getSelectedItem().toString();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Select a Player");
            return;
        }
        String sql="SELECT Player_ID,First_name,Last_Name,Team_Name,Country_Name FROM player_info, team "
                    + "WHERE team.`Team_ID`=(SELECT Team_ID FROM player_info WHERE First_Name ="+"'"+playerComboBox.getSelectedItem().toString()+"'"+") "
                    +" AND player_info.`Team_ID`=(SELECT Team_ID FROM player_info WHERE First_Name ="+"'"+playerComboBox.getSelectedItem().toString()+"'"+")"
                    +" AND player_info.`Team_ID`=team.`Team_ID` AND First_Name="+"'"+playerComboBox.getSelectedItem().toString()+"' ";
        try {
            statement = connection.createStatement();
            resultSet=statement.executeQuery(sql);
            playerTable.setModel(DbUtils.resultSetToTableModel(resultSet));
            
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
      
        if(count==1){
            JOptionPane.showMessageDialog(this, "Fixture has already created");
            return;
        }
          Date date = new Date();
LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
int year  = localDate.getYear();
        Fixture fix = new Fixture();
        fix.createFixture();
        
        try {
            
            statement =connection.createStatement();
            
            String a="INSERT INTO groupA(Team_ID,Team_Name) select Team_ID,Team_Name from team where Last_Year_Position IN("+
                    1+","+fix.group[0]+","+fix.group[1]+","+fix.group[2]+")";
            System.out.println(a);
            statement.execute("INSERT INTO groupA(Team_ID,Team_Name) select Team_ID,Team_Name from team where Last_Year_Position IN("+
                    1+","+fix.group[0]+","+fix.group[1]+","+fix.group[2]+")");
            
            
            
            statement.execute("INSERT INTO groupB(Team_ID,Team_Name) select Team_ID,Team_Name from team where Last_Year_Position IN("+
                    2+","+fix.group[3]+","+fix.group[4]+","+fix.group[5]+")");
            
            
            statement.execute("INSERT INTO groupC(Team_ID,Team_Name) select Team_ID,Team_Name from team where Last_Year_Position IN("+
                    3+","+fix.group[6]+","+fix.group[7]+","+fix.group[8]+")");
            
            
            statement.execute("INSERT INTO groupD(Team_ID,Team_Name) select Team_ID,Team_Name from team where Last_Year_Position IN("+
                    4+","+fix.group[9]+","+fix.group[10]+","+fix.group[11]+")");
            
                
         
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            statement=connection.createStatement();
            resultSet = statement.executeQuery("SELECT Team_Name FROM groupA");
           resultSet.next();
                jLabel60.setText(resultSet.getString("Team_Name"));
                
                resultSet.next();
                jLabel61.setText(resultSet.getString("Team_Name"));
                
                 resultSet.next();
                jLabel62.setText(resultSet.getString("Team_Name"));
                
                 resultSet.next();
                jLabel63.setText(resultSet.getString("Team_Name"));
            
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         try {
            statement=connection.createStatement();
            resultSet = statement.executeQuery("SELECT Team_Name FROM groupB");
           resultSet.next();
                jLabel65.setText(resultSet.getString("Team_Name"));
                
                resultSet.next();
                jLabel66.setText(resultSet.getString("Team_Name"));
                
                 resultSet.next();
                jLabel67.setText(resultSet.getString("Team_Name"));
                
                 resultSet.next();
                jLabel68.setText(resultSet.getString("Team_Name"));
            
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
                
         
          try {
            statement=connection.createStatement();
            resultSet = statement.executeQuery("SELECT Team_Name FROM groupC");
           resultSet.next();
                jLabel70.setText(resultSet.getString("Team_Name"));
                
                resultSet.next();
                jLabel71.setText(resultSet.getString("Team_Name"));
                
                 resultSet.next();
                jLabel72.setText(resultSet.getString("Team_Name"));
                
                 resultSet.next();
                jLabel73.setText(resultSet.getString("Team_Name"));
            
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         try {
            statement=connection.createStatement();
            resultSet = statement.executeQuery("SELECT Team_Name FROM groupD");
           resultSet.next();
                jLabel75.setText(resultSet.getString("Team_Name"));
                
                resultSet.next();
                jLabel76.setText(resultSet.getString("Team_Name"));
                
                 resultSet.next();
                jLabel77.setText(resultSet.getString("Team_Name"));
                
                 resultSet.next();
                jLabel78.setText(resultSet.getString("Team_Name"));
            
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         count=1;
         String teamOne=null;
         String teamTwo=null;
         String category=null;
        for(int a=1;a<=4;a++){
            String groupName=null;
            if(a==1){
                groupName="groupa";
                category="A";
            }else if(a==2){
                 groupName="groupb";
                 category="B";
            }else if(a==3){
                 groupName="groupc";
                 category="C";
            }else{
                 groupName="groupd";
                 category="D";
            }
            String alu="SELECT Group_ID FROM "+groupName+" WHERE Team_ID="+a;
            System.out.println("alu="+alu);
             int groupId1=0;
            try {
                statement=connection.createStatement();
                 resultSet=statement.executeQuery(alu);
                 resultSet.next();
                 
                groupId1=resultSet.getInt(1);
            } catch (SQLException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
                int d=1;
             for(int i=1;i<=4;i++){
                  
             for(int j=i+1;j<=4;j++){
                
                 
                 int groupId2=groupId1 +j -d;
                 try {
                     String abc="SELECT Team_Name FROM "
                     +groupName+" WHERE Group_ID IN("+groupId2+", "+groupId1+")";
                     System.out.println("abc="+abc);
                     statement =connection.createStatement();
                     resultSet=statement.executeQuery(abc);
                     resultSet.next();
                     teamOne=resultSet.getString("Team_Name").toString();
                     resultSet.next();
                      teamTwo=resultSet.getString("Team_Name").toString();
                      
                       String query="INSERT INTO result (Team_One,Team_two,Category,Year) values("
                         +"'"+teamOne+"'"+","+"'"+teamTwo+"' ,"+"'"+category+"' ,"+year+" )";
                 System.out.println("groupId1="+groupId1+" groupId2="+groupId2);
                 System.out.println("\n");
                 System.out.println("query="+query+" \n");
                 statement.execute(query);
                 } catch (SQLException ex) {
                     Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                 }
                 
                
                 
                 
                
             }
              d++;
             groupId1++;
         }
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
         
        
        if(count == 0){
             JOptionPane.showMessageDialog(this, "There is no Fixture to clear");
             return;
        }
        Date date = new Date();
LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
int year  = localDate.getYear();
        try {
            String delete="delete from result where Year="+year;
            statement = connection.createStatement();
            statement.executeUpdate("delete  from groupA");
             statement.executeUpdate("delete  from groupB");
              statement.executeUpdate("delete  from groupC");
               statement.executeUpdate("delete  from groupD");
               statement.executeUpdate(delete);
               JOptionPane.showMessageDialog(this, "Fixture has been cleared");
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Group A
            jLabel60.setText("Group A1");
            jLabel61.setText("Group A2");
            jLabel62.setText("Group A3");
            jLabel63.setText("Group A4");
            
            //Group B
            jLabel65.setText("Group B1");
            jLabel66.setText("Group B2");
            jLabel67.setText("Group B3");
            jLabel68.setText("Group B4");
            
            //Group C
            jLabel70.setText("Group C1");
            jLabel71.setText("Group C2");
            jLabel72.setText("Group C3");
            jLabel73.setText("Group C4");
            
            //Group D
            jLabel75.setText("Group D1");
            jLabel76.setText("Group D2");
            jLabel77.setText("Group D3");
            jLabel78.setText("Group D4");
        count=0;
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        
        
        CardLayout card = (CardLayout) jPanel1.getLayout();
        card.show(jPanel1, "mainMenuCard");
        
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        
         CardLayout card = (CardLayout) jPanel1.getLayout();
        card.show(jPanel1, "mainMenuCard");
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        try {
           
            int pointHome,pointAway;
            int resultHome,resultAway;
            String matchResult;
            statement = connection.createStatement();
            
            
            String updateHome=null;
            if(jComboBox5.getSelectedItem().toString().equals("Win")){
                pointHome=3;
                matchResult=jComboBox4.getSelectedItem().toString();
                resultSet=statement.executeQuery("SELECT Win From league_standing WHERE Team_Name ="+"'"+jComboBox4.getSelectedItem().toString()+"'");
                resultSet.next();
                resultHome=resultSet.getInt("Win") + 1;
                updateHome ="UPDATE league_standing SET Win="+resultHome+" WHERE Team_Name ="+"'"+jComboBox4.getSelectedItem().toString()+"'";
            }else if(jComboBox5.getSelectedItem().toString().equals("Draw")){
                pointHome=1;
                matchResult="Draw";
                 resultSet=statement.executeQuery("SELECT Draw From league_standing WHERE Team_Name ="+"'"+jComboBox4.getSelectedItem().toString()+"'");
                resultSet.next();
                resultHome=resultSet.getInt("Draw") + 1;
                updateHome ="UPDATE league_standing SET Draw="+resultHome+" WHERE Team_Name ="+"'"+jComboBox4.getSelectedItem().toString()+"'";
            }else{
                pointHome=0;
                matchResult =jComboBox7.getSelectedItem().toString();
                 resultSet=statement.executeQuery("SELECT Loss From league_standing WHERE Team_Name ="+"'"+jComboBox4.getSelectedItem().toString()+"'");
                resultSet.next();
                resultHome=resultSet.getInt("Loss") + 1;
                updateHome ="UPDATE league_standing SET Loss="+resultHome+" WHERE Team_Name ="+"'"+jComboBox4.getSelectedItem().toString()+"'";
            }
            statement.executeUpdate(updateHome);
            
       
            String updateAway=null;
             if(jComboBox8.getSelectedItem().toString().equals("Win")){
                pointAway=3;
                resultSet=statement.executeQuery("SELECT Win From league_standing WHERE Team_Name ="+"'"+jComboBox7.getSelectedItem().toString()+"'");
                resultSet.next();
                resultHome=resultSet.getInt("Win") + 1;
                updateAway ="UPDATE league_standing SET Win="+resultHome+" WHERE Team_Name ="+"'"+jComboBox7.getSelectedItem().toString()+"'";
            }else if(jComboBox8.getSelectedItem().toString().equals("Draw")){
                pointAway=1;
                 resultSet=statement.executeQuery("SELECT Draw From league_standing WHERE Team_Name ="+"'"+jComboBox7.getSelectedItem().toString()+"'");
                resultSet.next();
                resultHome=resultSet.getInt("Draw") + 1;
                updateAway ="UPDATE league_standing SET Draw="+resultHome+" WHERE Team_Name ="+"'"+jComboBox7.getSelectedItem().toString()+"'";
            }else{
                pointAway=0;
                 resultSet=statement.executeQuery("SELECT Loss From league_standing WHERE Team_Name ="+"'"+jComboBox7.getSelectedItem().toString()+"'");
                resultSet.next();
                resultHome=resultSet.getInt("Loss") + 1;
                updateAway ="UPDATE league_standing SET Loss="+resultHome+" WHERE Team_Name ="+"'"+jComboBox7.getSelectedItem().toString()+"'";
            }
             statement.executeUpdate(updateAway);
             System.out.println("pointHome:"+pointHome+"updateHome:"+updateHome+"pointAway:"+pointAway+"updateAway:"+updateAway);
            
           String result = "INSERT INTO result (Match_Result,Goal_T1,Goal_T2) values("+"'"+matchResult+"'"+
                   ","+Integer.parseInt(jComboBox10.getSelectedItem().toString())+","+Integer.parseInt(jComboBox11.getSelectedItem().toString())
                   +") WHERE Team_One="+"'"+jComboBox4.getSelectedItem().toString()+"'"+" AND Team_Two="+"'"+jComboBox7.getSelectedItem().toString()+"'";
            System.out.println("result:"+result);
            statement.execute(result);
            
            
            
            int goalDefHome,goalScoredHome,goalConcededHome; 
               
               resultSet=statement.executeQuery("SELECT Goal_Scored, Goal_Conceded,Goal_Def FROM score WHERE Team_Name="+
                     "'"+jComboBox4.getSelectedItem().toString()+"'" );
               resultSet.next();
               goalScoredHome=resultSet.getInt("Goal_Scored") +(Integer.parseInt(jComboBox10.getSelectedItem().toString()));
               goalConcededHome=resultSet.getInt("Goal_Conceded") +(Integer.parseInt(jComboBox11.getSelectedItem().toString()));
               goalDefHome=resultSet.getInt("Goal_Def")+(Integer.parseInt(jComboBox10.getSelectedItem().toString()) - Integer.parseInt(jComboBox11.getSelectedItem().toString()));
               
                
            String scoreHome="UPDATE  score SET Goal_Scored="
                    +goalScoredHome+", Goal_Conceded="
                    + goalConcededHome+", Goal_Def="+goalDefHome+" WHERE Team_Name="+
                  "'"+jComboBox4.getSelectedItem().toString()+"'" ;
            System.out.println("scoreHome:"+scoreHome);
            
            statement.executeUpdate(scoreHome);
            
           
            
            int goalDefAway,goalScoredAway,goalConcededAway;
            
               resultSet=statement.executeQuery("SELECT Goal_Scored, Goal_Conceded,Goal_Def FROM score WHERE Team_Name="+
                     "'"+jComboBox7.getSelectedItem().toString()+"'" );
               resultSet.next();
               goalScoredAway=resultSet.getInt("Goal_Scored") +(Integer.parseInt(jComboBox11.getSelectedItem().toString()));
               goalConcededAway=resultSet.getInt("Goal_Conceded") +(Integer.parseInt(jComboBox10.getSelectedItem().toString()));
               goalDefAway=resultSet.getInt("Goal_Def")+(Integer.parseInt(jComboBox11.getSelectedItem().toString()) - Integer.parseInt(jComboBox10.getSelectedItem().toString()));
            
            String scoreAway="UPDATE  score SET Goal_Scored="
                    + goalScoredAway+", Goal_Conceded="
                    +goalConcededAway+", Goal_Def="+goalDefAway+" WHERE Team_Name="
                   + "'"+jComboBox4.getSelectedItem().toString()+"'" ;
            System.out.println("scoreAway:"+scoreAway);
             statement.executeUpdate(scoreAway);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        jComboBox4.setSelectedItem("");
        jComboBox7.setSelectedItem("");
        
        JOptionPane.showMessageDialog(this, "Match Result has been updated");
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        
        CardLayout card = (CardLayout) jPanel1.getLayout();
        card.show(jPanel1, "teamManageCard");
        
    }//GEN-LAST:event_jButton21ActionPerformed

    private void teamTransferComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teamTransferComboBoxActionPerformed
        
    }//GEN-LAST:event_teamTransferComboBoxActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        try {
          
            statement = connection.createStatement();
            String query="INSERT INTO result(Match_Date,Match_Time) values("
                    
                    +"'"+jTextField10.getText()+"'"
                    +", "+"'"+jTextField11.getText()+"' )"+
                    "WHERE Team_One="+"'"+jComboBox12.getSelectedItem().toString()+"' "+" AND Team_Two="
                    +"'"+jComboBox13.getSelectedItem().toString()+"'";
            System.out.println("query:"+query);
            statement.execute(query);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "There no match between these team or  invalid data");
        }
        
        jComboBox12.setSelectedItem("");
        jComboBox13.setSelectedItem("");
        jTextField10.setText("yy-mm-dd");
        jTextField11.setText("hr:min-am/pm");
         JOptionPane.showMessageDialog(this, "Match date and time have been set");
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        
        
        CardLayout card = (CardLayout) jPanel1.getLayout();
        card.show(jPanel1, "card16");
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
      
        CardLayout card = (CardLayout) jPanel1.getLayout();
        card.show(jPanel1, "card13");
    }//GEN-LAST:event_jButton24ActionPerformed

    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;
    private String userName = "root";
    private String password = "root";
    String DATABASE_URL = ("jdbc:mysql://localhost:3306/footballmanagement2");
    
      
    public Connection startConnection(){
           try {
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            connection =  DriverManager.getConnection(DATABASE_URL,userName,password);
            
            System.out.println("connected");
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
        return  connection;
    }
    
    
    public void closeConnection(){
        try {
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   


    public static void main(String args[]) {
        
         

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 try {
    
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                
                Properties props = new Properties();
                props.put("logoString", "my company");
                HiFiLookAndFeel.setCurrentTheme(props);
               
                UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
              

            }
        } catch (Exception ex) {
            
        }
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitButton;
    private javax.swing.JLabel ExitLabel;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JPanel MainMenu;
    private javax.swing.JPanel PlayerManagePanel;
    private javax.swing.JLabel SearchLabel;
    private javax.swing.JButton addPlayerButton;
    private javax.swing.JPanel addPlayerPanel;
    private javax.swing.JButton addTeamButton;
    private javax.swing.JPanel addTeamPanel;
    private javax.swing.JComboBox attackingComboBox;
    private javax.swing.JComboBox attackingComboBox1;
    private javax.swing.JButton backButton;
    private javax.swing.JComboBox defendingComboBox;
    private javax.swing.JComboBox defendingComboBox1;
    private javax.swing.JButton deletePlayerButton;
    private javax.swing.JButton deleteTeamButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton fixtureButton;
    private javax.swing.JLabel fixtureLabel;
    private javax.swing.JPanel fixturePanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox10;
    private javax.swing.JComboBox jComboBox11;
    private javax.swing.JComboBox jComboBox12;
    private javax.swing.JComboBox jComboBox13;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JComboBox jComboBox8;
    private javax.swing.JComboBox jComboBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JPanel leagueTablePanel;
    private javax.swing.JLabel managePlayerLabel;
    private javax.swing.JLabel manageTeamLabel;
    private javax.swing.JPanel matchResultPanel;
    private javax.swing.JComboBox mentalComboBox;
    private javax.swing.JComboBox mentalComboBox1;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JComboBox physicalComboBox;
    private javax.swing.JComboBox physicalComboBox1;
    private javax.swing.JButton playerButton;
    private javax.swing.JComboBox playerComboBox;
    private javax.swing.JLabel playerManagementLabel;
    private javax.swing.JPanel playerProfilePanel;
    private javax.swing.JTable playerTable;
    private javax.swing.JComboBox playerTransferComboBox;
    private javax.swing.JButton searchButton;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JPanel setMatch;
    private javax.swing.JButton signInButton;
    private javax.swing.JComboBox speedComboBox;
    private javax.swing.JComboBox speedComboBox1;
    private javax.swing.JButton teamButton;
    private javax.swing.JComboBox teamComboBox;
    private javax.swing.JPanel teamManagePanel;
    private javax.swing.JLabel teamManagementLabel;
    private javax.swing.JTable teamManagementTable;
    private javax.swing.JLabel teamNameLabel;
    private javax.swing.JTextField teamNameTextField;
    private javax.swing.JComboBox teamPreferenceComboBox;
    private javax.swing.JComboBox teamTransferComboBox;
    private javax.swing.JComboBox technicalComboBox;
    private javax.swing.JComboBox technicalComboBox1;
    private javax.swing.JButton transferButton;
    private javax.swing.JLabel transferLabel;
    private javax.swing.JPanel transferPanel;
    private javax.swing.JButton updatePlayerButton;
    private javax.swing.JPanel updatePlayerPanel;
    private javax.swing.JButton updateTeamButton;
    private javax.swing.JPanel updateTeamPanel;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JTextField userNameTextField;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTextField valueTextField;
    private javax.swing.JLabel yearFoundedLabel;
    private javax.swing.JTextField yearFoundedTextField;
    // End of variables declaration//GEN-END:variables

     ArrayList<String>teamName = new ArrayList<String>();
    ArrayList<String>playerName = new ArrayList<String>();
    ArrayList<String>allName = new ArrayList<String>();
    
   public void autoComplete(){
        final JTextField textfield = (JTextField)     playerTransferComboBox.getEditor().getEditorComponent();
                    textfield.addKeyListener(new KeyAdapter() {
                       public void keyReleased(KeyEvent ke) {
                         SwingUtilities.invokeLater(new Runnable() {
                       public void run() {
                             comboFilter(textfield.getText());
                             
                           try {
                               Thread.sleep(1000);
                           } catch (InterruptedException ex) {
                               Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                           }
                }
            });
        }
    });
    }
    
    
public void comboFilter(String enteredText) {
      ArrayList<String> filterArray= new ArrayList<String>();

            String str1="";

     try
    {


    String str="SELECT First_Name FROM player_info WHERE First_Name  LIKE '"+enteredText+"%'";

     
     Statement stmt=connection.createStatement();
     ResultSet rs=stmt.executeQuery(str);
     while(rs.next())
     {

      str1=rs.getString("First_Name");
      filterArray.add(str1);


     }

    }
    catch(Exception ex)
    {
     System.out.println("error"+ex);   
    }



}


private void searchPlayer() {
       
        
            SearchBoxModel sbm = new SearchBoxModel(playerTransferComboBox,playerName);
            
            playerTransferComboBox.setModel(sbm);
            
            playerTransferComboBox.addItemListener(sbm);
            
            
            SearchBoxModel sbm2 = new SearchBoxModel(playerComboBox,playerName);
             playerComboBox.setModel(sbm2);
             playerComboBox.addItemListener(sbm2);
        
    }

 public void searchCompany(){
        SearchBoxModel sbmc = new SearchBoxModel(teamTransferComboBox, teamName);
        teamTransferComboBox.setModel(sbmc);
        teamTransferComboBox.addItemListener(sbmc);
        
        SearchBoxModel sbmc1 = new SearchBoxModel(teamComboBox, teamName);
        teamComboBox.setModel(sbmc1);
        teamComboBox.addItemListener(sbmc1);
        
        SearchBoxModel sbmc2 = new SearchBoxModel(teamPreferenceComboBox, teamName);
        teamPreferenceComboBox.setModel(sbmc2);
        teamPreferenceComboBox.addItemListener(sbmc2);
        
        SearchBoxModel sbmc3 = new SearchBoxModel(jComboBox3, teamName);
        jComboBox3.setModel(sbmc3);
        jComboBox3.addItemListener(sbmc3);
        
         SearchBoxModel sbmc4 = new SearchBoxModel(jComboBox4, teamName);
        jComboBox4.setModel(sbmc4);
        jComboBox4.addItemListener(sbmc4);
        
         SearchBoxModel sbmc5 = new SearchBoxModel(jComboBox7, teamName);
        jComboBox7.setModel(sbmc5);
        jComboBox7.addItemListener(sbmc5);
        
        SearchBoxModel sbmc6 = new SearchBoxModel(jComboBox13, teamName);
        jComboBox13.setModel(sbmc6);
        jComboBox13.addItemListener(sbmc6);
        
        SearchBoxModel sbmc7 = new SearchBoxModel(jComboBox12, teamName);
        jComboBox12.setModel(sbmc7);
        jComboBox12.addItemListener(sbmc7);
        
       
        
        
        
    }

private void createArrayListDB(){
        try {
            String sql = "select First_Name from player_info";
            Statement stmt=connection.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next())
            {
                
                playerName.add(rs.getString("First_Name"));
                System.out.println(rs.getString("First_Name"));
                
            }
        } catch (SQLException ex) {
            
        }
        
        
    }

     public void createArrayListDB2(){
        try {
            String sql = "SELECT Team_Name FROM team";
            Statement stmt=connection.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next())
            {
                
                teamName.add(rs.getString("Team_Name"));
                
            }
        } catch (SQLException ex) {
            
        }
        
    }
    
}
