import java.util.Scanner;

public class NumberInWord {
    public static void main(String[] args) {
        Scanner write=new Scanner(System.in);
        System.out.print("Raqam kiriting:");
        int son=write.nextInt();
        printNumberInWord(son);
    }
    public static void printNumberInWord(int son){
        if (son<1 && son>10)
            System.out.println("Boshqa raqam");

        switch (son){

            case 1:
                System.out.println("Bir");break;
            case 2:
                System.out.println("Ikki");break;
            case 3:
                System.out.println("Uch");break;
            case 4:
                System.out.println("To'rt");break;
            case 5:
                System.out.println("Besh");break;
            case 6:
                System.out.println("Olti");break;
            case 7:
                System.out.println("Yetti");break;
            case 8:
                System.out.println("Sakkiz");break;
            case 9:
                System.out.println("To'qqiz");break;
            case 10:
                System.out.println("O'n");break;
            default:
                System.out.println("Boshqa son");
        }
    }
}
