public class GamePlay{
    public static void main(String[] args){
        Game game = new Game();
        game.pressDown(); //duck
        game.releaseDown(); //stand
        game.pressUp(); //jump
        game.hitByRolled(); //hit by rolled object
        game.releaseUp(); //back to standing
        game.pressUp();
        game.pressDown(); //diving
        game.hitByFire(); //hit by fire
        game.releaseUp(); //standing
        game.releaseDown();
        game.pressEsc(); //shielded
        game.hitByFire();
    }
}
