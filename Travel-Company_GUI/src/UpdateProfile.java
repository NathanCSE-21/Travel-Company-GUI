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
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class UpdateProfile extends JFrame {

	private JPanel contentPane;
	private JTextField IDtextField;
	private JTextField lasttextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateProfile frame = new UpdateProfile();
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
	public UpdateProfile() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(252,248,243));
		
		JLabel lblNewLabel = new JLabel("Update Profile");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(170, 13, 92, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Traveler ID:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(30, 64, 78, 16);
		contentPane.add(lblNewLabel_1);
		
		IDtextField = new JTextField();
		IDtextField.setBounds(120, 62, 116, 22);
		contentPane.add(IDtextField);
		IDtextField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Last Name:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(30, 103, 72, 16);
		contentPane.add(lblNewLabel_2);
		
		lasttextField = new JTextField();
		lasttextField.setBounds(120, 97, 116, 22);
		contentPane.add(lasttextField);
		lasttextField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("View:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(63, 132, 80, 28);
		contentPane.add(lblNewLabel_3);
		
		String editOption[] = {"Address" , "Phone", "Medical Contact" , "Medical Phone", "Illness Type" , "Allergy Type"};
		JComboBox editBox = new JComboBox(editOption);
		editBox.setBounds(120, 136, 142, 22);
		contentPane.add(editBox);
		
		JButton submit = new JButton("Submit");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ID = IDtextField.getText();
				String lastname = lasttextField.getText();
				String editChoice = editBox.getSelectedItem().toString();
				
				
				// Pull data from agentID
				String filename = "agent"+ID;
				ArrayList <NewProfile> newprofile = new ArrayList <>();
				
				try {
					FileInputStream fis = new FileInputStream(filename);
					ObjectInputStream ois = new ObjectInputStream(fis);
					
					
					newprofile = (ArrayList) ois.readObject();
					
					ois.close();
					fis.close();
					
					
					// If the object at current match with the same lastname, then we send NewProfile object to display.
					
					UpdateProfileDesign design = new UpdateProfileDesign(newprofile, lastname, editChoice);
					dispose();
					design.setVisible(true);
						
					
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
				
				
			}
		});
		submit.setBounds(165, 192, 97, 25);
		contentPane.add(submit);
	}

}