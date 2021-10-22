import java.io.*;

public class CharacterReadInputStream extends FilterInputStream{
    public static int count = 0;
    public CharacterReadInputStream(InputStream in){
        super(in);
    }
    public int read() throws IOException{
        int c = in.read();
        if(c != 0){
            count++;
        }
        return c;
    }
}
