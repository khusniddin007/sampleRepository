import java.util.Scanner;

public class PeramidaYuzi {
    public static void main(String[] args) {
        Scanner krit=new Scanner(System.in);
        System.out.print("A tomonini kiriting:");
        double a= krit.nextDouble();
        System.out.print("B tomonini kiriting:");
        double b= krit.nextDouble();
        System.out.print("C tomonini kiriting:");
        double c= krit.nextDouble();

        double S=Math.abs(a-b)/Math.sqrt(1+Math.pow(c,-2));
        System.out.println("Berilgan peramidaning yuzi "+S+" ga teng");


    }
}
