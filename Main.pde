PImage img;
int XPoint = 600,YPoint = 590,Vertical = 30,Horizontal =50,difficulty = 10,limit = 10;
float points = 0;
Player[] p1;
boolean isCollided = false;


void initP1(int xMin, int xMax, int yMin, int yMax, int num){
  p1 = new Player[num];
 
  for(int i = 0; i < p1.length; i++){
     int x = (int)random(xMin, xMax);
     int y = (int)random(yMin, yMax);
     p1[i] = new Player(x, y, 30, 15);
  }
}
void setup(){
  size(1200,800);
  img = loadImage("bg.png");
  initP1(-100, width + 20, -250, -80, difficulty);

  
}

void draw(){
  
  image(img,0,0);
  drawPlayer();
  
  if(!isCollided){
    moveP1();
    if(points > limit && points < limit + 2){
      initP1(-100, width + 20, -260, -80, difficulty); difficulty += 10; limit += 20;
    }
  }
 else{
   text("POINTS: "+(int)points,500,580);
fill(0,0,0);
text("GAME OVER",493,540);
    
 }

  
}

void moveP1(){
      for(int i = 0; i < p1.length; i++){
        if(p1[i].Y > height){
           p1[i].Y = -10;
        }
        p1[i].display();
        p1[i].drop(random(1, 15));
      
        boolean conditionXLeft = p1[i].X + p1[i].W >= XPoint;
        boolean conditionXRight = p1[i].X + p1[i].W<= XPoint + Vertical + 4;
        boolean conditionUp =  p1[i].Y>= YPoint;
        boolean conditionDown = p1[i].Y + p1[i].H<= YPoint + Horizontal;
      
        if(conditionXLeft && conditionXRight && conditionUp && conditionDown){
             isCollided = true;
        }
  
      }
     
 
    points+= 0.1;

    fill(0, 0, 0);
    text("POINTS: "+(int)points, 1, 40);
    textSize(40);
}



void drawPlayer(){
  stroke(0, 0, 0);
  strokeWeight(4);
  fill(255,255, 0);
  
  
  

  rect(XPoint, YPoint, Vertical, Horizontal, 7);



}




void mouseDragged(){
  if(mouseX >= 0 && mouseX <= width - Vertical + 1){
    XPoint = mouseX;
  }
  if(mouseY >= 590 && mouseY <= height - Horizontal){
    YPoint = mouseY;
  }
 
}
