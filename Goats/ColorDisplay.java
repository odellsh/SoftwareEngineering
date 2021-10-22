import java.util.Observer;
import java.util.Observable;

public class ColorDisplay implements Observer {
    Observable observable;
    private String color = "green";
    private boolean isYellow = false;
    private boolean isRed = false;

    public ColorDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }
    
    //update method for ColorDisplay
    public void update(Observable observable, Object arg) {
        if (observable instanceof Goat) {
            Goat goat = (Goat) observable;
            if (!isYellow && goat.getScore() >= 500 && goat.getScore() < 900) {
                color = "yellow";
                System.out.println("The new color scheme is " + color);
                isYellow = true;
            }
            else if (!isRed && goat.getScore() >= 900) {
                color = "red";
                System.out.println("The new color scheme is " + color);
                isRed = true;
            }
        }
    }
}
