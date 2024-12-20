
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ManageStudentsForm extends javax.swing.JFrame {


    Student std = new Student();
    DefaultTableModel model;
    public ManageStudentsForm() 
    {
        
        initComponents();
        std.fillStudentJtable(jTableStudents, "");
        ButtonGroup bg = new ButtonGroup();
        bg.add(jRadioButtonFemale);
        bg.add(jRadioButtonMale);
        model = (DefaultTableModel)jTableStudents.getModel();
        jTableStudents.setRowHeight(40);
        jTableStudents.setGridColor(new Color(102,204,255));
        jTableStudents.setShowGrid(true);
        jTableStudents.setSelectionBackground(Color.BLACK);
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldLname = new javax.swing.JTextField();
        jTextFieldFname = new javax.swing.JTextField();
        jRadioButtonMale = new javax.swing.JRadioButton();
        jRadioButtonFemale = new javax.swing.JRadioButton();
        jButtonAddStudent = new javax.swing.JButton();
        jButtonEditStudent = new javax.swing.JButton();
        jTextFieldPhone = new javax.swing.JTextField();
        jTextFieldBirthDate = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaAddress = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jButtonRemoveStudent = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableStudents = new javax.swing.JTable();
        jTextFieldValueFind = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setText("Manage Students");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("First Name:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Sex:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("BirthDate:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Last Name:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Phone:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Address:");

        jTextFieldLname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jTextFieldFname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jRadioButtonMale.setBackground(new java.awt.Color(104, 204, 255));
        jRadioButtonMale.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioButtonMale.setText("Male");

        jRadioButtonFemale.setBackground(new java.awt.Color(104, 204, 255));
        jRadioButtonFemale.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioButtonFemale.setText("Female");

        jButtonAddStudent.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonAddStudent.setIcon(new javax.swing.ImageIcon("D:\\Java_Files\\NetBeans\\Images\\plus.png")); // NOI18N
        jButtonAddStudent.setText("Add");
        jButtonAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddStudentActionPerformed(evt);
            }
        });

        jButtonEditStudent.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonEditStudent.setIcon(new javax.swing.ImageIcon("D:\\Java_Files\\NetBeans\\Images\\edit.png")); // NOI18N
        jButtonEditStudent.setText("Edit");
        jButtonEditStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditStudentActionPerformed(evt);
            }
        });

        jTextFieldPhone.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextFieldPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPhoneActionPerformed(evt);
            }
        });
        jTextFieldPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldPhoneKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPhoneKeyTyped(evt);
            }
        });

        jTextFieldBirthDate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextFieldBirthDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldBirthDateKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldBirthDateKeyTyped(evt);
            }
        });

        jTextAreaAddress.setColumns(20);
        jTextAreaAddress.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextAreaAddress.setRows(5);
        jScrollPane1.setViewportView(jTextAreaAddress);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("ID:");

        jTextFieldID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jButtonRemoveStudent.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonRemoveStudent.setIcon(new javax.swing.ImageIcon("D:\\Java_Files\\NetBeans\\Images\\cancel.png")); // NOI18N
        jButtonRemoveStudent.setText("Remove");
        jButtonRemoveStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveStudentActionPerformed(evt);
            }
        });

        jTableStudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "FirstName", "LastName", "Sex", "BirthDate", "Phone", "Address"
            }
        ));
        jTableStudents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableStudentsMouseClicked(evt);
            }
        });
        jTableStudents.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTableStudentsKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTableStudents);

        jTextFieldValueFind.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextFieldValueFind.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldValueFindKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldValueFindKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldValueFindKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Enter Value to Search:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(480, 480, 480)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButtonFemale)
                                .addGap(31, 31, 31)
                                .addComponent(jRadioButtonMale))
                            .addComponent(jTextFieldBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldFname, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldLname, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonAddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jButtonEditStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jButtonRemoveStudent)))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldValueFind, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldFname, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldLname, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButtonFemale)
                            .addComponent(jRadioButtonMale)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButtonAddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonEditStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonRemoveStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel7)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldValueFind, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(259, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1287, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 951, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 11, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddStudentActionPerformed
                    AddStudent addStudent = new AddStudent();
                    addStudent.setVisible(true);
                    addStudent.pack();
                    addStudent.setLocationRelativeTo(null);
                    addStudent.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }//GEN-LAST:event_jButtonAddStudentActionPerformed

   public boolean verifText()
    {
    if(jTextFieldFname.getText().equals("") || jTextFieldLname.getText().equals("") || jTextFieldPhone.getText().equals("") ||
            jTextFieldID.getText().equals("") || jTextFieldBirthDate.getText().equals("") || jTextAreaAddress.getText().equals(""))
    {
        JOptionPane.showMessageDialog(null, "One or more empty fields");
        return false;
    }
    else
    {
        return true;
    }
        
    } 
    
    private void jButtonEditStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditStudentActionPerformed
        // TODO add your handling code here:
        String fname = jTextFieldFname.getText();
        String lname = jTextFieldLname.getText();
        String phone = jTextFieldPhone.getText();
        String address = jTextAreaAddress.getText();
        String bdate = jTextFieldBirthDate.getText();
        int Id = Integer.valueOf(jTextFieldID.getText());
        String sex = "";
        if(jRadioButtonFemale.isSelected())
        {
            sex = "Female";
        }
        else if(jRadioButtonMale.isSelected())
        {
            sex = "Male";
        }
        if(verifText())
        {
        Student std = new Student();
        std.insertUpdateDeleteStudent('u', Id ,fname, lname, sex, bdate, phone, address);
        MainForm.MainFormLabelStudentCount.setText("Student Count="+Integer.toString(MyFunction.countData("Student")));
        ManageStudentsForm.jTableStudents.setModel(new DefaultTableModel(null,new Object[]{"ID","FirstName","LastName","Sex","BirthDate","Phone","Address"}));
        //std.fillStudentJtable(ManageStudentsForm.jTableStudents, jTextFieldValueFind.getText());
        std.fillStudentJtable(ManageStudentsForm.jTableStudents,"");
//        jTextFieldFname.setText("");
//        jTextFieldLname.setText("");
//        jTextAreaAddress.setText("");
//        jTextFieldPhone.setText("");
//        jTextFieldBirthDate.setText("");
        
        }
       
    }//GEN-LAST:event_jButtonEditStudentActionPerformed

    private void jTextFieldPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPhoneActionPerformed

    private void jTextFieldPhoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPhoneKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPhoneKeyPressed

    private void jTextFieldPhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPhoneKeyTyped
        // TODO add your handling code here:
        if(!Character.isDigit(evt.getKeyChar()))
        {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldPhoneKeyTyped

    private void jTextFieldBirthDateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBirthDateKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBirthDateKeyPressed

    private void jTextFieldBirthDateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBirthDateKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBirthDateKeyTyped

    private void jButtonRemoveStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveStudentActionPerformed
       
        //To remove the scores of the student the has been removed,we have to add constraint to score table
        //constrait -> foreign key  + on delete cascade
        
        
        if(jTextFieldID.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"No Student Selected");
        }
        else
        {
        int id = Integer.valueOf(jTextFieldID.getText());
        std.insertUpdateDeleteStudent('d', id ,null, null, null, null, null, null);
        ManageStudentsForm.jTableStudents.setModel(new DefaultTableModel(null,new Object[]{"ID","FirstName","LastName","Sex","BirthDate","Phone","Address"}));
         MainForm.MainFormLabelStudentCount.setText("Student Count="+Integer.toString(MyFunction.countData("Student")));
        std.fillStudentJtable(ManageStudentsForm.jTableStudents,"");
        }
    }//GEN-LAST:event_jButtonRemoveStudentActionPerformed

    int rowIndex;
    private void jTableStudentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableStudentsMouseClicked
        // TODO add your handling code here:
        rowIndex = jTableStudents.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)jTableStudents.getModel();
        jTextFieldID.setText(model.getValueAt(rowIndex,0).toString());
        jTextFieldFname.setText(model.getValueAt(rowIndex,1).toString());
        jTextFieldLname.setText(model.getValueAt(rowIndex,2).toString());
        jTextFieldPhone.setText(model.getValueAt(rowIndex,5).toString());
        jTextFieldBirthDate.setText(model.getValueAt(rowIndex,4).toString());
        jTextAreaAddress.setText(model.getValueAt(rowIndex,6).toString());
        //jTextFieldValueFind.setText(model.getValueAt(rowIndex, 0).toString());
        if(model.getValueAt(rowIndex,3).toString().equals("Male"))
        {
            jRadioButtonMale.setSelected(true);
            jRadioButtonFemale.setSelected(false);
        }
        else
        {
            jRadioButtonFemale.setSelected(true);
            jRadioButtonMale.setSelected(false);
        }
        
    }//GEN-LAST:event_jTableStudentsMouseClicked

    private void jTextFieldValueFindKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldValueFindKeyTyped
        // TODO add your handling code here:
    
    }//GEN-LAST:event_jTextFieldValueFindKeyTyped

    private void jTextFieldValueFindKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldValueFindKeyPressed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jTextFieldValueFindKeyPressed

    private void jTextFieldValueFindKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldValueFindKeyReleased
        // TODO add your handling code here:
              jTableStudents.setModel(new DefaultTableModel(null,new Object[]{"ID","FirstName","LastName","Sex","BirthDate","Phone","Address"}));
        std.fillStudentJtable(jTableStudents, jTextFieldValueFind.getText());
        
    }//GEN-LAST:event_jTextFieldValueFindKeyReleased

    private void jTableStudentsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableStudentsKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN)
        {
        rowIndex = jTableStudents.getSelectedRow();
        jTextFieldID.setText(model.getValueAt(rowIndex,0).toString());
        jTextFieldFname.setText(model.getValueAt(rowIndex,1).toString());
        jTextFieldLname.setText(model.getValueAt(rowIndex,2).toString());
        jTextFieldPhone.setText(model.getValueAt(rowIndex,5).toString());
        jTextFieldBirthDate.setText(model.getValueAt(rowIndex,4).toString());
        jTextAreaAddress.setText(model.getValueAt(rowIndex,6).toString());
        
        if(model.getValueAt(rowIndex,3).toString().equals("Male"))
        {
            jRadioButtonMale.setSelected(true);
            jRadioButtonFemale.setSelected(false);
        }
        else
        {
            jRadioButtonFemale.setSelected(true);
            jRadioButtonMale.setSelected(false);
        }
        }
    }//GEN-LAST:event_jTableStudentsKeyReleased

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
            java.util.logging.Logger.getLogger(ManageStudentsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageStudentsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageStudentsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageStudentsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageStudentsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddStudent;
    private javax.swing.JButton jButtonEditStudent;
    private javax.swing.JButton jButtonRemoveStudent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonFemale;
    private javax.swing.JRadioButton jRadioButtonMale;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable jTableStudents;
    private javax.swing.JTextArea jTextAreaAddress;
    private javax.swing.JTextField jTextFieldBirthDate;
    private javax.swing.JTextField jTextFieldFname;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldLname;
    private javax.swing.JTextField jTextFieldPhone;
    private javax.swing.JTextField jTextFieldValueFind;
    // End of variables declaration//GEN-END:variables
}
