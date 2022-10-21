import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner kirit=new Scanner(System.in);
        System.out.println("Talaba balini kiriting: ");
        int x=kirit.nextInt();
        int k=chackingBand(x);
        switch (x=k){
            case 92:
                System.out.println("A");break;
            case 83:
                System.out.println("B");break;
            case 70:
                System.out.println("C");break;
                case 47:
                System.out.println("D");break;
            default:
                System.out.println("Invalid number");
        }
    }
    public static int chackingBand(int x){
        int d =x;
        if (x>=90)
            d= x;
        if (x<=89 && x>=80)
            d=x;
        if (x<=79 && x>=70)
            d=x;
        if (x<=69 && x>=60)
            d=x;
        if (x<=59 && x>=50)
            d=x;
        if (x<=49)
            d=x;

        return d;

    }

}
