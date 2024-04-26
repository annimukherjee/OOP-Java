import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator {
    Calculator() {
        JFrame j = new JFrame("Calculator");
        j.setLayout(new FlowLayout());
        j.setSize(600, 600);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel num1lb = new JLabel("Number 1");
        JTextField num1tf = new JTextField("Enter num1", 20);

        j.add(num1lb);
        j.add(num1tf);

        JLabel num2lb = new JLabel("Number 2");
        JTextField num2tf = new JTextField("Enter num2", 20);

        j.add(num2lb);
        j.add(num2tf);

        JLabel resulttext = new JLabel("Result: ");
        JLabel result_disp = new JLabel("Result will display here");

        j.add(resulttext);
        j.add(result_disp);

        JButton add = new JButton("Add");
        JButton sub = new JButton("Sub");
        JButton mul = new JButton("Mul");
        JButton div = new JButton("Div");

        j.add(add);
        j.add(sub);
        j.add(mul);
        j.add(div);

        // num2lb.addActionListener(new ActionListener()
        // {
        // public void actionPerformed(ActionEvent ae)
        // {
        // num2lb.setText(jt.getText());
        // }
        // });

        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int num1 = Integer.parseInt(num1tf.getText());
                int num2 = Integer.parseInt(num2tf.getText());
                int res = num1 + num2;
                result_disp.setText(Integer.toString(res));
            }
        });

		sub.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				int num1 = Integer.parseInt(num1tf.getText());
				int num2 = Integer.parseInt(num2tf.getText());
				int res = num1 - num2;
				result_disp.setText(Integer.toString(res));
			}
		});

		mul.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				int num1 = Integer.parseInt(num1tf.getText());
				int num2 = Integer.parseInt(num2tf.getText());
				int res = num1 * num2;
				result_disp.setText(Integer.toString(res));
			}
		});

		div.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				int num1 = Integer.parseInt(num1tf.getText());
				int num2 = Integer.parseInt(num2tf.getText());
				int res = num1 / num2;
				result_disp.setText(Integer.toString(res));
			}
		});

        j.setVisible(true);

    }

    public static void main(String[] args) {
        new Calculator();
    }

}
