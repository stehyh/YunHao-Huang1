class Player{

  public int X;
  public int Y;
  public int W;
  public int H;

  Player(int x, int y, int w, int h){
    X = x;
    Y = y;
    W = w;
    H = h;
    
  } 
  
  public void drop(float speed){
    Y += speed;
  }
  
  public void display(){
    fill(0,0, 255);
    stroke(255,255,255);
    rect(X, Y,W,H,5);
    
  }
}
