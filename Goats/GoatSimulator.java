import java.util.Observable;

public class GoatSimulator {
    public static void main(String[] args) {
        Goat goat = new Goat();
        //Goat goat2 = new Goat();

        //WinnerDisplay winnerDisplay2 = new WinnerDisplay(goat2);
        WinnerDisplay winnerDisplay = new WinnerDisplay(goat);
        //ColorDisplay colorDisplay2 = new ColorDisplay(goat2);
        ColorDisplay colorDisplay = new ColorDisplay(goat);
        //ImageDisplay imageDisplay2 = new ImageDisplay(goat2);
        ImageDisplay imageDisplay = new ImageDisplay(goat);
        //PointDisplay pointDisplay2 = new PointDisplay(goat2);
        PointDisplay pointDisplay = new PointDisplay(goat);

        goat.setName("Sydney");
        //goat2.setName("Brooke");
        goat.addPoints(100);
        //goat2.addPoints(200);
        goat.addPoints(100);
        goat.addPoints(100);
        goat.addPoints(100);
        goat.addPoints(100);
        goat.addPoints(50);
        goat.addPoints(100);
        goat.addPoints(50);
        goat.addPoints(100);
        goat.addPoints(100);
        goat.addPoints(100);
    }
}
