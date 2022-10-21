import java.util.Scanner;

public class MyCountry {
    public static void main(String[] args){
        Scanner k=new Scanner(System.in);

        System.out.println("Dollar miqdorini kiriting: ");
        int dollar=k.nextInt();
        System.out.println("Dollar kursini kiriting: ");
        float sum=k.nextFloat();
        double overall=dollar*sum;
        System.out.println("Jami summa "+overall+" miqdorga teng.");

    }
}
