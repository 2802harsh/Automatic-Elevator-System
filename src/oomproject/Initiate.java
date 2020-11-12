/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oomproject;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import java.util.*;
import java.awt.Toolkit;
import java.text.DecimalFormat;

import backend.Elevator;
import backend.enums.ElevatorDirection;
import backend.Input;
import backend.Log;
import backend.Email;

/**
 *
 * @author HP
 */
public class Initiate extends javax.swing.JFrame {
    
    Elevator elevator = new Elevator();
    ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
    
//    Timer t = new Timer();
//    t.schedule(ElevatorUpdated(), 0, 2000);

    /**
     * Creates new form Initiate
     */
    public Initiate() {
        initComponents();
        inputPersons.setVisible(false);
        executor.scheduleAtFixedRate(ElevatorUpdated, 0, 500, TimeUnit.MILLISECONDS);
        setVisible(true);
        setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputPersons = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        exitingInput = new javax.swing.JComboBox<>();
        done = new javax.swing.JButton();
        enteringInput = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        peopleLabel = new javax.swing.JLabel();
        floorLabel = new javax.swing.JLabel();
        weightLabel = new javax.swing.JLabel();
        doorLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        people = new javax.swing.JTextField();
        weight = new javax.swing.JTextField();
        doorStatus = new javax.swing.JTextField();
        floor = new javax.swing.JTextField();
        entering = new javax.swing.JLabel();
        overload = new javax.swing.JLabel();
        exiting = new javax.swing.JLabel();
        moving = new javax.swing.JLabel();
        generate = new javax.swing.JButton();
        elevatorDown = new javax.swing.JLabel();
        elevatorUp = new javax.swing.JLabel();
        powerCut = new javax.swing.JToggleButton();

        inputPersons.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        inputPersons.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                inputPersonsWindowClosed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(45, 64, 89));

