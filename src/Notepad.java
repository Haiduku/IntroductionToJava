import java.io.IOException;import java.lang.Runtime;import java.lang.String;import java.lang.System;

/**
 * Created by Dan on 2/8/2015.
 */
public class Notepad {
    public static void main(String[] args) {
        Runtime np = Runtime.getRuntime();
        int x = 1;

        for (x = 1; x < 20; x++) {
            try {
                np.exec("notepad");
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}
