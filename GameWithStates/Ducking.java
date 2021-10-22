public class Ducking implements State{
    Game game;
    public Ducking(Game game){
        this.game = game;
    }

    public void pressDown(){
        System.out.println("you are already pressing down");
    }
    public void releaseDown(){
        game.setState(game.getStanding());
        System.out.println("you are now standing");
    }
    public void pressUp(){
        game.setState(game.getDiving());
        System.out.println("you are now diving");
    }
    public void releaseUp(){
        System.out.println("you cant release up without pressing down first");
    }
    public void hitByThrown(){
        System.out.println("you are safe");
    }
    public void hitByRolled(){
        game.setState(game.getDead());
        System.out.println("you are dead");
    }
    public void hitByFire(){
        game.setState(game.getDead());
        System.out.println("you are dead");
    }
    public void pressEsc(){
        if(game.creditCheck() == true){
            game.setState(game.getShield());
            System.out.println("you are now shielded");
            game.creditCost();
        }
        else{
            System.out.println("you dont have enough credits. try again later");
        }
    }
    public void endShield(){
        System.out.println("you are no longer protected by a shield");
    }
}
