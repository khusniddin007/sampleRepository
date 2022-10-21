
public class IsPrimeMethod {

    public static void main(String[] args) {

        for (int j=1;j<50;j++){
            if (isPrime(j)) {

                System.out.println(j);
            }
        }
    }
    public static boolean isPrime(int n){
        if (n==1){
            return false;
        }

        for (int i=2;i<n/2;i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }

}
