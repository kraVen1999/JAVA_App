import javax.swing.*;
import java.awt.*;


import javax.swing.JPanel;

public class Paneau extends JPanel{
	
	public void paint(Graphics g){
	
		super.paint(g);
		g.setColor(Color.BLACK);
		g.fillRect(0,0, getWidthWindow(), getHeightWindow());
		
		
	}
	
		
	
}
