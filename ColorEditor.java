import org.code.theater.*;
import org.code.media.*;
import java.io.FileNotFoundException;

public class ColorEditor extends Image{
  private Pixel[][] imagePixels;
  public ColorEditor(String filename) throws FileNotFoundException {
    super(filename);
    imagePixels = ImageEffect.getPixels(this);
  }

  public void removeGreen() {
    for (Pixel[] pixels : imagePixels){
      for (Pixel p : pixels) {
        p.setGreen(0);
      }
    }
  }
}
