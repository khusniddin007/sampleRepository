public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(addNumbers(5,8));
        System.out.println(addNumbers(5,8,9));
        System.out.println(addNumbers(5,8,5,2));

        System.out.println(addNumbers(5,8.1));
        System.out.println(addNumbers(5,8.1,9.1));
        System.out.println(addNumbers(5,8.1,5.2,2.9));
    }
    
    public static int addNumbers(int num1,int num2){
        return num1+num2;
    }

    public static int addNumbers(int num1,int num2,int num3){
        return  num1+num2+num3;
    }

    public static int addNumbers(int num1,int num2,int num3,int num4){
        return num1+num2+num3+num4;
    }

    public static double addNumbers(double num1,double num2){
        return num1+num2;
    }

    public static double addNumbers(double num1,double num2,double num3){
        return num1+num2+num3;
    }

    public static double addNumbers(double num1,double num2,double num3,double num4){
        return num1+num2+num3+num4;
    }


}
