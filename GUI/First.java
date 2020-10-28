import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class First extends JFrame{
    private static final long serialVersionUID = 10001;

    JPanel panel = new JPanel();
    JButton configure, elevator, log;
    
    First(){
        super("Main Window");
        
		panel.setLayout(null);
        add(panel);

        JLabel title = new JLabel("<html><div style='text-align:center'>Welcome to Automatic Elevator System</div></html>");
        title.setBounds(100,50,500,20);
        panel.add(title);

        configure = newButton("Configure",50,150,150,20);
        elevator = newButton("Elevator",50,250,150,20);
        log = newButton("Log Report",50,350,150,20);
        panel.add(configure);
        panel.add(elevator);
        panel.add(log);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500,100,500,500);
		setVisible(true);
    }
    public JButton newButton(String name, int x, int y, int ht, int wd){
        JButton b = new JButton(name);
        b.setBounds(x,y,ht,wd);
        b.addActionListener(new newWindow());
        return b;
    }
    class newWindow implements ActionListener{
        public void actionPerformed(ActionEvent e){
            JButton btn = (JButton)e.getSource();
            if(btn == configure)
            {
                new Configure();
            }
            else if(btn == elevator)
            {
                new Elevator();
            }
            else
            {
                new Log();
            }
        }
    }
    public static void main(String args[])
    {
        First first = new First();
    }
}