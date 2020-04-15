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
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class FindProfile extends JFrame {

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
					FindProfile frame = new FindProfile();
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
	public FindProfile() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(252,248,243));
		
		JLabel lblNewLabel = new JLabel("Find Profile");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(170, 13, 72, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Traveler ID:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(30, 64, 78, 16);
		contentPane.add(lblNewLabel_1);
		
		IDtextField = new JTextField();
		IDtextField.setBounds(120, 62, 116, 22);
		contentPane.add(IDtextField);
		IDtextField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Last Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(30, 120, 72, 16);
		contentPane.add(lblNewLabel_2);
		
		lasttextField = new JTextField();
		lasttextField.setBounds(120, 118, 116, 22);
		contentPane.add(lasttextField);
		lasttextField.setColumns(10);
		
		JButton submit = new JButton("Submit");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ID = IDtextField.getText();
				String lastname = lasttextField.getText();
				
				
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
					
					DisplaySingleProfile design = new DisplaySingleProfile(newprofile, lastname);
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
		submit.setBounds(170, 193, 97, 25);
		contentPane.add(submit);
	}

}
