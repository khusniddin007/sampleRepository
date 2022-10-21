import java.util.Scanner;

public class Tarmoqlash {
    public static void main(String[] args) {
        Scanner kirit=new Scanner(System.in);
        double y;
        System.out.print("x= ");
        int x=kirit.nextInt();
        System.out.print("a= ");
        int a=kirit.nextInt();
        System.out.print("b= ");
        int b= kirit.nextInt();
        System.out.print("t= ");
        int t= kirit.nextInt();

        if (x > (a+b)/Math.pow(a,2)){
            y=3*t+5*x;
            System.out.println("y= "+y);
        }else{
            System.out.println("dastur noto'g'ri ");
        }

        if (x <= (a+b)/Math.pow(a,2)){
            y= Math.pow(4,x)+Math.pow(-2,t);
            System.out.println("y= "+y);
        }else{
            System.out.println("dastur noto'g'ri ");
        }






    }
}
