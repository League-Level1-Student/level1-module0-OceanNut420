       setup{
        PImage pictureOfRecord;                        //as member variable
        size(600,600);                                 //in setup method
        pictureOfRecord= loadImage("record.png");      //in setup method
       }
       
       draw{
        image(pictureOfRecord, xPosition, yPosition);  //in draw method
       }
