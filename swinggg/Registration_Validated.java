package swinggg;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Registration_Validated {
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
	}
}

class MyFrame extends JFrame implements ActionListener {
	private JLabel titleLabel, nameLabel, mobileLabel, genderLabel, dobLabel, addressLabel, resultLabel;
	private JTextField nameField, mobileField;
	private JRadioButton maleRadio, femaleRadio;
	private ButtonGroup genderGroup;
	private JComboBox<String> dateCombo, monthCombo, yearCombo;
	private JTextArea addressArea, outputArea, resultArea;
	private JCheckBox termsCheckbox;
	private JButton submitButton, resetButton;

	private String[] dates = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15",
			"16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
	private String[] months = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
	private String[] years = { "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004",
			"2005", "2006", "2007", "2008", "2009" };

	public MyFrame() {
		setTitle("Registration Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(900, 600);
		setLocationRelativeTo(null);
		setResizable(false);

		JPanel panel = new JPanel();
		panel.setLayout(null);

		titleLabel = new JLabel("Registration Form");
		titleLabel.setFont(new Font("Arial", Font.PLAIN, 30));
		titleLabel.setBounds(300, 30, 300, 30);
		panel.add(titleLabel);

		nameLabel = new JLabel("Name");
		nameLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		nameLabel.setBounds(100, 100, 100, 20);
		panel.add(nameLabel);

		nameField = new JTextField();
		nameField.setFont(new Font("Arial", Font.PLAIN, 15));
		nameField.setBounds(200, 100, 190, 20);
		panel.add(nameField);

		mobileLabel = new JLabel("Mobile");
		mobileLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		mobileLabel.setBounds(100, 150, 100, 20);
		panel.add(mobileLabel);

		mobileField = new JTextField();
		mobileField.setFont(new Font("Arial", Font.PLAIN, 15));
		mobileField.setBounds(200, 150, 150, 20);
		panel.add(mobileField);

		genderLabel = new JLabel("Gender");
		genderLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		genderLabel.setBounds(100, 200, 100, 20);
		panel.add(genderLabel);

		maleRadio = new JRadioButton("Male");
		maleRadio.setFont(new Font("Arial", Font.PLAIN, 15));
		maleRadio.setBounds(200, 200, 75, 20);
		maleRadio.setSelected(true);
		panel.add(maleRadio);

		femaleRadio = new JRadioButton("Female");
		femaleRadio.setFont(new Font("Arial", Font.PLAIN, 15));
		femaleRadio.setBounds(275, 200, 80, 20);
		panel.add(femaleRadio);

		genderGroup = new ButtonGroup();
		genderGroup.add(maleRadio);
		genderGroup.add(femaleRadio);

		dobLabel = new JLabel("DOB");
		dobLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		dobLabel.setBounds(100, 250, 100, 20);
		panel.add(dobLabel);

		dateCombo = new JComboBox<>(dates);
		dateCombo.setFont(new Font("Arial", Font.PLAIN, 15));
		dateCombo.setBounds(200, 250, 50, 20);
		panel.add(dateCombo);

		monthCombo = new JComboBox<>(months);
		monthCombo.setFont(new Font("Arial", Font.PLAIN, 15));
		monthCombo.setBounds(250, 250, 60, 20);
		panel.add(monthCombo);

		yearCombo = new JComboBox<>(years);
		yearCombo.setFont(new Font("Arial", Font.PLAIN, 15));
		yearCombo.setBounds(320, 250, 60, 20);
		panel.add(yearCombo);

		addressLabel = new JLabel("Address");
		addressLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		addressLabel.setBounds(100, 300, 100, 20);
		panel.add(addressLabel);

		addressArea = new JTextArea();
		addressArea.setFont(new Font("Arial", Font.PLAIN, 15));
		addressArea.setBounds(200, 300, 200, 75);
		addressArea.setLineWrap(true);
		panel.add(addressArea);

		termsCheckbox = new JCheckBox("Accept Terms and Conditions");
		termsCheckbox.setFont(new Font("Arial", Font.PLAIN, 15));
		termsCheckbox.setBounds(150, 400, 250, 20);
		panel.add(termsCheckbox);

		submitButton = new JButton("Submit");
		submitButton.setFont(new Font("Arial", Font.PLAIN, 15));
		submitButton.setBounds(150, 450, 100, 20);
		submitButton.addActionListener(this);
		panel.add(submitButton);

		resetButton = new JButton("Reset");
		resetButton.setFont(new Font("Arial", Font.PLAIN, 15));
		resetButton.setBounds(270, 450, 100, 20);
		resetButton.addActionListener(this);
		panel.add(resetButton);

		outputArea = new JTextArea();
		outputArea.setFont(new Font("Arial", Font.PLAIN, 15));
		outputArea.setBounds(500, 100, 300, 400);
		outputArea.setLineWrap(true);
		outputArea.setEditable(false);
		panel.add(outputArea);

		resultLabel = new JLabel("");
		resultLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		resultLabel.setBounds(100, 500, 500, 25);
		panel.add(resultLabel);

		resultArea = new JTextArea();
		resultArea.setFont(new Font("Arial", Font.PLAIN, 15));
		resultArea.setBounds(580, 175, 200, 75);
		resultArea.setLineWrap(true);
		panel.add(resultArea);

		add(panel);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == submitButton) {
			if (termsCheckbox.isSelected() && mobileField.getText().length() == 10) {
				String name = nameField.getText();
				String mobile = mobileField.getText();
				String gender = maleRadio.isSelected() ? "Male" : "Female";
				String dob = dateCombo.getSelectedItem() + "/" + monthCombo.getSelectedItem() + "/"
						+ yearCombo.getSelectedItem();
				String address = addressArea.getText();

				String output = "Name: " + name + "\n"
						+ "Mobile: " + mobile + "\n"
						+ "Gender: " + gender + "\n"
						+ "DOB: " + dob + "\n"
						+ "Address: " + address;

				outputArea.setText(output);
				resultLabel.setText("Registration Successful!");
			} else {
				outputArea.setText("");
				resultArea.setText("");
				if (mobileField.getText().length() != 10) {
					resultLabel.setText("Mobile number must have exactly 10 digits.");
				} else {
					resultLabel.setText("Please accept the terms and conditions.");
				}
			}
		} else if (e.getSource() == resetButton) {
			nameField.setText("");
			mobileField.setText("");
			addressArea.setText("");
			outputArea.setText("");
			resultArea.setText("");
			resultLabel.setText("");
			termsCheckbox.setSelected(false);
			dateCombo.setSelectedIndex(0);
			monthCombo.setSelectedIndex(0);
			yearCombo.setSelectedIndex(0);
		}
	}
}