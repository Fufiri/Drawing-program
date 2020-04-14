
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;


import javax.swing.JLabel;
import javax.swing.JPanel;



public class ColorPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4306072892151915463L;
	private ArrayList<Fyrkant> colorCh = new ArrayList<>();
	private Fyrkant selectedC = null;
	private Color color = Color.BLACK;
	private ArrayList<Former> sForm = new ArrayList<>();
	private Former selectedS = null;
	private String ss = null;
	
	public ColorPanel() {
	
		this.setLayout(new BorderLayout());
		JLabel label = new JLabel("Färg");
		this.add(label, BorderLayout.NORTH);
			
		colorCh.add(new Fyrkant(0, 20, Color.BLACK));
		colorCh.add(new Fyrkant(0, 50, Color.MAGENTA));
		colorCh.add(new Fyrkant(0, 80, Color.PINK));
		colorCh.add(new Fyrkant(0, 110, Color.BLUE));
		colorCh.add(new Fyrkant(0, 140, Color.GREEN));
		colorCh.add(new Fyrkant(0, 170, Color.YELLOW));
		colorCh.add(new Fyrkant(0, 200, Color.RED));
		colorCh.add(new Fyrkant(0, 230, Color.CYAN));
		
		JLabel formLabel = new JLabel("Form");
		this.add(formLabel, BorderLayout.CENTER);

		sForm.add(new Fyrkant(0,280, Color.ORANGE));
		sForm.add(new Cirkel(0, 310, Color.ORANGE));
		sForm.add(new Triangel(0, 340, Color.ORANGE));

		this.setFocusable(true);
		setVisible(true);
		
	
	this.addMouseListener(new MouseListener() {

		public void mouseClicked(MouseEvent e) {
			int y = e.getY();
			
			for (int i = 0; i < colorCh.size(); i++) {
				if (y <= colorCh.get(i).getY() + 30 && y >= 30){
					selectedC = colorCh.get(i);
					color = colorCh.get(i).getFill();
					repaint();
					return;
				}
			}

			for (int i = 0; i < sForm.size(); i++) {
				if (y <= sForm.get(i).getY() + 30 && y >= 30) {
					selectedS = sForm.get(i);
					ss = sForm.get(i).toString();
					
					if (ss.contains("Fyrkant")) {
						ss = "Fyrkant";
					} else if (ss.contains("Cirkel")) {
						ss = "Cirkel";
					} else if (ss.contains("Triangel")) {
						ss = "Triangel";
					}
					
					repaint();
					return;
				}
			}
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
	    	super.paintComponent(g);
	    		    	
			for (Fyrkant fyrkant : colorCh) {
				fyrkant.drawShape(g);
	    	}

			for (Former form : sForm) {
				form.drawShape(g);
			}
			
			if (selectedC != null) {
				selectedC.drawFrame(g);
				}

			if (selectedS != null) {
				selectedS.drawFrame(g);
			}
			
	 }
	 
	 public Color getColor() {
		 return color;
	 }

	 public String getShape() {
		return ss;
	 }
	 
		 
	 
}
	


