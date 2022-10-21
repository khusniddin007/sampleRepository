import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        System.out.println(getDurationString(36000));

    }

    public static String getDurationString(int minutes , int secundes){
        if (minutes>=0 && (secundes>=0 && secundes<59)){
            return String.format("%s h %s m %s s", minutes/60,secundes%60,secundes%60);
        }else {
            return "Invalid value";
        }
    }

    public static String getDurationString(int secundes){
        if (secundes>=0){
            int m=secundes/60;
            int s=secundes%60;
            return getDurationString(m, s);
        }else {
            return "Invalid value";
        }
    }
}
