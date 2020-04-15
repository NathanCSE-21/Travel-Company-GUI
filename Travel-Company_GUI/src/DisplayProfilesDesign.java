import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DisplayProfilesDesign extends JFrame {

	private JPanel contentPane;
	private JTextField agenttextField_1;
	private JTextField firsttextField_1;
	private JTextField lasttextField_1;
	private JTextField addresstextField_1;
	private JTextField phonetextField_1;
	private JTextField travelTextField_1;
	private JTextField paymentTextField_1;
	private JTextField contactTextField_1;
	private JTextField mdphonetextField_1;
	private JTextField illnesstextField_1;
	private JTextField allergytextField_1;
	private JTextField agenttextField_2;
	private JTextField firsttextField_2;
	private JTextField lasttextField_2;
	private JTextField addresstextField_2;
	private JTextField phonetextField_2;
	private JTextField traveltextField_2;
	private JTextField paymenttextField_2;
	private JTextField mdcontacttextField_2;
	private JTextField mdphonetextField_2;
	private JTextField illnesstextField_2;
	private JTextField allergytextField_2;
	private JTextField agenttextField_3;
	private JTextField firsttextField_3;
	private JTextField lasttextField_3;
	private JTextField addresstextField_3;
	private JTextField phonetextField_3;
	private JTextField traveltextField_3;
	private JTextField paymenttextField_3;
	private JTextField mdcontacttextField_3;
	private JTextField mdphonetextField_3;
	private JTextField illnesstextField_3;
	private JTextField allergytextField_3;
	private JTextField agenttextField_4;
	private JTextField firsttextField_4;
	private JTextField lasttextField_4;
	private JTextField addresstextField_4;
	private JTextField phonetextField_4;
	private JTextField traveltextField_4;
	private JTextField paymenttextField_4;
	private JTextField mdcontacttextField_4;
	private JTextField mdphonetextField_4;
	private JTextField illnesstextField_4;
	private JTextField allergytextField_4;
	private JTextField agenttextField_5;
	private JTextField firsttextField_5;
	private JTextField lasttextField_5;
	private JTextField addresstextField_5;
	private JTextField phonetextField_5;
	private JTextField traveltextField_5;
	private JTextField paymenttextField_5;
	private JTextField mdcontacttextField_5;
	private JTextField mdphonetextField_5;
	private JTextField illnesstextField_5;
	private JTextField allergytextField_5;
	private JTextField boxtextField;
	private int idx = 1;
	private double total = 0;
	private double pages = 0;
	private double current_page = 1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DisplayProfilesDesign frame = new DisplayProfilesDesign(null);
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
	public DisplayProfilesDesign(ArrayList<NewProfile> newprofile) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1109, 477);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(34,40,49));
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 69, 241);
		contentPane.add(panel);
		panel.setBackground(new Color(48,71,94));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 241, 69, 296);
		contentPane.add(panel_1);
		panel_1.setBackground(new Color(27,38,44));
		
		JLabel lblNewLabel = new JLabel("Profiles Database");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(467, 13, 120, 27);
		contentPane.add(lblNewLabel);
		
		JLabel agentLabel = new JLabel("AgentID");
		agentLabel.setForeground(Color.WHITE);
		agentLabel.setBounds(81, 64, 56, 16);
		contentPane.add(agentLabel);
		
		JLabel firstNameLabel = new JLabel("First Name");
		firstNameLabel.setForeground(Color.WHITE);
		firstNameLabel.setBounds(138, 64, 69, 16);
		contentPane.add(firstNameLabel);
		
		JLabel lastNameLabel = new JLabel("Last Name");
		lastNameLabel.setForeground(Color.WHITE);
		lastNameLabel.setBounds(219, 64, 69, 16);
		contentPane.add(lastNameLabel);
		
		JLabel addressLabel = new JLabel("Address");
		addressLabel.setForeground(Color.WHITE);
		addressLabel.setBounds(339, 64, 56, 16);
		contentPane.add(addressLabel);
		
		JLabel PhoneLabel = new JLabel("Phone");
		PhoneLabel.setForeground(Color.WHITE);
		PhoneLabel.setBounds(467, 64, 44, 16);
		contentPane.add(PhoneLabel);
		
		JLabel TravelTypeLabel = new JLabel("Travel Type");
		TravelTypeLabel.setForeground(Color.WHITE);
		TravelTypeLabel.setBounds(545, 64, 75, 16);
		contentPane.add(TravelTypeLabel);
		
		JLabel PaymentTypeLabel = new JLabel("Payment Type");
		PaymentTypeLabel.setForeground(Color.WHITE);
		PaymentTypeLabel.setBounds(648, 64, 90, 16);
		contentPane.add(PaymentTypeLabel);
		
		JLabel mdContactLabel = new JLabel("mdContact");
		mdContactLabel.setForeground(Color.WHITE);
		mdContactLabel.setBounds(750, 64, 69, 16);
		contentPane.add(mdContactLabel);
		
		JLabel mdPhoneLabel = new JLabel("mdPhone");
		mdPhoneLabel.setForeground(Color.WHITE);
		mdPhoneLabel.setBounds(831, 64, 56, 16);
		contentPane.add(mdPhoneLabel);
		
		JLabel illnessLabel = new JLabel("illnessType");
		illnessLabel.setForeground(Color.WHITE);
		illnessLabel.setBounds(915, 64, 69, 16);
		contentPane.add(illnessLabel);
		
		JLabel allergyLabel = new JLabel("allergyType");
		allergyLabel.setForeground(Color.WHITE);
		allergyLabel.setBounds(996, 64, 83, 16);
		contentPane.add(allergyLabel);
		
		agenttextField_1 = new JTextField();
		agenttextField_1.setBackground(Color.WHITE);
		agenttextField_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		agenttextField_1.setEditable(false);
		agenttextField_1.setBounds(81, 93, 44, 22);
		contentPane.add(agenttextField_1);
		agenttextField_1.setColumns(10);
		
		firsttextField_1 = new JTextField();
		firsttextField_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		firsttextField_1.setEditable(false);
		firsttextField_1.setBounds(138, 93, 62, 22);
		contentPane.add(firsttextField_1);
		firsttextField_1.setColumns(10);
		
		lasttextField_1 = new JTextField();
		lasttextField_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lasttextField_1.setEditable(false);
		lasttextField_1.setBounds(212, 93, 87, 22);
		contentPane.add(lasttextField_1);
		lasttextField_1.setColumns(10);
		
		addresstextField_1 = new JTextField();
		addresstextField_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		addresstextField_1.setEditable(false);
		addresstextField_1.setBounds(311, 93, 108, 22);
		contentPane.add(addresstextField_1);
		addresstextField_1.setColumns(10);
		
		phonetextField_1 = new JTextField();
		phonetextField_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		phonetextField_1.setEditable(false);
		phonetextField_1.setBounds(431, 93, 102, 22);
		contentPane.add(phonetextField_1);
		phonetextField_1.setColumns(10);
		
		travelTextField_1 = new JTextField();
		travelTextField_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		travelTextField_1.setEditable(false);
		travelTextField_1.setBounds(545, 93, 91, 22);
		contentPane.add(travelTextField_1);
		travelTextField_1.setColumns(10);
		
		paymentTextField_1 = new JTextField();
		paymentTextField_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		paymentTextField_1.setEditable(false);
		paymentTextField_1.setBounds(645, 93, 90, 22);
		contentPane.add(paymentTextField_1);
		paymentTextField_1.setColumns(10);
		
		contactTextField_1 = new JTextField();
		contactTextField_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contactTextField_1.setEditable(false);
		contactTextField_1.setBounds(744, 93, 75, 22);
		contentPane.add(contactTextField_1);
		contactTextField_1.setColumns(10);
		
		mdphonetextField_1 = new JTextField();
		mdphonetextField_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		mdphonetextField_1.setEditable(false);
		mdphonetextField_1.setBounds(831, 93, 69, 22);
		contentPane.add(mdphonetextField_1);
		mdphonetextField_1.setColumns(10);
		
		illnesstextField_1 = new JTextField();
		illnesstextField_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		illnesstextField_1.setEditable(false);
		illnesstextField_1.setBounds(909, 93, 75, 22);
		contentPane.add(illnesstextField_1);
		illnesstextField_1.setColumns(10);
		
		allergytextField_1 = new JTextField();
		allergytextField_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		allergytextField_1.setEditable(false);
		allergytextField_1.setColumns(10);
		allergytextField_1.setBounds(996, 93, 75, 22);
		contentPane.add(allergytextField_1);
		
		agenttextField_2 = new JTextField();
		agenttextField_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		agenttextField_2.setEditable(false);
		agenttextField_2.setColumns(10);
		agenttextField_2.setBounds(81, 140, 44, 22);
		contentPane.add(agenttextField_2);
		
		firsttextField_2 = new JTextField();
		firsttextField_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		firsttextField_2.setEditable(false);
		firsttextField_2.setColumns(10);
		firsttextField_2.setBounds(138, 139, 62, 22);
		contentPane.add(firsttextField_2);
		
		lasttextField_2 = new JTextField();
		lasttextField_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lasttextField_2.setEditable(false);
		lasttextField_2.setColumns(10);
		lasttextField_2.setBounds(212, 139, 87, 22);
		contentPane.add(lasttextField_2);
		
		addresstextField_2 = new JTextField();
		addresstextField_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		addresstextField_2.setEditable(false);
		addresstextField_2.setColumns(10);
		addresstextField_2.setBounds(311, 139, 108, 22);
		contentPane.add(addresstextField_2);
		
		phonetextField_2 = new JTextField();
		phonetextField_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		phonetextField_2.setEditable(false);
		phonetextField_2.setColumns(10);
		phonetextField_2.setBounds(431, 139, 102, 22);
		contentPane.add(phonetextField_2);
		
		traveltextField_2 = new JTextField();
		traveltextField_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		traveltextField_2.setEditable(false);
		traveltextField_2.setColumns(10);
		traveltextField_2.setBounds(545, 139, 91, 22);
		contentPane.add(traveltextField_2);
		
		paymenttextField_2 = new JTextField();
		paymenttextField_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		paymenttextField_2.setEditable(false);
		paymenttextField_2.setColumns(10);
		paymenttextField_2.setBounds(645, 140, 90, 22);
		contentPane.add(paymenttextField_2);
		
		mdcontacttextField_2 = new JTextField();
		mdcontacttextField_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		mdcontacttextField_2.setEditable(false);
		mdcontacttextField_2.setColumns(10);
		mdcontacttextField_2.setBounds(744, 139, 75, 22);
		contentPane.add(mdcontacttextField_2);
		
		mdphonetextField_2 = new JTextField();
		mdphonetextField_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		mdphonetextField_2.setEditable(false);
		mdphonetextField_2.setColumns(10);
		mdphonetextField_2.setBounds(831, 139, 69, 22);
		contentPane.add(mdphonetextField_2);
		
		illnesstextField_2 = new JTextField();
		illnesstextField_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		illnesstextField_2.setEditable(false);
		illnesstextField_2.setColumns(10);
		illnesstextField_2.setBounds(909, 139, 75, 22);
		contentPane.add(illnesstextField_2);
		
		allergytextField_2 = new JTextField();
		allergytextField_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		allergytextField_2.setEditable(false);
		allergytextField_2.setColumns(10);
		allergytextField_2.setBounds(996, 139, 75, 22);
		contentPane.add(allergytextField_2);
		
		agenttextField_3 = new JTextField();
		agenttextField_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		agenttextField_3.setEditable(false);
		agenttextField_3.setColumns(10);
		agenttextField_3.setBounds(81, 191, 44, 22);
		contentPane.add(agenttextField_3);
		
		firsttextField_3 = new JTextField();
		firsttextField_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		firsttextField_3.setEditable(false);
		firsttextField_3.setColumns(10);
		firsttextField_3.setBounds(138, 191, 62, 22);
		contentPane.add(firsttextField_3);
		
		lasttextField_3 = new JTextField();
		lasttextField_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lasttextField_3.setEditable(false);
		lasttextField_3.setColumns(10);
		lasttextField_3.setBounds(212, 191, 87, 22);
		contentPane.add(lasttextField_3);
		
		addresstextField_3 = new JTextField();
		addresstextField_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		addresstextField_3.setEditable(false);
		addresstextField_3.setColumns(10);
		addresstextField_3.setBounds(311, 191, 108, 22);
		contentPane.add(addresstextField_3);
		
		phonetextField_3 = new JTextField();
		phonetextField_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		phonetextField_3.setEditable(false);
		phonetextField_3.setColumns(10);
		phonetextField_3.setBounds(431, 191, 102, 22);
		contentPane.add(phonetextField_3);
		
		traveltextField_3 = new JTextField();
		traveltextField_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		traveltextField_3.setEditable(false);
		traveltextField_3.setColumns(10);
		traveltextField_3.setBounds(545, 191, 91, 22);
		contentPane.add(traveltextField_3);
		
		paymenttextField_3 = new JTextField();
		paymenttextField_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		paymenttextField_3.setEditable(false);
		paymenttextField_3.setColumns(10);
		paymenttextField_3.setBounds(645, 192, 90, 22);
		contentPane.add(paymenttextField_3);
		
		mdcontacttextField_3 = new JTextField();
		mdcontacttextField_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		mdcontacttextField_3.setEditable(false);
		mdcontacttextField_3.setColumns(10);
		mdcontacttextField_3.setBounds(744, 191, 75, 22);
		contentPane.add(mdcontacttextField_3);
		
		mdphonetextField_3 = new JTextField();
		mdphonetextField_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		mdphonetextField_3.setEditable(false);
		mdphonetextField_3.setColumns(10);
		mdphonetextField_3.setBounds(831, 191, 69, 22);
		contentPane.add(mdphonetextField_3);
		
		illnesstextField_3 = new JTextField();
		illnesstextField_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		illnesstextField_3.setEditable(false);
		illnesstextField_3.setColumns(10);
		illnesstextField_3.setBounds(909, 191, 75, 22);
		contentPane.add(illnesstextField_3);
		
		allergytextField_3 = new JTextField();
		allergytextField_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		allergytextField_3.setEditable(false);
		allergytextField_3.setColumns(10);
		allergytextField_3.setBounds(996, 191, 75, 22);
		contentPane.add(allergytextField_3);
		
		agenttextField_4 = new JTextField();
		agenttextField_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		agenttextField_4.setEditable(false);
		agenttextField_4.setColumns(10);
		agenttextField_4.setBounds(81, 230, 44, 22);
		contentPane.add(agenttextField_4);
		
		firsttextField_4 = new JTextField();
		firsttextField_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		firsttextField_4.setEditable(false);
		firsttextField_4.setColumns(10);
		firsttextField_4.setBounds(138, 229, 62, 22);
		contentPane.add(firsttextField_4);
		
		lasttextField_4 = new JTextField();
		lasttextField_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lasttextField_4.setEditable(false);
		lasttextField_4.setColumns(10);
		lasttextField_4.setBounds(212, 229, 87, 22);
		contentPane.add(lasttextField_4);
		
		addresstextField_4 = new JTextField();
		addresstextField_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		addresstextField_4.setEditable(false);
		addresstextField_4.setColumns(10);
		addresstextField_4.setBounds(311, 229, 108, 22);
		contentPane.add(addresstextField_4);
		
		phonetextField_4 = new JTextField();
		phonetextField_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		phonetextField_4.setEditable(false);
		phonetextField_4.setColumns(10);
		phonetextField_4.setBounds(431, 229, 102, 22);
		contentPane.add(phonetextField_4);
		
		traveltextField_4 = new JTextField();
		traveltextField_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		traveltextField_4.setEditable(false);
		traveltextField_4.setColumns(10);
		traveltextField_4.setBounds(545, 229, 91, 22);
		contentPane.add(traveltextField_4);
		
		paymenttextField_4 = new JTextField();
		paymenttextField_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		paymenttextField_4.setEditable(false);
		paymenttextField_4.setColumns(10);
		paymenttextField_4.setBounds(645, 229, 90, 22);
		contentPane.add(paymenttextField_4);
		
		mdcontacttextField_4 = new JTextField();
		mdcontacttextField_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		mdcontacttextField_4.setEditable(false);
		mdcontacttextField_4.setColumns(10);
		mdcontacttextField_4.setBounds(744, 229, 75, 22);
		contentPane.add(mdcontacttextField_4);
		
		mdphonetextField_4 = new JTextField();
		mdphonetextField_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		mdphonetextField_4.setEditable(false);
		mdphonetextField_4.setColumns(10);
		mdphonetextField_4.setBounds(831, 229, 69, 22);
		contentPane.add(mdphonetextField_4);
		
		illnesstextField_4 = new JTextField();
		illnesstextField_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		illnesstextField_4.setEditable(false);
		illnesstextField_4.setColumns(10);
		illnesstextField_4.setBounds(909, 226, 75, 22);
		contentPane.add(illnesstextField_4);
		
		allergytextField_4 = new JTextField();
		allergytextField_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		allergytextField_4.setEditable(false);
		allergytextField_4.setColumns(10);
		allergytextField_4.setBounds(996, 226, 75, 22);
		contentPane.add(allergytextField_4);
		
		agenttextField_5 = new JTextField();
		agenttextField_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		agenttextField_5.setEditable(false);
		agenttextField_5.setColumns(10);
		agenttextField_5.setBounds(81, 265, 44, 22);
		contentPane.add(agenttextField_5);
		
		firsttextField_5 = new JTextField();
		firsttextField_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		firsttextField_5.setEditable(false);
		firsttextField_5.setColumns(10);
		firsttextField_5.setBounds(138, 264, 62, 22);
		contentPane.add(firsttextField_5);
		
		lasttextField_5 = new JTextField();
		lasttextField_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lasttextField_5.setEditable(false);
		lasttextField_5.setColumns(10);
		lasttextField_5.setBounds(212, 264, 87, 22);
		contentPane.add(lasttextField_5);
		
		addresstextField_5 = new JTextField();
		addresstextField_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		addresstextField_5.setEditable(false);
		addresstextField_5.setColumns(10);
		addresstextField_5.setBounds(311, 264, 108, 22);
		contentPane.add(addresstextField_5);
		
		phonetextField_5 = new JTextField();
		phonetextField_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		phonetextField_5.setEditable(false);
		phonetextField_5.setColumns(10);
		phonetextField_5.setBounds(431, 264, 102, 22);
		contentPane.add(phonetextField_5);
		
		traveltextField_5 = new JTextField();
		traveltextField_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		traveltextField_5.setEditable(false);
		traveltextField_5.setColumns(10);
		traveltextField_5.setBounds(545, 264, 91, 22);
		contentPane.add(traveltextField_5);
		
		paymenttextField_5 = new JTextField();
		paymenttextField_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		paymenttextField_5.setEditable(false);
		paymenttextField_5.setColumns(10);
		paymenttextField_5.setBounds(645, 265, 90, 22);
		contentPane.add(paymenttextField_5);
		
		mdcontacttextField_5 = new JTextField();
		mdcontacttextField_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		mdcontacttextField_5.setEditable(false);
		mdcontacttextField_5.setColumns(10);
		mdcontacttextField_5.setBounds(744, 264, 75, 22);
		contentPane.add(mdcontacttextField_5);
		
		mdphonetextField_5 = new JTextField();
		mdphonetextField_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		mdphonetextField_5.setEditable(false);
		mdphonetextField_5.setColumns(10);
		mdphonetextField_5.setBounds(831, 264, 69, 22);
		contentPane.add(mdphonetextField_5);
		
		illnesstextField_5 = new JTextField();
		illnesstextField_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		illnesstextField_5.setEditable(false);
		illnesstextField_5.setColumns(10);
		illnesstextField_5.setBounds(909, 264, 75, 22);
		contentPane.add(illnesstextField_5);
		
		allergytextField_5 = new JTextField();
		allergytextField_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		allergytextField_5.setEditable(false);
		allergytextField_5.setColumns(10);
		allergytextField_5.setBounds(996, 264, 75, 22);
		contentPane.add(allergytextField_5);
		
		boxtextField = new JTextField();
		boxtextField.setEditable(false);
		boxtextField.setBounds(462, 378, 49, 22);
		contentPane.add(boxtextField);
		boxtextField.setColumns(10);
		
		
		JLabel lblNewLabel_1 = new JLabel("of");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(525, 381, 23, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel maxLabel = new JLabel("");
		maxLabel.setForeground(Color.WHITE);
		maxLabel.setBounds(545, 381, 44, 16);
		contentPane.add(maxLabel);
		
		JButton btNext = new JButton("NEXT");
		
		btNext.setBounds(601, 377, 97, 25);
		contentPane.add(btNext);
		//btNext.setVisible(false);
		
		//int idx = 1;
		//double total = 0;
		//double pages = 0;
		
		// Count the total profile in the object
		for(NewProfile prof:newprofile) {
			total++;
		}
		
		// Calculate how many pages we need.
		pages = Math.ceil(total/5);
		
		
		
			if(current_page < pages) {
				btNext.setVisible(true);
			}
			else {
				btNext.setVisible(false);
			}
			
			boxtextField.setText(Double.toString(current_page));
			maxLabel.setText(Double.toString(pages));
			
			btNext.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					idx = 1;
					current_page++;
					
					if(current_page < pages) {
						btNext.setVisible(true);
					}
					else {
						btNext.setVisible(false);
					}
					
					boxtextField.setText(Double.toString(current_page));
					
					// Set everything to empty.
					agenttextField_1.setText("");
					firsttextField_1.setText("");
					lasttextField_1.setText("");
					addresstextField_1.setText("");
					phonetextField_1.setText("");
					travelTextField_1.setText("");
					paymentTextField_1.setText("");
					contactTextField_1.setText("");
					mdphonetextField_1.setText("");
					illnesstextField_1.setText("");
					allergytextField_1.setText("");
					
					agenttextField_2.setText("");
					firsttextField_2.setText("");
					lasttextField_2.setText("");
					addresstextField_2.setText("");
					phonetextField_2.setText("");
					traveltextField_2.setText("");
					paymenttextField_2.setText("");
					mdcontacttextField_2.setText("");
					mdphonetextField_2.setText("");
					illnesstextField_2.setText("");
					allergytextField_2.setText("");
					
					agenttextField_3.setText("");
					firsttextField_3.setText("");
					lasttextField_3.setText("");
					addresstextField_3.setText("");
					phonetextField_3.setText("");
					traveltextField_3.setText("");
					paymenttextField_3.setText("");
					mdcontacttextField_3.setText("");
					mdphonetextField_3.setText("");
					illnesstextField_3.setText("");
					allergytextField_3.setText("");
					
					agenttextField_4.setText("");
					firsttextField_4.setText("");
					lasttextField_4.setText("");
					addresstextField_4.setText("");
					phonetextField_4.setText("");
					traveltextField_4.setText("");
					paymenttextField_4.setText("");
					mdcontacttextField_4.setText("");
					mdphonetextField_4.setText("");
					illnesstextField_4.setText("");
					allergytextField_4.setText("");
					
					agenttextField_5.setText("");
					firsttextField_5.setText("");
					lasttextField_5.setText("");
					addresstextField_5.setText("");
					phonetextField_5.setText("");
					traveltextField_5.setText("");
					paymenttextField_5.setText("");
					mdcontacttextField_5.setText("");
					mdphonetextField_5.setText("");
					illnesstextField_5.setText("");
					allergytextField_5.setText("");
					
					int temp = 1;
					for(NewProfile prof: newprofile) {
						if(temp > 5) {
							switch(idx) {
							case 1:
								agenttextField_1.setText(prof.ID);
								firsttextField_1.setText(prof.firstName);
								lasttextField_1.setText(prof.lastName);
								addresstextField_1.setText(prof.address);
								phonetextField_1.setText(prof.phone);
								travelTextField_1.setText(prof.travelType);
								paymentTextField_1.setText(prof.paymentType);
								contactTextField_1.setText(prof.mdContact);
								mdphonetextField_1.setText(prof.mdPhone);
								illnesstextField_1.setText(prof.illness);;
								allergytextField_1.setText(prof.allergy);;
								break;
								
							case 2:
								agenttextField_2.setText(prof.ID);
								firsttextField_2.setText(prof.firstName);
								lasttextField_2.setText(prof.lastName);
								addresstextField_2.setText(prof.address);
								phonetextField_2.setText(prof.phone);
								traveltextField_2.setText(prof.travelType);
								paymenttextField_2.setText(prof.paymentType);
								mdcontacttextField_2.setText(prof.mdContact);
								mdphonetextField_2.setText(prof.mdPhone);
								illnesstextField_2.setText(prof.illness);
								allergytextField_2.setText(prof.allergy);
								break;
								
							case 3:
								agenttextField_3.setText(prof.ID);
								firsttextField_3.setText(prof.firstName);
								lasttextField_3.setText(prof.lastName);
								addresstextField_3.setText(prof.address);
								phonetextField_3.setText(prof.phone);
								traveltextField_3.setText(prof.travelType);
								paymenttextField_3.setText(prof.paymentType);
								mdcontacttextField_3.setText(prof.mdContact);
								mdphonetextField_3.setText(prof.mdPhone);
								illnesstextField_3.setText(prof.illness);
								allergytextField_3.setText(prof.allergy);
								break;
								
							case 4:
								agenttextField_4.setText(prof.ID);
								firsttextField_4.setText(prof.firstName);
								lasttextField_4.setText(prof.lastName);
								addresstextField_4.setText(prof.address);
								phonetextField_4.setText(prof.phone);
								traveltextField_4.setText(prof.travelType);
								paymenttextField_4.setText(prof.paymentType);
								mdcontacttextField_4.setText(prof.mdContact);
								mdphonetextField_4.setText(prof.mdPhone);
								illnesstextField_4.setText(prof.illness);
								allergytextField_4.setText(prof.allergy);
								break;
								
							case 5:
								agenttextField_5.setText(prof.ID);
								firsttextField_5.setText(prof.firstName);
								lasttextField_5.setText(prof.lastName);
								addresstextField_5.setText(prof.address);
								phonetextField_5.setText(prof.phone);
								traveltextField_5.setText(prof.travelType);
								paymenttextField_5.setText(prof.paymentType);
								mdcontacttextField_5.setText(prof.mdContact);
								mdphonetextField_5.setText(prof.mdPhone);
								illnesstextField_5.setText(prof.illness);
								allergytextField_5.setText(prof.allergy);
								break;
							
							}
							
							idx++;
						}
						
						temp++;
					}
				}
			});
			
			for(NewProfile prof: newprofile) {
				switch(idx) {
				case 1:
					agenttextField_1.setText(prof.ID);
					firsttextField_1.setText(prof.firstName);
					lasttextField_1.setText(prof.lastName);
					addresstextField_1.setText(prof.address);
					phonetextField_1.setText(prof.phone);
					travelTextField_1.setText(prof.travelType);
					paymentTextField_1.setText(prof.paymentType);
					contactTextField_1.setText(prof.mdContact);
					mdphonetextField_1.setText(prof.mdPhone);
					illnesstextField_1.setText(prof.illness);;
					allergytextField_1.setText(prof.allergy);;
					break;
					
				case 2:
					agenttextField_2.setText(prof.ID);
					firsttextField_2.setText(prof.firstName);
					lasttextField_2.setText(prof.lastName);
					addresstextField_2.setText(prof.address);
					phonetextField_2.setText(prof.phone);
					traveltextField_2.setText(prof.travelType);
					paymenttextField_2.setText(prof.paymentType);
					mdcontacttextField_2.setText(prof.mdContact);
					mdphonetextField_2.setText(prof.mdPhone);
					illnesstextField_2.setText(prof.illness);
					allergytextField_2.setText(prof.allergy);
					break;
					
				case 3:
					agenttextField_3.setText(prof.ID);
					firsttextField_3.setText(prof.firstName);
					lasttextField_3.setText(prof.lastName);
					addresstextField_3.setText(prof.address);
					phonetextField_3.setText(prof.phone);
					traveltextField_3.setText(prof.travelType);
					paymenttextField_3.setText(prof.paymentType);
					mdcontacttextField_3.setText(prof.mdContact);
					mdphonetextField_3.setText(prof.mdPhone);
					illnesstextField_3.setText(prof.illness);
					allergytextField_3.setText(prof.allergy);
					break;
					
				case 4:
					agenttextField_4.setText(prof.ID);
					firsttextField_4.setText(prof.firstName);
					lasttextField_4.setText(prof.lastName);
					addresstextField_4.setText(prof.address);
					phonetextField_4.setText(prof.phone);
					traveltextField_4.setText(prof.travelType);
					paymenttextField_4.setText(prof.paymentType);
					mdcontacttextField_4.setText(prof.mdContact);
					mdphonetextField_4.setText(prof.mdPhone);
					illnesstextField_4.setText(prof.illness);
					allergytextField_4.setText(prof.allergy);
					break;
					
				case 5:
					agenttextField_5.setText(prof.ID);
					firsttextField_5.setText(prof.firstName);
					lasttextField_5.setText(prof.lastName);
					addresstextField_5.setText(prof.address);
					phonetextField_5.setText(prof.phone);
					traveltextField_5.setText(prof.travelType);
					paymenttextField_5.setText(prof.paymentType);
					mdcontacttextField_5.setText(prof.mdContact);
					mdphonetextField_5.setText(prof.mdPhone);
					illnesstextField_5.setText(prof.illness);
					allergytextField_5.setText(prof.allergy);
					break;
				
				}
				
				idx++;
			}
		
		
		
	}
	
}
