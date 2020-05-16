package pong;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel; //Här är de olika importerade klasserna som kommer att användas på denna sida 

public class Renderer extends JPanel
{

	private static final long serialVersionUID = 1L;

	@Override
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		Pong.pong.render((Graphics2D) g);  //Det som renderern gör att rendera spelet så man kan spela det
	}

}