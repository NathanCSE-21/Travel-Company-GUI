import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class MainMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
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
	public MainMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 479, 433);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(236, 251, 252) );
		
		
		JLabel lblNewLabel = new JLabel("Welcome to ITS Travel Program");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(210, 30, 222, 38);
		contentPane.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 461, 17);
		contentPane.add(panel_1);
		panel_1.setBackground(new Color(216, 185, 195));
		
		JPanel panelbottmleft = new JPanel();
		panelbottmleft.setBounds(0, 13, 179, 363);
		contentPane.add(panelbottmleft);
		panelbottmleft.setBackground(new Color(59, 105, 120));
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 376, 461, 10);
		contentPane.add(panel);
		panel.setBackground(new Color(35, 89, 82));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Create Profile");
		rdbtnNewRadioButton.setBounds(232, 92, 127, 25);
		contentPane.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBackground(new Color(236, 251, 252));
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Delete Profile");
		rdbtnNewRadioButton_1.setBounds(232, 145, 127, 25);
		contentPane.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBackground(new Color(236, 251, 252));
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Update Profile");
		rdbtnNewRadioButton_2.setBounds(232, 195, 127, 25);
		contentPane.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBackground(new Color(236, 251, 252));
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Find/Display Profile");
		rdbtnNewRadioButton_3.setBounds(232, 243, 144, 25);
		contentPane.add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_3.setBackground(new Color(236, 251, 252));
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Display All Profiles");
		rdbtnNewRadioButton_4.setBounds(232, 288, 144, 25);
		contentPane.add(rdbtnNewRadioButton_4);
		rdbtnNewRadioButton_4.setBackground(new Color(236, 251, 252));
		
		JButton btnNewButton = new JButton("Select");
		btnNewButton.setBounds(253, 338, 97, 25);
		contentPane.add(btnNewButton);
		btnNewButton.setBackground(new Color(236, 251, 252));
		
	}
}
