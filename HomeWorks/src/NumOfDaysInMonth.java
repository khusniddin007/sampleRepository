import java.util.Scanner;

public class NumOfDaysInMonth {
    public static void main(String[] args) {
        Scanner write=new Scanner(System.in);
        System.out.print("Oy kiriting:");
        String month=write.nextLine();
        System.out.println(daysInMonth(month));

}
public static int daysInMonth(String MonthName){
    return switch (MonthName.toLowerCase()) {
        case "yanvar" -> 31;
        case "fevral" -> 28;
        case "mart" -> 30;
        case "aprel" -> 31;
        case "may" -> 30;
        case "iyun" -> 30;
        case "iyul" -> 30;
        case "avgust" -> 31;
        case "sentabr" -> 30;
        case "oktyabr"->30;
        case "noyabr" -> 30;
        case "dekabr" -> 31;
        default -> -1;
    };
}

}

