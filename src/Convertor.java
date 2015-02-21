import java.util.Scanner;

public class Convertor {

    public static void main (String[] args){

        Scanner in = new Scanner (System.in);

        double Fah;
        System.out.print("Introdu temperatura in fahrenheit: ");
        Fah = in.nextDouble();

        double Celsius;
        Celsius = ( Fah - 32 ) * 5 / 9 ;
        //Celsius = Celsius - ( Celsius % 0.1);
        System.out.println("Temperatura in celsius este " + Celsius );


    }

}
