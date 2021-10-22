import java.util.Observer;
import java.util.Observable;

public class ImageDisplay implements Observer {
    Observable observable;

    public ImageDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable observable, Object arg) {
        if (observable instanceof Goat) {
            Goat goat = (Goat) observable;
            System.out.println(goat.getName() + " is made bigger.");
        }
    }
}
