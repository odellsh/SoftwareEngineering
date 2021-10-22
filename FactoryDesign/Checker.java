public class Checker{
    GamePieceFactory cpf;
    
    public Checker(GamePieceFactory cpf){
        this.cpf = cpf;
    }

    public void play(){
        Piece bc;
        Piece rc;
        bc = cpf.createPiece("Black", " ");
        rc = cpf.createPiece("Red", " ");

        System.out.println(bc);
        System.out.println(rc);
    }
}
