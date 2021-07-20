int cat = 0;
int rand = 0;
int score = 0;

void setup(){
  size(500,500);
}

void draw(){
  background(80,0,100);
  fill(0,0,100);
    stroke(0,0,100);
    ellipse(rand, cat, 50,50);
    fill(80,80,80);
    rect(mouseX, 460,100, 40);
    cat = cat + 5;
    
    if(cat == 500){
      cat = 0; 
      rand = (int) random(width);
      checkCatch(rand);
    }
    fill(0, 0, 0);
    textSize(16);
    text("Score: " + score, 20, 20);
  
}
void checkCatch(int cat){
         if (cat > mouseX && cat < mouseX+100){
            score=score+1;
         }
         else if (score > 0) {
            score=score-1;
         }
        println("Your score is now: " + score);
    }
