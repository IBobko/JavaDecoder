import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaDecoder {
    public static void main(String[] str) throws InterruptedException, IOException {
        Process p = Runtime.getRuntime().exec("javap " + str[0]);
        p.waitFor();

        BufferedReader reader =
                new BufferedReader(new InputStreamReader(p.getInputStream()));

        String line = "";
        while ((line = reader.readLine())!= null) {
            System.out.println(line);
        }
    }
}
