package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;



public class SignUp extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textName, textFname, textEmail, textAdd, textcity, textState, textPin;;
	JDateChooser dateChooser;
	Random ran = new Random();
	long first4 = (ran.nextLong() % 9000L) + 1000L;
	String first = " " + Math.abs(first4);

	JRadioButton r1, r2, m1, m2, m3;
	JButton next;

	public SignUp() {
		super("APPLICATION FORM");
		ImageIcon logo = new ImageIcon(this.getClass().getResource("/logo-png.png"));
		Image logoEmbed = logo.getImage().getScaledInstance(400, 160, Image.SCALE_DEFAULT);
		ImageIcon log = new ImageIcon(logoEmbed);
		JLabel imageLogo = new JLabel(log);
		imageLogo.setBounds(20, 10, 300, 110);
		add(imageLogo);

		ImageIcon logo1 = new ImageIcon(this.getClass().getResource("/bank.png"));
		Image logoEmbed1 = logo1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		ImageIcon log1 = new ImageIcon(logoEmbed1);
		JLabel imageLogo1 = new JLabel(log1);
		imageLogo1.setBounds(710, 10, 100, 100);
		add(imageLogo1);

//		JLabel label1 = new JLabel("Application Form : " + first);
//		label1.setBounds(340, 30, 600, 40);
//		label1.setFont(new Font("Raleway", Font.BOLD, 40));
//		add(label1);

//		JLabel label2=new JLabel("Page 1");
//		label2.setBounds(360,80,600,40);
//		label2.setFont(new Font("Raleway",Font.BOLD,28));
//		add(label2); 

		JLabel label3 = new JLabel("Personal Details");
		label3.setBounds(320, 120, 600, 30);
		label3.setFont(new Font("Raleway", Font.BOLD, 30));
		add(label3);

		JLabel labelName = new JLabel("Name : ");
		labelName.setBounds(100, 190, 100, 30);
		labelName.setFont(new Font("Raleway", Font.BOLD, 20));
		add(labelName);

		textName = new JTextField();
		textName.setBounds(300, 190, 400, 30);
		textName.setFont(new Font("Raleway", Font.BOLD, 20));
		add(textName);

		JLabel labelFName = new JLabel("Father's Name : ");
		labelFName.setBounds(100, 230, 200, 30);
		labelFName.setFont(new Font("Raleway", Font.BOLD, 20));
		add(labelFName);

		textFname = new JTextField();
		textFname.setBounds(300, 230, 400, 30);
		textFname.setFont(new Font("Raleway", Font.BOLD, 20));
		add(textFname);

		JLabel labelG = new JLabel("Gender : ");
		labelG.setFont(new Font("Raleway", Font.BOLD, 20));
		labelG.setBounds(100, 270, 200, 30);
		add(labelG);

		r1 = new JRadioButton("Male");
		r1.setFont(new Font("Raleway", Font.BOLD, 14));
		r1.setBackground(new Color(222, 255, 228));
		r1.setBounds(300, 270, 60, 30);
		add(r1);

		r2 = new JRadioButton("Female");
		r2.setBackground(new Color(222, 255, 228));
		r2.setFont(new Font("Raleway", Font.BOLD, 14));
		r2.setBounds(450, 270, 90, 30);
		add(r2);

		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(r1);
		buttonGroup.add(r2);

		JLabel DOB = new JLabel("Date Of Birth : ");
		DOB.setBounds(100, 320, 200, 30);
		DOB.setFont(new Font("Raleway", Font.BOLD, 20));
		add(DOB);

		dateChooser = new JDateChooser();
		dateChooser.setForeground(new Color(107, 107, 107));
		dateChooser.setBounds(300, 320, 400, 30);
		add(dateChooser);

		JLabel labelEmail = new JLabel("Email Address : ");
		labelEmail.setFont(new Font("Raleway", Font.BOLD, 20));
		labelEmail.setBounds(100, 390, 200, 30);
		add(labelEmail);

		textEmail = new JTextField();
		textEmail.setFont(new Font("Raleway", Font.BOLD, 14));
		textEmail.setBounds(300, 390, 400, 30);
		add(textEmail);

		JLabel labelMs = new JLabel("Marital Status : ");
		labelMs.setFont(new Font("Raleway", Font.BOLD, 20));
		labelMs.setBounds(100, 440, 200, 30);
		add(labelMs);

		m1 = new JRadioButton("Married");
		m1.setBounds(300, 440, 100, 30);
		m1.setBackground(new Color(222, 255, 228));
		m1.setFont(new Font("Raleway", Font.BOLD, 14));
		add(m1);

		m2 = new JRadioButton("Unmarried");
		m2.setBackground(new Color(222, 255, 228));
		m2.setBounds(450, 440, 100, 30);
		m2.setFont(new Font("Raleway", Font.BOLD, 14));
		add(m2);

		m3 = new JRadioButton("Other");
		m3.setBackground(new Color(222, 255, 228));
		m3.setBounds(635, 440, 100, 30);
		m3.setFont(new Font("Raleway", Font.BOLD, 14));
		add(m3);

		ButtonGroup buttonGroup1 = new ButtonGroup();
		buttonGroup1.add(m1);
		buttonGroup1.add(m2);
		buttonGroup1.add(m3);

		JLabel labelAdd = new JLabel("Address : ");
		labelAdd.setFont(new Font("Raleway", Font.BOLD, 20));
		labelAdd.setBounds(100, 490, 200, 30);
		add(labelAdd);

		textAdd = new JTextField();
		textAdd.setFont(new Font("Raleway", Font.BOLD, 14));
		textAdd.setBounds(300, 490, 400, 30);
		add(textAdd);

		JLabel labelCity = new JLabel("City : ");
		labelCity.setFont(new Font("Raleway", Font.BOLD, 20));
		labelCity.setBounds(100, 540, 200, 30);
		add(labelCity);

		textcity = new JTextField();
		textcity.setFont(new Font("Raleway", Font.BOLD, 14));
		textcity.setBounds(300, 540, 400, 30);
		add(textcity);

		JLabel labelPin = new JLabel("Pin Code : ");
		labelPin.setFont(new Font("Raleway", Font.BOLD, 20));
		labelPin.setBounds(100, 590, 200, 30);
		add(labelPin);

		textPin = new JTextField();
		textPin.setFont(new Font("Raleway", Font.BOLD, 14));
		textPin.setBounds(300, 590, 400, 30);
		add(textPin);

		JLabel labelstate = new JLabel("State : ");
		labelstate.setFont(new Font("Raleway", Font.BOLD, 20));
		labelstate.setBounds(100, 640, 200, 30);
		add(labelstate);

		textState = new JTextField();
		textState.setFont(new Font("Raleway", Font.BOLD, 14));
		textState.setBounds(300, 640, 400, 30);
		add(textState);

		next = new JButton("Next");
		next.setFont(new Font("Raleway", Font.BOLD, 14));
		next.setBackground(Color.BLACK);
		next.setForeground(Color.WHITE);
		next.setBounds(620, 710, 80, 30);
        next.addActionListener(this);
		add(next);
		JLabel l1=new JLabel("Page 1");
		l1.setFont(new Font("Raleway",Font.BOLD,22));
		l1.setBounds(50, 700, 90, 50);
		add(l1);

		getContentPane().setBackground(new Color(222, 255, 228));
		setLayout(null);
		setSize(850, 800);
		setLocation(360, 40);
		setVisible(true);
	}

	public static void main(String[] args) {
		new SignUp();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String formNo = first;

		String name = textName.getText();
		String fname = textFname.getText();
		String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
		String gender = null;
		if (r1.isSelected())
			gender = "Male";
		else if (r2.isSelected())
			gender = "Female";
		String email = textEmail.getText();
		String marital = null;
		if (m1.isSelected())
			marital = "Married";
		else if (m2.isSelected())
			marital = "Unmarried";
		else if (m3.isSelected())
			marital = "Other";
		String address = textAdd.getText();
		String city = textcity.getText();
		String pin = textPin.getText();
		String state = textState.getText();

		try {
			if (textName.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Fill All The Fields!");
			} else {
				ConnectionDB con1 = new ConnectionDB();
				String q = "insert into signup values ('" + formNo + "', '" + name + "', '" + fname + "','" + dob
						+ "', '" + gender + "', '" + email + "', '" + marital + "', '" + address + "', '" + city + "','"
						+ pin + "', '" + state + "')";
				con1.statement.executeUpdate(q);
				new SignUp2(first);
				setVisible(false);
			}
		} catch (Exception E) {
			E.printStackTrace();
		}

	}

}
