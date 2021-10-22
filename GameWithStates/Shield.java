public class Shield implements State{
    Game game;
    public Shield(Game game){
        this.game = game;
    }

    public void pressDown(){
        System.out.println("you cant do this action");
    }
    public void releaseDown(){
        System.out.println("you cant do this action");
    }
    public void pressUp(){
        System.out.println("you cant do this action");
    }
    public void releaseUp(){
        System.out.println("you cant do this action");
    }
    public void hitByThrown(){
        System.out.println("you are shielded");
    }
    public void hitByRolled(){
        System.out.println("you are shielded");
    }
    public void hitByFire(){
        System.out.println("you are shielded");
    }
    public void pressEsc(){
        System.out.println("you are already shielded");
    }
    public void endShield(){
        System.out.println("you are no longer protected by a shield");
        game.setState(game.getStanding());
    }
}
