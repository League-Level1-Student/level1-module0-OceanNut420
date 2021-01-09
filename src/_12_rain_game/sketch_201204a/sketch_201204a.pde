int cat = 0;
int rand = (int) random(width);

void setup(){
  size(500,500);
  
}

void draw(){
  background(80,0,100);
  fill(0,0,100);
    stroke(0,0,100);
    ellipse(rand, cat, 50,50);
    cat = cat + 1;
    
    if(cat == 500){
      cat = 0;
      
    }
  
}
