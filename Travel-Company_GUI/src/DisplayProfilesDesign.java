import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class DisplayProfilesDesign extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DisplayProfilesDesign frame = new DisplayProfilesDesign();
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
	public DisplayProfilesDesign() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 830, 584);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(34,40,49));
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 82, 241);
		contentPane.add(panel);
		panel.setBackground(new Color(48,71,94));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 241, 82, 296);
		contentPane.add(panel_1);
		panel_1.setBackground(new Color(27,38,44));
		
		JLabel lblNewLabel = new JLabel("Profiles Database");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(361, 13, 120, 27);
		contentPane.add(lblNewLabel);
		
	}
}
