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
    public int screenPos = 0;
    public boolean moveScreen = false;
    
    // hej fredrik
    public levelone() throws SlickException{
                    
    }
    public void init(GameContainer gc) throws SlickException{
        background3 = new Image("Rec/levelet.png"); 
    }   
    public void update(){
        if(moveScreen == true){
            screenPos-=60;
            //background3.draw(0, 0, 1728 , 480); 
        }
        
    }
    public void render() throws SlickException
    {
           background3.draw(screenPos, 0, 1728 , 480); 
         //  System.out.println("!the level has been executed!");
        
    }
}