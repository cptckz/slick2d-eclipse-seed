package example;

public class camera {
	viewportsizeX = 800;
	viewportsizeX = 600;
	offsetMaxX = Wscreen - viewportsizeX;
	offsetMaxY = Hscreen - viewportsizeY;
	offsetMinX = 0;
	offsetMinY = 0;

	camX = posX - viewportsizeX / 2;
	camY = posY - viewportsizeY / 2;	
	
	if (camX > offsetMaxX){
	    camX = offsetMaxX
	else if (camX < offsetMinX){
	    camX = offsetMinX;
	}
	    		
if(camY > offsetMaxY){
	camY = offsetMaxY
}
	else if (camY < offsetMaxY){
	camY = offsetMaxY;
	}
g.translate(-)
}
