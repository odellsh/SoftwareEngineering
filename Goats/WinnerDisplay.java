import java.util.Observer;
import java.util.Observable;

public class WinnerDisplay implements Observer {
    Observable observable;

    public WinnerDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable observable, Object arg) {
        if (observable instanceof Goat) {
            Goat goat = (Goat) observable;
            if (goat.getScore() >= 1000) {
                System.out.println(goat.getName() + " wins.");
            }
        }
    }
}
