import java.io.*;

public class InputTest {
    public static void main(String[] args) throws IOException {
        int c;
        InputStream in = null;
        try {
            in = 
            new CharacterReadInputStream(
                new NoWhiteSpace(
                    new LowerCaseInputStream( 
                        new BufferedInputStream(
                            new FileInputStream("test.txt")))));

            while((c = in.read()) >= 0) {
                System.out.print((char)c);
            }
            System.out.println();
            System.out.println("Total Characters Read: " + (CharacterReadInputStream.count - 2));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) { in.close(); }
        }
    }
}
