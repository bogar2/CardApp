import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.CardLayout;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.JLabel;

public class RedCardsBCK extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RedCardsBCK frame = new RedCardsBCK();
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
	public RedCardsBCK() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(50, 30, 173, 255);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setBorderPainted(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SelectedCardBCK n=new SelectedCardBCK();
				n.setLocationRelativeTo(null);
				n.getLblNewLabel().setIcon(new ImageIcon(RedCards.class.getResource("/image/Kártyák/piros1.jpg")));
				n.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setIcon(new ImageIcon(RedCardsBCK.class.getResource("/image/Kisk\u00E1rty\u00E1k/kicsipiros1.jpg")));
		
		JButton button = new JButton("");
		button.setBounds(50, 315, 173, 255);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SelectedCardBCK n =new SelectedCardBCK();
				
				n.setLocationRelativeTo(null);
				n.getLblNewLabel().setIcon(new ImageIcon(RedCards.class.getResource("/image/Kártyák/piros3.jpg")));
				n.setVisible(true);
				dispose();
			}
		});
		button.setIcon(new ImageIcon(RedCardsBCK.class.getResource("/image/Kisk\u00E1rty\u00E1k/kicsipiros3.jpg")));
		button.setBorderPainted(false);
		button.setBackground(Color.BLACK);
		
		JButton button_1 = new JButton("");
		button_1.setBounds(332, 30, 173, 255);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SelectedCardBCK n=new SelectedCardBCK();
				n.setLocationRelativeTo(null);
				n.getLblNewLabel().setIcon(new ImageIcon(RedCards.class.getResource("/image/Kártyák/piros2.jpg")));
				n.setVisible(true);
				dispose();
			}
		});
		button_1.setIcon(new ImageIcon(RedCardsBCK.class.getResource("/image/Kisk\u00E1rty\u00E1k/kicsipiros2.jpg")));
		button_1.setBorderPainted(false);
		button_1.setBackground(Color.BLACK);
		
		JButton button_2 = new JButton("");
		button_2.setBounds(332, 315, 173, 255);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SelectedCardBCK n=new SelectedCardBCK();
				n.setLocationRelativeTo(null);
				n.getLblNewLabel().setIcon(new ImageIcon(RedCards.class.getResource("/image/Kártyák/pirosures.jpg")));
				n.setVisible(true);
				dispose();
			}
		});
		button_2.setIcon(new ImageIcon(RedCardsBCK.class.getResource("/image/Kisk\u00E1rty\u00E1k/kicsipirosures.jpg")));
		button_2.setBorderPainted(false);
		button_2.setBackground(Color.BLACK);
		
		JButton btnNewButton_1 = new JButton("Vissza");
		btnNewButton_1.setBounds(233, 547, 81, 23);
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setBackground(UIManager.getColor("Button.background"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardColorBCK n=new CardColorBCK();
				n.setLocationRelativeTo(null);
				n.setVisible(true);
				dispose();
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);
		contentPane.add(button);
		contentPane.add(btnNewButton_1);
		contentPane.add(button_1);
		contentPane.add(button_2);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(RedCardsBCK.class.getResource("/image/CARDSTYLE.jpg")));
		label.setBounds(0, 0, 600, 600);
		contentPane.add(label);
	}

}
