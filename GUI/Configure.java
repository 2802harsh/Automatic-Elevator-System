import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class Configure extends JFrame{
    private static final long serialVersionUID = 10002;

    JPanel panel = new JPanel();
    JLabel numberLabel, weightLabel;
    JComboBox number;
    JTextField weight;
    String numberOfPeople[] = {"5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20"};
    Configure(){
        super("Configure Window");

        panel.setLayout(null);
        add(panel);

        JLabel title = new JLabel("Set the Threshold values for Number of People and Weight");
        title.setBounds(100,50,500,20);
        panel.add(title);

        numberLabel = new JLabel("Number of People");
        numberLabel.setBounds(100,120,200,20);
        panel.add(numberLabel);
        number = new JComboBox(numberOfPeople);
        number.setBounds(100,150,100,20);
        number.setSelectedIndex(5);
        number.addActionListener(new numberChange());
        panel.add(number);

        weightLabel = new JLabel("Weight (in kg)");
        weightLabel.setBounds(100,220,200,20);
        panel.add(weightLabel);
        weight = new JTextField("800");
        weight.setBounds(100,250,100,20);
        // weightChange listener = new weightChange();
        // weight.addKeyListener(listener);
        // weight.addActionListener(new weightChange());
        weight.getDocument().addDocumentListener(new weightChange());
        panel.add(weight);



        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(600,100,600,400);
		setVisible(true);
    }

    class numberChange implements ActionListener{
        public void actionPerformed(ActionEvent e){
            JComboBox num = (JComboBox) e.getSource();
            String maxNum = (String)num.getSelectedItem();
            numberLabel.setText(maxNum);
        }
    }

    class weightChange implements DocumentListener{
        public void changedUpdate(DocumentEvent e) {
            update();
        }
        public void removeUpdate(DocumentEvent e) {
            update();
        }
        public void insertUpdate(DocumentEvent e) {
            update();
        }
        public void update(){
            // JTextField wt = (JTextField) e.getSource();
            String maxWt = (String)weight.getText();
            weightLabel.setText(maxWt);
        }
    }

}