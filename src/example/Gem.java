package example;

import org.newdawn.slick.Animation;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Gem {
	public int gemX = 300;
	public int gemY = 200;
	Image gems = null;
	public Animation gemAnim;


	public Animation getAnimation ( Image gems , int spritesX, int spritesY , int spriteWidth , int spriteHeight, int frames, int duration )
	{
		Animation gemAnim = new Animation(false);
		
		int c = 0;
		for( int y = 0 ; y < spritesY; y++)
		{
			for( int x = 0 ; x < spritesX; x++)
			{
				if( c < frames ) gemAnim.addFrame( gems.getSubImage(x*spriteWidth, y*spriteHeight, spriteWidth, spriteHeight), duration);
				c++;
			}
		}
		
		return gemAnim;
	}
	
public void init(GameContainer gc) throws SlickException{	
		
		
		Image gems = new Image("Rec/gemsheet.png");

		gemAnim = getAnimation ( gems, gemX , gemY , 200, 200, 8, 100 );
		
	}
	
public void update()
		throws SlickException
	{
	gemAnim.update(50);


	}

public void render()
		throws SlickException{
		gemAnim.draw(gemX,gemY);
	}
	
}
