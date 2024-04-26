import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AlphaSwing {

    AlphaSwing() {
        JFrame jfrm = new JFrame("Book Example");
        jfrm.setSize(900, 800);
        jfrm.setLayout(new FlowLayout());
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton alp = new JButton("Alpha");
        jfrm.add(alp);

        JButton beta = new JButton("Beta");
        jfrm.add(beta);

        JLabel jlb = new JLabel("Result will appear here");
        jfrm.add(jlb);

        alp.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent ae) {
                        jlb.setText("Alpha");
                    }
                });

        beta.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent ae) {
                        jlb.setText("Beta");
                    }
                });

        jfrm.setVisible(true);

    }

    public static void main(String[] args) {
        new AlphaSwing();
    }
}
