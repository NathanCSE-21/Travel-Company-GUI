import java.awt.BorderLayout;
import java.awt.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class DeleteProfile extends JFrame {

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
					DeleteProfile frame = new DeleteProfile();
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
	public DeleteProfile() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 460, 305);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setBackground(new Color(232,249,233));
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 442, 20);
		contentPane.add(panel);
		panel.setBackground(new Color(244,218,218));
		
		JLabel lblNewLabel = new JLabel("Delete Profile");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(166, 29, 89, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Traveler ID:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(43, 71, 72, 16);
		contentPane.add(lblNewLabel_1);
		
		IDtextField = new JTextField();
		IDtextField.setBounds(127, 69, 116, 22);
		contentPane.add(IDtextField);
		IDtextField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Last Name:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(45, 117, 70, 16);
		contentPane.add(lblNewLabel_2);
		
		lasttextField = new JTextField();
		lasttextField.setBounds(127, 115, 116, 22);
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
					
					boolean found = false;
					int counter =0;
					int delete_idx =0;
					for(NewProfile prof: newprofile) {
						if(prof.lastName.equals(lastname)) {
							found = true;
							delete_idx = counter;
							newprofile.remove(prof);
							
							
							// Add newprofile into file.
							FileOutputStream fos = new FileOutputStream(filename);
				            ObjectOutputStream oos = new ObjectOutputStream(fos);
				            oos.writeObject(newprofile);
				            
				            oos.flush();
				            oos.close();
				            fos.close();
				            
							break;
						}
						
						counter++;
					}
					
					if(found) {
						//newprofile.remove(delete_idx);
						JOptionPane.showMessageDialog(null, "Profile Deleted");
					}
					else {
						JOptionPane.showMessageDialog(null, "Failed To Delete");
					}
					
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
		submit.setBounds(127, 196, 97, 25);
		contentPane.add(submit);
		
		
	}

}
