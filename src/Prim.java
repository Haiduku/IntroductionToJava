import java.util.Scanner;

/**
 * Created by Dan on 2/6/2015.
 */


public class Prim {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println(" Baga numarul, sa vedem daca e prim ! ");
        int nr = in.nextInt();
        int rest = 0;
        for (int i = 2; i < nr; i++) {
            rest = nr % i;
            if (rest == 0) {
                System.out.println(" Nu e prim! ");
                System.exit(0);
            }

        }


        if (rest != 0) {
            System.out.println(" E prim ");

        }

    }
}

