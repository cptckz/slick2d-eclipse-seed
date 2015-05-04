package example;
import java.util.logging.Level;
import java.util.logging.Logger;

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

	


public class SimpleSlickGame extends BasicGame
{

	int posX = 20;
	int posY = 340;
	float w = 120;
	float h = 180;
	float speed = 20;
    Image door2 = null;
    Image background2 = null;
    public static int Wscreen = 1240;
    public static int Hscreen = 480;
    public int counter = 0;
    public int num = 0;
    public boolean IDLE = true;
    public playerbaby player = new playerbaby();
    Vector2f trans = new Vector2f(0, 0);


	public SimpleSlickGame(String gamename)
	{
		super(gamename);

	}
	

	@Override
	public void init(GameContainer gc) throws SlickException {
	
		background2 = new Image("Rec/grunge-tileset2.png");
		door2 = new Image("Rec/grunge-tileset-door2.png");
		gc.setTargetFrameRate(24);

	}

	
	@Override
	public void update(GameContainer gc, int i) throws SlickException {
//		
//		if(gc.getInput().isKeyDown(Input.KEY_A)){
//		posX-=10;
//		IDLE = false;
//		}else if(gc.getInput().isKeyDown(Input.KEY_D)){
//			posX+=20;
//			IDLE = false;
//			}else{
//				IDLE = true;
//			}
//	
//		if(gc.getInput().isKeyPressed(Input.KEY_W)){
//			posY-=20;
//		}
//		counter++;
		
		player.update();
	 	}




	
	@Override
	public void render(GameContainer gc, Graphics g) throws SlickException
	{
		player.draw();
        background2.draw(0, 0, 1728 , Hscreen); 
//        if(posX >900 && posX < 1200)
//        door2.draw(0, 0, 1728 , Hscreen);
//        if(gc.getInput().isKeyDown(Input.KEY_D)&&counter%4==0){
//        	player2.draw(posX, posY);
//        	
//        }
        

        if(posX >900 && posX < 1200)
        door2.draw(0, 0, 1728 , Hscreen);
        if(gc.getInput().isKeyDown(Input.KEY_D)&&counter%4==0){
        	player2.draw(posX, posY, w, h);
        }
       player.draw(posX, posY, w, h);
	}
   
	public static void main(String[] args)
	{
		try
		{
			AppGameContainer appgc;
			appgc = new AppGameContainer(new SimpleSlickGame("Simple Slick Game"));
			appgc.setDisplayMode(Wscreen, Hscreen, false);
			appgc.start();
		}
		catch (SlickException ex)
		{
			Logger.getLogger(SimpleSlickGame.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
