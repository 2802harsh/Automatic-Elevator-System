import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class Log extends JFrame{
    private static final long serialVersionUID = 10004;

    JPanel panel = new JPanel();

    Log(){
        super("Log Report Window");

        panel.setLayout(null);
        add(panel);

        JLabel title = new JLabel("Log Report for the Elevator");
        title.setBounds(200,50,500,20);
        panel.add(title);



        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(600,100,600,400);
		setVisible(true);
    }
}