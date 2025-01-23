package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JLabel labelOne, labelTwo, labelThree;
	private final JTextField textField1;
	private final JPasswordField passwordField2;
	private final JButton button1, button2, button3;

	public Login() {
		super("Nexus Banking System");
		ImageIcon logo = new ImageIcon(this.getClass().getResource("/logo-png.png"));
		Image logoEmbed = logo.getImage().getScaledInstance(400, 160, Image.SCALE_DEFAULT);
		ImageIcon log = new ImageIcon(logoEmbed);
		JLabel imageLogo = new JLabel(log);
		imageLogo.setBounds(430, 20, 300, 120);
		add(imageLogo);

		ImageIcon card = new ImageIcon(this.getClass().getResource("/card.png"));
		Image cardEmbed = card.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		ImageIcon car = new ImageIcon(cardEmbed);
		JLabel imageCard = new JLabel(car);
		imageCard.setBounds(830, 565, 100, 100);
		add(imageCard);

		labelOne = new JLabel("Welcome To Nexus Banking Application!");
		labelOne.setForeground(Color.WHITE);
		labelOne.setFont(new Font("AvanteGarde", Font.BOLD, 36));
		labelOne.setBounds(250, 150, 1000, 50);
		add(labelOne);

		labelTwo = new JLabel("Enter Your Card Number:");
		labelTwo.setForeground(Color.WHITE);
		labelTwo.setFont(new Font("Arial", Font.BOLD, 28));
		labelTwo.setBounds(250, 250, 700, 50);
		add(labelTwo);
		textField1 = new JTextField(16);
		textField1.setBounds(250, 300, 600, 50);
		textField1.setFont(new Font("Ralway", Font.BOLD, 25));
		add(textField1);

		labelThree = new JLabel("Enter Your 6 Digit PIN :");
		labelThree.setForeground(Color.WHITE);
		labelThree.setFont(new Font("Ralway", Font.BOLD, 28));
		labelThree.setBounds(250, 350, 700, 50);
		add(labelThree);
		passwordField2 = new JPasswordField(15);
		passwordField2.setBounds(250, 400, 600, 50);
		passwordField2.setFont(new Font("Arial", Font.BOLD, 25));
		add(passwordField2);

		button1 = new JButton("Sign In");
		button1.setFont(new Font("Arial", Font.BOLD, 25));
		button1.setForeground(Color.WHITE);
		button1.setBackground(Color.BLACK);
		button1.setBounds(300, 500, 200, 50);
		button1.addActionListener(this);
		add(button1);

		button2 = new JButton("Clear");
		button2.setFont(new Font("Arial", Font.BOLD, 25));
		button2.setForeground(Color.WHITE);
		button2.setBackground(Color.BLACK);
		button2.setBounds(550, 500, 200, 50);
		button2.addActionListener(this);
		add(button2);

		button3 = new JButton("Sign In");
		button3.setFont(new Font("Arial", Font.BOLD, 25));
		button3.setForeground(Color.WHITE);
		button3.setBackground(Color.BLACK);
		button3.setBounds(280, 580, 500, 50);
		button3.addActionListener(this);
		add(button3);

		ImageIcon background = new ImageIcon(this.getClass().getResource("/backbg.png"));
		Image bgEmbed = background.getImage().getScaledInstance(1200, 800, Image.SCALE_DEFAULT);
		ImageIcon bg = new ImageIcon(bgEmbed);
		JLabel imageBg = new JLabel(bg);
		imageBg.setBounds(0, 0, 1200, 800);
		add(imageBg);

		setLayout(null);
		setSize(1200, 700);
		setLocation(190, 90);
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if (e.getSource() == button1) {
				ConnectionDB c = new ConnectionDB();
				String cardno = textField1.getText();

				char[] pin1 = passwordField2.getPassword();
				String pin = new String(pin1);
				String q = "select * from login where card_number = '" + cardno + "' and  pin = '" + pin + "'";
				ResultSet resultSet = c.statement.executeQuery(q);
				if (resultSet.next()) {
					setVisible(false);
					new main_Class(pin);
				} else {
					JOptionPane.showMessageDialog(null, "Incorrect Card Number or PIN");
				}

			} else if (e.getSource() == button2) {
				textField1.setText("");
				passwordField2.setText("");
			} else if (e.getSource() == button3) {
				new SignUp();
				setVisible(false);
			}
		} catch (Exception E) {
			E.printStackTrace();
		}

	}

	public static void main(String[] args) {
		new Login();

	}

}
