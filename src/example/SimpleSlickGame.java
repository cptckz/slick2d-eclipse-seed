package example;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;



import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.Image;
import org.newdawn.slick.Music;
import org.newdawn.slick.Sound;
import org.newdawn.slick.SpriteSheet;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Circle;
import org.newdawn.slick.geom.Shape;
import org.newdawn.slick.geom.Vector2f;
import org.newdawn.slick.openal.Audio;
import org.newdawn.slick.openal.AudioLoader;
import org.newdawn.slick.util.ResourceLoader;



public class SimpleSlickGame extends BasicGame
{
    

    int posX = 500;
    int posY = 340;
    
    //Image files
    Image door1 = null;
    Image door2 = null;
    Image background2 = null;
    
    //Audio files
	public Sound doorOpen;

	
	//Music files
	Music mainLevel;
	Music levelOneMusic;

    
    public boolean pressed = false;
    
    //Size of the game window
    public static int Wscreen = 1240;
    public static int Hscreen = 480;
    public boolean startPos = true;
    public int counter = 0;
    public int num = 0;
    public boolean IDLE = true;
    public int endOfScreen = -15000;
    
    

    //Loading classes
    public playerbaby player;
    //public playerbaby playerIdle;
    //public Gem gems;
    
   

    
    public levelone level;
    public GameOver gameOver;
    
    int levelnum = 0;
    
    
    public Gem[] gems = new Gem[10];
    public SimpleSlickGame(String gamename)
    {
        super(gamename);

    }
    

    @Override
    public void init(GameContainer gc) throws SlickException {
    	
 
		Sound doorOpen = new Sound("Rec/0584.ogg");
        background2 = new Image("Rec/grunge-tileset2.png");
        door1 = new Image("Rec/grunge-tileset-door1.png");
        door2 = new Image("Rec/grunge-tileset-door2.png");
        gc.setTargetFrameRate(24);
        player = new playerbaby();
        
        
      
        
        level = new levelone();
        gameOver = new GameOver();
        player.init(gc);
//        gems[1].init(gc);
        System.out.println("GEMS    "+gems[1]);
       // gems[0].init(gc);
      //  gems = new Gem[10];
        
        for(int i = 0; i<gems.length;i++){
        	gems[i] = new Gem();
        	gems[i].gemX = 600*i+400;
        }
        
        
        level.init(gc);
    }

    
    @Override
    public void update(GameContainer gc, int i) throws SlickException {
    	level.update();
    	player.update();
    	
    	
    	 for(int i2 = 0; i2<10;i2++){
    	       
    		 
    		 gems[i2].update();
    	        
    	        
    	       
    	        }
    	
    	if(gc.getInput().isKeyDown(Input.KEY_D)&&levelnum==0){
            player.direction = player.LEFT;
        } else if (gc.getInput().isKeyDown(Input.KEY_A)&&levelnum==0){
            player.direction = player.RIGHT;
            }else{
            player.direction = player.IDLE;
            }    
          
        if(player.posX >1000 && player.posX < 1150){
            if(gc.getInput().isKeyPressed(Input.KEY_W)){
                levelnum = 1 ;
                if(startPos==true){
                	player.posX=100;
                	player.posY=280;
                	startPos=false;
                }
           }
       	}
        
        
        if(levelnum==1&&gc.getInput().isKeyDown(Input.KEY_D)){
        	
        	for(int i4 = 0; i4<gems.length;i4++ ){
        	gems[i4].moveGem = true;
        	}
        	player.levelnr=1; 
            level.moveScreen= true;  
            player.movePlayer=false;
            player.playerWalking=true;
         
            
           for(int i5 = 0;i5<gems.length;i5++){
            if(player.posX==gems[i5].gemX+70){
            	gems[i5].gemY=-200;
            	level.points++;
            }
          }
            
           }else{
        	   level.moveScreen= false;
        	   
        	   for(int i6 = 0; i6<gems.length;i6++){
        	   gems[i6].moveGem = false;
        	   }
        	   
        	   player.playerWalking=false; 
    } 
        	if(levelnum==0){ 
        	   player.movePlayer=true;
           }
        	if(level.screenPos3<endOfScreen){
        		levelnum=2;
        	}
        	
        }
    
    
    @Override
    public void render(GameContainer gc, Graphics g) throws SlickException
    {   
    if(levelnum == 0){
        background2.draw(0, 0, 1728 , Hscreen); 
       
        if(player.posX >150 && player.posX < 250){
            door1.draw(0, 0, 1728 , Hscreen);
        }
        
        if(player.posX >1000 && player.posX < 1150){
            door2.draw(0, 0, 1728 , Hscreen);
			//doorOpen.play(1.0f, 1.0f);

        }
              
        g.drawString("ENTER DOOR & PRESS W TO START GAME",500, 100);
    }
    
    
    if(levelnum == 1){
                    level.render(g);
                    
                    for(int i3 = 0; i3<gems.length;i3++){
                    	gems[i3].render();
           }
    	}
    player.render();
    if(level.screenPos3<endOfScreen&&levelnum==2){
    	gameOver.points = level.points;
        gameOver.render(g);	
        	}
    
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
