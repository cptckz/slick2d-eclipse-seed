package example;

import org.newdawn.slick.Animation;
import org.newdawn.slick.Image;

public class Gem {
	public int gemX;
	public int gemY;
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
	
	
}
