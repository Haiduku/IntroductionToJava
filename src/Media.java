import java.util.Scanner;

public class Media {

    public static void main(String[] args){
        Scanner data = new Scanner(System.in);
        int i, num, temp = 0;
        float sum = 0;
        System.out.print("Media a cator numere vrei sa calculezi : ");
        num=data.nextInt();
        System.out.println("Scrie " +num+ " numere pentru medie");
        for(i=0; i < num; i++)
        {
            temp = data.nextInt();
            sum = sum + temp;
        }
        sum = sum/num;
        System.out.println( "Media a " +num+ " este " +sum );
    }
}