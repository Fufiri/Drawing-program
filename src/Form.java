
import java.awt.Color;
import java.awt.Graphics;

public abstract class Former {
	
	private int x;
	private int y;
	private Color fill;

	public Former(int x, int y, Color fill) {
		this.x = x;
		this.y = y;
		this.fill = fill;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Color getFill() {
		return fill;
	}

	public void setFill(Color fill) {
		this.fill = fill;
	}

	public void drawShape(Graphics g) {
		g.setColor(fill);
	}
	
	public void drawFrame(Graphics g) {
		g.setColor(Color.DARK_GRAY);
	}
	
	public abstract Former copyThis();
	
}
