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
	fractal(500,500,10,50);
}

public void fractal(float x, float y, int big,int border){
	if(big < 20){
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
	 	vertex(border + x*.293f,y+border);
	 	vertex(x + border -x*.293f,y+border);
	 	vertex(x + border,y+ border -x*.293f);
	 	vertex(x + border,border +x*.293f);
	 	vertex(x + border -x*.293f,border);
	 	vertex(border + x*.293f,border);
	 	vertex(border,border +x*.293f);
	 	vertex(border,y+ border -x*.293f);
	 	endShape(CLOSE);
	 	stroke(0,0,0);
	 	fill(0,0,0);

	 }else{
	 	//int newX = (int) x*.146;
	 	//int newY = (int) y*.146;
	 	fractal(x*.146f,y*.146f,big-10,border);
	 }
	
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
