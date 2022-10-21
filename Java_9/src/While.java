public class While {
    public static void main(String[] args) {

        System.out.println(sumDigits(125));
    }
    public static int sumDigits(int number){
        if (number<10) {
            return -1;
        }
        int sum=0;
        while (true){
            sum+=number%10;
            number=number/10;
            if (number==0){
                break;
            }
        }
        return sum;
    }
}
