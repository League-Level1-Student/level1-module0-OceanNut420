void draw(){
  makeMagical();
  for(int i=0;i<50;i++){
    float b=random(500);
float c=random(500);
    ellipse(getWormX(i),getWormY(i),20,20);
    fill(200,0,0);
    
  }
  
}
void setup(){
  size(500,500);
    background(150,1,200);
    
}

float frequency = .001;
    float noiseInterval = PI;

    void makeMagical() {
        fill( 0, 0, 0, 10 );
        rect(0, 0, width, height);
        noStroke();
    }

    float getWormX(int i) {
        return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
    }

    float getWormY(int i) {
        return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
    }
