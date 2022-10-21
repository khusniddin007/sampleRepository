import com.sun.tools.javac.Main;

import java.math.MathContext;
import java.util.Scanner;

public class leetcode {
    public static void main(String[] args) {
        Scanner krit=new Scanner(System.in);

        System.out.print("Raqam kiriting  ");
        int x=krit.nextInt();


        System.out.println(isPlaindrome(x));;
    }
    public static boolean  isPlaindrome(int num){
        if(num<0) return false;
        int reversed=0,remainder, original=num;
        while (num!=0){
            remainder=num%10;
            reversed = reversed*10+remainder ;
            System.out.println("ssss"+(num /=10));

        }
        return original==reversed;


    }


}
