public class Client{
    public static void main(String[] args){
        GamePieceFactory gpf = new ChessPieceFactory();
        Chess chess = new Chess(gpf);
        chess.play();

        CheckerPieceFactory cpf = new CheckerPieceFactory();
        Checker checker = new Checker(cpf);
        checker.play();
    }
}
