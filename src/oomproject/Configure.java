/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oomproject;

import java.util.*;
import java.util.regex.Pattern;

import java.util.regex.Matcher;
import oomproject.First;

import backend.ElevatorControl;
import javax.swing.DefaultListModel;

import backend.Elevator;

/**
 *
 * @author HP
 */
public class Configure extends javax.swing.JFrame {

    /**
     * Creates new form Configure
     */
    public Configure() {
        initComponents();
        setVisible(true);
        setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
        validateWeightNo.setVisible(false);
        validateMailOk.setVisible(false);
        
        // Set display values 
        people.setSelectedItem(String.valueOf(ElevatorControl.getMaxPeople()));
        weight.setText(String.valueOf(ElevatorControl.getMaxWeight()));
        mail.setText(String.valueOf(ElevatorControl.getMailId()));
        
        newIdWarning.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputEmergencyIds = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        addId = new javax.swing.JLabel();
        removeId = new javax.swing.JLabel();
        newIdText = new javax.swing.JTextField();
        newIdWarning = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        weightLabel = new javax.swing.JLabel();
        people = new javax.swing.JComboBox<>();
        peopleLabel = new javax.swing.JLabel();
        weight = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        validateWeightOk = new javax.swing.JLabel();
        validateWeightNo = new javax.swing.JLabel();
        emergencyIdLabel = new javax.swing.JLabel();
        mail = new javax.swing.JTextField();
        validateMailNo = new javax.swing.JLabel();
        validateMailOk = new javax.swing.JLabel();
        emergencyIdButton = new javax.swing.JButton();
        emailLabel = new javax.swing.JLabel();

        inputEmergencyIds.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                inputEmergencyIdsWindowActivated(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(45, 64, 89));

        jList1.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jList1.setModel(idModel);
        jScrollPane1.setViewportView(jList1);

        addId.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oomproject/icons/plus.png"))); // NOI18N
        addId.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addIdMouseClicked(evt);
            }
        });

        removeId.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oomproject/icons/minus.png"))); // NOI18N
        removeId.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removeId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeIdMouseClicked(evt);
            }
        });

        newIdText.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N

        newIdWarning.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        newIdWarning.setForeground(new java.awt.Color(238, 238, 238));
        newIdWarning.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oomproject/icons/warning.png"))); // NOI18N
        newIdWarning.setText("Empty");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)
                            .addComponent(removeId))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(newIdText)
                            .addGap(28, 28, 28)
                            .addComponent(addId)))
                    .addComponent(newIdWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(135, 135, 135))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(newIdText))
                .addGap(18, 18, 18)
                .addComponent(newIdWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeId))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout inputEmergencyIdsLayout = new javax.swing.GroupLayout(inputEmergencyIds.getContentPane());
        inputEmergencyIds.getContentPane().setLayout(inputEmergencyIdsLayout);
        inputEmergencyIdsLayout.setHorizontalGroup(
            inputEmergencyIdsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputEmergencyIdsLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        inputEmergencyIdsLayout.setVerticalGroup(
            inputEmergencyIdsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputEmergencyIdsLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(240, 123, 63));

        jPanel2.setBackground(new java.awt.Color(45, 64, 89));
        jPanel2.setForeground(new java.awt.Color(238, 238, 238));

        jLabel1.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(238, 238, 238));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Set the threshold values for Number of People and Weight");

        jLabel2.setFont(new java.awt.Font("Dubai", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(238, 238, 238));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Configure");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        weightLabel.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        weightLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oomproject/icons/weighing-scale.png"))); // NOI18N
        weightLabel.setText(" Maximum Weight ( in kg )");

        people.setBackground(new java.awt.Color(238, 238, 238));
        people.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        people.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));

        peopleLabel.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        peopleLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oomproject/icons/group.png"))); // NOI18N
        peopleLabel.setText(" Maximum Number of People");

        weight.setBackground(new java.awt.Color(238, 238, 238));
        weight.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        weight.setText("800");
        weight.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                weightKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                weightKeyReleased(evt);
            }
        });

        update.setBackground(new java.awt.Color(45, 64, 89));
        update.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        update.setForeground(new java.awt.Color(238, 238, 238));
        update.setText("Update");
        update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        validateWeightOk.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        validateWeightOk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        validateWeightOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oomproject/icons/check.png"))); // NOI18N
        validateWeightOk.setText("OK");

        validateWeightNo.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        validateWeightNo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        validateWeightNo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oomproject/icons/warning.png"))); // NOI18N
        validateWeightNo.setText("The value should be between 500 and 3000 ");

        emergencyIdLabel.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        emergencyIdLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oomproject/icons/id.png"))); // NOI18N
        emergencyIdLabel.setText("Update Emergency Ids");

        mail.setBackground(new java.awt.Color(238, 238, 238));
        mail.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        mail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mailKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mailKeyReleased(evt);
            }
        });

        validateMailNo.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        validateMailNo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        validateMailNo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oomproject/icons/warning.png"))); // NOI18N
        validateMailNo.setText("Not a valid e-mail Id");

        validateMailOk.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        validateMailOk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        validateMailOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oomproject/icons/check.png"))); // NOI18N
        validateMailOk.setText("OK");

        emergencyIdButton.setBackground(new java.awt.Color(45, 64, 89));
        emergencyIdButton.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        emergencyIdButton.setForeground(new java.awt.Color(238, 238, 238));
        emergencyIdButton.setText("Edit Here");
        emergencyIdButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        emergencyIdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emergencyIdButtonActionPerformed(evt);
            }
        });

        emailLabel.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        emailLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oomproject/icons/email.png"))); // NOI18N
        emailLabel.setText(" Set Admin Mail ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(validateMailNo, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(emailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(85, 85, 85)
                                .addComponent(mail))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 23, Short.MAX_VALUE)
                                .addComponent(validateWeightNo, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(peopleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(81, 81, 81)
                                .addComponent(people, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(weightLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(107, 107, 107)
                                .addComponent(weight, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(emergencyIdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(54, 54, 54)
                                .addComponent(emergencyIdButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(validateWeightOk)
                    .addComponent(validateMailOk))
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(peopleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(people, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(validateWeightOk, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(weightLabel)
                            .addComponent(weight, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(validateWeightNo)
                                .addGap(88, 88, 88))
                            .addComponent(validateMailOk, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(emailLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(validateMailNo)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emergencyIdButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emergencyIdLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        
        update();
    }//GEN-LAST:event_updateActionPerformed
    
    public void update()
    {
        if(weightValidated == false || emailValidated == false)
        {
            javax.swing.JOptionPane.showMessageDialog(update, "Wrong Input! Check Validation Message");
            First.setCheckEmail(false);
            return;
        }
        String num = (String)people.getSelectedItem();
        int maxNumPeople = Integer.parseInt(num);
        ElevatorControl.setMaxPeople(maxNumPeople);
//        
        String wt = (String)weight.getText();
        Double maxWeight = Double.parseDouble(wt);
        ElevatorControl.setMaxWeight(maxWeight);
        
        First.setCheckEmail(true);
        
        javax.swing.JOptionPane.showMessageDialog(update, "Updated !");
        
        String id = mail.getText();
        ElevatorControl.setMailId(id);
    }
    
    private void weightKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_weightKeyReleased
        // TODO add your handling code here:
        String wtText = weight.getText();
        
        if(! Pattern.matches(DOUBLE_PATTERN,wtText))
        {
            validateWeightNo.setText("Not a Value ");
            validateWeightNo.setVisible(true);
            weightValidated = false;
            validateWeightOk.setVisible(false);
        }
        else
        {
            Double wt = Double.parseDouble(wtText);
            if(wt<500 || wt>10000)
            {
                validateWeightOk.setVisible(false);
                validateWeightNo.setText("The value should be between 500 and 10000 ");
                validateWeightNo.setVisible(true);
                weightValidated = false;
            }
            else
            {
                validateWeightOk.setVisible(true);
                validateWeightNo.setVisible(false);
                weightValidated = true;
            }
        }
        
    }//GEN-LAST:event_weightKeyReleased

    private void mailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mailKeyReleased
        // TODO add your handling code here:
        String email = mail.getText();
        pattern = Pattern.compile(EMAIL_REGEX, Pattern.CASE_INSENSITIVE);
        matcher = pattern.matcher(email);
        if(!matcher.matches())
        {
            validateMailNo.setVisible(true);
            validateMailOk.setVisible(false);
            emailValidated=false;

        }
        else
        {
            validateMailNo.setVisible(false);
            validateMailOk.setVisible(true);
            emailValidated=true;

        }
    }//GEN-LAST:event_mailKeyReleased

    private void emergencyIdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emergencyIdButtonActionPerformed
        // TODO add your handling code here:
        inputEmergencyIds.setVisible(true);
        inputEmergencyIds.setBounds(800,300,460, 350);
    }//GEN-LAST:event_emergencyIdButtonActionPerformed

    private void removeIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeIdMouseClicked
        // TODO add your handling code here:
        int index = jList1.getSelectedIndex();
        if (index >= 0) {
            idModel.remove(index);
            Elevator.removeEmergencyId(index);
        }
    }//GEN-LAST:event_removeIdMouseClicked

    private void addIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addIdMouseClicked
        // TODO add your handling code here:
        String id = newIdText.getText();
        boolean already = false;
        
        for(int i=0; i < idModel.getSize(); i++){
            Object o =  idModel.getElementAt(i);  
            String val = String.valueOf(o);
            if(id.compareTo(val) == 0)
            {
                already = true;
                break;
            }
        }
        if(id.compareTo("")==0)
        {
            newIdWarning.setText("Empty Field !");
            newIdWarning.setVisible(true);
        }
        else if(already){
            newIdWarning.setText("Already Exists !");
            newIdWarning.setVisible(true);
        }
        else{
            idModel.addElement(id);
            
            Elevator.addEmergencyId(id);
            
            newIdText.setText("");
            newIdWarning.setVisible(false);
        }
    }//GEN-LAST:event_addIdMouseClicked

    private void inputEmergencyIdsWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_inputEmergencyIdsWindowActivated
        // TODO add your handling code here:
        idModel.removeAllElements();
        List<String> ids = Elevator.getEmergencyIds();
        for(int i=0;i<ids.size();i++)
        {
            idModel.addElement(ids.get(i));
        }
    }//GEN-LAST:event_inputEmergencyIdsWindowActivated

    private void weightKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_weightKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER);
        {
            mail.requestFocusInWindow();
        }
    }//GEN-LAST:event_weightKeyPressed

    private void mailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mailKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER)
        {
            update();
        }
    }//GEN-LAST:event_mailKeyPressed
    public boolean getValidated()
    {
        return weightValidated;
    }
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
            java.util.logging.Logger.getLogger(Configure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Configure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Configure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Configure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Configure().setVisible(true);
            }
        });
    }
    
    private boolean weightValidated = true;
    final static String DOUBLE_PATTERN = "[-+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?";
    
    public boolean emailValidated = false;
    private static final String EMAIL_REGEX = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
    private static Pattern pattern;
    private Matcher matcher;
    
    DefaultListModel idModel = new DefaultListModel();
    
    protected String newId;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addId;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JButton emergencyIdButton;
    private javax.swing.JLabel emergencyIdLabel;
    private javax.swing.JDialog inputEmergencyIds;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mail;
    private javax.swing.JTextField newIdText;
    private javax.swing.JLabel newIdWarning;
    private javax.swing.JComboBox<String> people;
    private javax.swing.JLabel peopleLabel;
    private javax.swing.JLabel removeId;
    private javax.swing.JButton update;
    private javax.swing.JLabel validateMailNo;
    private javax.swing.JLabel validateMailOk;
    private javax.swing.JLabel validateWeightNo;
    private javax.swing.JLabel validateWeightOk;
    private javax.swing.JTextField weight;
    private javax.swing.JLabel weightLabel;
    // End of variables declaration//GEN-END:variables
}
