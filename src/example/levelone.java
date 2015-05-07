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
    public int screenPos = 0;
    public boolean moveScreen = false;

    
    public levelone() throws SlickException{
    
                    
    }
    public void init(GameContainer gc) throws SlickException{
        background3 = new Image("Rec/spacepara5.png"); 
        background4 = new Image("Rec/spacepara1.png");
    }   
    public void update(){
        if(moveScreen == true){
            screenPos-=60;
           // System.out.println("hey");
            //background3.draw(0, 0, 1728 , 480); 
        }
        
    }
    public void render() throws SlickException
    {
           background3.draw(screenPos, 0, 1728 , 480); 
         //  System.out.println("!the level has been executed!");
        
    }
}