float b=random(500);
float c=random(500);

void draw(){
  for(int i=0;i<100;i++){
    ellipse(b,c,20,20);
    b=b+2;
    c=c+2;
    fill(200,0,0);
    
  }
  
}
void setup(){
  size(500,500);
    background(150,1,200);
    
}
