package example;

import org.newdawn.slick.Animation;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

public class Gem extends playerbaby {

	public int gemY = 250;
	Image gems = null;
	public Animation gemAnim;
	public boolean moveGem = true;
    public int gemX = 200;

    Gem() throws SlickException{
    	//initialising the diamond image and animation
		Image gems = new Image("Rec/gemsheet.png");
		gemAnim = getAnimation ( gems, gemX , gemY , 200, 200, 8, 100 );
    }
//creating the diamond animation
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
	


	
public void update()
		throws SlickException
	{
	
gemAnim.update(50);

//moving the diamonds, creating the sensation of the player moving
if(moveGem==true){
	gemX-=10;
}

	}

public void render()
		throws SlickException{
	//rendering the diamond animation
		gemAnim.draw(gemX,gemY);
	}
	
}
