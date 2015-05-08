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
	
	public int LEFT = 0;
	public int RIGHT = 1;
	public int IDLE = -1;
	public int direction;
	public int posX = 600;
	public int posY = 210;
	public int playerW = 90;
	public int playerH = 180;
	public Animation playerAnim;
	public int currentPos;
	public boolean movePlayer = true;
	public boolean playerWalking = false;
	public int levelnr = 0;
	


	public Animation getAnimation ( Image player , int spritesX, int spritesY , int spriteWidth , int spriteHeight, int frames, int duration )
	{
		// creating the player animation
		Animation playerAnim = new Animation(false);
		
		int c = 0;
		for( int y = 0 ; y < spritesY; y++)
		{
			for( int x = 0 ; x < spritesX; x++)
			{
				if( c < frames ) playerAnim.addFrame( player.getSubImage(x*spriteWidth, y*spriteHeight, spriteWidth, spriteHeight), duration);
				c++;
			}
		}
		
		return playerAnim;
	}

	
	public void init(GameContainer gc) throws SlickException{	
		
		//initialising the player image
		Image player = new Image("Rec/playersheet3.png");
		//initialising the player animation
		playerAnim = getAnimation ( player, posX , posY , 80, 188, 12, 100 );

		
		
	}
	
	public void update()
		throws SlickException
	{
		move();

	}
	public void move(){
		//using the player inputs
		if(direction == RIGHT){
			posX -= 20;
			playerAnim.update(50);
		}
		else if(direction == LEFT){
			posX += 20; 
			playerAnim.update(50);
		}
		else{

		}

if(movePlayer==false&&levelnr==1&&playerWalking==true){
	playerAnim.update(50);
}
	}
	public void render()
	throws SlickException{
		
	if(direction == RIGHT){	
	//Rotates the image/animation sprites to face another direction while moving	
		playerAnim.getCurrentFrame().getFlippedCopy(true, false).draw(posX, posY);
	
	} else {
		playerAnim.draw(posX,posY);
	}
	}
}

