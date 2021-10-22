import java.util.Observable;
import java.util.Observer;

public class Goat extends Observable {
    private String name;
    private int score;

    /**
     * constructor for Goat
     */
    public Goat(){
        score = 0;
    }

    //getter for name
    public String getName(){
        return name;
    }

    //getter for score
    public int getScore(){
        return score;
    }

    //setter for name
    public void setName(String name){
        this.name = name;
    }

    //add points method
    public void addPoints(int points) {
        if (points >= 0) {
            score += points;

            setChanged();
            notifyObservers();
        }
    }
}
