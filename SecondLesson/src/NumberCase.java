import java.util.Scanner;

public class NumberCase {
    public static void main(String[] args) {
        Scanner krit=new Scanner(System.in);

        System.out.println("Iltimos raqam kiriting: ");
        int num=krit.nextInt();

        if (num>0){
            System.out.println("Kiritilgan raqam musbat...");
        }else if(num<0){
            System.out.println("Kirirtilgan raqam manfiy...");
        }else {
            System.out.println("kiritilgan raqam nol");
        }

    }
}
