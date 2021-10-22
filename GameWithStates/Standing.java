public class Standing implements State{
    Game game;
    public Standing(Game game){
        this.game = game;
    }

    public void pressDown(){
        game.setState(game.getDucking());
        System.out.println("you are now ducking");
    }
    public void releaseDown(){
        System.out.println("you weren't pressing down");
    }
    public void pressUp(){
        game.setState(game.getJumping());
        System.out.println("you are now jumping");
    }
    public void releaseUp(){
        System.out.println("you weren't pressing up");
    }
    public void hitByThrown(){
        game.setState(game.getDead());
        System.out.println("you are dead");
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
