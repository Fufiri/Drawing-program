import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;


public class Rityta extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1850682520469023159L;
	private Modell ritModell = new Modell();
	private Panel bottomP = new Panel(ritModell);
	private ColorPanel cPanel = new ColorPanel();

	public Rityta() {
		
//		Modell ritModell = new Modell();
//		Panel bottomP = new Panel(ritModell);
//		ColorPanel cPanel = new ColorPanel();
	
		setLayout(new BorderLayout());
		setTitle("Rita som ett proffs");
		setPreferredSize(new Dimension(800, 600));
		this.add(cPanel, BorderLayout.EAST);	
		this.add(ritModell);
		this.add(bottomP, BorderLayout.SOUTH);
		this.setFocusable(true);
		pack();
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
				
		this.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent e) {
				
				ritModell.setForm(cPanel.getShape());
				if (!(cPanel.getShape() == null)) {
					ritModell.createShape(e.getX() - 15, e.getY() - 40, cPanel.getColor());
					System.out.println("skapad form");
						} else {
							System.out.println("Du har inte valt en form");
						}
				ritModell.repaint();
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
		
	   public void paintComponent(Graphics g) {
	    	//super.paintComponent(g);
	    	
			
	    	for (Former form : ritModell.getArray()) {
	    		System.out.println("ritar array");
				form.drawShape(g);
			}
	   }
}
	
