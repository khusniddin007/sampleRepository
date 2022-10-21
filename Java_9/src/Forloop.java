public class Forloop {
    public static void main(String[] args){

        adding(1000);

        System.out.println();

    }
    public static void adding(int son){
        for (int i=1; i<=son;i++){

            if ((i%3==0) && (i%5==0)){

                System.out.println(i);
            }

        }



    }
}
