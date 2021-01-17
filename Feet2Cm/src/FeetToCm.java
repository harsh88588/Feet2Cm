import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FeetToCm extends JFrame {

	private JPanel contentPane;
	private JTextField FeetBox;
	private JTextField InchBox;
	private JTextField CMBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FeetToCm frame = new FeetToCm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FeetToCm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 332, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Feet");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 14));
		lblNewLabel.setBounds(41, 91, 74, 25);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Inch");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 14));
		lblNewLabel_1.setBounds(41, 147, 74, 25);
		panel.add(lblNewLabel_1);
		
		FeetBox = new JTextField();
		FeetBox.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		FeetBox.setBounds(114, 91, 96, 25);
		panel.add(FeetBox);
		FeetBox.setColumns(10);
		
		InchBox = new JTextField();
		InchBox.setColumns(10);
		InchBox.setBounds(114, 151, 96, 25);
		panel.add(InchBox);
		
		JButton ConverterBtn = new JButton("Convert To Cm");
		ConverterBtn.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				double Feet, Inch, CM;
				Feet = Double.parseDouble(FeetBox.getText());
				Inch = Double.parseDouble(InchBox.getText());
				CM = (Feet * 12 + Inch) * 2.54;
				CMBox.setText(String.valueOf(CM));
				
				
			}
		});
		ConverterBtn.setFont(new Font("Verdana", Font.BOLD, 20));
		ConverterBtn.setBounds(41, 197, 241, 48);
		panel.add(ConverterBtn);
		
		JLabel lblNewLabel_2 = new JLabel("CM");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Verdana", Font.BOLD, 14));
		lblNewLabel_2.setBounds(41, 269, 74, 25);
		panel.add(lblNewLabel_2);
		
		CMBox = new JTextField();
		CMBox.setBounds(114, 269, 96, 25);
		panel.add(CMBox);
		CMBox.setColumns(10);
		
		JButton ClearBtn = new JButton("Clear");
		ClearBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FeetBox.setText("");
				InchBox.setText("");
				CMBox.setText("");
			}
		});
		ClearBtn.setFont(new Font("Verdana", Font.BOLD, 11));
		ClearBtn.setBounds(10, 305, 89, 23);
		panel.add(ClearBtn);
		
		JButton ExitBtn = new JButton("Exit");
		ExitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		ExitBtn.setForeground(Color.BLACK);
		ExitBtn.setBackground(Color.RED);
		ExitBtn.setFont(new Font("Verdana", Font.BOLD, 11));
		ExitBtn.setBounds(207, 305, 89, 23);
		panel.add(ExitBtn);
		
		JLabel lblNewLabel_3 = new JLabel("Welcome To Converter");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_3.setBounds(20, 11, 276, 53);
		panel.add(lblNewLabel_3);
	}
}
