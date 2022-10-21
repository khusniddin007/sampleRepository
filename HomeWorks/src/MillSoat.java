import java.util.Scanner;

public class MillSoat {
    public static void main(String[] args) {

        Scanner kirit=new Scanner(System.in);
        System.out.print("Mashina tezligini kiriting: ");
        double kmSpeed= kirit.nextDouble();;
        double nat=toMilsoat(kmSpeed);
        long milNatija=(long) nat;
        System.out.println("Mashina "+milNatija+" mil/soat tezlikda harakatlanmoqda");
    }
    public static Double toMilsoat(double KmHour){
        double milSoat=1.609;
        double nat=(KmHour<0)? -1:KmHour*milSoat;
        return nat;

    }
}
