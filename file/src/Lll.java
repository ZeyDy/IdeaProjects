import java.io.*;
import java.io.FileNotFoundException;

public class Lll {
    public static void main(String[] args) {
        try (InputStream in = new FileInputStream("src/text.txt")) {

            int raidesKodas;
            while( (raidesKodas = in.read()) > 0 ) {
                char raide = (char) raidesKodas;
                System.out.print( raide );
            }

        } catch (IOException e) {
            System.out.println(e);
        }
    }
    static String skaitymasSuBuferiu() {
        String result = "";
        try ( BufferedReader br = new BufferedReader ( new FileReader("src/text.txt") )  ){

            String line;

            while (  (line  = br.readLine()  ) != null ) {
                result += line;
                System.out.println(line);
            }



        } catch ( IOException e) {
            System.out.println(e);
        }

        return result;
    }
}
