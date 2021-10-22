public class Dead implements State{
    Game game;
    public Dead(Game game){
        this.game = game;
    }

    public void pressDown(){
        System.out.println("you are dead");
    }
    public void releaseDown(){
        System.out.println("you are dead");
    }
    public void pressUp(){
        System.out.println("you are dead");
    }
    public void releaseUp(){
        System.out.println("you are dead");
    }
    public void hitByThrown(){
        System.out.println("you are dead");
    }
    public void hitByRolled(){
        System.out.println("you are dead");
    }
    public void hitByFire(){
        System.out.println("you are dead");
    }
    public void pressEsc(){
        System.out.println("you are dead");
    }
    public void endShield(){
        System.out.println("you are dead");
    }
}
