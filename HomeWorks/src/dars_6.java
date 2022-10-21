public class dars_6 {
    public static void main(String[] args) {
        int t1 = 92;
        int t2 = 83;
        int t3 = 70;
        int t4 = 47;
        ball(t1);
        ball(t2);
        ball(t3);
        ball(t4);

    }
    public static void ball(int t){

        if (t > 90) {
            System.out.println("A");
        }
        if (t > 80 && t < 89) {
            System.out.println("B");
        }
        if (t >= 70 && t < 79) {
            System.out.println("C");
        }
        if (t > 60 && t < 69) {
            System.out.println("D");
        }
        if (t > 50 && t < 59) {
            System.out.println("E");
        }
        if (t < 49) {
            System.out.println("F");
        } }}

