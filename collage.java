import org.code.theater.*;
import org.code.media.*;

public class Collage {

  private Stage myStage = Theater.stage;		// the stage
  private Image[][] collageImages;					// 2D array of Image objects

  // constructor to initialize and create 2D array of Image objects
  public Collage(String[][] imageFiles) {
    collageImages = new Image[imageFiles.length][imageFiles[0].length];
    createImages(imageFiles);
  }

  // creates 2D array of Image objects from the array of filenames
  public void createImages(String[][] imageFiles) {
    for (int row = 0; row < imageFiles.length; row++) {
      for (int col = 0; col < imageFiles[0].length; col++) {
        collageImages[row][col] = TheaterControl.createImage(imageFiles[row][col]);
      }
    }
  }

  // displays a collage of images on the stage
  public void createCollage() {
    // TO DO: Declare and initialize variables xPos, yPos, width, and height.
int xPos =0;
int yPos=0;
int width=myStage.getWidth()/2;
int height=myStage.getHeight()/2;
    // TO DO: Traverse the 2D array to display the images on the stage.
    for(int row=0; row< collageImages.length;row++){                           //(int row=0;row<collageImages.length;row++) (int column=0;column<row[0].length;column++);
   for (int column=0; column<collageImages[0].length;column++){
      myStage.drawImage(collageImages[row][column], xPos,  yPos,  width,  height, 0);
     xPos=(myStage.getWidth()/2);
    
   }
       xPos=0;
         yPos=(myStage.getHeight()/2);
}

    
  }
}
