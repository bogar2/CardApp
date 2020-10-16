import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;

public class CardsApp extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CardsApp frame = new CardsApp();
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
	public CardsApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 600);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnjKrtya = new JButton("\u00DAj k\u00E1rtya");
		btnjKrtya.setBackground(Color.BLACK);
		btnjKrtya.setForeground(Color.WHITE);
		btnjKrtya.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		btnjKrtya.setBorderPainted(false);
		btnjKrtya.setContentAreaFilled(false);
		btnjKrtya.setFocusPainted(false);
		btnjKrtya.setOpaque(false);
		btnjKrtya.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardColor n=new CardColor();
				n.setLocationRelativeTo(null);
				n.setVisible(true);
				dispose();
				
			}
		});
		
		JButton btnKilps = new JButton("Kil\u00E9p\u00E9s");
		btnKilps.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnKilps.setOpaque(false);
		btnKilps.setForeground(Color.WHITE);
		btnKilps.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		btnKilps.setFocusPainted(false);
		btnKilps.setContentAreaFilled(false);
		btnKilps.setBorderPainted(false);
		btnKilps.setBackground(Color.BLACK);
		btnKilps.setBounds(100, 493, 200, 50);
		contentPane.add(btnKilps);
		btnjKrtya.setBounds(100, 52, 200, 50);
		contentPane.add(btnjKrtya);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(CardsApp.class.getResource("/image/222.jpg")));
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBorder(BorderFactory.createLineBorder(Color.WHITE, 5, true));
		lblNewLabel.setBounds(0, 0, 400, 600);
		contentPane.add(lblNewLabel);
	}
}
