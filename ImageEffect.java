import org.code.media.*;

public final class ImageEffect {
  public static Pixel[][] getPixels(Image theImage) {
    int width = theImage.getWidth();
    int height = theImage.getHeight();
    Pixel [][] pixels = new Pixel[height][width];
    
    for (int row = 0; row < height; row++) {
      for (int col = 0; col < width; col++) {
        pixels[row][col] = theImage.getPixel(col, row);
      }
    }
    return(pixels);
  }    
}
