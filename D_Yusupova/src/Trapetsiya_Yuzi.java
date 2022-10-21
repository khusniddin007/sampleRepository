import java.util.Scanner;

public class Trapetsiya_Yuzi {
    public static void main(String[] args) {
        Scanner kirit=new Scanner(System.in);
        System.out.print("A asosni kiriting:");
        double a= kirit.nextDouble();
        System.out.print("B asosni kiriting:");
        double b=kirit.nextDouble();
        System.out.print("Alfa burchakni kiriting: " );
        double alfa=Math.tan(kirit.nextDouble() );

        double S=(Math.pow(a,2)+Math.pow(b,2))*alfa/4;
        System.out.print("Trapetsiyaning yuzi "+S+" ga teng");


    }
}
