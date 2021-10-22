public abstract class GamePieceFactory{
    public GamePieceFactory(){
    }
    abstract Piece createPiece(String color, String type);
}
