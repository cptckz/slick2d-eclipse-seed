package example;
//import org.newdawn.slick.Image;
import org.newdawn.slick.*;
import org.newdawn.slick.SlickException;

public class playerbaby {
	public Image player;
	int posX = 0;
	int posY = 0;
	int LEFT = 0;
	int RIGHT = 1;
	int IDLE = -1;
	int direction;
	int x, y;
	public playerbaby(){
    //Image player =  new Image("Rec/man2.png");
    //Image player2 = new Image("Rec/man3.png");
	

	}
	
public void init() throws SlickException{
	player = new Image("Rec/man1.png");
	
}
public void draw(){
	player.draw(posX,posY);
}

public void update(){
	move();
	
}

public void move(){
	if(direction == LEFT){
		x -= 1; 
	}
	else if(direction == RIGHT){
		x += 1;		
	}else if(direction == IDLE){
		
		}	
	}
}
