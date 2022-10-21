import java.util.Scanner;

public class SpeedOfCar {
    public static void main(String[] args) {
        Scanner kir=new Scanner(System.in);
        System.out.print("Mashina tezligini kiriting: ");
        double tez=kir.nextDouble();
        long natija=(long) toMilSoat(tez);
        System.out.println("Tezlik "+natija+" mil/soat ga teng");
    }
    public static double toMilSoat(double kilometrSoat){
        double milSoat=1.609;
        double speed=(kilometrSoat>0)? (kilometrSoat/milSoat):-1;
        return speed;
    }
}
