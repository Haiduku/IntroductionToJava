import java.util.Scanner;
import java.util.ArrayList;

public class Impare {

    public static void main (String[] args){
        Scanner numar = new Scanner(System.in);
        int n, temp, i = 0;
       ArrayList<Integer> arrlist = new ArrayList<Integer>();

        System.out.print(" Cate numere are lista ta? " );

        n = numar.nextInt();

        System.out.println( " Scrie " +n+  "numere , sa vedem care dintre ele sunt impare ");
        for(i=0; i < n ; i++ )
        {
            temp = numar.nextInt();

        if (  temp % 2  == 1 ) {

            arrlist.add(temp);

        }
        }
        System.out.println( " Numerele impare sunt" + arrlist );
    }
}