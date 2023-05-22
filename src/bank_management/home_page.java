package bank_management;
import java.awt.Color;
import java.awt.Component;
import java.sql.*;
import java.text.MessageFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.*;
import javax.swing.UIManager;
import javax.swing.table.*;
import net.proteanit.sql.DbUtils;
public class home_page extends javax.swing.JFrame implements Runnable{
    Connection conn;
    ResultSet res;
    Statement stt;
    Thread th;
    int s=0;
    static String panel_name="";

    public home_page() {
        initComponents();
        setTitle("Bank Management System");

        insert_data insert= new insert_data();

        main.removeAll();
        main.repaint();
        main.revalidate();

        main.add(home_page);
        main.repaint();
        main.revalidate();

        home_login.removeAll();
        home_login.repaint();
        home_login.revalidate();

        home_login.add(login_main);
        home_login.repaint();
        home_login.revalidate();


    }
    public void setUploading(){
        setVisible(false);

    }

    @Override
    public void run() {
        try{
            for(int i=0;i<=200;i++){
                s++;
                int m=progress_bar.getMaximum();
                int v=progress_bar.getValue();
                if(v<m){
                    progress_bar.setValue(progress_bar.getValue()+1);

                }
                else{
                    i =201;
                    main.removeAll();
                    main.repaint();
                    main.revalidate();


                    if(panel_name.equals("admin")){
                        main.add(admin);
                        main.repaint();
                        main.revalidate();
                        admin_main.removeAll();
                        admin_main.repaint();
                        admin_main.revalidate();
                        admin_main.add(admin_dash);
                        admin_main.repaint();
                        admin_main.revalidate();
                    }
                    else if(panel_name.equals("user_page")){
                        main.add(user_page);
                        main.repaint();
                        main.revalidate();
                        user_main.removeAll();
                        user_main.repaint();
                        user_main.revalidate();
                        user_main.add(dash_board);
                        user_main.repaint();
                        user_main.revalidate();


                    }


                    home_login.removeAll();
                    home_login.repaint();
                    home_login.revalidate();

                    home_login.add(login_main);
                    home_login.repaint();
                    home_login.revalidate();
                }
                Thread.sleep(50);
            }
        }
        catch(Exception e){

        }
    }
    public void getindex(String name){
        panel_name = name;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        main = new javax.swing.JPanel();
        home_page = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        account = new javax.swing.JComboBox<>();
        home_login = new javax.swing.JPanel();
        login_main = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        user_id = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        user_pass = new javax.swing.JPasswordField();
        progress = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        progress_bar = new javax.swing.JProgressBar();
        jLabel54 = new javax.swing.JLabel();
        admin = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        user_logout = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jButton22 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButton49 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel91 = new javax.swing.JLabel();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        admin_main = new javax.swing.JPanel();
        admin_dash = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        user_list_table = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        full_table = new javax.swing.JTable();
        list = new javax.swing.JLabel();
        jButton55 = new javax.swing.JButton();
        search = new javax.swing.JPanel();
        details10 = new javax.swing.JPanel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jTextField50 = new javax.swing.JTextField();
        jTextField51 = new javax.swing.JTextField();
        jTextField52 = new javax.swing.JTextField();
        jTextField53 = new javax.swing.JTextField();
        jTextField54 = new javax.swing.JTextField();
        jTextField55 = new javax.swing.JTextField();
        jTextField56 = new javax.swing.JTextField();
        jTextField57 = new javax.swing.JTextField();
        jTextField58 = new javax.swing.JTextField();
        jTextField60 = new javax.swing.JTextField();
        jButton51 = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        jLabel144 = new javax.swing.JLabel();
        jTextField81 = new javax.swing.JTextField();
        search_ex = new javax.swing.JPanel();
        details11 = new javax.swing.JPanel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        jTextField59 = new javax.swing.JTextField();
        jTextField61 = new javax.swing.JTextField();
        jTextField62 = new javax.swing.JTextField();
        jTextField63 = new javax.swing.JTextField();
        jTextField64 = new javax.swing.JTextField();
        jTextField65 = new javax.swing.JTextField();
        jTextField66 = new javax.swing.JTextField();
        jTextField67 = new javax.swing.JTextField();
        jTextField68 = new javax.swing.JTextField();
        jTextField69 = new javax.swing.JTextField();
        jButton52 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jTextField80 = new javax.swing.JTextField();
        jLabel143 = new javax.swing.JLabel();
        ex_list = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        full_table3 = new javax.swing.JTable();
        list2 = new javax.swing.JLabel();
        jButton57 = new javax.swing.JButton();
        balanced = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        full_table4 = new javax.swing.JTable();
        list3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        history = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        full_table5 = new javax.swing.JTable();
        list4 = new javax.swing.JLabel();
        admin_up = new javax.swing.JPanel();
        details13 = new javax.swing.JPanel();
        jLabel146 = new javax.swing.JLabel();
        jLabel155 = new javax.swing.JLabel();
        jButton64 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        user_page = new javax.swing.JPanel();
        jPane = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        user_name_show = new javax.swing.JLabel();
        user_logout1 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        user_p_id = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        user_p_name = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        user_main = new javax.swing.JPanel();
        dash_board = new javax.swing.JPanel();
        jButton21 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        details_user = new javax.swing.JPanel();
        details = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jButton36 = new javax.swing.JButton();
        withdraw = new javax.swing.JPanel();
        details1 = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        withdraw_id = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jTextField13 = new javax.swing.JPasswordField();
        transfer = new javax.swing.JPanel();
        details4 = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        transfer_id = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jButton18 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JPasswordField();
        transaction_history = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        full_table1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.FlowLayout());

        main.setLayout(new java.awt.GridBagLayout());

