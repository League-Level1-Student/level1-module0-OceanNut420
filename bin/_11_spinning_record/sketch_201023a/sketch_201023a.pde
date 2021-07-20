PImage pictureOfRecord;                        //as member variable

void setup(){
        size(900,900);                                 //in setup method
        pictureOfRecord= loadImage("record.png");      //in setup method
        pictureOfRecord.resize(900,900);     
}

void draw(){
  image(pictureOfRecord, 0, 0);  //in draw method
}
