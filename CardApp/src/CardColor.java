import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CardColor extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CardColor frame = new CardColor();
					frame.setLocationRelativeTo(null);
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
	public CardColor() {
		setBackground(Color.LIGHT_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 300);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(CardColor.class.getResource("/image/RED.jpg")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RedCards r=new RedCards();
				r.setLocationRelativeTo(null);
				r.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setBounds(10, 100, 100, 100);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon(CardColor.class.getResource("/image/YEL.jpg")));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				YellowCards r=new YellowCards();
				r.setLocationRelativeTo(null);
				r.setVisible(true);
				dispose();
			}
		});
		button.setForeground(Color.YELLOW);
		button.setBackground(Color.YELLOW);
		button.setBounds(163, 100, 100, 100);
		contentPane.add(button);
		
		JButton button_1 = new JButton("");
		button_1.setIcon(new ImageIcon(CardColor.class.getResource("/image/images.png")));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GreenCards r=new GreenCards();
				r.setLocationRelativeTo(null);
				r.setVisible(true);
				dispose();
			}
		});
		button_1.setForeground(Color.GREEN);
		button_1.setBackground(Color.GREEN);
		button_1.setBounds(324, 100, 100, 100);
		contentPane.add(button_1);
		
		JLabel lblNewLabel = new JLabel("V\u00E1lassza ki az el\u0151lap sz\u00EDn\u00E9t!");
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBounds(117, 11, 366, 54);
		contentPane.add(lblNewLabel);
		
		JButton button_2 = new JButton("");
		button_2.setIcon(new ImageIcon(CardColor.class.getResource("/image/blue.png")));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BlueCards r =new BlueCards();
				r.setLocationRelativeTo(null);
				r.setVisible(true);
				dispose();
			}
		});
		button_2.setForeground(Color.BLUE);
		button_2.setBackground(Color.BLUE);
		button_2.setBounds(475, 100, 100, 100);
		contentPane.add(button_2);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBorderPainted(false); 
		btnNewButton_1.setContentAreaFilled(false); 
		btnNewButton_1.setFocusPainted(false); 
		btnNewButton_1.setOpaque(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnNewButton_1.setBackground(new Color(0, 0, 0));
		btnNewButton_1.setIcon(new ImageIcon(CardColor.class.getResource("/image/kisx.png")));
		btnNewButton_1.setBounds(555, 269, 35, 20);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(CardColor.class.getResource("/image/cardcolorhatter2.jpg")));
		lblNewLabel_1.setBounds(0, 0, 600, 300);
		contentPane.add(lblNewLabel_1);
	}
}
