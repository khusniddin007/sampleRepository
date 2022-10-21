import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner write=new Scanner(System.in);
        System.out.print("Write day number of the week:");
        int day=write.nextInt();
        printDayOfTheWeek(day);

    }
    public static void printDayOfTheWeek(int day){

        if (day<1 && day>7){
            System.out.println("Invalid day");
        }
        switch (day){
            case 1:
                System.out.println("Monthday");break;
            case 2:
                System.out.println("Tuesday");break;
            case 3:
                System.out.println("Wednesday");break;
            case 4:
                System.out.println("Thursday");break;
            case 5:
                System.out.println("Friday");break;
            case 6:
                System.out.println("Saturday");break;
            case 7:
                System.out.println("Sunday");break;
            default:
                System.out.println("Invalid day");
        }



    }

}
