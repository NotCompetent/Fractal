public void setup()   
{     
	size(600,600);
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
 	vertex(x-x/2.414,y+border);
 	vertex(x,y-y/2.414);
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