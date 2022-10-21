public class Casting {
    public static void main(String[] args){
        int num=25;
        byte mynum=(byte)num;

        short myshort=(short)mynum;

        double mydouble=(double)myshort;

        float myfloat=(float)mydouble;

        System.out.println("natija:"+mynum+" "+myshort+" "+mydouble+" "+myfloat);
    }
}
