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

//woop woop did this work
//hello?
public void setup()   
 {     
 	//initialize bacteria variables here 
 	//int t = 0;
 	
	
 }   
  public void settings() { 	size(500,500); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Fractal" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
