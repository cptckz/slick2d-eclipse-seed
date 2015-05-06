package example;
import org.newdawn.slick.Animation;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SlickException;

public class playerbaby {
	Image player = null;
	Image player2 = null;
	public int LEFT = 0;
	public int RIGHT = 1;
	public int IDLE = -1;
	public int direction;
	public int posX = 600;
	public int posY = 210;
	public int playerW = 90;
	public int playerH = 180;
	public Animation a;
	public int currentPos;


	public Animation getAnimation ( Image player , int spritesX, int spritesY , int spriteWidth , int spriteHeight, int frames, int duration )
	{
		Animation a = new Animation(false);
		
		int c = 0;
		for( int y = 0 ; y < spritesY; y++)
		{
			for( int x = 0 ; x < spritesX; x++)
			{
				if( c < frames ) a.addFrame( player.getSubImage(x*spriteWidth, y*spriteHeight, spriteWidth, spriteHeight), duration);
				c++;
			}
		}
		
		return a;
	}

	
	public void init(GameContainer gc) throws SlickException{	
		
		
		Image player = new Image("Rec/playersheet3.png");

		a = getAnimation ( player, posX , posY , 80, 188, 12, 100 );

		
		
	}
	
	public void update()
		throws SlickException
	{
		move();

	}
	public void move(){
		if(direction == RIGHT){
			posX -= 20;
			a.update(50);


		}
		else if(direction == LEFT){
			posX += 20; 
			a.update(50);
			


		}
		else if(direction == IDLE){
			
		}
		//a.update();

	}
	public void render()
	throws SlickException{
		
	if(direction == RIGHT){	
	//Rotates the image/animation sprites to face another direction while moving	
	a.getCurrentFrame().getFlippedCopy(true, false).draw(posX, posY);
	} else{
		a.draw(posX,posY);
	}
}
}
