public class Switch {
    public static void main(String[] args){

        String text="hello world";
        print(text);

        char tex='k';
        int num=25;
        print(tex,num,text);

    }
    public static void print(String str1){
        System.out.println(str1);
    }

    public static void print(char str1,int r,String l){
        System.out.println(str1+"  "+r+" "+l);
    }
}
