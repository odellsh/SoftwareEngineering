public class ChessPieceFactory extends GamePieceFactory{
    public ChessPieceFactory(){
    }

    Piece createPiece(String color, String type){
        //Piece piece = null;
        if(type.equals("King")){
           return new King(color);
        }
        else if(type.equals("Queen")){
            return new Queen(color);
        }
        else if(type.equals("Pawn")){
            return new Pawn(color);
        }
        else if(type.equals("Rook")){
            return new Rook(color);
        }
        else if(type.equals("Bishop")){
            return new Bishop(color);
        }
        else if(type.equals("knight")){
            return new Knight(color);
        }
        else return null;
    }
}
