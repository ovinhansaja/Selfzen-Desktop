package com.soft;

import com.code.CallBackInterface;
import com.code.DB_conection;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Cashier extends javax.swing.JFrame {

    Connection con=null;
    PreparedStatement pst = null;
    PreparedStatement pstUP= null;
           

    public Cashier() {
        initComponents();
        con = DB_conection.connect();
        
        
    }
 
    public Cashier(String cash_nic) {
         initComponents();
         txt_nic.setText(cash_nic);
         con = DB_conection.connect();
         
            String cashiernic=txt_nic.getText();
        try {
            
            String sqlGetID ="SELECT * FROM cashier WHERE cash_nic='"+cashiernic+"';";
            pst = con.prepareStatement(sqlGetID);
            ResultSet rs1 = pst.executeQuery();
            
            if(rs1.next()){
            txt_nicID.setText(rs1.getString(1));
            txtcashName.setText(rs1.getString(2));
            }
        } catch (Exception e) {
        }
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        head = new javax.swing.JPanel();
        close = new javax.swing.JButton();
        minimize = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bill = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        discount = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_tot = new javax.swing.JLabel();
        txtDisc = new javax.swing.JLabel();
        txtBalance = new javax.swing.JLabel();
        txtAmountPay = new javax.swing.JTextField();
        txt_nic = new javax.swing.JLabel();
        confirm = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        QR = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        txtPayble = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnLoad = new javax.swing.JButton();
        txt_billD = new javax.swing.JLabel();
        discount1 = new javax.swing.JLabel();
        txtcashName = new javax.swing.JLabel();
        txt_nicID = new javax.swing.JLabel();
        discount2 = new javax.swing.JLabel();
        discount3 = new javax.swing.JLabel();
        discount4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        head.setBackground(new java.awt.Color(47, 46, 65));

        close.setBackground(new java.awt.Color(47, 46, 65));
        close.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        close.setForeground(java.awt.Color.white);
        close.setText("X");
        close.setBorder(null);
        close.setBorderPainted(false);
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        minimize.setBackground(new java.awt.Color(47, 46, 65));
        minimize.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        minimize.setForeground(java.awt.Color.white);
        minimize.setText("-");
        minimize.setBorder(null);
        minimize.setBorderPainted(false);
        minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        minimize.setMaximumSize(new java.awt.Dimension(22, 22));
        minimize.setMinimumSize(new java.awt.Dimension(22, 22));
        minimize.setPreferredSize(new java.awt.Dimension(22, 22));
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimizeMouseExited(evt);
            }
        });
        minimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout headLayout = new javax.swing.GroupLayout(head);
        head.setLayout(headLayout);
        headLayout.setHorizontalGroup(
            headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        headLayout.setVerticalGroup(
            headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(minimize, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.setBackground(java.awt.Color.white);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        bill.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        bill.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ITEM NAME", "PRICE", "QTY.", "DISCOUNT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        bill.setPreferredSize(new java.awt.Dimension(550, 360));
        bill.setRowHeight(30);
        jScrollPane1.setViewportView(bill);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setText("Total");

        discount.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        discount.setText("Total Discount");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel3.setText("Amount Payable");

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel4.setText("Paid Amount ");

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel5.setText("Change");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("LKR");

        txt_tot.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        txt_tot.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        txt_tot.setText("0.00");

        txtDisc.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtDisc.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        txtDisc.setText("0.00");

        txtBalance.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        txtBalance.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        txtBalance.setText("0.00");

        txtAmountPay.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtAmountPay.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAmountPay.setText("0.00");
        txtAmountPay.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAmountPayFocusLost(evt);
            }
        });
        txtAmountPay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAmountPayKeyPressed(evt);
            }
        });

        txt_nic.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        txt_nic.setText("asfsdfd");

        confirm.setBackground(new java.awt.Color(7, 108, 17));
        confirm.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        confirm.setForeground(java.awt.Color.white);
        confirm.setText("Confirm");
        confirm.setBorder(null);
        confirm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        confirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                confirmMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                confirmMouseExited(evt);
            }
        });
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });

        cancel.setBackground(new java.awt.Color(156, 24, 24));
        cancel.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        cancel.setForeground(java.awt.Color.white);
        cancel.setText("Cancel");
        cancel.setBorder(null);
        cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelMouseExited(evt);
            }
        });

        QR.setBackground(new java.awt.Color(47, 46, 65));
        QR.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        QR.setForeground(java.awt.Color.white);
        QR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/QR scaner.png"))); // NOI18N
        QR.setBorder(null);
        QR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        QR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                QRMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                QRMouseExited(evt);
            }
        });
        QR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QRActionPerformed(evt);
            }
        });

        logout.setBackground(java.awt.Color.gray);
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/log-out 1.png"))); // NOI18N
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutMouseExited(evt);
            }
        });
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        txtPayble.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        txtPayble.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        txtPayble.setText("0.00");
        txtPayble.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPaybleFocusGained(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N

        btnLoad.setBackground(new java.awt.Color(7, 108, 17));
        btnLoad.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        btnLoad.setForeground(java.awt.Color.white);
        btnLoad.setText("Cal Bill");
        btnLoad.setBorder(null);
        btnLoad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLoad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLoadMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLoadMouseExited(evt);
            }
        });
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });

        txt_billD.setFont(new java.awt.Font("Tw Cen MT", 0, 22)); // NOI18N
        txt_billD.setText("sasdasasd");

        discount1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        discount1.setText("Bill ID");

        txtcashName.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        txtcashName.setText("asfsdfd");

        txt_nicID.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        txt_nicID.setText("asfsdfd");

        discount2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        discount2.setText("Cashier Name");

        discount3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        discount3.setText("Cashier NIC");

        discount4.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        discount4.setText("Cashier ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(discount2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(discount3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(discount4, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_nic, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtcashName, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_nicID, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(100, 100, 100)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(btnLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(discount1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_billD, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(discount)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPayble, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtAmountPay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtDisc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_tot, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(88, 88, 88))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(QR, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(210, 210, 210))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logout)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_tot, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDisc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(discount, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPayble, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAmountPay, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(QR, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logout)
                .addGap(12, 12, 12))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_billD, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(discount1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcashName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(discount2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLoad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_nic, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(discount3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nicID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(discount4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jLabel13))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(head, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(head, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        // TODO add your handling code here:
        close.setBackground(new Color(14, 132, 116));
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        // TODO add your handling code here:
        close.setBackground(new Color(47, 46, 65));
    }//GEN-LAST:event_closeMouseExited

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeActionPerformed

    private void minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseEntered
        // TODO add your handling code here:
        minimize.setBackground(new Color(14, 132, 116));
    }//GEN-LAST:event_minimizeMouseEntered

    private void minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseExited
        // TODO add your handling code here:
        minimize.setBackground(new Color(47, 46, 65));
    }//GEN-LAST:event_minimizeMouseExited

    private void minimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizeActionPerformed
        // TODO add your handling code here:
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeActionPerformed

    private void logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseEntered
        // TODO add your handling code here:
        logout.setBackground(Color.lightGray);
    }//GEN-LAST:event_logoutMouseEntered

    private void logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseExited
        // TODO add your handling code here:
        logout.setBackground(Color.gray);
    }//GEN-LAST:event_logoutMouseExited

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        dispose();
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void QRMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QRMouseEntered
        // TODO add your handling code here:
        QR.setBackground(new Color(14, 132, 116));
    }//GEN-LAST:event_QRMouseEntered

    private void QRMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QRMouseExited
        // TODO add your handling code here:
        QR.setBackground(new Color(47, 46, 65));
    }//GEN-LAST:event_QRMouseExited

    private void QRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QRActionPerformed
        // TODO add your handling code here:
        Scan scan = new Scan(new CallBackInterface() {
            @Override
            public void calback(String id) {
                txt_billD.setText(id);
                
            }
        });
        
        scan.setVisible(true);
    }//GEN-LAST:event_QRActionPerformed
    
    
    
    
    private void confirmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmMouseEntered
        // TODO add your handling code here:
        confirm.setBackground(new Color(76, 134, 81));
        confirm.setForeground(Color.black);
    }//GEN-LAST:event_confirmMouseEntered

    private void confirmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmMouseExited
        // TODO add your handling code here:
        confirm.setBackground(new Color(7, 108, 17));
        confirm.setForeground(Color.white);
    }//GEN-LAST:event_confirmMouseExited

    private void cancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseEntered
        // TODO add your handling code here:
        cancel.setBackground(new Color(180, 96, 96));
        cancel.setForeground(Color.black);
    }//GEN-LAST:event_cancelMouseEntered

    private void cancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseExited
        // TODO add your handling code here:
        cancel.setBackground(new Color(156, 24, 24));
        cancel.setForeground(Color.black);
    }//GEN-LAST:event_cancelMouseExited

    private void btnLoadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoadMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLoadMouseEntered

    private void btnLoadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoadMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLoadMouseExited

    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed
        try {
            
            String BillID=txt_billD.getText();
            String sql = "SELECT i.item_name,i.i_price,bi.qty,i.i_discount FROM bill b INNER JOIN bill_item bi ON b.bill_id=bi.bill_id INNER JOIN item i ON bi.item_id=i.item_id WHERE b.bill_id='"+BillID+"';";
           
            pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            DefaultTableModel model = (DefaultTableModel) bill.getModel();
            model.setRowCount(0);

            while (rs.next()) {

                Object data[] = {rs.getString("item_name"), rs.getString("i_price"), rs.getString("qty"), rs.getString("i_discount")};
                model.addRow(data);
                
               
                int numrow=bill.getRowCount();
                double payble=0; 
                double tot =0;
                double distot=0;
                
                
                for(int i=0;i<numrow;i++){
                            
                            double price=Double.parseDouble(bill.getValueAt(i, 1).toString());
                            double qty=Double.parseDouble(bill.getValueAt(i, 2).toString());
                            double dis=Double.parseDouble(bill.getValueAt(i, 3).toString());
           
                            double val= price*qty;
                            tot+=val;
                            
                            double disPrice=price*(dis/100);
                            double disPriceQTY=disPrice*qty;
                            distot+=disPriceQTY;
                         
                            }
                
                txt_tot.setText(Double.toString(tot));
                txtDisc.setText(Double.toString(distot));
                
                payble=tot-distot;
                txtPayble.setText(Double.toString(payble));
            }
           
         
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
       
    }//GEN-LAST:event_btnLoadActionPerformed

    private void txtPaybleFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPaybleFocusGained
        if (txtAmountPay.getText().equals("0.00"))
        {
            txtAmountPay.setText("");
            txtAmountPay.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtPaybleFocusGained

    private void txtAmountPayFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAmountPayFocusLost
         if (txtAmountPay.getText().equals(""))
        {
            txtAmountPay.setText("");
            txtAmountPay.setForeground(new Color(47,46,65));
        }
    }//GEN-LAST:event_txtAmountPayFocusLost

    private void txtAmountPayKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAmountPayKeyPressed
       double cus_Pay=Double.parseDouble(txtAmountPay.getText());
       double dis_tot=Double.parseDouble(txtPayble.getText());
       double cus_balance=cus_Pay-dis_tot;
       txtBalance.setText(Double.toString(cus_balance));
       
    }//GEN-LAST:event_txtAmountPayKeyPressed

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        String BillID=txt_billD.getText();
        int cashID=Integer.parseInt(txt_nicID.getText());
        double  paied=Double.parseDouble(txtPayble.getText());
        double  Discount=Double.parseDouble(txtDisc.getText());
        
        
        
        try {
            String sql="INSERT INTO pay_bill (bill_id,cash_id,total_discount,total_price)values ('"+BillID+"','"+cashID+"','"+Discount+"','"+paied+"')";
            pst=con.prepareStatement(sql);
            pst.execute();
            
            String sqlUP="UPDATE bill SET status='Paied' WHERE bill_id='"+BillID+"'";
            pstUP=con.prepareStatement(sqlUP);
            pstUP.execute();
            
            JOptionPane.showMessageDialog(null, "Payment Successfull");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_confirmActionPerformed

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
            java.util.logging.Logger.getLogger(Cashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cashier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton QR;
    private javax.swing.JTable bill;
    private javax.swing.JButton btnLoad;
    private javax.swing.JButton cancel;
    private javax.swing.JButton close;
    private javax.swing.JButton confirm;
    private javax.swing.JLabel discount;
    private javax.swing.JLabel discount1;
    private javax.swing.JLabel discount2;
    private javax.swing.JLabel discount3;
    private javax.swing.JLabel discount4;
    private javax.swing.JPanel head;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logout;
    private javax.swing.JButton minimize;
    private javax.swing.JTextField txtAmountPay;
    private javax.swing.JLabel txtBalance;
    private javax.swing.JLabel txtDisc;
    private javax.swing.JLabel txtPayble;
    private javax.swing.JLabel txt_billD;
    private javax.swing.JLabel txt_nic;
    private javax.swing.JLabel txt_nicID;
    private javax.swing.JLabel txt_tot;
    private javax.swing.JLabel txtcashName;
    // End of variables declaration//GEN-END:variables
}
