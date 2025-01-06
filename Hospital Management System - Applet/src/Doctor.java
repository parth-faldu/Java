import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;


public class Doctor extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst;
    Statement st;
    ResultSet rs;

    public Doctor() {
        initComponents();
        connectDB();
        if(jTextField1.getText().isEmpty()){
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
            fetchdoc();
        }
        jPanel2.setVisible(false);
    }
    
    public void connectDB(){
        try{
             Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","");
             st = con.createStatement();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        Specialization = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        add_doc_btn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Back_btn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        invalid = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        remove_doc_btn = new javax.swing.JButton();
        update_doc_btn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        jLabel9.setText("jLabel9");

        jLabel11.setText("jLabel11");

        jLabel12.setText("jLabel12");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setText("ID");

        id.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        id.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                idFocusLost(evt);
            }
        });
        id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                idKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                idKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setText("Name");

        name.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameFocusLost(evt);
            }
        });
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setText("Gender");

        buttonGroup1.add(male);
        male.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        male.setText(" Male");
        male.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        buttonGroup1.add(female);
        female.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        female.setText(" Female");
        female.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setText("Specialization");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "      -  -  -", "Cardiology", "Orthopedics", "Pediatrics", "Neurology", "Dermatology" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel6.setText("Qualifications");

        Specialization.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel7.setText("Phone Number");

        phone.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        phone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                phoneFocusLost(evt);
            }
        });
        phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                phoneKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                phoneKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phoneKeyTyped(evt);
            }
        });

        add_doc_btn.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        add_doc_btn.setText("Add");
        add_doc_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_doc_btnActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage Doctors");

        Back_btn.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        Back_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow.jpg"))); // NOI18N
        Back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_btnActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(Back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(217, 217, 217)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(Back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));

        invalid.setBackground(new java.awt.Color(255, 255, 255));
        invalid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        invalid.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(invalid, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(invalid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        table.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Gender", "Qualifications", "Specialization", "Phone Number"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        remove_doc_btn.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        remove_doc_btn.setText("Remove");
        remove_doc_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove_doc_btnActionPerformed(evt);
            }
        });

        update_doc_btn.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        update_doc_btn.setText("Update");
        update_doc_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_doc_btnActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Search By ID");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(male, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(female)))
                        .addGap(173, 173, 173)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(add_doc_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(remove_doc_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(update_doc_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addGap(32, 32, 32)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Specialization, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 903, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(Specialization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(male)
                    .addComponent(female)
                    .addComponent(jLabel7)
                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_doc_btn)
                    .addComponent(remove_doc_btn)
                    .addComponent(update_doc_btn)
                    .addComponent(jLabel10)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void Back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_btnActionPerformed
        new Menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_Back_btnActionPerformed

    public void fetchdoc(){
        Object rows[];
        try{
            rs = st.executeQuery("select * from doctors");
            DefaultTableModel model = (DefaultTableModel)table.getModel();
             while(rs.next()){
                 rows = new Object[] {rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)};
                 model.addRow(rows);
            }
            table.setModel(model);
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }
    private void add_doc_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_doc_btnActionPerformed
        // TODO add your handling code here:
        
        try{
                       
            boolean field_validation = (!id.getText().isEmpty()&& id.getText().matches("\\d+")) && 
                                 (!name.getText().isEmpty() &&  name.getText().matches("[a-zA-Z]+")) &&
                                 (male.isSelected() || female.isSelected()) &&
                                 (!(jComboBox1.getSelectedIndex() == 0)) &&
                                 (!Specialization.getText().isEmpty()) &&
                                 (!phone.getText().isEmpty() && phone.getText().matches("\\d+") && phone.getText().length() == 10);
            
                if(field_validation){
                    pst = con.prepareStatement("insert into doctors values(?,?,?,?,?,?)");
                
                    int docid = Integer.parseInt(id.getText()); 
                    String docname = name.getText();
                    String gender = (male.isSelected()) ? "male" : "female";
                    String qualifications = (String) jComboBox1.getSelectedItem();
                    String specialization = Specialization.getText();
                    String phoneNumber = phone.getText();
                    
                    pst.setInt(1,docid);
                    pst.setString(2,docname);
                    pst.setString(3,gender);
                    pst.setString(4,qualifications);
                    pst.setString(5,specialization);
                    pst.setString(6,phoneNumber);
                
                    int ans = pst.executeUpdate();
                
                    String record_inserted = (ans > 0) ? "Record Inserted..." : "Record Not Inserted...!!!!"; 
                    
                    DefaultTableModel model = (DefaultTableModel) table.getModel();
                    model.setRowCount(0);
                    fetchdoc();
                    
                    JOptionPane.showMessageDialog(rootPane, record_inserted);
                }
                else{
                    JOptionPane.showMessageDialog(rootPane, "Field Must Not be Empty..!!!");
                }
             }
             catch(Exception sqlEx){
                String duplicate_insert = sqlEx.getMessage();
                 
                if(duplicate_insert.contains("Duplicate entry")){
                    JOptionPane.showMessageDialog(rootPane,"Can't Insert Records With Same ID");
                    DefaultTableModel model = (DefaultTableModel) table.getModel();
                    model.setRowCount(0);
                    fetchdoc();
                } 
                else {
                    JOptionPane.showMessageDialog(rootPane,"Database Error:" + sqlEx.getMessage());
                }
             }
    }//GEN-LAST:event_add_doc_btnActionPerformed

    private void idKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyReleased

    }//GEN-LAST:event_idKeyReleased

    private void nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyReleased

    }//GEN-LAST:event_nameKeyReleased

    private void phoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneKeyReleased
    }//GEN-LAST:event_phoneKeyReleased

    private void phoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneFocusLost
        // TODO add your handling code here:
        if(phone.getText().length() < 10){
               if(phone.getText().isEmpty()){
                   invalid.setText("");
                   jPanel2.setVisible(false);
               }
               else{
                   invalid.setText("!! Number Must Be In 10 Digits");
                   jPanel2.setVisible(true);
               }
        }
        else{
            invalid.setText("");
            jPanel2.setVisible(false);
        }
    }//GEN-LAST:event_phoneFocusLost

    private void idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if(Character.isLetter(c)){
            id.setEditable(false);
            invalid.setText("!! Must be Number");
            jPanel2.setVisible(true);
        }
        else{
            id.setEditable(true);
            invalid.setText("");
            jPanel2.setVisible(false);
        }
    }//GEN-LAST:event_idKeyPressed

    private void nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if(Character.isDigit(c)){
            name.setEditable(false);
            invalid.setText("!! Must be Characters");
            jPanel2.setVisible(true);
        }
        else{
            name.setEditable(true);
            invalid.setText("");
            jPanel2.setVisible(false);
        }
    }//GEN-LAST:event_nameKeyPressed

    private void phoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if(Character.isLetter(c)){
            phone.setEditable(false);
            invalid.setText("!! Must be Digits");
            jPanel2.setVisible(true);
        }
        else{
            phone.setEditable(true);
            invalid.setText("");
            jPanel2.setVisible(false);
            
            if(phone.getText().length() <10){
                phone.setEditable(true); 
                jPanel2.setVisible(false);
            }
            else{
                if(!(Character.isISOControl(c))){
                    phone.setEditable(false);
                    jPanel2.setVisible(false);
                }
            }
        }
    }//GEN-LAST:event_phoneKeyPressed

    private void phoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneKeyTyped

    private void idFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idFocusLost
        // TODO add your handling code here:
        invalid.setText("");
        jPanel2.setVisible(false);
    }//GEN-LAST:event_idFocusLost

    private void nameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFocusLost
        // TODO add your handling code here:
        invalid.setText("");
        jPanel2.setVisible(false);
    }//GEN-LAST:event_nameFocusLost

    private void remove_doc_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove_doc_btnActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(rootPane, "are you sure you want to delete this record ?");
        int docid = Integer.parseInt(id.getText()); 
        try{
            if(confirm == 0){
                pst = con.prepareStatement("delete from doctors where id = ?");
                pst.setInt(1,docid);
                pst.execute();
                
                DefaultTableModel model1 = (DefaultTableModel) table.getModel();
                model1.setRowCount(0);
                fetchdoc();
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_remove_doc_btnActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
        if(!(jTextField1.getText().isEmpty()) && jTextField1.getText().matches("\\d*")){
            DefaultTableModel model1 = (DefaultTableModel) table.getModel();
            model1.setRowCount(0);
            Object rows[];
        try{
            pst = con.prepareStatement("select * from doctors where id = ?");
            int docid = Integer.parseInt(jTextField1.getText());
            pst.setInt(1,docid);
            rs = pst.executeQuery();

            DefaultTableModel model = (DefaultTableModel)table.getModel();
             while(rs.next()){
                 rows = new Object[] {rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)};
                 model.addRow(rows);
            }
            table.setModel(model);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
        }
        else {
            DefaultTableModel model1 = (DefaultTableModel) table.getModel();
            model1.setRowCount(0);
            fetchdoc();
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        
        if(Character.isLetter(c)){
            jTextField1.setEditable(false);
            invalid.setText("!! Must be Number");
            jPanel2.setVisible(true);
        }
        else{
            jTextField1.setEditable(true);
            invalid.setText("");
            jPanel2.setVisible(false);
        }
        
    }//GEN-LAST:event_jTextField1KeyPressed

    private void update_doc_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_doc_btnActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(rootPane, "are you sure you want to update this record ?");
        try{
            if(confirm == 0){
                pst = con.prepareStatement("update doctors set name = ?,gender = ? ,specialization = ?,qualifications = ?,phone = ? where id = ?");
                   
                    int docid = Integer.parseInt(id.getText()); 
                    String docname = name.getText();
                    String gender = (male.isSelected()) ? "male" : "female";
                    String qualifications = (String) jComboBox1.getSelectedItem();
                    String specialization = Specialization.getText();
                    String phoneNumber = phone.getText();
                    
                    pst.setString(1,docname);
                    pst.setString(2,gender);
                    pst.setString(3,qualifications);
                    pst.setString(4,specialization);
                    pst.setString(5,phoneNumber);
                    pst.setInt(6,docid);
                    
                    int alert = pst.executeUpdate();
                    
                    if(alert == 0){
                        JOptionPane.showMessageDialog(rootPane,"ID Not Found !!" );
                    }
 
                    DefaultTableModel model = (DefaultTableModel) table.getModel();
                    model.setRowCount(0);
                    fetchdoc();
            } 
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_update_doc_btnActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
                    String idfield = table.getValueAt(table.getSelectedRow(),0).toString();
                    String namefield = table.getValueAt(table.getSelectedRow(),1).toString();
                    String genderfield = table.getValueAt(table.getSelectedRow(),2).toString();
                    String qualificationsfield = table.getValueAt(table.getSelectedRow(), 3).toString();
                    String specializationfield = table.getValueAt(table.getSelectedRow(),4).toString();
                    
                    int index=0;
                    for (int i = 0; i < jComboBox1.getItemCount(); i++) {
                        if (jComboBox1.getItemAt(i).equals(qualificationsfield)) {
                            index = i;
                            break;
                        }
                    }
                    String phonefield = table.getValueAt(table.getSelectedRow(),5).toString();

                    id.setText(idfield);
                    name.setText(namefield);
                    Specialization.setText(specializationfield);
                    jComboBox1.setSelectedIndex(index);
                    phone.setText(phonefield);
                    
                    if (genderfield.equals("male")) {
                        male.setSelected(true);
                    } else if (genderfield.equals("female")) {
                        female.setSelected(true);
                    }
    }//GEN-LAST:event_tableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new AdminLogin().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_btn;
    private javax.swing.JTextField Specialization;
    private javax.swing.JButton add_doc_btn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField id;
    private javax.swing.JLabel invalid;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField name;
    private javax.swing.JTextField phone;
    private javax.swing.JButton remove_doc_btn;
    private javax.swing.JTable table;
    private javax.swing.JButton update_doc_btn;
    // End of variables declaration//GEN-END:variables
}