        jLabel3.setBackground(new java.awt.Color(238, 238, 238));
        jLabel3.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(238, 238, 238));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Enter Persons Entering / Leaving");

        jLabel5.setFont(new java.awt.Font("Dubai", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(235, 235, 234));
        jLabel5.setText("Entering ");

        jLabel6.setFont(new java.awt.Font("Dubai", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(238, 238, 238));
        jLabel6.setText("Exiting");

        exitingInput.setBackground(new java.awt.Color(238, 238, 238));
        exitingInput.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        exitingInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));
        exitingInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                exitingInputFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                exitingInputFocusLost(evt);
            }
        });

        done.setBackground(new java.awt.Color(45, 64, 89));
        done.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        done.setForeground(new java.awt.Color(238, 238, 238));
        done.setText("Done");
        done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneActionPerformed(evt);
            }
        });

        enteringInput.setBackground(new java.awt.Color(238, 238, 238));
        enteringInput.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        enteringInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));
        enteringInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                enteringInputFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                enteringInputFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(212, 212, 212)
                        .addComponent(exitingInput, 0, 159, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(212, 212, 212)
                        .addComponent(enteringInput, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(36, 36, 36))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(done, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(232, 232, 232))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(enteringInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(exitingInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(done)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout inputPersonsLayout = new javax.swing.GroupLayout(inputPersons.getContentPane());
        inputPersons.getContentPane().setLayout(inputPersonsLayout);
        inputPersonsLayout.setHorizontalGroup(
            inputPersonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 557, Short.MAX_VALUE)
            .addGroup(inputPersonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(inputPersonsLayout.createSequentialGroup()
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        inputPersonsLayout.setVerticalGroup(
            inputPersonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 301, Short.MAX_VALUE)
            .addGroup(inputPersonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(inputPersonsLayout.createSequentialGroup()
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(694, 704));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(240, 123, 63));

        jPanel2.setBackground(new java.awt.Color(45, 64, 89));
        jPanel2.setForeground(new java.awt.Color(238, 238, 238));
        jPanel2.setPreferredSize(new java.awt.Dimension(536, 194));

        jLabel1.setFont(new java.awt.Font("Dubai", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(238, 238, 238));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Initiated");

        jLabel2.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(238, 238, 238));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("The Automatic Elevator has been initiated");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(43, 43, 43))
        );

        peopleLabel.setFont(new java.awt.Font("Dubai", 1, 20)); // NOI18N
        peopleLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oomproject/icons/group.png"))); // NOI18N
        peopleLabel.setText("Number of Persons");

        floorLabel.setFont(new java.awt.Font("Dubai", 1, 20)); // NOI18N
        floorLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oomproject/icons/floor.png"))); // NOI18N
        floorLabel.setText("Floor Number");

        weightLabel.setFont(new java.awt.Font("Dubai", 1, 20)); // NOI18N
        weightLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oomproject/icons/weighing-scale.png"))); // NOI18N
        weightLabel.setText("Weight");

        doorLabel.setFont(new java.awt.Font("Dubai", 1, 20)); // NOI18N
        doorLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oomproject/icons/opened-building-elevator-doors.png"))); // NOI18N
        doorLabel.setText("Door Status");

        jLabel4.setBackground(new java.awt.Color(234, 84, 85));
        jLabel4.setFont(new java.awt.Font("Dubai", 1, 30)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText(" Overall Status ");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        people.setEditable(false);
        people.setBackground(new java.awt.Color(247, 251, 252));
        people.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        people.setText("0");

        weight.setEditable(false);
        weight.setBackground(new java.awt.Color(247, 251, 252));
        weight.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        weight.setText("0");

        doorStatus.setEditable(false);
        doorStatus.setBackground(new java.awt.Color(247, 251, 252));
        doorStatus.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        doorStatus.setText("Closed");

        floor.setEditable(false);
        floor.setBackground(new java.awt.Color(247, 251, 252));
        floor.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        floor.setText("0");

        entering.setBackground(new java.awt.Color(184, 222, 111));
        entering.setFont(new java.awt.Font("Dubai", 1, 20)); // NOI18N
        entering.setForeground(new java.awt.Color(255, 248, 205));
        entering.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        entering.setText("People Entering");
        entering.setEnabled(false);

        overload.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        overload.setForeground(new java.awt.Color(39, 33, 33));
        overload.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        overload.setText("Overload");
        overload.setEnabled(false);

        exiting.setFont(new java.awt.Font("Dubai", 1, 20)); // NOI18N
        exiting.setForeground(new java.awt.Color(255, 248, 205));
        exiting.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exiting.setText("People Exiting");
        exiting.setEnabled(false);

        moving.setFont(new java.awt.Font("Dubai", 1, 20)); // NOI18N
        moving.setForeground(new java.awt.Color(255, 248, 205));
        moving.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        moving.setText("Lift Moving");
        moving.setEnabled(false);

        generate.setBackground(new java.awt.Color(45, 64, 89));
        generate.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        generate.setForeground(new java.awt.Color(238, 238, 238));
        generate.setText("Generate");
        generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateActionPerformed(evt);
            }
        });

        elevatorDown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oomproject/icons/down-arrow.png"))); // NOI18N
        elevatorDown.setEnabled(false);

        elevatorUp.setForeground(new java.awt.Color(248, 248, 248));
        elevatorUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oomproject/icons/up-arrow.png"))); // NOI18N
        elevatorUp.setEnabled(false);

        powerCut.setBackground(new java.awt.Color(45, 64, 89));
        powerCut.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        powerCut.setForeground(new java.awt.Color(238, 238, 238));
        powerCut.setText("Power Cut");
        powerCut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powerCutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(generate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(peopleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(weightLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(43, 43, 43))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(entering, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(42, 42, 42)))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(weight, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                    .addComponent(people))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(doorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18))
                                    .addComponent(floorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(floor, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(elevatorUp, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(elevatorDown, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(doorStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(274, 274, 274)
                                .addComponent(moving, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(powerCut)
                        .addGap(105, 105, 105))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(exiting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(287, 287, 287))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                            .addComponent(overload, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(254, 254, 254))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(peopleLabel)
                            .addComponent(people, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(doorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(doorStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(weightLabel)
                                .addComponent(weight, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(elevatorUp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(elevatorDown)))
                        .addGap(26, 26, 26))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(floorLabel)
                            .addComponent(floor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(61, 61, 61)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entering)
                    .addComponent(exiting)
                    .addComponent(moving))
                .addGap(18, 18, 18)
                .addComponent(overload)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(generate)
                    .addComponent(powerCut))
                .addGap(41, 41, 41))
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

    private void doneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneActionPerformed
        // TODO add your handling code here:
        setData();
        inputPersons.dispose();
        if(!overloaded)
        {
            updatePeople = true;
            elevator.setChangeIncoming(false);
        }
    }//GEN-LAST:event_doneActionPerformed

    private void inputPersonsWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_inputPersonsWindowClosed
        // TODO add your handling code here:
        if(!overloaded)
        {
            elevator.setChangeIncoming(false);
        }
        updatePeople = true;
    }//GEN-LAST:event_inputPersonsWindowClosed

    private void enteringInputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_enteringInputFocusGained
        // TODO add your handling code here:
        entering.setEnabled(true);
    }//GEN-LAST:event_enteringInputFocusGained

    private void enteringInputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_enteringInputFocusLost
        // TODO add your handling code here:
        entering.setEnabled(false);
    }//GEN-LAST:event_enteringInputFocusLost

    private void exitingInputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_exitingInputFocusGained
        // TODO add your handling code here:
        exiting.setEnabled(true);
    }//GEN-LAST:event_exitingInputFocusGained

    private void exitingInputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_exitingInputFocusLost
        // TODO add your handling code here:
        exiting.setEnabled(false);
    }//GEN-LAST:event_exitingInputFocusLost

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        elevator.finalize();
    }//GEN-LAST:event_formWindowClosed

    private void generateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateActionPerformed
        // TODO add your handling code here:
        elevator.getNewFloor();
    }//GEN-LAST:event_generateActionPerformed

    private void powerCutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powerCutActionPerformed
        // TODO add your handling code here:
        if(powerCut.isSelected())
        {
            elevator.PowerCut();
            elevator.setChangeIncoming(true);
            elevatorUp.setEnabled(false);
            elevatorDown.setEnabled(false);
            Email email = new Email();
        }
        else
        {
            elevator.setChangeIncoming(false);
        }
       
    }//GEN-LAST:event_powerCutActionPerformed

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
            java.util.logging.Logger.getLogger(Initiate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Initiate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Initiate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Initiate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Initiate().setVisible(true);
            }
        });
    }
    
    public void setData()
    {
        maxWeight = Elevator.getMaxWeight();
        
        DecimalFormat df = new DecimalFormat("#.##");
        String e1 = (String)enteringInput.getSelectedItem();
        int ent = Integer.parseInt(e1);
        String e2 = (String)exitingInput.getSelectedItem();
        int ext = Integer.parseInt(e2);
        Input newPassengers = new Input(ent , ext , elevator.getTotalFloors());
                 
        Set<Integer> floors = newPassengers.getFloors();
        List<Double> weights = newPassengers.getWeights();
        floors.forEach(fl -> {
                     elevator.addNewDestination(fl);
                 });
                 
                
        Double totalWeight = 0.0;
        for(int i=0;i<weights.size();i++)
        {
             totalWeight += weights.get(i);
        }
        
        totalWeight = Double.parseDouble(df.format(totalWeight));
        
        elevator.setWeight(totalWeight);
        
        elevator.setPeople(ent,ext);
        
        if(totalWeight>maxWeight)
        {
            overload.setEnabled(true);
            overloaded = true;
        }
        else
        {
            overload.setEnabled(false);
            overloaded = false;
            Log log = new Log(elevator.getCurrentFloor(),ent,ext,totalWeight);
        }
    }
    
    public void setValuesComboBox()
    {
        enteringInput.removeAllItems();
        exitingInput.removeAllItems();
        int entppl = Elevator.getMaxPeople() - elevator.getPeople();
        int extppl = elevator.getPeople();
        for(int i=0;i<=entppl;i++)
        {
           enteringInput.addItem(String.valueOf(i));
        }
        for(int i=0;i<=extppl;i++)
        { 
           exitingInput.addItem(String.valueOf(i));
        }
    }
    Runnable ElevatorUpdated = new Runnable() {
        @Override
        public void run() {
                // Receiving Values from elevator object
             int elPeople = elevator.getPeople();
             Double elWeight = elevator.getWeight();
             String elDoor = elevator.getDoorStatus();
             String currentFloor = String.valueOf(elevator.getCurrentFloor());
             ElevatorDirection direction = elevator.getElevatorDirection();
             boolean changing = elevator.getChangeIncoming();
             

             // Set the values in GUI
             people.setText(String.valueOf(elPeople));
             weight.setText(String.valueOf(elWeight));
             doorStatus.setText(String.valueOf(elDoor));
             floor.setText(currentFloor);
             if(direction == ElevatorDirection.ELEVATOR_UP)
             {
                 elevatorUp.setEnabled(true);
                 elevatorDown.setEnabled(false);
                 moving.setEnabled(true);
             }
             else if(direction == ElevatorDirection.ELEVATOR_DOWN)
             {
                 elevatorUp.setEnabled(false);
                 elevatorDown.setEnabled(true);
                 moving.setEnabled(true);
             }
             else
             {
                 elevatorUp.setEnabled(false);
                 elevatorDown.setEnabled(false);
                 moving.setEnabled(false);
             }
             if(changing)
             {
                 moving.setEnabled(false);
                 doorStatus.setText("Open");
             }
             else
             {
                 doorStatus.setText("Closed");
             }
             
             if(changing & !powerCut.isSelected())
             {
                 inputPersons.setVisible(true);
                 inputPersons.setBounds(800,300,557,330);
                 if(updatePeople)
                 {
                     setValuesComboBox();
                     updatePeople = false;
                 }
             }
             if(overloaded)
             {
               Toolkit.getDefaultToolkit().beep();
             }
        }
    };
   
    
    
    
    
    boolean updatePeople = true;
    boolean overloaded = false;
    Double maxWeight;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton done;
    private javax.swing.JLabel doorLabel;
    private javax.swing.JTextField doorStatus;
    private javax.swing.JLabel elevatorDown;
    private javax.swing.JLabel elevatorUp;
    private javax.swing.JLabel entering;
    private javax.swing.JComboBox<String> enteringInput;
    private javax.swing.JLabel exiting;
    private javax.swing.JComboBox<String> exitingInput;
    private javax.swing.JTextField floor;
    private javax.swing.JLabel floorLabel;
    private javax.swing.JButton generate;
    private javax.swing.JDialog inputPersons;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel moving;
    private javax.swing.JLabel overload;
    private javax.swing.JTextField people;
    private javax.swing.JLabel peopleLabel;
    private javax.swing.JToggleButton powerCut;
    private javax.swing.JTextField weight;
    private javax.swing.JLabel weightLabel;
    // End of variables declaration//GEN-END:variables
}
