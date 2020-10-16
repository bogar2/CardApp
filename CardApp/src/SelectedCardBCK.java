import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.scilab.forge.jlatexmath.TeXConstants;
import org.scilab.forge.jlatexmath.TeXFormula;
import org.scilab.forge.jlatexmath.TeXIcon;

import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.io.source.ByteArrayOutputStream;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfDocument;
import com.itextpdf.text.pdf.PdfTemplate;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.*;


import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Graphics2D;

public class SelectedCardBCK extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField tmezo;
	public int x_pressed = 0;
	public int y_pressed = 0;
	private JTextField tmezo2;
	private JTextField tmezo3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelectedCardBCK frame = new SelectedCardBCK();
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
	public SelectedCardBCK() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 700);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setBounds(30, 34, 335, 492);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		
		JLabel parancs = new JLabel("");
		parancs.setBounds(63, 23, 203, 125);
		panel.add(parancs);
		parancs.setFont(new Font("Stencil", Font.PLAIN, 23));
		parancs.addMouseMotionListener(new MouseMotionAdapter(){
	        public void mouseDragged(MouseEvent me) {
	            parancs.setLocation(parancs.getLocation().x + me.getX() - x_pressed, 
	                        parancs.getLocation().y + me.getY() - y_pressed);
	            panel.revalidate();
	            panel.repaint();
	        }
	    });
	    parancs.addMouseListener(new MouseAdapter() {
	            public void mousePressed(MouseEvent me) {
	                // Get x,y and store them
	                x_pressed = me.getX();
	                y_pressed = me.getY();
	            }
	        });
	    panel.add(parancs);
	    panel.revalidate();
	    panel.repaint();
		
		JLabel parancs2 = new JLabel("");
		parancs2.setBounds(63, 159, 203, 125);
		panel.add(parancs2);
		parancs2.setFont(new Font("Stencil", Font.PLAIN, 23));
		parancs2.addMouseMotionListener(new MouseMotionAdapter(){
	        public void mouseDragged(MouseEvent me) {
	            parancs2.setLocation(parancs.getLocation().x + me.getX() - x_pressed, 
	                        parancs2.getLocation().y + me.getY() - y_pressed);
	            panel.revalidate();
	            panel.repaint();
	        }
	    });
		parancs2.addMouseListener(new MouseAdapter() {
		        public void mousePressed(MouseEvent me) {
		            // Get x,y and store them
		            x_pressed = me.getX();
		            y_pressed = me.getY();
		        }
		    });
		panel.add(parancs2);
		
		JLabel parancs3 = new JLabel("");
		parancs3.setFont(new Font("Stencil", Font.PLAIN, 23));
		parancs3.setBounds(63, 332, 203, 125);
		panel.add(parancs3);
		parancs3.setFont(new Font("Stencil", Font.PLAIN, 23));
		parancs3.addMouseMotionListener(new MouseMotionAdapter(){
	        public void mouseDragged(MouseEvent me) {
	            parancs3.setLocation(parancs.getLocation().x + me.getX() - x_pressed, 
	                        parancs3.getLocation().y + me.getY() - y_pressed);
	            panel.revalidate();
	            panel.repaint();
	        }
	    });
		parancs3.addMouseListener(new MouseAdapter() {
		        public void mousePressed(MouseEvent me) {
		            // Get x,y and store them
		            x_pressed = me.getX();
		            y_pressed = me.getY();
		        }
		    });
		panel.add(parancs3);
		
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 335, 492);
		panel.add(lblNewLabel);
		
		JButton vissza = new JButton("Vissza");
		vissza.setBackground(Color.BLACK);
		vissza.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 13));
		vissza.setForeground(Color.WHITE);
		vissza.setBorderPainted(true);
		vissza.setContentAreaFilled(false);
		vissza.setFocusPainted(false);
		vissza.setOpaque(false);
		vissza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardColorBCK n=new CardColorBCK();
				n.setLocationRelativeTo(null);
				n.setVisible(true);
				dispose();
			}
		});
		vissza.setBounds(128, 592, 89, 23);
		contentPane.add(vissza);
		
		JButton exit = new JButton("Kil\u00E9p");
		exit.setBackground(Color.BLACK);
		exit.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 13));
		exit.setForeground(Color.WHITE);
		exit.setBorderPainted(true);
		exit.setContentAreaFilled(false);
		exit.setFocusPainted(false);
		exit.setOpaque(false);
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		exit.setBounds(1101, 593, 89, 23);
		contentPane.add(exit);
		
		tmezo = new JTextField();
		tmezo.setBounds(835, 181, 278, 20);
		contentPane.add(tmezo);
		tmezo.setColumns(10);
		
		JButton felvisz = new JButton("Felvisz");
		felvisz.setBackground(Color.BLACK);
		felvisz.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 13));
		felvisz.setForeground(Color.WHITE);
		felvisz.setBorderPainted(true);
		felvisz.setContentAreaFilled(false);
		felvisz.setFocusPainted(false);
		felvisz.setOpaque(false);
		felvisz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				parancs.setIcon(new ImageIcon(keppealakit(tmezo.getText())));
			}
		});
		felvisz.setBounds(835, 212, 89, 23);
		contentPane.add(felvisz);
		
		JLabel lblNewLabel_1 = new JLabel("K\u00E9rem \u00EDrja be a LaTeX parancsot!");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		lblNewLabel_1.setBounds(835, 147, 291, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel label = new JLabel("");
		label.setBounds(375, 34, 335, 492);
		contentPane.add(label);
		
		JButton merge = new JButton("\u00D6sszef\u00E9s\u00FCl");
		merge.setBackground(Color.BLACK);
		merge.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 13));
		merge.setForeground(Color.BLACK);
		merge.setBorderPainted(true);
		merge.setContentAreaFilled(false);
		merge.setFocusPainted(false);
		merge.setOpaque(false);
		
		merge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				label.setIcon(new ImageIcon(createImage(panel)));
				
			}
		});
		merge.setBounds(625, 592, 150, 23);
		contentPane.add(merge);
		
		
		
		JPanel masodik = new JPanel();
		masodik.setOpaque(false);
		masodik.setBounds(835, 246, 278, 54);
		
		contentPane.add(masodik);
		masodik.setLayout(null);
		masodik.setVisible(false);
		
		tmezo2 = new JTextField();
		tmezo2.setBounds(0, 0, 278, 20);
		masodik.add(tmezo2);
		tmezo2.setColumns(10);
		
		JButton felvisz2 = new JButton("Felvisz");
		
		felvisz2.setBackground(Color.BLACK);
		felvisz2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 13));
		felvisz2.setForeground(Color.WHITE);
		felvisz2.setBorderPainted(true);
		felvisz2.setContentAreaFilled(false);
		felvisz2.setFocusPainted(false);
		felvisz2.setOpaque(false);
		felvisz2.setBounds(0, 31, 89, 23);
		
		masodik.add(felvisz2);
		
		
		felvisz2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				parancs2.setIcon(new ImageIcon(keppealakit(tmezo2.getText())));
				
			}
		});
		
		JPanel harmadik = new JPanel();
		harmadik.setBounds(835, 311, 278, 54);
		harmadik.setOpaque(false);
		contentPane.add(harmadik);
		harmadik.setLayout(null);
		harmadik.setVisible(false);
		
		JButton uj2 = new JButton("\u00DAj...");
		uj2.setBackground(Color.BLACK);
		uj2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 13));
		uj2.setForeground(Color.WHITE);
		uj2.setBorderPainted(true);
		uj2.setContentAreaFilled(false);
		uj2.setFocusPainted(false);
		uj2.setOpaque(false);
		uj2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				harmadik.setVisible(true);
			}
		});
		uj2.setBounds(108, 31, 68, 23);
		masodik.add(uj2);
		
		tmezo3 = new JTextField();
		tmezo3.setBounds(0, 0, 278, 20);
		harmadik.add(tmezo3);
		tmezo3.setColumns(10);
		
		JButton felvisz3 = new JButton("Felvisz");
		felvisz3.setBounds(0, 31, 89, 23);
		harmadik.add(felvisz3);
		felvisz3.setBackground(Color.BLACK);
		felvisz3.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 13));
		felvisz3.setForeground(Color.WHITE);
		felvisz3.setBorderPainted(true);
		felvisz3.setContentAreaFilled(false);
		felvisz3.setFocusPainted(false);
		felvisz3.setOpaque(false);
		felvisz3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				parancs3.setIcon(new ImageIcon(keppealakit(tmezo2.getText())));
			}
		});
		JButton uj = new JButton("\u00DAj...");
		uj.setBackground(Color.BLACK);
		uj.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 13));
		uj.setForeground(Color.WHITE);
		uj.setBorderPainted(true);
		uj.setContentAreaFilled(false);
		uj.setFocusPainted(false);
		uj.setOpaque(false);
		uj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				masodik.setVisible(true);
			}
		});
		uj.setBounds(943, 212, 68, 23);
		contentPane.add(uj);
		
		Document document = new Document(PageSize.A4);
		document.setMargins(0, 0, 0, 0);
		try {
			PdfWriter.getInstance(document, new FileOutputStream("C:\\Users\\Bimba\\Desktop\\picsfortheprog\\kartyak.pdf"));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (DocumentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		document.open();
		JButton btnNewButton = new JButton("Ment\u00E9s");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			BufferedImage buf = createImage(panel);
					ByteArrayOutputStream baos = new ByteArrayOutputStream();
					try {
						ImageIO.write(buf, "png", baos);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					try {
						Image iTextImage = Image.getInstance(baos.toByteArray());
						iTextImage.setAlignment(Element.ALIGN_CENTER);
						try {
							document.add(iTextImage);
						} catch (DocumentException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					} catch (BadElementException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (MalformedURLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					document.close();
		      
		      // Closing the document       
		      document.close();              
		        
			
			};
			
		});
		btnNewButton.setBounds(475, 593, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel hatter = new JLabel("");
		hatter.setIcon(new ImageIcon(SelectedCardBCK.class.getResource("/image/hatterveg.jpg")));
		hatter.setBounds(0, 0, 1200, 700);
		contentPane.add(hatter);
		
		/*JButton btnNewButton_5 = new JButton("Ment\u00E9s");
		
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Creating a PdfWriter       
			      String dest = "C:\\\\Users\\\\Bimba\\\\Desktop\\\\picsfortheprog\teszt.pdf";       
			      PdfWriter writer = new PdfWriter();
			      writer.dest
			      
			      // Creating a PdfDocument       
			      PdfDocument pdf = new PdfDocument();              
			      
			      // Creating a Document        
			      Document document = new Document();              
			                    
			      ImageData data = ImageDataFactory.create(createImage(panel), Color.black)	;		     
			      // Creating an Image object        
			      Image image = new Image(data);                 
			      
			      // Adding image to the document       
			      document.add(image);              
			      
			      // Closing the document       
			      document.close();              
			}
		});
		btnNewButton_5.setBounds(671, 503, 89, 23);
		contentPane.add(btnNewButton_5);
		*/
		
		
	}
	public static BufferedImage keppealakit(String input) {
		input = "\\textcolor{black}\\textbf{$$" + input + "$$}";
		TeXFormula formula = null;
		try {
			formula = new TeXFormula(input);
			} catch (org.scilab.forge.jlatexmath.ParseException pe) {
			JOptionPane.showMessageDialog(null, "Nem létezik ilyen parancs", "LaTeX", 1);
			}
			TeXIcon ti = formula.createTeXIcon(TeXConstants.STYLE_DISPLAY, 30); 
			BufferedImage b = new BufferedImage(ti.getIconWidth(), ti.getIconHeight(),
			BufferedImage.TYPE_4BYTE_ABGR);
			ti.paintIcon(new JLabel(), b.getGraphics(), 0, 0);
		return b;
		
	}
	public BufferedImage createImage(JPanel panel) {

	    int w = panel.getWidth();
	    int h = panel.getHeight();
	    BufferedImage bi = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
	    Graphics2D g = bi.createGraphics();
	    panel.print(g);
	    g.dispose();
	    return bi;
	}
	public JLabel getLblNewLabel() {
		return lblNewLabel;
	}
}
