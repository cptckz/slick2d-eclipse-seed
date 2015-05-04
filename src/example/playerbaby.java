package example;
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
	public int posX;
	public int posY;
	public int playerW = 90;
	public int playerH = 180;

	public void init(GameContainer gc) 
			throws SlickException{	
		player = new Image("Rec/playerwalk1.png");
		posX = 340;
		posY = 210;
	}
	
	public void update()
		throws SlickException
	{
		move();
		player.draw(posX,posY, playerW,playerH);
	}
	public void move(){
		if(direction == RIGHT){
			posX -= 20;
		}
		else if(direction == LEFT){
			posX += 20; 
			
		}
		else if(direction == IDLE){
			
		}
		
	}
	public void render()
	throws SlickException{
	player.draw(posX,posY, playerW, playerH);
}



//public void move(){
//	if(direction == LEFT){
//		x -= 1; 
//	}
//	else if(direction == RIGHT){
//		x += 1;		
//	}else if(direction == IDLE){
//		
//		}	
	//}
}
