import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.io.Serializable;

public class CreateProfile extends JFrame {

	private JPanel contentPane;
	private JTextField IDtext;
	private JTextField firstNameText;
	private JTextField lastNameTxt;
	private JTextField addressTxt;
	private JTextField PhoneTxt;
	private JTextField tripCostTxt;
	private JTextField MdContactField;
	private JTextField MdPhoneField;
	private JTextField illnessField;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateProfile frame = new CreateProfile();
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
	public CreateProfile() throws Exception {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 706);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(236, 251, 252));
		
		JPanel panelbottmleft = new JPanel();
		panelbottmleft.setBounds(0, 15, 159, 603);
		panelbottmleft.setBackground(new Color(59, 105, 120));
		contentPane.add(panelbottmleft);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 522, 15);
		panel_1.setBackground(new Color(216, 185, 195));
		contentPane.add(panel_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 619, 522, 40);
		panel.setBackground(new Color(35, 89, 82));
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Create Profile");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(285, 28, 105, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Traveler ID:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(171, 72, 80, 22);
		contentPane.add(lblNewLabel_1);
		
		IDtext = new JTextField();
		IDtext.setBounds(274, 73, 116, 22);
		contentPane.add(IDtext);
		IDtext.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("First Name:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(171, 107, 93, 22);
		contentPane.add(lblNewLabel_2);
		
		firstNameText = new JTextField();
		firstNameText.setBounds(274, 108, 116, 22);
		contentPane.add(firstNameText);
		firstNameText.setColumns(10);
		
		lastNameTxt = new JTextField();
		lastNameTxt.setColumns(10);
		lastNameTxt.setBounds(274, 146, 116, 22);
		contentPane.add(lastNameTxt);
		
		JLabel lblNewLabel_3 = new JLabel("Last Name:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(171, 149, 80, 16);
		contentPane.add(lblNewLabel_3);
		
		addressTxt = new JTextField();
		addressTxt.setColumns(10);
		addressTxt.setBounds(274, 181, 116, 22);
		contentPane.add(addressTxt);
		
		JLabel lblNewLabel_4 = new JLabel("Address:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(171, 184, 69, 16);
		contentPane.add(lblNewLabel_4);
		
		PhoneTxt = new JTextField();
		PhoneTxt.setColumns(10);
		PhoneTxt.setBounds(274, 216, 116, 22);
		contentPane.add(PhoneTxt);
		
		JLabel lblNewLabel_5 = new JLabel("Phone:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(171, 219, 69, 16);
		contentPane.add(lblNewLabel_5);
		
		tripCostTxt = new JTextField();
		tripCostTxt.setColumns(10);
		tripCostTxt.setBounds(274, 251, 116, 22);
		contentPane.add(tripCostTxt);
		
		JLabel lblNewLabel_6 = new JLabel("Trip Cost:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(170, 254, 70, 16);
		contentPane.add(lblNewLabel_6);
		
		String travelOption[] = {"Pleasure" , "Business"};
		JComboBox travelTypeBox = new JComboBox(travelOption);
		travelTypeBox.setBounds(274, 296, 116, 22);
		contentPane.add(travelTypeBox);
		
		JLabel lblNewLabel_7 = new JLabel("Travel Type:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(171, 297, 80, 19);
		contentPane.add(lblNewLabel_7);
		
		String paymenOption[] = {"Credit", "Debit" , "Invoice" , "Check"};
		JComboBox paymentTypeBox = new JComboBox(paymenOption);
		paymentTypeBox.setBounds(274, 331, 116, 22);
		contentPane.add(paymentTypeBox);
		
		JLabel lblNewLabel_8 = new JLabel("Payment Type:");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_8.setBounds(171, 334, 106, 19);
		contentPane.add(lblNewLabel_8);
		
		
		MdContactField = new JTextField();
		MdContactField.setColumns(10);
		MdContactField.setBounds(274, 401, 116, 22);
		contentPane.add(MdContactField);
		MdContactField.setVisible(false);
		
		JLabel lblNewLabel_10 = new JLabel("MDContact:");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_10.setBounds(171, 401, 93, 22);
		contentPane.add(lblNewLabel_10);
		lblNewLabel_10.setVisible(false);
		
		MdPhoneField = new JTextField();
		MdPhoneField.setColumns(10);
		MdPhoneField.setBounds(274, 436, 116, 22);
		contentPane.add(MdPhoneField);
		MdPhoneField.setVisible(false);
		
		JLabel lblNewLabel_11 = new JLabel("MDPhone:");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_11.setBounds(171, 436, 80, 22);
		contentPane.add(lblNewLabel_11);
		lblNewLabel_11.setVisible(false);
		
		illnessField = new JTextField();
		illnessField.setColumns(10);
		illnessField.setBounds(274, 470, 116, 22);
		contentPane.add(illnessField);
		illnessField.setVisible(false);
		
		JLabel lblNewLabel_12 = new JLabel("Illness Type:");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_12.setBounds(171, 471, 80, 21);
		contentPane.add(lblNewLabel_12);
		lblNewLabel_12.setVisible(false);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(274, 505, 116, 22);
		contentPane.add(textField);
		textField.setVisible(false);
		
		JLabel lblNewLabel_13 = new JLabel("Allergy Type:");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_13.setBounds(171, 505, 93, 22);
		contentPane.add(lblNewLabel_13);
		lblNewLabel_13.setVisible(false);
		
		
		JLabel lblNewLabel_9 = new JLabel("Do you want to enter MD Information?");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_9.setBounds(171, 369, 246, 19);
		contentPane.add(lblNewLabel_9);
		
		
		String s1[] = {"No", "Yes"};
		JComboBox mdOptionBox = new JComboBox(s1);
		mdOptionBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = (String) mdOptionBox.getSelectedItem();
				
				// Check for a match
				switch(s) {
				case "No":
					MdContactField.setVisible(false);
					lblNewLabel_10.setVisible(false);
					MdPhoneField.setVisible(false);
					lblNewLabel_11.setVisible(false);
					illnessField.setVisible(false);
					lblNewLabel_12.setVisible(false);
					textField.setVisible(false);
					lblNewLabel_13.setVisible(false);
					break;
				case "Yes":
					MdContactField.setVisible(true);
					lblNewLabel_10.setVisible(true);
					MdPhoneField.setVisible(true);
					lblNewLabel_11.setVisible(true);
					illnessField.setVisible(true);
					lblNewLabel_12.setVisible(true);
					textField.setVisible(true);
					lblNewLabel_13.setVisible(true);
					break;
				}
			}
		});
		mdOptionBox.setBounds(429, 368, 47, 22);
		contentPane.add(mdOptionBox);
		
		JButton submitButton = new JButton("Submit");
		submitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String agentID = IDtext.getText();
				String filename = "agent"+agentID;
				String firstName = firstNameText.getText();
				String lastName = lastNameTxt.getText();
				String address = addressTxt.getText();
				String phone = PhoneTxt.getText();
				Float tripCost = Float.parseFloat(tripCostTxt.getText());
				String travelType = travelTypeBox.getSelectedItem().toString();
				String paymentType = paymentTypeBox.getSelectedItem().toString();
				String MdOption = mdOptionBox.getSelectedItem().toString();
				
				String MdContact = "None";
				String MdPhone = "None";
				String illness = "None";
				String allergy = "None";
				
				switch(MdOption) {
				case "Yes":
					MdContact = MdContactField.getText();
					MdPhone = MdPhoneField.getText();
					illness = illnessField.getText();
					allergy = textField.getText();
					break;
				case "No":
					break;
				}
				
				
				ArrayList <NewProfile> newprofile = new ArrayList <>();
				
				// Load object from existing file.
				try {
					// File exists
					FileInputStream fis = new FileInputStream(filename);
					ObjectInputStream ois = new ObjectInputStream(fis);
					
					newprofile = (ArrayList<NewProfile>) ois.readObject();
					
					ois.close();
					fis.close();
				}
				catch(IOException ioe) {
					// File does not exists
					
					
					
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				// Add the profile into object.
				NewProfile prof = new NewProfile(agentID, 
						firstName, 
						lastName, 
						address, 
						phone, 
						tripCost, 
						travelType, 
						paymentType, 
						MdContact, 
						MdPhone, 
						illness, 
						allergy);
				newprofile.add(prof);
				
				try
		        {
					// add to file
		            FileOutputStream fos = new FileOutputStream(filename);
		            ObjectOutputStream oos = new ObjectOutputStream(fos);
		            oos.writeObject(newprofile);
		            
		            oos.flush();
		            oos.close();
		            fos.close();
		            
		        } 
		        catch (IOException ioe) 
		        {
		        	// fail to add to file
		            //ioe.printStackTrace();
		        	System.out.println("Create Profile Failed!");
		        }
				
				
			}
		});
		submitButton.setForeground(new Color(0, 0, 0));
		submitButton.setBounds(274, 555, 143, 51);
		contentPane.add(submitButton);
	}

}
