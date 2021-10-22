public class CheckerPieceFactory extends GamePieceFactory{
    public CheckerPieceFactory(){
    }

    Piece createPiece(String color, String type){
       // CheckerPiece piece = null;
        if(color.equals("Black")){
            return new CheckerPiece(color);
        }
        else if(color.equals("Red")){
            return new CheckerPiece(color);
        }
        else return null;
    }
}
