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
import com.sun.javafx.geom.Rectangle;

public class SimpleSlickGame extends BasicGame
{
    

    int posX = 20;
    int posY = 340;
    float w = 120;
    float h = 180;
    float speed = 20;
    Image door2 = null;
    Image background2 = null;
    public boolean pressed = false;
    public static int Wscreen = 1240;
    public static int Hscreen = 480;
    public int counter = 0;
    public int num = 0;
    public boolean IDLE = true;
    public playerbaby player;
    public levelone level;
    Vector2f trans = new Vector2f(0, 0);
    Rectangle boxCollider = null;
    int levelnum = 0;

    public SimpleSlickGame(String gamename)
    {
        super(gamename);

    }
    

    @Override
    public void init(GameContainer gc) throws SlickException {
        boxCollider = new Rectangle(20,20,20,20);
        background2 = new Image("Rec/grunge-tileset2.png");
        door2 = new Image("Rec/grunge-tileset-door2.png");
        gc.setTargetFrameRate(24);
        player = new playerbaby();
        level = new levelone();
        player.init(gc);
        level.init(gc);
    }

    
    @Override
    public void update(GameContainer gc, int i) throws SlickException {
        
        if(gc.getInput().isKeyDown(Input.KEY_D)){
            player.direction = player.LEFT;
            if(levelnum==1){
            level.update();
            level.moveScreen= true;
            }
        } else if (gc.getInput().isKeyDown(Input.KEY_A)){
            player.direction = player.RIGHT;
            }else{
            player.direction = player.IDLE;
            }
        
        player.update();
         if(player.posX >900 && player.posX < 1200){
             if(gc.getInput().isKeyPressed(Input.KEY_W)){
                 levelnum = 1 ;
                 //System.out.println(levelnum+ " " + " "+level.screenPos);
                 
                }
            }
        }
    @Override
    public void render(GameContainer gc, Graphics g) throws SlickException
    {   
    if(levelnum == 0){
        background2.draw(0, 0, 1728 , Hscreen); 
        g.drawString("ENTER DOOR & PRESS W TO START GAME",500, 100);
        if(player.posX >900 && player.posX < 1200){
            door2.draw(0, 0, 1728 , Hscreen);
        }
    }
    if(levelnum == 1){
                    level.render();
            }
    player.render();
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