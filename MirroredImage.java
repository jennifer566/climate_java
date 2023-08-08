import org.code.theater.*;
import org.code.media.*;
import java.io.FileNotFoundException;

// TO DO: Make MirroredImage a subclass of Image.
public class MirroredImage extends Image{
  private Pixel [][] imagePixels;

  // TO DO: Declare a 2D Pixel array called imagePixels.
  

  // TO DO: Complete the constructor by calling super() and initializing
  // imagePixels to the 2D Pixel array returned from ImageEditor.getPixels().
  public MirroredImage(String filename) throws FileNotFoundException {
    super(filename);
    imagePixels = ImageEffect.getPixels(this);
  }

  // TO DO: Write your code to vertically mirror the image.
  public void verticalMirror() {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = imagePixels[0].length;
    for(int col = 0; col < width/2; col++){
      for(int row = 0; row < imagePixels.length; row++){
        leftPixel = imagePixels[row][col];
        rightPixel = imagePixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }
}
