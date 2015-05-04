package example;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.Image;
import org.newdawn.slick.SpriteSheet;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Circle;
import org.newdawn.slick.geom.Vector2f;

public class levelone{
    public static int Wscreen = 1240;
    public static int Hscreen = 480;

	public levelone(String gamename) {
		
	}
	public static Image levelet = null;
	
	public void init(GameContainer gc) 
			throws SlickException{
		levelet = new Image("Rec/levelet.png");
	}
	public static void render()
	throws SlickException{
		levelet.draw(0,0,Wscreen,Hscreen);
		
	}
	public void update()
	throws SlickException{
		levelet.draw(0,0,Wscreen,Hscreen);
	}

}
