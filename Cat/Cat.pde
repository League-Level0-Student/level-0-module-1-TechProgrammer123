void setup(){
 size(720,405);
  PImage face = loadImage("p0517py6.jpeg");
image(face, 0, 0); 
  
}
void draw() {
  fill(1,mouseX,mouseY);
  ellipse(540, 150, 80, 80); 
  ellipse(350, 160, 80, 80); 
  fill(#000000);
  ellipse(550, 160, 40, 40); 
  ellipse(360, 170, 40, 40); 
}