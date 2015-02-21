import java.lang.String;import java.lang.System;import java.util.Arrays;

/**
 * Created by Ana on 2/14/2015.
 */
public class Criptare {
    public static void main(String[] args) {

        int sir[] = {2, 3, 7, 9};
        System.out.println("Sirul este" +Arrays.toString(sir));
        int key = 1040;
        int sircriptat[] = {0, 0, 0, 0};
        for (int i = 0; i < sir.length-1; i++) {
            System.out.println(sir[i]);
            sircriptat[i] = sir[i] + key;
        }
        System.out.println("Sirul criptat este" + Arrays.toString(sircriptat));

        for (
                int i = 0;
                i < sircriptat.length - 1; i++) {
            sir[i] = sircriptat[i] - key;
        }
        System.out.println("Sirul decriptat este" + Arrays.toString(sir));

    }


}

