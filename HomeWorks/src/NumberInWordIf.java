import java.util.Scanner;

public class NumberInWordIf {

        public static void main(String[] args) {
            Scanner write=new Scanner(System.in);
            System.out.print("Raqam kiriting:");
            int son=write.nextInt();
            printNumberInWord(son);

    }
    public static void printNumberInWord(int son){
            if (son<1 && son>10) System.out.println("Invalid Number");
            if(son==1) System.out.println("Bir");
            if(son==2) System.out.println("Ikki");
            if(son==3) System.out.println("Uch");
            if(son==4) System.out.println("To'rt");
            if(son==5) System.out.println("Besh");
            if(son==6) System.out.println("Olti");
            if(son==7) System.out.println("Yetti");
            if(son==8) System.out.println("Sakkiz");
            if(son==9) System.out.println("To'qqiz");
            if(son==10) System.out.println("O'n");



    }
}
