import java.awt.BorderLayout;
import java.awt.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.awt.event.ActionEvent;

public class UpdateProfileDesign extends JFrame {

	private JPanel contentPane;
	String agenttextField;
	private JTextField firsttextField;
	private JTextField lasttextField;
	private JTextField addresstextField;
	private JTextField phonetextField;
	Float travelcosttextField;
	private JTextField traveltextField;
	private JTextField paymenttextField;
	private JTextField mdContacttextField;
	private JTextField mdphonetextField;
	private JTextField illnesstextField;
	private JTextField allergytextField;
	
	private int idFound = 0;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateProfileDesign frame = new UpdateProfileDesign(null, null, null);
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
	public UpdateProfileDesign(ArrayList<NewProfile> newprofile, String lastname, String editChoice) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 593, 449);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(252,248,243));
		
		JLabel lblNewLabel = new JLabel("Individual Profile");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(223, 13, 110, 28);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 575, 16);
		contentPane.add(panel);
		panel.setBackground(new Color(170,207,207));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 374, 575, 28);
		contentPane.add(panel_1);
		panel_1.setBackground(new Color(170,207,207));
		
		JLabel first = new JLabel("First Name");
		first.setFont(new Font("Tahoma", Font.PLAIN, 14));
		first.setBounds(36, 60, 72, 16);
		contentPane.add(first);
		
		firsttextField = new JTextField();
		firsttextField.setEditable(false);
		firsttextField.setBounds(12, 85, 116, 22);
		contentPane.add(firsttextField);
		firsttextField.setColumns(10);
		
		JLabel last = new JLabel("Last Name");
		last.setFont(new Font("Tahoma", Font.PLAIN, 14));
		last.setBounds(175, 60, 72, 16);
		contentPane.add(last);
		
		lasttextField = new JTextField();
		lasttextField.setEditable(false);
		lasttextField.setBounds(153, 85, 116, 22);
		contentPane.add(lasttextField);
		lasttextField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Address");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(328, 61, 57, 16);
		contentPane.add(lblNewLabel_1);
		
		addresstextField = new JTextField();
		addresstextField.setEditable(false);
		addresstextField.setBounds(292, 85, 116, 22);
		contentPane.add(addresstextField);
		addresstextField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Phone");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(468, 61, 56, 16);
		contentPane.add(lblNewLabel_2);
		
		phonetextField = new JTextField();
		phonetextField.setEditable(false);
		phonetextField.setBounds(435, 85, 116, 22);
		contentPane.add(phonetextField);
		phonetextField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Travel Type");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(36, 148, 72, 16);
		contentPane.add(lblNewLabel_3);
		
		traveltextField = new JTextField();
		traveltextField.setEditable(false);
		traveltextField.setBounds(12, 177, 116, 22);
		contentPane.add(traveltextField);
		traveltextField.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Payment Type");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(164, 148, 94, 16);
		contentPane.add(lblNewLabel_4);
		
		paymenttextField = new JTextField();
		paymenttextField.setEditable(false);
		paymenttextField.setBounds(153, 177, 116, 22);
		contentPane.add(paymenttextField);
		paymenttextField.setColumns(10);
		
		mdContacttextField = new JTextField();
		mdContacttextField.setEditable(false);
		mdContacttextField.setBounds(292, 177, 116, 22);
		contentPane.add(mdContacttextField);
		mdContacttextField.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Medical Contact");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(292, 148, 105, 16);
		contentPane.add(lblNewLabel_5);
		
		mdphonetextField = new JTextField();
		mdphonetextField.setEditable(false);
		mdphonetextField.setBounds(435, 177, 116, 22);
		contentPane.add(mdphonetextField);
		mdphonetextField.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Medical Phone");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(452, 149, 86, 16);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Illness Type");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(36, 227, 80, 16);
		contentPane.add(lblNewLabel_7);
		
		illnesstextField = new JTextField();
		illnesstextField.setEditable(false);
		illnesstextField.setBounds(12, 256, 116, 22);
		contentPane.add(illnesstextField);
		illnesstextField.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Allergy Type");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_8.setBounds(164, 227, 83, 16);
		contentPane.add(lblNewLabel_8);
		
		allergytextField = new JTextField();
		allergytextField.setEditable(false);
		allergytextField.setBounds(153, 256, 116, 22);
		contentPane.add(allergytextField);
		allergytextField.setColumns(10);
		
	
		boolean found = false;
		int counter = 0;
		
		for(NewProfile prof: newprofile) {
			if(prof.lastName.equals(lastname)) {
				found = true;
				idFound = counter;
				// Set text for the corresponding field.
				agenttextField = prof.ID;
				firsttextField.setText(prof.firstName);
				lasttextField.setText(prof.lastName);
				addresstextField.setText(prof.address);
				phonetextField.setText(prof.phone);
				travelcosttextField = prof.tripCost;
				traveltextField.setText(prof.travelType);
				paymenttextField.setText(prof.paymentType);
				mdContacttextField.setText(prof.mdContact);
				mdphonetextField.setText(prof.mdPhone);
				illnesstextField.setText(prof.illness);
				allergytextField.setText(prof.allergy);
				
				if(editChoice.equals("Address")) {
					
					addresstextField.setEditable(true);
					
				}
				
				if(editChoice.equals("Phone")) {
					
					phonetextField.setEditable(true);
					
				}
				if(editChoice.equals("Medical Contact")) {
					
					mdContacttextField.setEditable(true);
					
				}
				if(editChoice.equals("Medical Phone")) {
					
					mdphonetextField.setEditable(true);
					
				}
				if(editChoice.equals("Illness Type")) {
					
					illnesstextField.setEditable(true);
					
				}
				if(editChoice.equals("Allergy Type")) {
					
					allergytextField.setEditable(true);
					
				}
				
				counter++;
				
			}
		}
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String agentID = agenttextField;
				String firstName = firsttextField.getText();
				String lastName = lasttextField.getText();
				String travelType = traveltextField.getText();
				String paymentType = paymenttextField.getText();
				Float tripCost = travelcosttextField;
				String address = addresstextField.getText();
				String phone = phonetextField.getText();				
				String MdContact = mdContacttextField.getText();
				String MdPhone = mdphonetextField.getText();
				String illness = illnesstextField.getText();
				String allergy = allergytextField.getText();
				
				String filename = "agent"+agentID;
				
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
				newprofile.set(idFound, prof);
				
				try
		        {
					// add to file
					
		            FileOutputStream fos = new FileOutputStream(filename);
		            ObjectOutputStream oos = new ObjectOutputStream(fos);
		            oos.writeObject(newprofile);
		            
		            oos.flush();
		            oos.close();
		            fos.close();
		            
		            dispose();
		            JOptionPane.showMessageDialog(null, "Profile Saved");		        } catch(IOException ioe) {
					// File does not exists
		            	
				}
				
				
				
			}
		});
		btnNewButton.setBounds(236, 318, 97, 25);
		contentPane.add(btnNewButton);
		
		
		if(!found) {
			JOptionPane.showMessageDialog(null, "Profile Not Found!");
		}
		
	}
}