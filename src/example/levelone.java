	package example;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.Camera;
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
import org.newdawn.slick.geom.Shape;
import org.newdawn.slick.geom.Vector2f;



public class levelone extends playerbaby{
   
    
    Image background3 = null;
    Image background4 = null;
    Image background5 = null;
    Image background2 = null;
    Image background1 = null;
    public int screenPos = 0;
    public int screenPos1 = 0;
    public int screenPos2 = 0;
    public int screenPos3 = 0;
    public boolean moveScreen = false;

    
    public levelone() throws SlickException{
    
                    
    }
    public void init(GameContainer gc) throws SlickException{
        background5 = new Image("Rec/spacepara5.png"); 
        background1 = new Image("Rec/spacepara1.png");
        background2 = new Image("Rec/spacepara2.png");
        background3 = new Image("Rec/spacepara3.png");
        background4 = new Image("Rec/spacepara4.png");
    }
    public void update(){
        if(moveScreen == true){
            screenPos-=5;
            screenPos1-= 15;
            screenPos2-=30;
            screenPos3-=60;
            
           // System.out.println("hey");
            //background3.draw(0, 0, 1728 , 480); 
        }
        
    }
    public void render() throws SlickException
    {
    	   background1.draw(0,0,1738,480);
    	   background2.draw(screenPos,0,14387,480);
    	   background3.draw(screenPos1,0,14387,480);	
    	   background4.draw(screenPos2,0,14387,480);
           background5.draw(screenPos3, 0, 14387 , 480); 
         //  System.out.println(	"!the level has been executed!");
        
    }
}
