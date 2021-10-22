public abstract class Piece{
    protected String color;
    protected String type;
        
    public String toString(){
        return color.substring(0,1) + type.substring(0,1);
    }
}
