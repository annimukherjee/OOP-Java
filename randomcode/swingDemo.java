import javax.swing.*;
import java.awt.*;

class swingDemo {
    swingDemo() {
        JFrame jfrm = new JFrame("Anigga");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(1920, 1080);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel jlb = new JLabel("Jello");
        jfrm.add(jlb);
        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        new swingDemo();
    }
}