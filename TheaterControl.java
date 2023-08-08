import org.code.media.*;
import java.io.FileNotFoundException;

public final class TheaterControl {
  private static Image tempImage;

  public static Image createImage(String filename) {
    try {
      tempImage = new Image(filename);
    } catch (FileNotFoundException e) {
      System.out.println("Error creating image: " + filename);
    }

    return tempImage;
  }
}
