import java.util.Scanner;

public class Yakuniy_baho {
    public static void main(String[] args){
        Scanner krit=new Scanner(System.in);
        System.out.print("Talaba balini kiriting: ");
        int ball= krit.nextInt();


        talabaBaho(ball);

    }
    public static void talabaBaho(int ball){

        if (ball>100 || ball<0){
            System.out.println("Ball noto'g'ri kiritildi..");
        }


        if (100>ball && 90<=ball){
            System.out.println("A'lo...");
        }

        if (89>ball && 80<=ball){
            System.out.println("Yaxshi...");
        }

        if (79>ball && 70<=ball){
            System.out.println("Qoniqarli...");
        }

        if (69>ball && 60<=ball){
            System.out.println("Qoniqarsiz...");
        }

        if (59>ball && 0<=ball){
            System.out.println("Yomon...");
        }
    }
}
