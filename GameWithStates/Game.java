import java.util.concurrent.TimeUnit;

public class Game{
    State standing;
    State jumping;
    State ducking;
    State diving;
    State shield;
    State dead;

    State state;
    int numOfCreds;

    public Game(){
        standing = new Standing(this);
        jumping = new Jumping(this);
        ducking = new Ducking(this);
        diving = new Diving(this);
        shield = new Shield(this);
        dead = new Dead(this);
       
        numOfCreds = 2; 
        state = standing; //default state is standing!
    }
    public boolean creditCheck(){
        if(numOfCreds > 0)
            return true;
        else
            return false;
    }
    public void creditCost(){
        numOfCreds -= 1;
    }
    public void pressDown(){
        state.pressDown();
    }
    public void releaseDown(){
        state.releaseDown();
    }
    public void pressUp(){
        state.pressUp();
    }
    public void releaseUp(){
        state.releaseUp();
    }
    public void hitByThrown(){
        state.hitByThrown();
    }
    public void hitByRolled(){
        state.hitByRolled();
    }
    public void hitByFire(){
        state.hitByFire();
    }
    public void pressEsc(){
        state.pressEsc();
        try{
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        state.endShield();
    }
    public void endShield(){
        state.endShield();
    }

    public State getStanding(){
        return standing;
    }
    public State getJumping(){
        return jumping;
    }
    public State getDucking(){
        return ducking;
    }
    public State getDiving(){
        return diving;
    }
    public State getDead(){
        return dead;
    }
    public State getShield(){
        return shield;
    }

    public void setState(State state){
        this.state = state;
    }
}
