import org.code.theater.*;
import org.code.media.*;
import java.io.FileNotFoundException;

public class MyConcert {
  public static void main(String[] args)throws FileNotFoundException{
 Stage myStage = Theater.stage;


String[][] climateCollege = {{"106609510-1594313213307gettyimages-1180949765.jpeg","fires.jpeg"},
                            {"drought.jpeg","sad-1629928173.jpg"}};
    String[][] Renewable = {{"download-(1).jpeg","images.jpeg"},
                            {"download-(2).jpeg","images-6.jpeg"}};
    
SustainableNeighborhood effects = new SustainableNeighborhood(climateCollege);
    SustainableNeighborhood d = new SustainableNeighborhood(Renewable);
MirroredImage reflect = new MirroredImage("download.jpeg");
MirroredImage land = new MirroredImage("vertical.jpeg");
ColorEditor j = new ColorEditor("1532103464825.jpeg");

    effects.playConcert();
    myStage.playSound("mixkit-rain-and-thunder-crash-1258.wav");
    myStage.pause(10);

    myStage.drawImage("earth.jpeg", 0, 0, myStage.getWidth(), myStage.getHeight(), 0.0);
    myStage.drawText("Global warming and climate change cause disasters", 12,30 , new Color("yellow"), Font.SANS, 12, 0.0);
    myStage.drawText("to become more extreme.", 12,42, new Color("yellow"), Font.SANS, 12, 0.0);
    myStage.drawText("By reducing our impacts we can reduce the severity of:", 12,54 , new Color("yellow"), Font.SANS, 12, 0.0);
    myStage.drawText("heat waves, melting ice caps, floods, droughts,", 12,68 , new Color("yellow"), Font.SANS, 12, 0.0);
    myStage.drawText("and fires", 12,80 , new Color("yellow"), Font.SANS, 12, 0.0);

    myStage.pause(15);
    myStage.playSound("h.wav");
    myStage.drawImage("download.jpeg", 0, 0, myStage.getWidth(), myStage.getHeight(), 0.0);
    myStage.pause(3);
    reflect.verticalMirror();
    myStage.drawImage(reflect, 0, 0, myStage.getWidth(), myStage.getHeight(), 0.0);
    myStage.drawText("Climate change poses a risk to humans and all other forms", 12,40 , new Color("yellow"), Font.SANS, 14, 0.0);
    myStage.drawText("of life on earth", 12,52 , new Color("yellow"), Font.SANS, 14, 0.0);
    myStage.pause(10);

    myStage.drawImage("vertical.jpeg", 0, 0, myStage.getWidth(), myStage.getHeight(), 0.0);
    myStage.pause(1);
    land.verticalMirror();
    myStage.drawImage(land, 0, 0, myStage.getWidth(), myStage.getHeight(), 0.0);
    myStage.drawText("You can prevent this.....", 12,60, new Color("purple"), Font.SANS, 25, 0.0);
   myStage.playSound("renewable.wav");
    myStage.pause(20);
   
    d.playConcert();
    myStage.playSound("solar.wav");
    myStage.pause(20);

    
    myStage.drawImage("1532103464825.jpeg", 0, 0, myStage.getWidth(), myStage.getHeight(), 0.0);
  //  myStage.pause(5);
    myStage.playSound("mixkit-rain-and-thunder-crash-1258.wav");
    j.removeGreen();
    myStage.drawImage(j, 0, 0, myStage.getWidth(), myStage.getHeight(), 0.0);
    myStage.pause(7);
    myStage.drawImage("1532103464825.jpeg", 0, 0, myStage.getWidth(), myStage.getHeight(), 0.0);
    myStage.pause(8);
    myStage.drawImage("earthx.jpeg", 0, 0, myStage.getWidth(), myStage.getHeight(), 0.0);
    myStage.playSound("d.wav");
    myStage.pause(15);
    myStage.playSound("help.wav");
    myStage.pause(10);


    
    myStage.play();
  }
}
