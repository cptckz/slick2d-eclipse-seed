package example;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class GameOver extends levelone {
	
	
public GameOver() throws SlickException {
		super();
		// TODO Auto-generated constructor stub
	}

public int points = 0; 


public void render(Graphics g) throws SlickException
{
	g.setBackground(Color.black);
	g.drawString("!FINISH! you've got "+points+" points",100,100);
	
}
}

