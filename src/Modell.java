import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Modell extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1825219219555207095L;
	private ArrayList<Former> shapeArray;
	private String form = null;
	
	
	public Modell() {
		setBackground(Color.WHITE);
		setSize(800, 600);
		setVisible(true);	
		
		this.shapeArray = new ArrayList<Former>();
	}
	
	
	public ArrayList<Former> createShape(int x, int y, Color color) {
		
		if (this.form.equals("Cirkel")) {
			Cirkel cirkel = new Cirkel(x, y, color);
			System.out.println("Skapar cirkel");
			shapeArray.add(cirkel);
			
		} else if (this.form.equals("Triangel")) {
			Former triangle = new Triangel(x, y, color);
			shapeArray.add(triangle);
			
		} else if (this.form.equals("Fyrkant")) {
			Former square = new Fyrkant(x, y, color);
			shapeArray.add(square);
			
		}
		
		//shapeArray.add(currentShape.copyThis());
		//
	
		return shapeArray;	
	}
		
    
    public void setForm(String form) {
    	this.form = form;
    }
    
    public String getForm() {
    	return form;
    }
    
    public ArrayList<Former> getArray() {
    	return this.shapeArray;
    }
	
}

	

