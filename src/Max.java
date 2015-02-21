import java.util.Scanner;
public class Max {

    public static void main (String[] args){
        Scanner numar = new Scanner(System.in);
        int n, temp, i = 0;
        int Max = 0;

        System.out.print(" Cate numere are lista ta? " );

        n = numar.nextInt();

        System.out.println( " Scrie " +n+  " numere , sa vedem care e mai mare");
        for(i=0; i < n ; i++ )
        {
            temp = numar.nextInt();
            if( Max - temp < 0 )
            {
                Max = temp ;
            }
            else {
                Max = Max;
            }
        }
        System.out.println("Cel mai mare numar este "  + Max );

    }
}
