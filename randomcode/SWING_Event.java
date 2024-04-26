import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class SWING_Event {
    SWING_Event()
    {
        JFrame j = new JFrame("Events happening");
        j.setLayout(new FlowLayout());
        j.setSize(500,700);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextField jt = new JTextField("Enter", 15);
        JLabel jlb = new JLabel("Message appears here");
        j.add(jt);
        j.add(jlb);

        jt.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                jlb.setText(jt.getText());
            }
        });
        j.setVisible(true);
    }

    public static void main(String[] args) {
        new SWING_Event();
    }
}
