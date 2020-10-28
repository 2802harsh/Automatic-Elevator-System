import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class Elevator extends JFrame{
    private static final long serialVersionUID = 10003;

    JPanel panel = new JPanel();

    Elevator(){
        super("Elevator Window");

        panel.setLayout(null);
        add(panel);

        JLabel title = new JLabel("Welcome to the Automatic Elevator System");
        title.setBounds(150,50,500,20);
        panel.add(title);



        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(600,100,600,400);
		setVisible(true);
    }
}