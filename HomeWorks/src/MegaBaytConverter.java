import java.util.Scanner;

public class MegaBaytConverter {
    public static void main(String[] args) {
        Scanner krit=new Scanner(System.in);
        System.out.println("KB miqdorini kiriting  ");
        int yy= krit.nextInt();
        printMegaBytesAndKiloBytes(yy);

    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes<0){
            System.out.println("invalid Value");
        }
        int kbayt=1024;
        int mbqol=kiloBytes/kbayt;
        int kbqol=kiloBytes%kbayt;
        System.out.println(kiloBytes+" KB = "+mbqol+" MB and "+kbqol+" KB" );
    }


}
