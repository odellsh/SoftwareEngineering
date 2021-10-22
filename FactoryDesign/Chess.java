public class Chess{
    GamePieceFactory cpf;
    
    public Chess(GamePieceFactory cpf){
        this.cpf = cpf;
    }

    public void play(){
        Piece br;
        Piece wr;
        br = cpf.createPiece("Black", "Rook");
        wr = cpf.createPiece("White", "Rook");

        Piece bb;
        Piece wb;
        bb = cpf.createPiece("Black", "Bishop");
        wb = cpf.createPiece("White", "Bishop");
        
        Piece bkni;
        Piece wkni;
        bkni = cpf.createPiece("Black", "knight");
        wkni = cpf.createPiece("White", "knight");

        Piece bq;
        Piece wq;
        bq = cpf.createPiece("Black", "Queen");
        wq = cpf.createPiece("White", "Queen");

        Piece bk;
        Piece wk;
        bk = cpf.createPiece("Black", "King");
        wk = cpf.createPiece("White", "King");

        Piece bp;
        Piece wp;
        bp = cpf.createPiece("Black", "Pawn");
        wp = cpf.createPiece("White", "Pawn");
        
        System.out.println(br);
        System.out.println(wr);
        System.out.println(bb);
        System.out.println(wb);
        System.out.println(bkni);    
        System.out.println(wkni);
        System.out.println(bq);
        System.out.println(wq);
        System.out.println(bk);
        System.out.println(wk);
        System.out.println(bp);
        System.out.println(wp);
        System.out.println();
    }
}
