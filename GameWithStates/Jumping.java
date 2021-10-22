public class Jumping implements State{
    Game game;
    public Jumping(Game game){
        this.game = game;
    }

    public void pressDown(){
        game.setState(game.getDiving());
        System.out.println("you are now diving");
    }
    public void releaseDown(){
        System.out.println("you weren't pressing down");
    }
    public void pressUp(){
        System.out.println("you are already pressing up");
    }
    public void releaseUp(){
        game.setState(game.getStanding());
        System.out.println("you weren't pressing up");
    }
    public void hitByThrown(){
        game.setState(game.getDead());
        System.out.println("you are dead");
    }
    public void hitByRolled(){
        System.out.println("you are safe");
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
