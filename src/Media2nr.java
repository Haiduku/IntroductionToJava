import java.util.Scanner;

/**
 * Created by Dan on 2/8/2015.
 */
public class Media2nr {
    public static void main(String[] args) {

        int x, y, media = 0;
        Scanner bag = new Scanner(System.in);

        x = citesteNumar(bag);
        y = citesteNumar(bag);

        media = prestezMedia(x,y);

        System.out.println( " Media este " + media );


    }


    private static int citesteNumar(Scanner in){
        System.out.println("Baga un numar!");
        int nr = in.nextInt();
        return nr;
    }

    private static int prestezMedia(int x, int y){

        int media = (x + y) / 2;
        return media;
    }
}
