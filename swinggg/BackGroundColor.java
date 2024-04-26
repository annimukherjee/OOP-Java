package swinggg;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class BackGroundColor {

    BackGroundColor() {

        JFrame jfrm = new JFrame("Background Color");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(500, 250);
        jfrm.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);



        JButton Output = new JButton("Show Output");


        JComboBox jcb1 = new JComboBox();

        for (int i = 0; i <= 255; i++) {
            jcb1.addItem(String.valueOf(i));
        }

        JComboBox jcb2 = new JComboBox();

        for (int i = 0; i <= 255; i++) {
            jcb2.addItem(String.valueOf(i));
        }

        JComboBox jcb3 = new JComboBox();
        for (int i = 0; i <= 255; i++) {
            jcb3.addItem(String.valueOf(i));
        }

        JLabel red = new JLabel("Red");
        red.setForeground(Color.red);
        jfrm.add(red);
        jfrm.add(jcb1);

        JLabel green = new JLabel("Green");
        green.setForeground(Color.green);
        jfrm.add(green);
        jfrm.add(jcb2);

        JLabel blue = new JLabel("Blue");
        blue.setForeground(Color.blue);
        jfrm.add(blue);
        jfrm.add(jcb3);

        jfrm.add(Output);

        Output.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int r, g, b;
                r = Integer.parseInt(jcb1.getSelectedItem().toString());
                g = Integer.parseInt(jcb2.getSelectedItem().toString());
                b = Integer.parseInt(jcb3.getSelectedItem().toString());
                Color mycolor = new Color(r, g, b);

                JLabel yourColour_pref = new JLabel("You chose: " + r + " " + g + " " + b);
                jfrm.add(yourColour_pref);

                jfrm.getContentPane().setBackground(mycolor);
            }
        });

        jfrm.setVisible(true);
    }

    public static void main(String args[]) {
        new BackGroundColor();
    }

}