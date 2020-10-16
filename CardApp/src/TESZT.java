import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import org.scilab.*;
import org.scilab.forge.jlatexmath.TeXConstants;
import org.scilab.forge.jlatexmath.TeXFormula;
import org.scilab.forge.jlatexmath.TeXIcon;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class TESZT extends JFrame {

	private JPanel contentPane;
	private static JTextField szovegmezo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TESZT frame = new TESZT();
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
	public TESZT() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(RedCards.class.getResource("/image/Kártyák/pirosures.jpg")));
		label.setBounds(47, 11, 108, 100);
		contentPane.add(label);
		
		JButton gomb = new JButton("New button");
		gomb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				label.setIcon(new ImageIcon(keppealakit(szovegmezo.getText())));
			}
		
		});
		gomb.setBounds(335, 227, 89, 23);
		contentPane.add(gomb);
		
		szovegmezo = new JTextField();
		szovegmezo.setBounds(279, 196, 145, 20);
		contentPane.add(szovegmezo);
		szovegmezo.setColumns(10);
	}
	
	public static BufferedImage keppealakit(String input) {
		input = "\\textcolor{black}\\textbf{$$" + input + "$$}";
		TeXFormula formula = null;
		try {
			formula = new TeXFormula(input);
			} catch (org.scilab.forge.jlatexmath.ParseException pe) {
			JOptionPane.showMessageDialog(null, "Rossz bemenet", "LaTeX", 1);
			}
			TeXIcon ti = formula.createTeXIcon(TeXConstants.STYLE_DISPLAY, 30); 
			BufferedImage b = new BufferedImage(ti.getIconWidth(), ti.getIconHeight(),
			BufferedImage.TYPE_4BYTE_ABGR);
			ti.paintIcon(new JLabel(), b.getGraphics(), 0, 0);
		return b;
		
	}
	

	public static JTextField getSzovegmezo() {
		return szovegmezo;
	}
}
