public class PrimeNumber {
    public static void main(String[] args) {
        for(int i=3;i<=100;i++){
            boolean isPrime=true;
            for (int k=2; k<=50;k++){

                if (i!=k && i%k==0){
                    isPrime=false;
                }
            }

            if (isPrime)
                System.out.println(i);
        }
    }

}
