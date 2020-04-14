import java.awt.Color;
import java.awt.Graphics;

public class Fyrkant extends Former {
	
	public Fyrkant(int x, int y, Color fill) {
		super(x, y, fill);
	}

	public void drawShape(Graphics g) {
	     super.drawShape(g);
	     g.fillRect(super.getX(), super.getY(), 30, 30);
	        
	    }

	
	public void drawFrame(Graphics g) {
		super.drawFrame(g);
		g.drawRect(super.getX(), super.getY(), 30, 30);
	}

	public Color getFill() {
		return super.getFill();
	}
}
