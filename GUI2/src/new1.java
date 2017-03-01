import javax.swing.*;
import java.awt.*;

/**
 * Created by exam on 3/1/2017.
 */
public class new1 {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        //frame.setResizable(false);
        JPanel panel=new JPanel();

       // panel.setPreferredSize(new Dimension(500,500));
        frame.setContentPane(panel);
        frame.pack();
        frame.setVisible(true);

    }
}
