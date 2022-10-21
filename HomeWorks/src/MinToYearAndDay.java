public class MinToYearAndDay {
    public static void main(String[] args){

        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }
    public static void printYearsAndDays(long minutes){
        if (minutes<0){
            System.out.println("Invalid value");
        }

        System.out.println(String.format("%s min=%s y and %s d",minutes,minutes/(24*60*365),(minutes/24*60)%365));

    }
}
