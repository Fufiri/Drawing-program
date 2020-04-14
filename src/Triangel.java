import java.awt.Color;
import java.awt.Graphics;

public class Triangel extends Former {
	
	public Triangel(int x, int y, Color fill) {
		super(x, y, fill);
	}

	
	public void drawShape(Graphics g) {	            	   
		 super.drawShape(g);
	     g.fillPolygon(new int[] { super.getX(), super.getX() + 15, super.getX() + 30}, new int[] {super.getY() +30, super.getY(), super.getY()+30}, 3);
	    }
	
	public void drawFrame(Graphics g) {
		super.drawFrame(g);
		g.drawPolygon(new int[] { super.getX(), super.getX() + 15, super.getX() + 30}, new int[] {super.getY() +30, super.getY(), super.getY()+30}, 3);
	}


}
