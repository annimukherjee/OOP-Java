package swinggg;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator {
    // Initialize frame, numbers and result
    private JFrame jfrm;
    double num1;
    double num2;
    double result;

    public double get_result(JTextField tf) {
        /*
         * takes num1 and num2 (global variable)
         * extracts which operation is performed
         * returns the result of the operation on num1 num2
         */
        // operations are + - / % *
        String text = tf.getText();
        char operation = ' ';
        if (text.contains("+")) {
            operation = '+';
            result = num1 + num2;
        } else if (text.contains("-")) {
            operation = '-';
            result = num1 - num2;
        } else if (text.contains("*")) {
            operation = '*';
            result = num1 * num2;
        } else if (text.contains("/")) {
            operation = '/';
            result = num1 / num2;
        } else if (text.contains("%")) {
            operation = '%';
            result = num1 % num2;
        }
        return result;
    }

    public double get_second_number(JTextField tf) {
        /*
         * Extracts second number from textfield
         * by looking for the values after the operation character.
         * returns the second number
         */
        String text = tf.getText();
        double secondNumber = 0;
        if (text.contains("+")) {
            secondNumber = Double.parseDouble(text.substring(text.indexOf("+") + 1));
        } else if (text.contains("-")) {
            secondNumber = Double.parseDouble(text.substring(text.indexOf("-") + 1));
        } else if (text.contains("*")) {
            secondNumber = Double.parseDouble(text.substring(text.indexOf("*") + 1));
        } else if (text.contains("/")) {
            secondNumber = Double.parseDouble(text.substring(text.indexOf("/") + 1));
        } else if (text.contains("%")) {
            secondNumber = Double.parseDouble(text.substring(text.indexOf("%") + 1));
        }
        return secondNumber;
    }

    public void set_empty(JTextField tf) {
        /*
         * Sets the Left text field empty when first button is clicked.
         */
        if (tf.getText().equals("CALCULATOR")) {
            tf.setText("");
        }
    }

    JButton sized_button(String cnt) {
        /*
         * creates a button of size 70x25
         * returns the created button
         */
        JButton button = new JButton(cnt);
        button.setPreferredSize(new Dimension(70, 25));
        return button;
    }

    public void add_buttons_to_frame(JFrame jfrm, JTextField tf, JTextField res) {
        result = Double.NEGATIVE_INFINITY;
        /*
         * Adds Button to the Frame
         * Listens for events on buttons
         */
        JButton n1 = sized_button("1");
        jfrm.add(n1);
        JButton n2 = sized_button("2");
        jfrm.add(n2);
        JButton n3 = sized_button("3");
        jfrm.add(n3);
        JButton nplus = sized_button("+");
        jfrm.add(nplus);
        JButton n4 = sized_button("4");
        jfrm.add(n4);
        JButton n5 = sized_button("5");
        jfrm.add(n5);
        JButton n6 = sized_button("6");
        jfrm.add(n6);
        JButton nminus = sized_button("-");
        jfrm.add(nminus);
        JButton n7 = sized_button("7");
        jfrm.add(n7);
        JButton n8 = sized_button("8");
        jfrm.add(n8);
        JButton n9 = sized_button("9");
        jfrm.add(n9);
        JButton nast = sized_button("*");
        jfrm.add(nast);
        JButton ndiv = sized_button("/");
        jfrm.add(ndiv);
        JButton n0 = sized_button("0");
        jfrm.add(n0);
        JButton nmod = sized_button("%");
        jfrm.add(nmod);
        JButton neq = sized_button("=");
        jfrm.add(neq);

        // creates off button
        JButton clr = new JButton("CLR");
        clr.setPreferredSize(new Dimension(140, 25));
        jfrm.add(clr);

        //// Adding Event Listeners
        // listener on 1
        n1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                set_empty(tf);
                tf.setText(tf.getText() + "1");
            }
        });
        // listener on 2
        n2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                set_empty(tf);
                tf.setText(tf.getText() + "2");
            }
        });
        // listener on 3
        n3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                set_empty(tf);
                tf.setText(tf.getText() + "3");
            }
        });
        // listener on 4
        n4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                set_empty(tf);
                tf.setText(tf.getText() + "4");
            }
        });
        // listener on 5
        n5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                set_empty(tf);
                tf.setText(tf.getText() + "5");
            }
        });
        // listener on 6
        n6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                set_empty(tf);
                tf.setText(tf.getText() + "6");
            }
        });
        // listener on 7
        n7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                set_empty(tf);
                tf.setText(tf.getText() + "7");
            }
        });
        // listener on 8
        n8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                set_empty(tf);
                tf.setText(tf.getText() + "8");
            }
        });
        // listener on 9
        n9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                set_empty(tf);
                tf.setText(tf.getText() + "9");
            }
        });
        // listner on 0
        n0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                set_empty(tf);
                tf.setText(tf.getText() + "0");
            }
        });

        // CLR resets the input when CLR button is pressed
        clr.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                tf.setText("CALCULATOR");
                res.setText("RESULT");
                num1 = 0;
                num2 = 0;
                result = Double.NEGATIVE_INFINITY;
            }
        });

        //// Listeners for Operations
        // listener for '+' operation
        nplus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (result == Double.NEGATIVE_INFINITY) {
                    num1 = Double.parseDouble(tf.getText());
                    tf.setText(tf.getText() + " + ");
                } else {
                    tf.setText(Double.toString(num1) + " + ");
                }
            }
        });
        // listerner for '-' operation
        nminus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (result == Double.NEGATIVE_INFINITY) {
                    num1 = Double.parseDouble(tf.getText());
                    tf.setText(tf.getText() + " - ");
                } else {
                    tf.setText(Double.toString(num1) + " - ");
                }
            }
        });
        // listener for '*' operation
        nast.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (result == Double.NEGATIVE_INFINITY) {
                    num1 = Double.parseDouble(tf.getText());
                    tf.setText(tf.getText() + " * ");
                } else {
                    tf.setText(Double.toString(num1) + " * ");
                }
            }
        });
        // listner for '%' operation
        nmod.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (result == Double.NEGATIVE_INFINITY) {
                    num1 = Double.parseDouble(tf.getText());
                    tf.setText(tf.getText() + " % ");
                } else {
                    tf.setText(Double.toString(num1) + " % ");
                }
            }
        });
        // listener for '/' operation
        ndiv.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (result == Double.NEGATIVE_INFINITY) {
                    num1 = Double.parseDouble(tf.getText());
                    tf.setText(tf.getText() + " / ");
                } else {
                    tf.setText(Double.toString(num1) + " / ");
                }
            }
        });

        // listener for '=' button
        neq.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                num2 = get_second_number(tf);
                result = get_result(tf);
                res.setText(Double.toString(result));
                num1 = result;
            }
        });
    }

    public Calculator() {
        prepareGUI();
    }

    private void prepareGUI() {
        /*
         * creates a frame called "Calculator"
         * sets size to 375x225
         * sets bg to cyan
         */
        jfrm = new JFrame("Calculator");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(330, 225);
        jfrm.setResizable(false);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.getContentPane().setBackground(Color.CYAN);

        // add Calculator textfield
        JTextField calc = new JTextField("CALCULATOR");
        calc.setEditable(false);
        calc.setBackground(Color.CYAN);
        calc.setPreferredSize(new Dimension(140, 25));
        jfrm.add(calc);

        // add Result text field
        JTextField res = new JTextField("RESULT");
        res.setEditable(false);
        res.setPreferredSize(new Dimension(140, 25));
        jfrm.add(res);

        // add all the number buttons and event listeners
        add_buttons_to_frame(jfrm, calc, res);
    }

    public void display() {
        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.display();
    }
}