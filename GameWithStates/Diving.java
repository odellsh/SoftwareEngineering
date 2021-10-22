public class Diving implements State{
    Game game;
    
    public Diving(Game game){
        this.game = game;
    }

    public void pressDown(){
        System.out.println("you are alread pressing down");
    }
    public void releaseDown(){
        game.setState(game.getJumping());
        System.out.println("you are now jumping");
    }
    public void pressUp(){
        System.out.println("you are already pressing up");
    }
    public void releaseUp(){
        game.setState(game.getDucking());
        System.out.println("you are now ducking");
    }
    public void hitByThrown(){
        System.out.println("you are safe");
    }
    public void hitByRolled(){
        game.setState(game.getDead());
        System.out.println("you are dead");
    }
    public void hitByFire(){
        System.out.println("you are safe");
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
