import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Panel extends JPanel {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5509155261502497671L;

	public Panel(Modell model) {
	JButton clear = new JButton("Rensa");
	add(clear, FlowLayout.LEFT);
	setVisible(true);
	
	clear.addActionListener(new ActionListener() { 
		  public void actionPerformed(ActionEvent e) { 
		  if (model.getArray() != null) {
			  model.getArray().clear();
			  model.repaint();
		  }
		  } 
		} );
	
	}

	
}
