import java.util.Scanner;

public class Tenglama_Sistemasi {
    public static void main(String[] args) {
        Scanner krit=new Scanner(System.in);
        System.out.println("x ga qiymat kiriting:");
        int x= krit.nextInt();
        System.out.println("t ga qiymat kiriting");
        int t= krit.nextInt();

        natija(x,t);
    }

    public static void natija(int x, int t){
        if (x>3*t && x<=Math.pow(2,t)){
            System.out.println("natija to'g'ri....");
        }else {

            System.out.println("natija noto'g'ri....");
        }
    }
}
