void draw(){
  for(int i = 0; i<10;i++){
    float z = random(500);
    float b = random(500);
    ellipse(z,b,20,20);
    fill(100,100,0);
  }
  
}
void setup(){
  size(500,500);
    background(100,1,150);
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
