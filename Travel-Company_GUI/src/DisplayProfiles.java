import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.util.*;
import java.io.*;


public class DisplayProfiles extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DisplayProfiles frame = new DisplayProfiles();
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
	public DisplayProfiles() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 456, 385);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(236, 251, 252));
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 442, 10);
		contentPane.add(panel);
		panel.setBackground(new Color(216, 185, 195));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(35, 89, 82));
		panel_1.setBounds(0, 307, 442, 40);
		contentPane.add(panel_1);
		
		JPanel panelbottmleft = new JPanel();
		panelbottmleft.setBackground(new Color(59, 105, 120));
		panelbottmleft.setBounds(0, 10, 110, 298);
		contentPane.add(panelbottmleft);
		
		JLabel lblNewLabel = new JLabel("Display all Profiles");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(192, 33, 124, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Traveler ID:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(123, 94, 80, 22);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(215, 91, 142, 30);
		contentPane.add(textField);
		
		JButton submitButton = new JButton("Submit");
		submitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String filename = "agent";
				filename += textField.getText();
				
				ArrayList <NewProfile> newprofile = new ArrayList <>();
				
				try {
					FileInputStream fis = new FileInputStream(filename);
					ObjectInputStream ois = new ObjectInputStream(fis);
					
					
					newprofile = (ArrayList) ois.readObject();
					
					ois.close();
					fis.close();
					
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				for(NewProfile profile: newprofile) {
					System.out.println(profile);
				}
				
				
			}
		});
		submitButton.setForeground(Color.BLACK);
		submitButton.setBounds(215, 155, 143, 51);
		contentPane.add(submitButton);
	}
}
