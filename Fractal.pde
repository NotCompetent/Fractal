public void setup()   
{     
	size(600,600);
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
	 	vertex(border + x*.293,y+border);
	 	vertex(x + border -x*.293,y+border);
	 	vertex(x + border,y+ border -x*.293);
	 	vertex(x + border,border +x*.293);
	 	vertex(x + border -x*.293,border);
	 	vertex(border + x*.293,border);
	 	vertex(border,border +x*.293);
	 	vertex(border,y+ border -x*.293);
	 	endShape(CLOSE);
	 	stroke(0,0,0);
	 	fill(0,0,0);

	 }else{
	 	//int newX = (int) x*.146;
	 	//int newY = (int) y*.146;
	 	fractal(x*.146,y*.146,big-10,border);
	 }
	
}