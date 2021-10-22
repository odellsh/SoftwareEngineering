import java.util.Observer;
import java.util.Observable;

public class PointDisplay implements Observer {
    Observable observable;

    //PointDisplay constructor
    public PointDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    //update method
    public void update(Observable observable, Object arg) {
        if (observable instanceof Goat) {
            Goat goat = (Goat) observable;
            System.out.println(goat.getName() + " ate something and now has " + goat.getScore() + " points. ");
        }
    }
}
