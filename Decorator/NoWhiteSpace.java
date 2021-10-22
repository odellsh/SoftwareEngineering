import java.io.*;

public class NoWhiteSpace extends FilterInputStream{
    public NoWhiteSpace(InputStream in){
        super(in);
    }

    public int read() throws IOException{
        int c = in.read();
        //return in.read().replace(" " ,"");
        if(c == -1){
            return c;
        }
        else if(c == ' '){
            return 0;
        }
        else{
            return c;
        }
    }
}
