package swinggg;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Stopwatch {

    JFrame jfm;
    JLabel hrs, min, sec, mili, title, colon1, colon2, colon3;
    JButton startStop, reset;

    Timer timer;
    int hours = 0, minutes = 0, seconds = 0, milliseconds = 0;
    boolean running = false;

    Stopwatch() {

        // Frame
        jfm = new JFrame("Stopwatch");
        jfm.setLayout(null);
        jfm.setSize(600, 350);
        jfm.setResizable(false);
        jfm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Labels
        title = new JLabel("Stopwatch");
        title.setBounds(160, 10, 200, 100);
        title.setFont(new Font("Arial", Font.BOLD, 24));
        jfm.add(title);

        hrs = new JLabel("00");
        hrs.setBounds(160, 100, 40, 40);
        hrs.setFont(new Font("Arial", Font.PLAIN, 20));
        jfm.add(hrs);

        colon1 = new JLabel(":");
        colon1.setBounds(200, 100, 20, 40);
        colon1.setFont(new Font("Arial", Font.PLAIN, 20));
        jfm.add(colon1);

        min = new JLabel("00");
        min.setBounds(220, 100, 40, 40);
        min.setFont(new Font("Arial", Font.PLAIN, 20));
        jfm.add(min);

        colon2 = new JLabel(":");
        colon2.setBounds(260, 100, 20, 40);
        colon2.setFont(new Font("Arial", Font.PLAIN, 20));
        jfm.add(colon2);

        sec = new JLabel("00");
        sec.setBounds(280, 100, 40, 40);
        sec.setFont(new Font("Arial", Font.PLAIN, 20));
        jfm.add(sec);

        colon3 = new JLabel(".");
        colon3.setBounds(320, 100, 20, 40);
        colon3.setFont(new Font("Arial", Font.PLAIN, 20));
        jfm.add(colon3);

        mili = new JLabel("00");
        mili.setBounds(340, 100, 40, 40);
        mili.setFont(new Font("Arial", Font.PLAIN, 20));
        jfm.add(mili);

        // Buttons
        startStop = new JButton("Start");
        startStop.setBounds(160, 160, 100, 30);
        jfm.add(startStop);

        reset = new JButton("Reset");
        reset.setBounds(280, 160, 100, 30);
        jfm.add(reset);

        // Button actions
        startStop.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (running) {
                    stop();
                } else {
                    start();
                }
            }
        });

        reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                reset();
            }
        });

        jfm.setVisible(true);
    }

    private void start() {
        running = true;
        timer = new Timer(10, new ActionListener() { // To count time
            public void actionPerformed(ActionEvent e) {
                milliseconds++;
                if (milliseconds >= 100) {
                    milliseconds = 0;
                    seconds++;
                    if (seconds >= 60) {
                        seconds = 0;
                        minutes++;
                        if (minutes >= 60) {
                            minutes = 0;
                            hours++;
                        }
                    }
                }
                updateLabels();
            }
        });
        timer.start();
        startStop.setText("Stop");
    }

    private void stop() {
        running = false;
        timer.stop();
        startStop.setText("Start");
    }

    private void reset() {
        running = false;
        timer.stop();
        hours = 0;
        minutes = 0;
        seconds = 0;
        milliseconds = 0;
        updateLabels();
        startStop.setText("Start");
    }

    private void updateLabels() {
        hrs.setText(" " + hours);
        min.setText(" " + minutes);
        sec.setText(" " + seconds);
        mili.setText(" " + milliseconds);
    }

    public static void main(String[] args) {
        new Stopwatch();
    }
}