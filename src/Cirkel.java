import java.awt.Color;
import java.awt.Graphics;


public class Cirkel extends Former { 
//extends Former {
	
	Cirkel(int x, int y, Color cirkelFill) {
		super(x, y, cirkelFill);
	}

	@Override
	public void drawShape(Graphics g) {
		super.drawShape(g);
		g.fillOval(super.getX(), super.getY(), 30, 30);
		
	}

	@Override
	public void drawFrame(Graphics g) {
		super.drawFrame(g);
		g.drawOval(super.getX(), super.getY(), 30, 30);
		
	}
}

