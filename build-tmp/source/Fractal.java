import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Fractal extends PApplet {

public void setup()   
{     
	
}   

public void draw()
{
	background(0,0,0);
	fractal(500,500,50,50);
}

public void fractal(int x, int y, int big,int border){

	//square
	fill(255,0,255);
	stroke(255,0,255);
	beginShape();
	vertex(x+border,y+border);
	vertex(0+border,y+border);
	vertex(0+border,0+border);
	vertex(x+border,0+border);
	vertex(x+border,y+border);
	endShape(CLOSE);
	stroke(0,0,0);
	fill(0,0,0);

	//inner octagon
	fill(0,255,255);
 	stroke(0,0,255);
 	beginShape();
 	vertex(x-x/2.414f,y+border);
 	vertex(x,y-y/2.414f);
 	//vertex(x,y/2.414);
 	//vertex(x-x/2.414,border);
 	//vertex(border + x/2.414, border);
 	//vertex(border,y/2.414);
 	//vertex(border,y-y/2.414);
 	//vertex(border + x/2.414,y);
 	endShape(CLOSE);
 	stroke(0,0,0);
 	fill(0,0,0);
}
  public void settings() { 	size(600,600); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Fractal" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
