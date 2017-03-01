import javax.lang.model.element.Name;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 * Created by exam on 2/28/2017.
 */
public class Window implements ActionListener{
   static Window w1;

       static  JTextField name;
       static JPasswordField psword;
       static JButton login ,signup;
    public static void main(String[] args) {

runagain();
    }

 static void runagain()
{
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JLabel label1 = new JLabel("Name");
    JLabel label2 = new JLabel("Password");
    login = new JButton("Login");
    signup = new JButton("Sign Up");
    psword = new JPasswordField("Ur password here");
    name = new JTextField("Ur name");
    panel.setPreferredSize(new Dimension(500,500));


    label1.setBounds(new Rectangle(0,0,10,30));
    panel.add(label1);
    panel.add(name);
    panel.add(label2);
    panel.add(psword);
    panel.add(login);
    panel.add(signup);
    login.addActionListener(new Window());
    signup.addActionListener(new Window());
    frame.setContentPane(panel);
    frame.pack();
    frame.setVisible(true);

}

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==login)
        {
            System.out.println(name.getText());
            System.out.println(psword.getPassword());

    }
    else if(e.getSource()==signup) {
        System.out.println("Hello");
        runagain();
        }
}}