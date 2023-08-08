import org.code.theater.*;
import org.code.media.*;

public class SustainableNeighborhood {

  private Stage myStage = Theater.stage;
  private Collage concertCollage;

  public SustainableNeighborhood(String[][] climateCollege) {
        concertCollage = new Collage(climateCollege);
  }

  public void playConcert() {
    
  concertCollage.createCollage();
  }
   
  }