        home_page.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 51, 51)));
        home_page.setMaximumSize(new java.awt.Dimension(1000, 700));
        home_page.setPreferredSize(new java.awt.Dimension(900, 570));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setPreferredSize(new java.awt.Dimension(900, 48));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Webdings", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Andalus", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 255));
        jLabel10.setText("Banking System");

        jLabel11.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Select Account");

        account.setFont(new java.awt.Font("Andalus", 2, 14)); // NOI18N
        account.setForeground(new java.awt.Color(51, 51, 51));
        account.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Local User" }));
        account.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountaccountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(account, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel9)
                                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, Short.MAX_VALUE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(account, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel11))
                                                .addGap(0, 0, Short.MAX_VALUE))))
        );

        home_login.setPreferredSize(new java.awt.Dimension(895, 510));
        home_login.setLayout(new java.awt.GridBagLayout());

        login_main.setMinimumSize(new java.awt.Dimension(890, 520));
        login_main.setName(""); // NOI18N
        login_main.setPreferredSize(new java.awt.Dimension(875, 510));
        login_main.setLayout(new java.awt.GridBagLayout());

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/admin.png"))); // NOI18N
        jLabel16.setMaximumSize(new java.awt.Dimension(456, 245));
        jLabel16.setMinimumSize(new java.awt.Dimension(456, 245));

        jPanel8.setBackground(new java.awt.Color(153, 255, 153));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 255, 204), new java.awt.Color(204, 255, 204)));
        jPanel8.setPreferredSize(new java.awt.Dimension(399, 200));

        jPanel7.setBackground(new java.awt.Color(0, 153, 102));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Login First");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel13.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jLabel13.setText("User Name :");

        user_id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jLabel14.setText("Password :");

        jButton1.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jButton2.setText("Clear");
        jButton2.setMaximumSize(new java.awt.Dimension(41, 26));
        jButton2.setMinimumSize(new java.awt.Dimension(41, 26));
        jButton2.setPreferredSize(new java.awt.Dimension(41, 26));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(user_id)
                                        .addComponent(user_pass)
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addComponent(jButton1)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)))
                                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(user_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addGap(32, 32, 32)
                                                .addComponent(jLabel14))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                                .addGap(24, 24, 24)
                                                .addComponent(user_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addContainerGap(21, Short.MAX_VALUE)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.ipady = -6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 197, 0, 151);
        login_main.add(jPanel4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = -394;
        gridBagConstraints.ipady = -11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 10);
        home_login.add(login_main, gridBagConstraints);

        progress.setPreferredSize(new java.awt.Dimension(875, 510));
        progress.setLayout(new java.awt.GridBagLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Loading...", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Footlight MT Light", 3, 36), new java.awt.Color(0, 51, 51))); // NOI18N

        jLabel58.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel58.setText("Redirecting ...");

        progress_bar.setForeground(new java.awt.Color(0, 0, 204));
        progress_bar.setOpaque(true);
        progress_bar.setStringPainted(true);

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/loading.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(progress_bar, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(89, 89, 89))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel58)
                                .addGap(195, 195, 195))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(progress_bar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel58)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        progress.add(jPanel1, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = -104;
        gridBagConstraints.ipady = -115;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 20, 1, 10);
        home_login.add(progress, gridBagConstraints);

        javax.swing.GroupLayout home_pageLayout = new javax.swing.GroupLayout(home_page);
        home_page.setLayout(home_pageLayout);
        home_pageLayout.setHorizontalGroup(
                home_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, home_pageLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(home_login, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
                                .addContainerGap())
        );
        home_pageLayout.setVerticalGroup(
                home_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(home_pageLayout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(home_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = -665;
        gridBagConstraints.ipady = -558;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        main.add(home_page, gridBagConstraints);

        admin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        admin.setPreferredSize(new java.awt.Dimension(910, 574));

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Webdings", 1, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("");

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Andalus", 1, 30)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 255));
        jLabel17.setText("Banking System");

        user_logout.setFont(new java.awt.Font("Felix Titling", 1, 11)); // NOI18N
        user_logout.setForeground(new java.awt.Color(255, 255, 255));
        user_logout.setText("Logout");
        user_logout.setContentAreaFilled(false);
        user_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_logoutActionPerformed(evt);
            }
        });

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N

        jButton22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton22.setForeground(new java.awt.Color(204, 255, 204));
        jButton22.setText("Update");
        jButton22.setContentAreaFilled(false);
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton22)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(user_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56))
        );
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(user_logout))
                                .addContainerGap(11, Short.MAX_VALUE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel15))
                                        .addComponent(jButton22))
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(21, 55, 70));

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Bookman Old Style", 3, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(204, 255, 204));
        jButton4.setText("CUSTOMER LIST");
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton4.setVerifyInputWhenFocusTarget(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Bookman Old Style", 3, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(204, 255, 204));
        jButton5.setText("SEARCH CUSTOMER");
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Bookman Old Style", 3, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(204, 255, 204));
        jButton6.setText("CREATE CUSTOMER ACC.");
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jPanel10.setBackground(new java.awt.Color(0, 51, 51));

        jButton49.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        jButton49.setForeground(new java.awt.Color(255, 255, 255));
        jButton49.setText("Dash Board");
        jButton49.setContentAreaFilled(false);
        jButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton49ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
                jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton49, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
                jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton49, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search(1).png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_list.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/create_user.png"))); // NOI18N

        jPanel17.setBackground(new java.awt.Color(0, 153, 153));

        jLabel91.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(204, 204, 204));
        jLabel91.setText("CUSTOMER FIELD");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
                jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabel91)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
                jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel91)
                                .addContainerGap())
        );

        jButton41.setFont(new java.awt.Font("Bookman Old Style", 3, 12)); // NOI18N
        jButton41.setForeground(new java.awt.Color(204, 255, 204));
        jButton41.setText("Total Balance");
        jButton41.setContentAreaFilled(false);
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });

        jButton42.setFont(new java.awt.Font("Bookman Old Style", 3, 12)); // NOI18N
        jButton42.setForeground(new java.awt.Color(204, 255, 204));
        jButton42.setText("All Transaction History");
        jButton42.setContentAreaFilled(false);
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });

        jLabel80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bl.png"))); // NOI18N

        jLabel81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/history.png"))); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
                jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel9Layout.createSequentialGroup()
                                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(15, 15, 15))
                                        .addGroup(jPanel9Layout.createSequentialGroup()
                                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel9Layout.createSequentialGroup()
                                                                .addGap(27, 27, 27)
                                                                .addComponent(jLabel81)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel9Layout.createSequentialGroup()
                                                                .addGap(24, 24, 24)
                                                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel9Layout.createSequentialGroup()
                                                                                .addComponent(jLabel5)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(jPanel9Layout.createSequentialGroup()
                                                                                .addComponent(jLabel4)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(jButton5))))
                                                        .addGroup(jPanel9Layout.createSequentialGroup()
                                                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel9Layout.createSequentialGroup()
                                                                                .addGap(26, 26, 26)
                                                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(jLabel80, javax.swing.GroupLayout.Alignment.TRAILING))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jButton6)
                                                                        .addComponent(jButton41))))
                                                .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel9Layout.setVerticalGroup(
                jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5))
                                .addGap(13, 13, 13)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton5)
                                        .addComponent(jLabel4))
                                .addGap(9, 9, 9)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel80)
                                        .addComponent(jButton41))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel81)
                                        .addComponent(jButton42))
                                .addContainerGap(257, Short.MAX_VALUE))
        );

        admin_main.setMaximumSize(new java.awt.Dimension(634, 490));
        admin_main.setMinimumSize(new java.awt.Dimension(634, 490));
        admin_main.setPreferredSize(new java.awt.Dimension(634, 490));
        admin_main.setLayout(new java.awt.GridBagLayout());

        admin_dash.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        admin_dash.setMaximumSize(new java.awt.Dimension(620, 460));
        admin_dash.setMinimumSize(new java.awt.Dimension(620, 460));
        admin_dash.setPreferredSize(new java.awt.Dimension(620, 460));
        admin_dash.setLayout(new java.awt.GridBagLayout());

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_listB.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = -11;
        gridBagConstraints.ipady = -22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(68, 35, 0, 0);
        admin_dash.add(jButton3, gridBagConstraints);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/searchB.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = -16;
        gridBagConstraints.ipady = -22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(68, 47, 0, 0);
        admin_dash.add(jButton8, gridBagConstraints);

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/createB.png"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = -13;
        gridBagConstraints.ipady = -22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(68, 33, 0, 41);
        admin_dash.add(jButton9, gridBagConstraints);

        jLabel18.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 51, 51));
        jLabel18.setText("CUSTOMER LIST");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 50, 0, 0);
        admin_dash.add(jLabel18, gridBagConstraints);

        jLabel20.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 51, 51));
        jLabel20.setText("CREATE CUSTOMER");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 43, 0, 0);
        admin_dash.add(jLabel20, gridBagConstraints);

        jLabel21.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 51, 51));
        jLabel21.setText("SEARCH CUSTOMER");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 47, 0, 0);
        admin_dash.add(jLabel21, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = -560;
        gridBagConstraints.ipady = -444;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        admin_main.add(admin_dash, gridBagConstraints);

        user_list_table.setBackground(new java.awt.Color(204, 204, 204));
        user_list_table.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        user_list_table.setMaximumSize(new java.awt.Dimension(620, 460));
        user_list_table.setMinimumSize(new java.awt.Dimension(620, 460));
        user_list_table.setPreferredSize(new java.awt.Dimension(620, 460));

        full_table.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        full_table.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {},
                        {},
                        {},
                        {}
                },
                new String [] {

                }
        ));
        full_table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        full_table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        full_table.setFocusable(false);
        full_table.setName(""); // NOI18N
        full_table.setRequestFocusEnabled(false);
        full_table.setRowHeight(25);
        full_table.setRowMargin(2);
        full_table.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                full_tableComponentResized(evt);
            }
        });
        jScrollPane5.setViewportView(full_table);
        full_table.getAccessibleContext().setAccessibleDescription("");

        list.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jButton55.setText("Delete");
        jButton55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton55ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout user_list_tableLayout = new javax.swing.GroupLayout(user_list_table);
        user_list_table.setLayout(user_list_tableLayout);
        user_list_tableLayout.setHorizontalGroup(
                user_list_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(user_list_tableLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(user_list_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(user_list_tableLayout.createSequentialGroup()
                                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                .addContainerGap())
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, user_list_tableLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(user_list_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, user_list_tableLayout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton55)
                                                                .addContainerGap())
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, user_list_tableLayout.createSequentialGroup()
                                                                .addComponent(list, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(196, 196, 196))))))
        );
        user_list_tableLayout.setVerticalGroup(
                user_list_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, user_list_tableLayout.createSequentialGroup()
                                .addComponent(list, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(user_list_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton55)
                                        )
                                .addGap(5, 5, 5))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = -571;
        gridBagConstraints.ipady = -500;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        admin_main.add(user_list_table, gridBagConstraints);

        search.setBackground(new java.awt.Color(51, 51, 51));
        search.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        search.setMaximumSize(new java.awt.Dimension(624, 470));
        search.setMinimumSize(new java.awt.Dimension(0, 0));
        search.setPreferredSize(new java.awt.Dimension(624, 470));
        search.setLayout(new java.awt.GridBagLayout());

        details10.setBackground(new java.awt.Color(204, 204, 204));
        details10.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        details10.setMaximumSize(new java.awt.Dimension(610, 460));
        details10.setMinimumSize(new java.awt.Dimension(610, 460));
        details10.setName(""); // NOI18N
        details10.setPreferredSize(new java.awt.Dimension(624, 470));
        details10.setLayout(new java.awt.GridBagLayout());

        jLabel113.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel113.setText("User Search and Update ");
        jLabel113.setMaximumSize(new java.awt.Dimension(100, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 15;
        gridBagConstraints.ipadx = 26;
        gridBagConstraints.ipady = -3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(52, 192, 0, 206);
        details10.add(jLabel113, gridBagConstraints);

        jLabel114.setText("Account ID:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(23, 150, 0, 0);
        details10.add(jLabel114, gridBagConstraints);

        jLabel115.setText("Password:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 157, 0, 0);
        details10.add(jLabel115, gridBagConstraints);

        jLabel116.setText("Account Type:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 135, 0, 0);
        details10.add(jLabel116, gridBagConstraints);

        jLabel117.setText("NID:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 182, 0, 0);
        details10.add(jLabel117, gridBagConstraints);

        jLabel118.setText("Date Of Birth:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 136, 0, 0);
        details10.add(jLabel118, gridBagConstraints);

        jLabel119.setText("Join Date:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 152, 0, 0);
        details10.add(jLabel119, gridBagConstraints);

        jLabel120.setText("Nationality :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 145, 0, 0);
        details10.add(jLabel120, gridBagConstraints);

        jLabel121.setText("Phone Number:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 129, 0, 0);
        details10.add(jLabel121, gridBagConstraints);

        jLabel122.setText("Name: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 174, 0, 0);
        details10.add(jLabel122, gridBagConstraints);

        jTextField50.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 167;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 17, 0, 0);
        details10.add(jTextField50, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 167;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 0, 0);
        details10.add(jTextField51, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 167;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 17, 0, 0);
        details10.add(jTextField52, gridBagConstraints);

        jTextField53.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 167;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 15, 0, 0);
        details10.add(jTextField53, gridBagConstraints);

        jTextField54.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 167;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 14, 0, 0);
        details10.add(jTextField54, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 167;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 13, 0, 0);
        details10.add(jTextField55, gridBagConstraints);

        jTextField56.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 167;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 11, 0, 0);
        details10.add(jTextField56, gridBagConstraints);

        jTextField57.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 167;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 13, 0, 0);
        details10.add(jTextField57, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 167;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 13, 0, 0);
        details10.add(jTextField58, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 167;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 0, 0);
        details10.add(jTextField60, gridBagConstraints);

        jButton51.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton51.setText("Search");
        jButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton51ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 142, 0, 0);
        details10.add(jButton51, gridBagConstraints);

        jButton53.setText("Update");
        jButton53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton53ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 117, 60, 0);
        details10.add(jButton53, gridBagConstraints);

        jLabel144.setText("Address :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 158, 0, 0);
        details10.add(jLabel144, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 167;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 9, 0, 0);
        details10.add(jTextField81, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        search.add(details10, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = -600;
        gridBagConstraints.ipady = -600;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        admin_main.add(search, gridBagConstraints);

        search_ex.setBackground(new java.awt.Color(51, 51, 51));
        search_ex.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        search_ex.setMaximumSize(new java.awt.Dimension(624, 470));
        search_ex.setPreferredSize(new java.awt.Dimension(624, 470));
        search_ex.setLayout(new java.awt.GridBagLayout());

        details11.setBackground(new java.awt.Color(204, 204, 204));
        details11.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        details11.setMaximumSize(new java.awt.Dimension(624, 470));
        details11.setMinimumSize(new java.awt.Dimension(624, 470));
        details11.setPreferredSize(new java.awt.Dimension(624, 470));
        details11.setLayout(new java.awt.GridBagLayout());

        jLabel123.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel123.setMaximumSize(new java.awt.Dimension(100, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(39, 191, 0, 204);
        details11.add(jLabel123, gridBagConstraints);

        jLabel124.setText("Executive ID:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 164, 0, 0);
        details11.add(jLabel124, gridBagConstraints);

        jLabel125.setText("Password:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 177, 0, 0);
        details11.add(jLabel125, gridBagConstraints);

        jLabel126.setText("Designation :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 166, 0, 0);
        details11.add(jLabel126, gridBagConstraints);

        jLabel127.setText("NID:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 205, 0, 0);
        details11.add(jLabel127, gridBagConstraints);

        jLabel128.setText("Date Of Birth:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 160, 0, 0);
        details11.add(jLabel128, gridBagConstraints);

        jLabel129.setText("Join Date:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 180, 0, 0);
        details11.add(jLabel129, gridBagConstraints);

        jLabel130.setText("Nationality :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 171, 0, 0);
        details11.add(jLabel130, gridBagConstraints);

        jLabel131.setText("Phone Number:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 19;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 155, 0, 0);
        details11.add(jLabel131, gridBagConstraints);

        jLabel132.setText("Name: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 193, 0, 0);
        details11.add(jLabel132, gridBagConstraints);

        jTextField59.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 167;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 18, 0, 204);
        details11.add(jTextField59, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 167;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 0, 204);
        details11.add(jTextField61, gridBagConstraints);

        jTextField62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField62ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 167;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 18, 0, 204);
        details11.add(jTextField62, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 167;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 0, 204);
        details11.add(jTextField63, gridBagConstraints);

        jTextField64.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 167;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 0, 204);
        details11.add(jTextField64, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 167;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 18, 0, 204);
        details11.add(jTextField65, gridBagConstraints);

        jTextField66.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 167;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 0, 204);
        details11.add(jTextField66, gridBagConstraints);

        jTextField67.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 167;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 0, 204);
        details11.add(jTextField67, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 21;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 167;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 0, 204);
        details11.add(jTextField68, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 167;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 18, 0, 204);
        details11.add(jTextField69, gridBagConstraints);

        jButton52.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton52.setForeground(new java.awt.Color(0, 102, 102));
        jButton52.setText("Search");
        jButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton52ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 158, 0, 0);
        details11.add(jButton52, gridBagConstraints);

        jButton50.setText("Update");
        jButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton50ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 23;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 124, 55, 204);
        details11.add(jButton50, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 19;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 167;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 0, 204);
        details11.add(jTextField80, gridBagConstraints);

        jLabel143.setText("Address :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 21;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 183, 0, 0);
        details11.add(jLabel143, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        search_ex.add(details11, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = -182;
        gridBagConstraints.ipady = 69;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        admin_main.add(search_ex, gridBagConstraints);

        ex_list.setBackground(new java.awt.Color(204, 204, 204));
        ex_list.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        ex_list.setMaximumSize(new java.awt.Dimension(620, 460));
        ex_list.setMinimumSize(new java.awt.Dimension(620, 460));

        full_table3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        full_table3.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {},
                        {},
                        {},
                        {}
                },
                new String [] {

                }
        ));
        full_table3.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        full_table3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        full_table3.setFocusable(false);
        full_table3.setName(""); // NOI18N
        full_table3.setRequestFocusEnabled(false);
        full_table3.setRowHeight(25);
        full_table3.setRowMargin(2);
        full_table3.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                full_table3ComponentResized(evt);
            }
        });
        jScrollPane8.setViewportView(full_table3);


        jButton57.setText("Delete");
        jButton57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton57ActionPerformed(evt);
            }
        });



        javax.swing.GroupLayout ex_listLayout = new javax.swing.GroupLayout(ex_list);
        ex_list.setLayout(ex_listLayout);
        ex_listLayout.setHorizontalGroup(
                ex_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ex_listLayout.createSequentialGroup()
                                .addGroup(ex_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(ex_listLayout.createSequentialGroup()
                                                .addGap(263, 263, 263)
                                                .addComponent(list2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(ex_listLayout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addGroup(ex_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(ex_listLayout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton57))
                                                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(2, 2, 2))
        );
        ex_listLayout.setVerticalGroup(
                ex_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ex_listLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(list2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ex_listLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(ex_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton57))
                                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = -571;
        gridBagConstraints.ipady = -500;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        admin_main.add(ex_list, gridBagConstraints);

        balanced.setBackground(new java.awt.Color(204, 204, 204));
        balanced.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        balanced.setMaximumSize(new java.awt.Dimension(620, 460));
        balanced.setMinimumSize(new java.awt.Dimension(620, 460));
        balanced.setLayout(new java.awt.GridBagLayout());

        full_table4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        full_table4.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {},
                        {},
                        {},
                        {}
                },
                new String [] {

                }
        ));
        full_table4.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        full_table4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        full_table4.setFocusable(false);
        full_table4.setName(""); // NOI18N
        full_table4.setRequestFocusEnabled(false);
        full_table4.setRowHeight(25);
        full_table4.setRowMargin(2);
        full_table4.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                full_table4ComponentResized(evt);
            }
        });
        jScrollPane9.setViewportView(full_table4);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 982;
        gridBagConstraints.ipady = 701;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(13, 22, 0, 26);
        balanced.add(jScrollPane9, gridBagConstraints);

        list3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        list3.setText("Total Balance");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 139, 0, 0);
        balanced.add(list3, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("jLabel1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 176;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 139, 0, 0);
        balanced.add(jLabel1, gridBagConstraints);


        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 22, 17, 0);


        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = -571;
        gridBagConstraints.ipady = -500;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        admin_main.add(balanced, gridBagConstraints);

        history.setBackground(new java.awt.Color(204, 204, 204));
        history.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        history.setMaximumSize(new java.awt.Dimension(620, 460));
        history.setMinimumSize(new java.awt.Dimension(620, 460));
        history.setLayout(new java.awt.GridBagLayout());

        full_table5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        full_table5.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {},
                        {},
                        {},
                        {}
                },
                new String [] {

                }
        ));
        full_table5.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        full_table5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        full_table5.setFocusable(false);
        full_table5.setName(""); // NOI18N
        full_table5.setRequestFocusEnabled(false);
        full_table5.setRowHeight(25);
        full_table5.setRowMargin(2);
        full_table5.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                full_table5ComponentResized(evt);
            }
        });
        jScrollPane10.setViewportView(full_table5);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 573;
        gridBagConstraints.ipady = 359;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 8, 0, 16);
        history.add(jScrollPane10, gridBagConstraints);

        list4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        list4.setText("Total Transaction History");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 187, 0, 0);
        history.add(list4, gridBagConstraints);


        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 168, 16, 16);


        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = -571;
        gridBagConstraints.ipady = -500;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        admin_main.add(history, gridBagConstraints);

        admin_up.setBackground(new java.awt.Color(51, 51, 51));
        admin_up.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        admin_up.setMaximumSize(new java.awt.Dimension(624, 470));
        admin_up.setMinimumSize(new java.awt.Dimension(0, 0));
        admin_up.setPreferredSize(new java.awt.Dimension(624, 470));
        admin_up.setLayout(new java.awt.GridBagLayout());

        details13.setBackground(new java.awt.Color(204, 204, 204));
        details13.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        details13.setMaximumSize(new java.awt.Dimension(610, 460));
        details13.setMinimumSize(new java.awt.Dimension(610, 460));
        details13.setName(""); // NOI18N

        jLabel146.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel146.setText("Admin password update");
        jLabel146.setMaximumSize(new java.awt.Dimension(100, 14));

        jLabel155.setText("Password");

        jButton64.setText("Update");
        jButton64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton64ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout details13Layout = new javax.swing.GroupLayout(details13);
        details13.setLayout(details13Layout);
        details13Layout.setHorizontalGroup(
                details13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(details13Layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(jLabel155)
                                .addGroup(details13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(details13Layout.createSequentialGroup()
                                                .addGap(39, 39, 39)
                                                .addComponent(jLabel146, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(details13Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(31, 31, 31)
                                                .addComponent(jButton64)))
                                .addContainerGap(147, Short.MAX_VALUE))
        );
        details13Layout.setVerticalGroup(
                details13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(details13Layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(jLabel146, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addGroup(details13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton64)
                                        .addComponent(jLabel155)
                                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(290, 290, 290))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        admin_up.add(details13, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = -600;
        gridBagConstraints.ipady = -600;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        admin_main.add(admin_up, gridBagConstraints);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(admin_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(admin_main, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(92, 92, 92))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout adminLayout = new javax.swing.GroupLayout(admin);
        admin.setLayout(adminLayout);
        adminLayout.setHorizontalGroup(
                adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminLayout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        adminLayout.setVerticalGroup(
                adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(adminLayout.createSequentialGroup()
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1))
        );

        main.add(admin, new java.awt.GridBagConstraints());

        user_page.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 51, 51)));
        user_page.setMaximumSize(new java.awt.Dimension(930, 589));
        user_page.setPreferredSize(new java.awt.Dimension(930, 589));
        user_page.setLayout(new java.awt.GridBagLayout());

        jPane.setBackground(new java.awt.Color(51, 51, 51));

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Webdings", 1, 36)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("");

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setFont(new java.awt.Font("Andalus", 1, 30)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(204, 204, 255));
        jLabel27.setText("Banking System");

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user(1).png"))); // NOI18N

        user_name_show.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        user_name_show.setForeground(new java.awt.Color(102, 255, 204));
        user_name_show.setText("ABD");

        user_logout1.setFont(new java.awt.Font("Felix Titling", 1, 11)); // NOI18N
        user_logout1.setForeground(new java.awt.Color(255, 255, 255));
        user_logout1.setText("Logout");
        user_logout1.setContentAreaFilled(false);
        user_logout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_logout1ActionPerformed(evt);
            }
        });

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N

        javax.swing.GroupLayout jPaneLayout = new javax.swing.GroupLayout(jPane);
        jPane.setLayout(jPaneLayout);
        jPaneLayout.setHorizontalGroup(
                jPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 250, Short.MAX_VALUE)
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(user_name_show, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(user_logout1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49))
        );
        jPaneLayout.setVerticalGroup(
                jPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPaneLayout.createSequentialGroup()
                                .addGroup(jPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel26)
                                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(jPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPaneLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(user_logout1))
                                        .addComponent(user_name_show, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 244;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 12, 0, 12);
        user_page.add(jPane, gridBagConstraints);

        jPanel14.setBackground(new java.awt.Color(204, 204, 204));
        jPanel14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        jPanel14.setPreferredSize(new java.awt.Dimension(900, 509));

        jPanel15.setBackground(new java.awt.Color(153, 204, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Current Account Summery");

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel31.setText("Account ID :");

        user_p_id.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        user_p_id.setText("00000");

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel32.setText("Name        :");

        user_p_name.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        user_p_name.setText("ABD");

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel34.setText("$1000000000");

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel35.setText("Amount     :");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
                jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel15Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel15Layout.createSequentialGroup()
                                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel15Layout.createSequentialGroup()
                                                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(user_p_name)
                                                                        .addComponent(user_p_id, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(jPanel15Layout.createSequentialGroup()
                                                                .addComponent(jLabel35)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabel34)))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
                jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel15Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel31)
                                        .addComponent(user_p_id))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel32)
                                        .addComponent(user_p_name))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel35)
                                        .addComponent(jLabel34))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel16.setBackground(new java.awt.Color(0, 102, 102));
        jPanel16.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel16.setLayout(new java.awt.GridBagLayout());

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/details.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 14, 0, 0);
        jPanel16.add(jLabel36, gridBagConstraints);

        jButton15.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jButton15.setForeground(new java.awt.Color(153, 255, 255));
        jButton15.setText("ACCOUNT DETAILS");
        jButton15.setContentAreaFilled(false);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 9, 0, 0);
        jPanel16.add(jButton15, gridBagConstraints);

        jButton17.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jButton17.setForeground(new java.awt.Color(153, 255, 255));
        jButton17.setText("WITHDRAW CASH");
        jButton17.setContentAreaFilled(false);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 10, 0, 0);
        jPanel16.add(jButton17, gridBagConstraints);

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/withdrawl.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 14, 0, 0);
        jPanel16.add(jLabel38, gridBagConstraints);

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/transfer.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 14, 0, 0);
        jPanel16.add(jLabel39, gridBagConstraints);

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hostory.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 14, 2, 0);
        jPanel16.add(jLabel40, gridBagConstraints);

        jButton19.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jButton19.setForeground(new java.awt.Color(153, 255, 255));
        jButton19.setText("TRANSACTION HISTORY");
        jButton19.setContentAreaFilled(false);
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 9, 2, 2);
        jPanel16.add(jButton19, gridBagConstraints);

        jButton20.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jButton20.setForeground(new java.awt.Color(153, 255, 255));
        jButton20.setText("TRANSFER MONEY");
        jButton20.setContentAreaFilled(false);
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 10, 0, 0);
        jPanel16.add(jButton20, gridBagConstraints);

        jButton31.setBackground(new java.awt.Color(0, 102, 102));
        jButton31.setFont(new java.awt.Font("Bookman Old Style", 0, 24)); // NOI18N
        jButton31.setForeground(new java.awt.Color(153, 255, 255));
        jButton31.setText("DashBoard");
        jButton31.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 4, 0, 0);
        jPanel16.add(jButton31, gridBagConstraints);

        user_main.setBackground(new java.awt.Color(204, 204, 204));
        user_main.setPreferredSize(new java.awt.Dimension(580, 450));
        user_main.setLayout(new java.awt.GridBagLayout());

        dash_board.setBackground(new java.awt.Color(204, 204, 204));
        dash_board.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        dash_board.setPreferredSize(new java.awt.Dimension(596, 459));

        jButton21.setBackground(new java.awt.Color(204, 204, 204));
        jButton21.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/DetailsB.png"))); // NOI18N
        jButton21.setBorderPainted(false);
        jButton21.setContentAreaFilled(false);
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton23.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/withdrawlB.png"))); // NOI18N
        jButton23.setContentAreaFilled(false);
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/transferB.png"))); // NOI18N
        jButton24.setContentAreaFilled(false);
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton25.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/historyB.png"))); // NOI18N
        jButton25.setContentAreaFilled(false);
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(0, 102, 102));
        jLabel42.setText("ACCOUNT DETAILS");

        jLabel44.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(0, 102, 102));
        jLabel44.setText("WITHDRAW CASH");

        jLabel45.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(0, 102, 102));
        jLabel45.setText("TRANSFER MONEY");

        jLabel47.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(0, 102, 102));
        jLabel47.setText("TRANSACTION HISTORY");

        javax.swing.GroupLayout dash_boardLayout = new javax.swing.GroupLayout(dash_board);
        dash_board.setLayout(dash_boardLayout);
        dash_boardLayout.setHorizontalGroup(
                dash_boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dash_boardLayout.createSequentialGroup()
                                .addGroup(dash_boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(dash_boardLayout.createSequentialGroup()
                                                .addGroup(dash_boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(dash_boardLayout.createSequentialGroup()
                                                                .addGroup(dash_boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(dash_boardLayout.createSequentialGroup()
                                                                                .addGap(106, 106, 106)
                                                                                .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(dash_boardLayout.createSequentialGroup()
                                                                                .addGap(129, 129, 129)
                                                                                .addComponent(jLabel42)))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGroup(dash_boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jButton23)
                                                                        .addGroup(dash_boardLayout.createSequentialGroup()
                                                                                .addGap(10, 10, 10)
                                                                                .addGroup(dash_boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jLabel44)
                                                                                        .addComponent(jButton25)))))
                                                        .addGroup(dash_boardLayout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(jLabel47)))
                                                .addGap(32, 32, 32))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, dash_boardLayout.createSequentialGroup()
                                                .addGap(105, 105, 105)
                                                .addGroup(dash_boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel45)
                                                        .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(71, 71, 71))
        );
        dash_boardLayout.setVerticalGroup(
                dash_boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(dash_boardLayout.createSequentialGroup()
                                .addGroup(dash_boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(dash_boardLayout.createSequentialGroup()
                                                .addGap(48, 48, 48)
                                                .addComponent(jButton21))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dash_boardLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(dash_boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel42)
                                        .addComponent(jLabel44))
                                .addGroup(dash_boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(dash_boardLayout.createSequentialGroup()
                                                .addGap(51, 51, 51)
                                                .addComponent(jButton24))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dash_boardLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton25)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(dash_boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel45)
                                        .addComponent(jLabel47))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 0);
        user_main.add(dash_board, gridBagConstraints);

        details_user.setBackground(new java.awt.Color(51, 51, 51));
        details_user.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        details_user.setPreferredSize(new java.awt.Dimension(596, 459));

        details.setBackground(new java.awt.Color(204, 204, 204));
        details.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        details.setMaximumSize(new java.awt.Dimension(465, 459));
        details.setLayout(new java.awt.GridBagLayout());

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel29.setText("User Profile");
        jLabel29.setMaximumSize(new java.awt.Dimension(100, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 58;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 33, 0, 0);
        details.add(jLabel29, gridBagConstraints);

        jLabel41.setText("Account ID:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 117, 0, 0);
        details.add(jLabel41, gridBagConstraints);

        jLabel55.setText("Password:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 124, 0, 0);
        details.add(jLabel55, gridBagConstraints);

        jLabel56.setText("Account Type:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 104, 0, 0);
        details.add(jLabel56, gridBagConstraints);

        jLabel57.setText("NID:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 152, 0, 0);
        details.add(jLabel57, gridBagConstraints);

        jLabel59.setText("Date Of Birth:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 107, 0, 0);
        details.add(jLabel59, gridBagConstraints);

        jLabel60.setText("Join Date:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 125, 0, 0);
        details.add(jLabel60, gridBagConstraints);

        jLabel61.setText("Nationality :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 116, 0, 0);
        details.add(jLabel61, gridBagConstraints);

        jLabel62.setText("Phone Number:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 100, 0, 0);
        details.add(jLabel62, gridBagConstraints);

        jLabel63.setText("Name: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 140, 0, 0);
        details.add(jLabel63, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 167;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 23, 0, 73);
        details.add(jTextField1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 167;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 23, 0, 73);
        details.add(jTextField2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 167;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 23, 0, 73);
        details.add(jTextField3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 167;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 23, 0, 73);
        details.add(jTextField4, gridBagConstraints);

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 167;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 23, 0, 73);
        details.add(jTextField5, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 167;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 23, 0, 73);
        details.add(jTextField6, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 167;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 23, 0, 73);
        details.add(jTextField7, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 167;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 23, 0, 73);
        details.add(jTextField8, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 167;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 23, 0, 73);
        details.add(jTextField9, gridBagConstraints);

        jLabel64.setText("Address :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 128, 0, 0);
        details.add(jLabel64, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 19;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 167;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 23, 0, 73);
        details.add(jTextField10, gridBagConstraints);

        jButton36.setText("Update Password");
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 21;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 79, 13, 73);
        details.add(jButton36, gridBagConstraints);

        javax.swing.GroupLayout details_userLayout = new javax.swing.GroupLayout(details_user);
        details_user.setLayout(details_userLayout);
        details_userLayout.setHorizontalGroup(
                details_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(details, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        details_userLayout.setVerticalGroup(
                details_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(details, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 61;
        gridBagConstraints.ipady = 63;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 0);
        user_main.add(details_user, gridBagConstraints);

        withdraw.setBackground(new java.awt.Color(51, 51, 51));
        withdraw.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        withdraw.setPreferredSize(new java.awt.Dimension(596, 459));
        withdraw.setLayout(new java.awt.GridBagLayout());

        details1.setBackground(new java.awt.Color(204, 204, 204));
        details1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabel65.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel65.setText("Cash Withdraw");
        jLabel65.setMaximumSize(new java.awt.Dimension(100, 14));

        jLabel66.setText("Account ID:");

        jLabel67.setText("Password:");

        jLabel74.setText("Amount :");

        withdraw_id.setEditable(false);

        jButton33.setText("Submit");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jButton34.setText("Clear");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        jTextField13.setText("jPaeld1");

        javax.swing.GroupLayout details1Layout = new javax.swing.GroupLayout(details1);
        details1.setLayout(details1Layout);
        details1Layout.setHorizontalGroup(
                details1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, details1Layout.createSequentialGroup()
                                .addContainerGap(181, Short.MAX_VALUE)
                                .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(99, 99, 99))
                        .addGroup(details1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(details1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(details1Layout.createSequentialGroup()
                                                .addComponent(jButton34)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton33))
                                        .addGroup(details1Layout.createSequentialGroup()
                                                .addGroup(details1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel66)
                                                        .addComponent(jLabel74)
                                                        .addComponent(jLabel67))
                                                .addGap(38, 38, 38)
                                                .addGroup(details1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jTextField12)
                                                        .addComponent(withdraw_id)
                                                        .addComponent(jTextField13, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        details1Layout.setVerticalGroup(
                details1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(details1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addGroup(details1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel66)
                                        .addComponent(withdraw_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(details1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel74)
                                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(details1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel67)
                                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(details1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton33)
                                        .addComponent(jButton34))
                                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 19;
        gridBagConstraints.ipady = 28;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(86, 121, 89, 135);
        withdraw.add(details1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 105;
        gridBagConstraints.ipady = 89;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 0);
        user_main.add(withdraw, gridBagConstraints);

        transfer.setBackground(new java.awt.Color(51, 51, 51));
        transfer.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        transfer.setPreferredSize(new java.awt.Dimension(596, 459));
        transfer.setLayout(new java.awt.GridBagLayout());

        details4.setBackground(new java.awt.Color(204, 204, 204));
        details4.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabel68.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel68.setText("Transfer Money");
        jLabel68.setMaximumSize(new java.awt.Dimension(100, 14));

        jLabel69.setText("Transfer from:");

        jLabel70.setText("Password:");

        jLabel75.setText("Transfer to ( id ) :");

        transfer_id.setEditable(false);

        jButton18.setText("Transfer");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton32.setText("Clear");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jLabel33.setText("Amount ($):");

        jTextField16.setText("rdField1");

        javax.swing.GroupLayout details4Layout = new javax.swing.GroupLayout(details4);
        details4.setLayout(details4Layout);
        details4Layout.setHorizontalGroup(
                details4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, details4Layout.createSequentialGroup()
                                .addContainerGap(80, Short.MAX_VALUE)
                                .addGroup(details4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, details4Layout.createSequentialGroup()
                                                .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(88, 88, 88))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, details4Layout.createSequentialGroup()
                                                .addComponent(jButton32)
                                                .addGap(39, 39, 39)
                                                .addComponent(jButton18)
                                                .addGap(44, 44, 44))))
                        .addGroup(details4Layout.createSequentialGroup()
                                .addGroup(details4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(details4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(details4Layout.createSequentialGroup()
                                                        .addGap(56, 56, 56)
                                                        .addGroup(details4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jLabel69)
                                                                .addComponent(jLabel70))
                                                        .addGap(38, 38, 38))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, details4Layout.createSequentialGroup()
                                                        .addContainerGap()
                                                        .addComponent(jLabel75)
                                                        .addGap(34, 34, 34)))
                                        .addGroup(details4Layout.createSequentialGroup()
                                                .addGap(68, 68, 68)
                                                .addComponent(jLabel33)
                                                .addGap(38, 38, 38)))
                                .addGroup(details4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField15)
                                        .addComponent(transfer_id)
                                        .addComponent(jTextField11)
                                        .addComponent(jTextField16, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        details4Layout.setVerticalGroup(
                details4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(details4Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addGroup(details4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel69)
                                        .addComponent(transfer_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(details4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel75)
                                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(details4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel33)
                                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(details4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel70)
                                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(details4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton18)
                                        .addComponent(jButton32))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(108, 105, 90, 140);
        transfer.add(details4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.ipadx = 92;
        gridBagConstraints.ipady = 78;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 0);
        user_main.add(transfer, gridBagConstraints);

        transaction_history.setBackground(new java.awt.Color(51, 51, 51));
        transaction_history.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        transaction_history.setPreferredSize(new java.awt.Dimension(596, 459));
        transaction_history.setLayout(new java.awt.GridBagLayout());

        jScrollPane6.setMaximumSize(new java.awt.Dimension(580, 440));
        jScrollPane6.setPreferredSize(new java.awt.Dimension(580, 440));

        full_table1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        full_table1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {},
                        {},
                        {},
                        {}
                },
                new String [] {

                }
        ));
        full_table1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        full_table1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        full_table1.setFocusable(false);
        full_table1.setName(""); // NOI18N
        full_table1.setRequestFocusEnabled(false);
        full_table1.setRowHeight(25);
        full_table1.setRowMargin(2);
        full_table1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                full_table1ComponentResized(evt);
            }
        });
        jScrollPane6.setViewportView(full_table1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 569;
        gridBagConstraints.ipady = 400;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 0, 2);
        transaction_history.add(jScrollPane6, gridBagConstraints);


        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 529, 2, 0);


        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.ipadx = 573;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 30, 95, 1297);
        user_main.add(transaction_history, gridBagConstraints);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
                jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel14Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(user_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
                jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel14Layout.createSequentialGroup()
                                                .addGap(29, 29, 29)
                                                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel14Layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addComponent(user_main, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 11, Short.MAX_VALUE)))
                                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
                jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
                jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = -4;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 12, 13, 12);
        user_page.add(jPanel12, gridBagConstraints);

        main.add(user_page, new java.awt.GridBagConstraints());

        getContentPane().add(main);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void user_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_logoutActionPerformed
        main.removeAll();
        main.repaint();
        main.revalidate();

        main.add(home_page);
        main.repaint();
        main.revalidate();
        progress_bar.setValue(0);

    }//GEN-LAST:event_user_logoutActionPerformed
    public void resizeColumnWidth(JTable table) {
        final TableColumnModel columnModel = table.getColumnModel();
        for (int column = 0; column < table.getColumnCount(); column++) {
            int width = 15; // Min width
            for (int row = 0; row < table.getRowCount(); row++) {
                TableCellRenderer renderer = table.getCellRenderer(row, column);
                Component comp = table.prepareRenderer(renderer, row, column);
                width = Math.max(comp.getPreferredSize().width +1 , width);
            }
            if(width > 300)
                width=300;
            columnModel.getColumn(column).setPreferredWidth(width);
        }
    }

    public void user_list(){
        try{
            list.setText("User List");
            conn = Dbconnect.dbconnection();
            stt = conn.createStatement();
            stt.execute("USE bank_management");
            String query = "select* from user";
            res = stt.executeQuery(query);
            full_table.setModel(DbUtils.resultSetToTableModel(res));
            admin_main.removeAll();
            admin_main.repaint();
            admin_main.revalidate();
            admin_main.add(user_list_table);
            admin_main.repaint();
            admin_main.revalidate();
            resizeColumnWidth(full_table);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }

        finally {
            try {
                if (conn != null) {
                    conn.close();
                }
                if (stt != null) {
                    stt.close();
                }
            } catch (SQLException sqlee) {
                JOptionPane.showMessageDialog(null, sqlee.toString());
            }
        }
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        user_list();

    }//GEN-LAST:event_jButton4ActionPerformed

    private void accountaccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountaccountActionPerformed

    }//GEN-LAST:event_accountaccountActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            conn = Dbconnect.dbconnection();
            stt = conn.createStatement();
            stt.execute("USE bank_management");


             if(account.getSelectedItem().equals("Local User")){
                try{
                    String login_id = user_id.getText();
                    String query="select* from user where id='"+user_id.getText()+"' and pass='"+user_pass.getText()+"'";
                    res =stt.executeQuery(query);
                    int count=0;

                    while(res.next()){
                        count=1;
                    }

                    if(count==1){
                        home_login.removeAll();
                        home_login.repaint();
                        home_login.revalidate();

                        home_login.add(progress);
                        home_login.repaint();
                        home_login.revalidate();

                        getindex("user_page");
                        th = new Thread((Runnable)this);
                        th.start();

                        String sql = "select* from user where id = '"+login_id+"'";
                        res = stt.executeQuery(sql);
                        while(res.next()){
                            user_name_show.setText(res.getString("name"));
                            user_p_id.setText(res.getString("id"));
                            user_p_name.setText(res.getString("name"));
                            withdraw_id.setText(res.getString("id"));
                            transfer_id.setText(res.getString("id"));
                        }
                        sql = "select* from money where id = '"+login_id+"'";
                        res = stt.executeQuery(sql);
                        while(res.next()){
                            jLabel34.setText(res.getString("amount")+"$");
                        }
                    }
                    else{
                        user_id.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.red));
                        user_pass.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.red));
                        JOptionPane.showMessageDialog(null,"check ID or password ");/// error for username or password
                    }
                }
                catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex.toString());// sarver error ,show message
                }
            }
            else if(account.getSelectedItem().equals("Admin")){
                try{

                    String query="select* from admin where id='"+user_id.getText()+"' and pass='"+user_pass.getText()+"'";
                    res =stt.executeQuery(query);
                    int count=0;

                    while(res.next()){
                        count=1;
                    }

                    if(count==1){
                        home_login.removeAll();
                        home_login.repaint();
                        home_login.revalidate();

                        home_login.add(progress);
                        home_login.repaint();
                        home_login.revalidate();
                        getindex("admin");
                        th = new Thread((Runnable)this);
                        th.start();
                    }
                    else{
                        user_id.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.red));
                        user_pass.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.red));
                        JOptionPane.showMessageDialog(null,"check username or password ");/// error for username or password
                    }

                }
                catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex.toString());// sarver error ,show message
                }
            }
        }

        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        finally {
            try {
                if (conn != null) {
                    conn.close();
                }
                if (stt != null) {
                    stt.close();
                }
            } catch (SQLException sqlee) {
                JOptionPane.showMessageDialog(null, sqlee.toString());
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void user_logout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_logout1ActionPerformed
        main.removeAll();
        main.repaint();
        main.revalidate();

        main.add(home_page);
        main.repaint();
        main.revalidate();
        progress_bar.setValue(0);
    }//GEN-LAST:event_user_logout1ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        user_main.removeAll();
        user_main.repaint();
        user_main.revalidate();
        user_main.add(transfer);
        user_main.repaint();
        user_main.revalidate();
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        user_main.removeAll();
        user_main.repaint();
        user_main.revalidate();
        user_main.add(withdraw);
        user_main.repaint();
        user_main.revalidate();
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        user_main.removeAll();
        user_main.repaint();
        user_main.revalidate();
        user_main.add(details_user);
        user_main.repaint();
        user_main.revalidate();

        try {
            conn = Dbconnect.dbconnection();
            stt = conn.createStatement();
            stt.execute("USE bank_management");
            String sql = "select* from user where id = '"+user_p_id.getText()+"'";
            res = stt.executeQuery(sql);
            while(res.next()){
                jTextField1.setText(res.getString("id"));
                jTextField2.setText(res.getString("name"));
                jTextField3.setText(res.getString("pass"));
                jTextField4.setText(res.getString("ac_type"));
                jTextField5.setText(res.getString("nid"));
                jTextField6.setText(res.getString("dob"));
                jTextField7.setText(res.getString("join_date"));
                jTextField8.setText(res.getString("nation"));
                jTextField9.setText(res.getString("p_number"));
                jTextField10.setText(res.getString("address"));

                jTextField1.setEditable(false);
                jTextField2.setEditable(false);

                jTextField4.setEditable(false);
                jTextField5.setEditable(false);
                jTextField6.setEditable(false);
                jTextField7.setEditable(false);
                jTextField8.setEditable(false);
                jTextField9.setEditable(false);
                jTextField10.setEditable(false);

                jLabel29.setText("Account Details ");
            }
        }
        catch (SQLException e ) {
            JOptionPane.showMessageDialog(null, e);
        }
        finally {
            try {
                if (conn != null) {
                    conn.close();
                }
                if (stt != null) {
                    stt.close();
                }
            } catch (SQLException sqlee) {
                JOptionPane.showMessageDialog(null, sqlee.toString());
            }
        }
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        user_main.removeAll();
        user_main.repaint();
        user_main.revalidate();
        user_main.add(transfer);
        user_main.repaint();
        user_main.revalidate();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        user_registration reg = new user_registration();
        reg.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    public void ex_list(){
        try{
            list.setText("Executive List");
            conn = Dbconnect.dbconnection();
            stt = conn.createStatement();
            stt.execute("USE bank_management");
            String query = "select* from executive";
            res = stt.executeQuery(query);

            admin_main.removeAll();
            admin_main.repaint();
            admin_main.revalidate();
            admin_main.repaint();
            admin_main.revalidate();

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }

        finally {
            try {
                if (conn != null) {
                    conn.close();
                }
                if (stt != null) {
                    stt.close();
                }
            } catch (SQLException sqlee) {
                JOptionPane.showMessageDialog(null, sqlee.toString());
            }
        }
    }
    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        user_main.removeAll();
        user_main.repaint();
        user_main.revalidate();
        user_main.add(dash_board);
        user_main.repaint();
        user_main.revalidate();
    }//GEN-LAST:event_jButton31ActionPerformed

    private void full_tableComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_full_tableComponentResized
        // TODO add your handling code here:
    }//GEN-LAST:event_full_tableComponentResized

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        user_id.setText("");
        user_pass.setText("");
        user_id.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.LIGHT_GRAY));
        user_pass.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.LIGHT_GRAY));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void full_table1ComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_full_table1ComponentResized
        // TODO add your handling code here:
    }//GEN-LAST:event_full_table1ComponentResized

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        user_main.removeAll();
        user_main.repaint();
        user_main.revalidate();
        user_main.add(details_user);
        user_main.repaint();
        user_main.revalidate();

        try {
            conn = Dbconnect.dbconnection();
            stt = conn.createStatement();
            stt.execute("USE bank_management");
            String sql = "select* from user where id = '"+user_p_id.getText()+"'";
            res = stt.executeQuery(sql);
            while(res.next()){
                jTextField1.setText(res.getString("id"));
                jTextField2.setText(res.getString("name"));
                jTextField3.setText(res.getString("pass"));
                jTextField4.setText(res.getString("ac_type"));
                jTextField5.setText(res.getString("nid"));
                jTextField6.setText(res.getString("dob"));
                jTextField7.setText(res.getString("join_date"));
                jTextField8.setText(res.getString("nation"));
                jTextField9.setText(res.getString("p_number"));
                jTextField10.setText(res.getString("address"));

                jTextField1.setEditable(false);
                jTextField2.setEditable(false);

                jTextField4.setEditable(false);
                jTextField5.setEditable(false);
                jTextField6.setEditable(false);
                jTextField7.setEditable(false);
                jTextField8.setEditable(false);
                jTextField9.setEditable(false);
                jTextField10.setEditable(false);

                jLabel29.setText("Account Details ");
            }
        }
        catch (SQLException e ) {
            JOptionPane.showMessageDialog(null, e);
        }
        finally {
            try {
                if (conn != null) {
                    conn.close();
                }
                if (stt != null) {
                    stt.close();
                }
            } catch (SQLException sqlee) {
                JOptionPane.showMessageDialog(null, sqlee.toString());
            }
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        user_main.removeAll();
        user_main.repaint();
        user_main.revalidate();
        user_main.add(withdraw);
        user_main.repaint();
        user_main.revalidate();


    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        try{

            conn = Dbconnect.dbconnection();
            stt = conn.createStatement();
            stt.execute("USE bank_management");
            String query = "select* from history where id='"+user_p_id.getText()+"'or t_to_id='"+user_p_id.getText()+"'";
            res = stt.executeQuery(query);
            full_table1.setModel(DbUtils.resultSetToTableModel(res));
            user_main.removeAll();
            user_main.repaint();
            user_main.revalidate();
            user_main.add(transaction_history);
            user_main.repaint();
            user_main.revalidate();

            full_table1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            full_table1.getColumnModel().getColumn(0).setPreferredWidth(115);
            full_table1.getColumnModel().getColumn(1).setPreferredWidth(115);
            full_table1.getColumnModel().getColumn(2).setPreferredWidth(102);
            full_table1.getColumnModel().getColumn(3).setPreferredWidth(135);
            full_table1.getColumnModel().getColumn(4).setPreferredWidth(115);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }

        finally {
            try {
                if (conn != null) {
                    conn.close();
                }
                if (stt != null) {
                    stt.close();
                }
            } catch (SQLException sqlee) {
                JOptionPane.showMessageDialog(null, sqlee.toString());
            }
        }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        // TODO add your handling code here:

        try{
            conn = Dbconnect.dbconnection();
            stt = conn.createStatement();
            stt.execute("USE bank_management");

            String query="select* from user where id='"+withdraw_id.getText()+"' and pass='"+jTextField13.getText()+"'";
            res =stt.executeQuery(query);
            int count=0;

            while(res.next()){
                count=1;
            }

            if(count==1){
                query="select amount from money where id='"+withdraw_id.getText()+"'";
                res =stt.executeQuery(query);
                int getint=0;
                while(res.next()){
                    getint =Integer.parseInt(res.getString("amount"));
                }
                int value = Integer.parseInt(jTextField12.getText());
                int am = getint - Integer.parseInt(jTextField12.getText());
                if(am>=0){
                    query="update money set amount ='"+am+"' where id='"+withdraw_id.getText()+"'";
                    stt.executeUpdate(query);

                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    LocalDate localDate = LocalDate.now();
                    String datee=dtf.format(localDate);

                    query="INSERT INTO  history(id,amount,date,purpose) VALUES('"+withdraw_id.getText()+"','"+value+"','"+datee+"','Withdraw')";
                    stt.executeUpdate(query);

                    JOptionPane.showMessageDialog(null,"You have successfully withdraw "+jTextField12.getText()+"$ remaining amount is "+am+".");
                    jLabel34.setText(""+am+"");
                }
                else{
                    JOptionPane.showMessageDialog(null,"Your balance is not enough! you have "+getint+".");
                }
            }

            else{
                JOptionPane.showMessageDialog(null,"cheak Your password ");/// error for username or password
            }

        }

        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());// sarver error ,show message
        }
        finally {
            try {
                if (conn != null) {
                    conn.close();
                }
                if (stt != null) {
                    stt.close();
                }
            } catch (SQLException sqlee) {
                JOptionPane.showMessageDialog(null, sqlee.toString());
            }
        }


    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        // TODO add your handling code here:
        jTextField12.setText("");
        jTextField13.setText("");
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        try{
            conn = Dbconnect.dbconnection();
            stt = conn.createStatement();
            stt.execute("USE bank_management");

            String query="select* from user where id='"+transfer_id.getText()+"' and pass='"+jTextField16.getText()+"'";
            res =stt.executeQuery(query);
            int count=0;

            while(res.next()){
                count=1;
            }

            if(count==1){
                query="select amount from money where id='"+transfer_id.getText()+"'";
                res =stt.executeQuery(query);
                int total=0,getint=0;
                while(res.next()){
                    getint =Integer.parseInt(res.getString("amount"));
                }
                int value = Integer.parseInt(jTextField11.getText());
                int am = getint - value;
                if(am>=0){
                    query="select amount from money where id='"+jTextField15.getText()+"'";
                    res =stt.executeQuery(query);
                    while(res.next()){
                        total = Integer.parseInt(res.getString("amount"))+ Integer.parseInt(jTextField11.getText());
                    }
                    query="update money set amount ='"+am+"' where id='"+transfer_id.getText()+"'";
                    stt.executeUpdate(query);

                    query="update money set amount ='"+total+"' where id='"+jTextField15.getText()+"'";
                    stt.executeUpdate(query);

                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    LocalDate localDate = LocalDate.now();
                    String datee=dtf.format(localDate);

                    query="INSERT INTO  history(id,amount,date,purpose,t_to_id) VALUES('"+transfer_id.getText()+"','"+value+"','"+datee+"','Transfer to','"+jTextField15.getText()+"')";
                    stt.executeUpdate(query);
                    JOptionPane.showMessageDialog(null,"You have successfully transfer "+jTextField11.getText()+"$ remaining amount is "+am+".");
                    jLabel34.setText(""+am+"");
                }
                else{
                    JOptionPane.showMessageDialog(null,"Your balance is not enough! you have "+getint+".");
                }

            }
            else{
                JOptionPane.showMessageDialog(null,"cheak Your password ");/// error for username or password
            }

        }

        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());// sarver error ,show message
        }
        finally {
            try {
                if (conn != null) {
                    conn.close();
                }
                if (stt != null) {
                    stt.close();
                }
            } catch (SQLException sqlee) {
                JOptionPane.showMessageDialog(null, sqlee.toString());
            }
        }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        admin_main.removeAll();
        admin_main.repaint();
        admin_main.revalidate();
        admin_main.add(search);
        admin_main.repaint();
        admin_main.revalidate();
    }//GEN-LAST:event_jButton5ActionPerformed


    private void jButton51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton51ActionPerformed
        try{
            conn = Dbconnect.dbconnection();
            stt = conn.createStatement();
            stt.execute("USE bank_management");


            if((jTextField60.getText()!= null && !jTextField60.getText().isEmpty()) ){
                String query = "SELECT* FROM user WHERE id ="+"\'"+ jTextField60.getText() +"\'"+" or nid="+"\'" + jTextField60.getText()+"\'";
                res =  stt.executeQuery(query);
                int check =0;
                while(res.next()){
                    jTextField50.setText(res.getString("id"));
                    jTextField51.setText(res.getString("name"));
                    jTextField52.setText(res.getString("pass"));
                    jTextField53.setText(res.getString("ac_type"));
                    jTextField54.setText(res.getString("nid"));
                    jTextField55.setText(res.getString("dob"));
                    jTextField56.setText(res.getString("join_date"));
                    jTextField57.setText(res.getString("nation"));
                    jTextField58.setText(res.getString("p_number"));
                    jTextField81.setText(res.getString("address"));

                    check=1;
                }
                if(check==0){
                    JOptionPane.showMessageDialog(null,"Not match any data");
                    jTextField50.setText("");
                    jTextField51.setText("");
                    jTextField52.setText("");
                    jTextField53.setText("");
                    jTextField54.setText("");
                    jTextField55.setText("");
                    jTextField56.setText("");
                    jTextField57.setText("");
                    jTextField58.setText("");
                    jTextField81.setText("");
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"Invalid input !");
                jTextField50.setText("");
                jTextField51.setText("");
                jTextField52.setText("");
                jTextField53.setText("");
                jTextField54.setText("");
                jTextField55.setText("");
                jTextField56.setText("");
                jTextField57.setText("");
                jTextField58.setText("");
                jTextField81.setText("");
            }

        }

        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());// sarver error ,show message
        }
        finally {
            try {
                if (conn != null) {
                    conn.close();
                }
                if (stt != null) {
                    stt.close();
                }
            } catch (SQLException sqlee) {
                JOptionPane.showMessageDialog(null, sqlee.toString());
            }
        }
    }//GEN-LAST:event_jButton51ActionPerformed

    private void jButton53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton53ActionPerformed
        try{
            conn = Dbconnect.dbconnection();
            stt = conn.createStatement();
            stt.execute("USE bank_management");
            String errorset= "";
            int check=0;


            String  name3 = jTextField51.getText();
            String pass3 = jTextField52.getText();
            String dob3 = jTextField55.getText();
            String address3 = jTextField81.getText();
            String  p_number3 = jTextField58.getText();

            if(pass3 == null || pass3.isEmpty()){
                errorset+="Password should not be empty!\n";
                jTextField52.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.red));
                check=1;
            }
            else if(pass3.length()<6){
                errorset+="Password length should be more than or equal 6!\n";
                jTextField52.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.red));
                check=1;
            }
            else{
                jTextField52.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.GREEN));
            }
            //name
            if(name3 == null || name3.isEmpty()){
                jTextField51.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.red));
                errorset+="Name should not be empty!\n";
                check=1;
            }
            else if (name3.matches("^[a-zA-Z\\s]+$")) {
                if(name3.length()<4){
                    jTextField51.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.red));
                    errorset+="Name should be grater than 3 letter!";
                    check=1;
                }
                else{
                    jTextField51.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.GREEN));
                }

            }
            else if(!name3.matches("^[a-zA-Z\\s]+$")){
                jTextField51.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.red));
                errorset+="Name is  invalid!";
                check=1;
            }

            if(dob3 == null || dob3.isEmpty()){
                errorset+="Date of Birth should not be empty! format (yyyy-mm-day)\n";
                jTextField55.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.red));
                check=1;
            }
            else if (!dob3.matches("^(\\d{4})-(\\d{1,2})-(\\d{1,2})$")) {
                jTextField55.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.red));
                errorset+="Invalid Date of Birth ! format (yyyy-mm-day)\n";
                check=1;
            }
            else{
                jTextField55.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.GREEN));
            }
            if(p_number3 == null || p_number3.isEmpty()){
                errorset+="Phone Number should not be empty!\n";
                jTextField58.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.red));
                check=1;
            }
            else if(!p_number3.matches("^(?:\\+88|01)?\\d{11}$")){
                jTextField58.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.red));
                errorset+="Phone Number is not valid!\n";
                check=1;
            }
            else{
                jTextField58.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.GREEN));
            }

            if(address3 == null || address3.isEmpty()){
                jTextField81.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.red));
                errorset+="Address should not be empty!\n";
                check=1;
            }
            else if (address3.matches("^[a-zA-Z\\s]+$")) {
                if(address3.length()<4){
                    jTextField81.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.red));
                    errorset+="Address should be grater than 3 letter!\n";
                    check=1;
                }
                else{
                    jTextField81.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.GREEN));
                }

            }
            else if(!address3.matches("^[a-zA-Z\\s]+$")){
                jTextField81.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.red));
                errorset+="Address is  invalid!\n";
                check=1;
            }


            if(check==0){
                String query = "Update user set"
                        +" name = '"+jTextField51.getText()+"',"
                        +" pass = '"+jTextField52.getText()+"',"
                        +" dob = '"+jTextField55.getText()+"',"
                        +" address = '"+jTextField81.getText()+"',"
                        +" p_number = '"+jTextField58.getText()+"'"
                        +"where id="+jTextField50.getText();


                stt.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Successfully Updated !");
            }
            else{
                JOptionPane.showMessageDialog(null,errorset);
            }
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString());// sarver error ,show message
        }
        finally {
            try {
                if (conn != null) {
                    conn.close();
                }
                if (stt != null) {
                    stt.close();
                }
            } catch (SQLException sqlee) {
                JOptionPane.showMessageDialog(null, sqlee.toString());
            }
        }
    }//GEN-LAST:event_jButton53ActionPerformed

    private void jButton55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton55ActionPerformed
        try{
            conn = Dbconnect.dbconnection();
            stt = conn.createStatement();
            stt.execute("USE bank_management");

            DefaultTableModel model = (DefaultTableModel) full_table.getModel();
            int srow = full_table.getSelectedRow();

            String id = model.getValueAt(srow, 0).toString();
            stt.executeUpdate("delete from user where id="+id);
            model.removeRow(srow);
            stt.executeUpdate("delete from history where id="+id);
            stt.executeUpdate("delete from money where id="+id);
            JOptionPane.showMessageDialog(null, "Delete Successfully");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Not select any row");
        }
        finally {
            try {
                if (conn != null) {
                    conn.close();
                }
                if (stt != null) {
                    stt.close();
                }
            } catch (SQLException sqlee) {
                JOptionPane.showMessageDialog(null,sqlee);
            }
        }
    }//GEN-LAST:event_jButton55ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        try{
            conn = Dbconnect.dbconnection();
            stt = conn.createStatement();
            stt.execute("USE bank_management");

            String query = "Update user set"
                    +" pass = '"+jTextField3.getText()+"'"
                    +"where id="+jTextField1.getText();


            stt.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Successfully Updated !");

        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString());// sarver error ,show message
        }
        finally {
            try {
                if (conn != null) {
                    conn.close();
                }
                if (stt != null) {
                    stt.close();
                }
            } catch (SQLException sqlee) {
                JOptionPane.showMessageDialog(null, sqlee.toString());
            }
        }
    }//GEN-LAST:event_jButton36ActionPerformed

    public void balanced(){
        try{

            conn = Dbconnect.dbconnection();
            stt = conn.createStatement();
            stt.execute("USE bank_management");
            String query = "select* from money";
            res = stt.executeQuery(query);
            full_table4.setModel(DbUtils.resultSetToTableModel(res));
            admin_main.removeAll();
            admin_main.repaint();
            admin_main.revalidate();
            admin_main.add(balanced);
            admin_main.repaint();
            admin_main.revalidate();

            full_table4.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            full_table4.getColumnModel().getColumn(0).setPreferredWidth(225);
            full_table4.getColumnModel().getColumn(1).setPreferredWidth(225);
            full_table4.getColumnModel().getColumn(2).setPreferredWidth(112);

            res = stt.executeQuery("select sum(amount) from money");
            res.next();
            jLabel1.setText("Total Balance = "+res.getString(1)+"$");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }

        finally {
            try {
                if (conn != null) {
                    conn.close();
                }
                if (stt != null) {
                    stt.close();
                }
            } catch (SQLException sqlee) {
                JOptionPane.showMessageDialog(null, sqlee.toString());
            }
        }
    }

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        balanced();
    }//GEN-LAST:event_jButton41ActionPerformed

    public void history(){
        try{

            conn = Dbconnect.dbconnection();
            stt = conn.createStatement();
            stt.execute("USE bank_management");
            String query = "select* from history";
            res = stt.executeQuery(query);
            full_table5.setModel(DbUtils.resultSetToTableModel(res));
            admin_main.removeAll();
            admin_main.repaint();
            admin_main.revalidate();
            admin_main.add(history);
            admin_main.repaint();
            admin_main.revalidate();

            full_table5.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            full_table5.getColumnModel().getColumn(0).setPreferredWidth(110);
            full_table5.getColumnModel().getColumn(1).setPreferredWidth(125);
            full_table5.getColumnModel().getColumn(2).setPreferredWidth(100);
            full_table5.getColumnModel().getColumn(3).setPreferredWidth(125);
            full_table5.getColumnModel().getColumn(4).setPreferredWidth(110);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }

        finally {
            try {
                if (conn != null) {
                    conn.close();
                }
                if (stt != null) {
                    stt.close();
                }
            } catch (SQLException sqlee) {
                JOptionPane.showMessageDialog(null, sqlee.toString());
            }
        }
    }

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        history();
    }//GEN-LAST:event_jButton42ActionPerformed

    private void full_table4ComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_full_table4ComponentResized
        // TODO add your handling code here:
    }//GEN-LAST:event_full_table4ComponentResized

    private void full_table5ComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_full_table5ComponentResized
        // TODO add your handling code here:
    }//GEN-LAST:event_full_table5ComponentResized







    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        jTextField15.setText("");
        jTextField11.setText("");
        jTextField16.setText("");
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        try{

            conn = Dbconnect.dbconnection();
            stt = conn.createStatement();
            stt.execute("USE bank_management");
            String query = "select* from history where id='"+user_p_id.getText()+"'or t_to_id='"+user_p_id.getText()+"'";
            res = stt.executeQuery(query);
            full_table1.setModel(DbUtils.resultSetToTableModel(res));
            user_main.removeAll();
            user_main.repaint();
            user_main.revalidate();
            user_main.add(transaction_history);
            user_main.repaint();
            user_main.revalidate();

            full_table1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            full_table1.getColumnModel().getColumn(0).setPreferredWidth(115);
            full_table1.getColumnModel().getColumn(1).setPreferredWidth(115);
            full_table1.getColumnModel().getColumn(2).setPreferredWidth(102);
            full_table1.getColumnModel().getColumn(3).setPreferredWidth(135);
            full_table1.getColumnModel().getColumn(4).setPreferredWidth(115);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }

        finally {
            try {
                if (conn != null) {
                    conn.close();
                }
                if (stt != null) {
                    stt.close();
                }
            } catch (SQLException sqlee) {
                JOptionPane.showMessageDialog(null, sqlee.toString());
            }
        }
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton49ActionPerformed
        admin_main.removeAll();
        admin_main.repaint();
        admin_main.revalidate();
        admin_main.add(admin_dash);
        admin_main.repaint();
        admin_main.revalidate();

    }//GEN-LAST:event_jButton49ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        admin_main.removeAll();
        admin_main.repaint();
        admin_main.revalidate();
        admin_main.add(admin_up);
        admin_main.repaint();
        admin_main.revalidate();
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton64ActionPerformed
        try{
            conn = Dbconnect.dbconnection();
            stt = conn.createStatement();
            stt.execute("USE bank_management");
            String query="update admin set pass ='"+jPasswordField1.getText()+"'";
            stt.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Update successfully");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);

        }
        finally {
            try {
                if (conn != null) {
                    conn.close();
                }
                if (stt != null) {
                    stt.close();
                }
            } catch (SQLException sqlee) {
                JOptionPane.showMessageDialog(null, sqlee.toString());
            }
        }




    }//GEN-LAST:event_jButton64ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        user_registration obj = new user_registration();
        obj.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        admin_main.removeAll();
        admin_main.repaint();
        admin_main.revalidate();
        admin_main.add(search);
        admin_main.repaint();
        admin_main.revalidate();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        user_list();
    }//GEN-LAST:event_jButton3ActionPerformed



    private void jButton57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton57ActionPerformed
        try{
            conn = Dbconnect.dbconnection();
            stt = conn.createStatement();
            stt.execute("USE bank_management");

            DefaultTableModel model = (DefaultTableModel) full_table3.getModel();
            int srow = full_table3.getSelectedRow();

            String id = model.getValueAt(srow, 0).toString();
            stt.executeUpdate("delete from executive where id='"+id+"'");
            model.removeRow(srow);
            JOptionPane.showMessageDialog(null, "Delete Successfully");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Not select any row");
        }
        finally {
            try {
                if (conn != null) {
                    conn.close();
                }
                if (stt != null) {
                    stt.close();
                }
            } catch (SQLException sqlee) {
                JOptionPane.showMessageDialog(null, sqlee.toString());
            }
        }
    }//GEN-LAST:event_jButton57ActionPerformed

    private void full_table3ComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_full_table3ComponentResized
        // TODO add your handling code here:
    }//GEN-LAST:event_full_table3ComponentResized

    private void jButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton50ActionPerformed
        try{
            conn = Dbconnect.dbconnection();
            stt = conn.createStatement();
            stt.execute("USE bank_management");
            String errorset= "";
            int check=0;
            String  name3 = jTextField61.getText();
            String pass3 = jTextField62.getText();
            String designation3 = jTextField63.getText();
            String dob3 = jTextField65.getText();
            String address3 = jTextField68.getText();
            String  p_number3 = jTextField80.getText();

            //pass
            if(pass3 == null || pass3.isEmpty()){
                errorset+="Password should not be empty!\n";
                jTextField62.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.red));
                check=1;
            }
            else if(pass3.length()<6){
                errorset+="Password length should be more than or equal 6!\n";
                jTextField62.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.red));
                check=1;
            }
            else{
                jTextField62.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.GREEN));
            }

            if(designation3 == null || designation3.isEmpty()){
                jTextField63.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.red));
                errorset+="Designation should not be empty!\n";
                check=1;
            }
            else if (!designation3.matches("^[A-z]+$")) {
                jTextField63.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.red));
                errorset+="Designation is invalid!";
                check=1;
            }
            else{
                jTextField63.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.GREEN));
            }

            //name
            if(name3 == null || name3.isEmpty()){
                jTextField61.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.red));
                errorset+="Name should not be empty!\n";
                check=1;
            }
            else if (name3.matches("^[a-zA-Z\\s]+$")) {
                if(name3.length()<4){
                    jTextField61.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.red));
                    errorset+="Name should be grater than 3 letter!";
                    check=1;
                }
                else{
                    jTextField61.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.GREEN));
                }

            }
            else if(!name3.matches("^[a-zA-Z\\s]+$")){
                jTextField61.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.red));
                errorset+="Name is  invalid!";
                check=1;
            }

            if(dob3 == null || dob3.isEmpty()){
                errorset+="Date of Birth should not be empty! format (yyyy-mm-day)\n";
                jTextField65.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.red));
                check=1;
            }
            else if (!dob3.matches("^(\\d{4})-(\\d{1,2})-(\\d{1,2})$")) {
                jTextField65.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.red));
                errorset+="Invalid Date of Birth ! format (yyyy-mm-day)\n";
                check=1;
            }
            else{
                jTextField65.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.GREEN));
            }

            //phone number
            if(p_number3 == null || p_number3.isEmpty()){
                errorset+="Phone Number should not be empty!\n";
                jTextField80.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.red));
                check=1;
            }
            else if(!p_number3.matches("^(?:\\+88|01)?\\d{11}$")){
                jTextField80.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.red));
                errorset+="Phone Number is not valid!\n";
                check=1;
            }
            else{
                jTextField80.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.GREEN));
            }

            //address
            if(address3 == null || address3.isEmpty()){
                jTextField68.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.red));
                errorset+="Address should not be empty!\n";
                check=1;
            }
            else if (address3.matches("^[a-zA-Z\\s]+$")) {
                if(address3.length()<4){
                    jTextField68.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.red));
                    errorset+="Address should be grater than 3 letter!\n";
                    check=1;
                }
                else{
                    jTextField68.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.GREEN));
                }

            }
            else if(!address3.matches("^[a-zA-Z\\s]+$")){
                jTextField68.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.red));
                errorset+="Address is  invalid!\n";
                check=1;
            }

            if(check==0){
                String query = "Update executive set"
                        +" name = '"+jTextField61.getText()+"',"
                        +" pass = '"+jTextField62.getText()+"',"
                        +" designation = '"+jTextField63.getText()+"',"
                        +" dob = '"+jTextField65.getText()+"',"
                        +" address = '"+jTextField68.getText()+"',"
                        +" p_number = '"+jTextField80.getText()+"'"
                        +"where id='"+jTextField59.getText()+"'";

                stt.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Successfully Updated !");
            }

            else{
                JOptionPane.showMessageDialog(null,errorset);

            }

        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString());// sarver error ,show message
        }
        finally {
            try {
                if (conn != null) {
                    conn.close();
                }
                if (stt != null) {
                    stt.close();
                }
            } catch (SQLException sqlee) {
                JOptionPane.showMessageDialog(null, sqlee.toString());
            }
        }
    }//GEN-LAST:event_jButton50ActionPerformed

    private void jButton52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton52ActionPerformed
        try{
            conn = Dbconnect.dbconnection();
            stt = conn.createStatement();
            stt.execute("USE bank_management");

            if((jTextField69.getText()!= null && !jTextField69.getText().isEmpty()) ){
                String query = "SELECT* FROM executive WHERE id ="+"\'"+ jTextField69.getText() +"\'"+" or nid="+"\'" + jTextField69.getText()+"\'";
                res =  stt.executeQuery(query);
                int check =0;
                while(res.next()){
                    jTextField59.setText(res.getString("id"));
                    jTextField61.setText(res.getString("name"));
                    jTextField62.setText(res.getString("pass"));
                    jTextField63.setText(res.getString("designation"));
                    jTextField64.setText(res.getString("nid"));
                    jTextField65.setText(res.getString("dob"));
                    jTextField66.setText(res.getString("join_date"));
                    jTextField67.setText(res.getString("nation"));
                    jTextField80.setText(res.getString("p_number"));
                    jTextField68.setText(res.getString("address"));

                    check=1;
                }
                if(check==0){
                    JOptionPane.showMessageDialog(null,"Not match any data");

                    jTextField61.setText("");
                    jTextField62.setText("");
                    jTextField63.setText("");
                    jTextField64.setText("");
                    jTextField65.setText("");
                    jTextField66.setText("");
                    jTextField67.setText("");
                    jTextField68.setText("");
                    jTextField80.setText("");

                }
            }
            else{
                JOptionPane.showMessageDialog(null,"Invalid input !");

                jTextField61.setText("");
                jTextField62.setText("");
                jTextField63.setText("");
                jTextField64.setText("");
                jTextField65.setText("");
                jTextField66.setText("");
                jTextField67.setText("");
                jTextField68.setText("");
                jTextField80.setText("");
            }

        }

        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());// sarver error ,show message
        }
        finally {
            try {
                if (conn != null) {
                    conn.close();
                }
                if (stt != null) {
                    stt.close();
                }
            } catch (SQLException sqlee) {
                JOptionPane.showMessageDialog(null, sqlee.toString());
            }
        }
    }//GEN-LAST:event_jButton52ActionPerformed

    private void jTextField62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField62ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField62ActionPerformed


    public static void main(String args[]) {


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> account;
    private javax.swing.JPanel admin;
    private javax.swing.JPanel admin_dash;
    private javax.swing.JPanel admin_main;
    private javax.swing.JPanel admin_up;
    private javax.swing.JPanel balanced;
    private javax.swing.JPanel dash_board;
    private javax.swing.JPanel details;
    private javax.swing.JPanel details1;
    private javax.swing.JPanel details10;
    private javax.swing.JPanel details11;
    private javax.swing.JPanel details13;
    private javax.swing.JPanel details4;
    private javax.swing.JPanel details_user;
    private javax.swing.JPanel ex_list;
    private javax.swing.JTable full_table;
    private javax.swing.JTable full_table1;
    private javax.swing.JTable full_table3;
    private javax.swing.JTable full_table4;
    private javax.swing.JTable full_table5;
    private javax.swing.JPanel history;
    private javax.swing.JPanel home_login;
    private javax.swing.JPanel home_page;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton15;
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
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton57;

    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton64;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
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
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JPanel jPane;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JPasswordField jTextField13;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JPasswordField jTextField16;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField50;
    private javax.swing.JTextField jTextField51;
    private javax.swing.JTextField jTextField52;
    private javax.swing.JTextField jTextField53;
    private javax.swing.JTextField jTextField54;
    private javax.swing.JTextField jTextField55;
    private javax.swing.JTextField jTextField56;
    private javax.swing.JTextField jTextField57;
    private javax.swing.JTextField jTextField58;
    private javax.swing.JTextField jTextField59;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField60;
    private javax.swing.JTextField jTextField61;
    private javax.swing.JTextField jTextField62;
    private javax.swing.JTextField jTextField63;
    private javax.swing.JTextField jTextField64;
    private javax.swing.JTextField jTextField65;
    private javax.swing.JTextField jTextField66;
    private javax.swing.JTextField jTextField67;
    private javax.swing.JTextField jTextField68;
    private javax.swing.JTextField jTextField69;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField80;
    private javax.swing.JTextField jTextField81;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel list;
    private javax.swing.JLabel list2;
    private javax.swing.JLabel list3;
    private javax.swing.JLabel list4;
    private javax.swing.JPanel login_main;
    private javax.swing.JPanel main;
    private javax.swing.JPanel progress;
    private javax.swing.JProgressBar progress_bar;
    private javax.swing.JPanel search;
    private javax.swing.JPanel search_ex;
    private javax.swing.JPanel transaction_history;
    private javax.swing.JPanel transfer;
    private javax.swing.JTextField transfer_id;
    private javax.swing.JTextField user_id;
    private javax.swing.JPanel user_list_table;
    public javax.swing.JButton user_logout;
    public javax.swing.JButton user_logout1;
    private javax.swing.JPanel user_main;
    private javax.swing.JLabel user_name_show;
    private javax.swing.JLabel user_p_id;
    private javax.swing.JLabel user_p_name;
    private javax.swing.JPanel user_page;
    private javax.swing.JPasswordField user_pass;
    private javax.swing.JPanel withdraw;
    private javax.swing.JTextField withdraw_id;
    // End of variables declaration//GEN-END:variables


}
