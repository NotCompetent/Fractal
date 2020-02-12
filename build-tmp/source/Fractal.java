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

int newX = 0;
int newY = 155;
int newZ = 255;
int temp = 0;
public void setup()   
{     
	
	int wow = 1;
	frameRate(10);
}   

public void draw()
{
	//int wow = wow + 1; 
	background(0,0,0);
	fractal(1000,1000,700,0,0,newX,newY,newZ);
	temp = newX;
	newX = newY;
	newY = newZ;
	newZ = temp;
}

public void fractal(float x, float y, int big,float border,int blacker,int r, int g, int b){
	if(big < 10){

		//square
		fill(r- blacker,g- blacker,b- blacker);
		stroke(0- blacker,0- blacker,0- blacker);
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
		fill(0- blacker,0- blacker,0- blacker);
	 	stroke(0- blacker,0- blacker,g- blacker);
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

	 	fill(r- blacker,g- blacker,b- blacker);
		stroke(0- blacker,0- blacker,0- blacker);
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
		fill(0- blacker,0- blacker,0- blacker);
	 	stroke(0- blacker,0- blacker,g- blacker);
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


	 	//int newX = (int) x*.146;
	 	//int newY = (int) y*.146;
	 	fractal(x-x*.1f,y-y*.1f,big-10,border +x*.05f,blacker + 10,g + 5,b + 5, r + 5);
	 }
	
}
  public void settings() { 	size(1000,1000); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Fractal" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
