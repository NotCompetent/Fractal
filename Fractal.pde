public void setup()   
{     
	size(600,600);
}   

public void draw()
{
	background(0,0,0);
	fractal(500,500,50);
}

public void fractal(int x, int y, int big){
	fill(255,0,255);
	stroke(255,0,255);
	beginShape();
	vertex(x,y);
	vertex(0,y);
	vertex(0,0);
	vertex(x,0);
	vertex(x,y);
	endShape(CLOSE);
	stroke(0,0,0);
	fill(0,0,0);
}