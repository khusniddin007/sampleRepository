public class Ekuk_Ekub {
    public static void main(String[] args) {

        ekub(18, 12);
        ekuk(2, 6);
    }

    public static void ekub(int son1, int son2) {
        int k = son1;
        while ((son1 % k != 0) || (son2 % k != 0)) {
            k--;
        }
        System.out.println(k);

    }

    public static void ekuk(int son1, int son2) {
        int ekuk = son1;
        while ((ekuk % son1 != 0) || (ekuk % son2 != 0)) {
            ekuk++;
        }
        System.out.println(ekuk);

    }

}





