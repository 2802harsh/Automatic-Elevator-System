/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oomproject;

import java.util.regex.Pattern;

import backend.ElevatorControl;

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
        validateNo.setVisible(false);
        
        // Set display values 
        people.setSelectedItem(String.valueOf(ElevatorControl.getMaxPeople()));
        weight.setText(String.valueOf(ElevatorControl.getMaxWeight()));
        mail.setText(String.valueOf(ElevatorControl.getMailId()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        weightLabel = new javax.swing.JLabel();
        people = new javax.swing.JComboBox<>();
        peopleLabel = new javax.swing.JLabel();
        weight = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        validateOk = new javax.swing.JLabel();
        validateNo = new javax.swing.JLabel();
        weightLabel1 = new javax.swing.JLabel();
        mail = new javax.swing.JTextField();

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

        validateOk.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        validateOk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        validateOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oomproject/icons/check.png"))); // NOI18N
        validateOk.setText("OK");

        validateNo.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        validateNo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        validateNo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oomproject/icons/warning.png"))); // NOI18N
        validateNo.setText("The value should be between 500 and 3000 ");

        weightLabel1.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        weightLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oomproject/icons/weighing-scale.png"))); // NOI18N
        weightLabel1.setText("Set Admin Mail ID");

        mail.setBackground(new java.awt.Color(238, 238, 238));
        mail.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(269, 269, 269)
                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(weightLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(mail))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(validateNo, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(peopleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(people, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(weightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(weight, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(validateOk)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(peopleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(people, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(validateOk, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(weightLabel)
                            .addComponent(weight, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(validateNo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(weightLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        
        if(validated == false)
        {
            javax.swing.JOptionPane.showMessageDialog(update, "Wrong Input! Check Validation Message");
            return;
        }
        String num = (String)people.getSelectedItem();
        int maxNumPeople = Integer.parseInt(num);
        ElevatorControl.setMaxPeople(maxNumPeople);
//        
        String wt = (String)weight.getText();
        Double maxWeight = Double.parseDouble(wt);
        ElevatorControl.setMaxWeight(maxWeight);
        javax.swing.JOptionPane.showMessageDialog(update, "Updated !");
        
        String id = mail.getText();
        ElevatorControl.setMailId(id);
    }//GEN-LAST:event_updateActionPerformed

    private void weightKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_weightKeyReleased
        // TODO add your handling code here:
        String wtText = weight.getText();
        
        if(! Pattern.matches(DOUBLE_PATTERN,wtText))
        {
            validateNo.setText("Not a Value ");
            validateNo.setVisible(true);
            validated = false;
            validateOk.setVisible(false);
        }
        else
        {
            Double wt = Double.parseDouble(wtText);
            if(wt<500 || wt>10000)
            {
                validateOk.setVisible(false);
                validateNo.setText("The value should be between 500 and 10000 ");
                validateNo.setVisible(true);
                validated = false;
            }
            else
            {
                validateOk.setVisible(true);
                validateNo.setVisible(false);
                validated = true;
            }
        }
        
    }//GEN-LAST:event_weightKeyReleased
    public boolean getValidated()
    {
        return validated;
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
    
    private boolean validated = true;
    final static String DOUBLE_PATTERN = "[-+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?";

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField mail;
    private javax.swing.JComboBox<String> people;
    private javax.swing.JLabel peopleLabel;
    private javax.swing.JButton update;
    private javax.swing.JLabel validateNo;
    private javax.swing.JLabel validateOk;
    private javax.swing.JTextField weight;
    private javax.swing.JLabel weightLabel;
    private javax.swing.JLabel weightLabel1;
    // End of variables declaration//GEN-END:variables
}
