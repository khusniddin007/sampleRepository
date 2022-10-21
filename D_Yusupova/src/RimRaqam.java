import java.util.Scanner;


class RimRaqam {

   static int x_sanoq(char num1, char num2, int i, char[] c) {
        c[i++] = num1;
        c[i++] = num2;
        return i;
    }

    static int y_sanoq(char ch, int n, int i, char[] c) {
        for (int j = 0; j < n; j++) {
            c[i++] = ch;
        }
        return i;
    }


    static void rimRaqamChiqar(int number) {
        char c[] = new char[100];
        int i = 0;


        if (number <= 0) {
            System.out.printf("Notog'ri raqam");
            return;
        }


        while (number != 0) {

            if (number >= 1000) {

                i = y_sanoq('M', number / 1000, i, c);
                number = number % 1000;
            }

            else if (number >= 500) {
                if (number < 900) {
                    i = y_sanoq('D', number / 500, i, c);
                    number = number % 500;
                }
                else {
                    i = x_sanoq('C', 'M', i, c);
                    number = number % 100;
                }
            }
            else if (number >= 100) {
                if (number < 400) {
                    i = y_sanoq('C', number / 100, i, c);
                    number = number % 100;
                }
                else {
                    i = x_sanoq('C', 'D', i, c);
                    number = number % 100;
                }
            }
            else if (number >= 50) {
                if (number < 90) {
                    i = y_sanoq('L', number / 50, i, c);
                    number = number % 50;
                }
                else {
                    i = x_sanoq('X', 'C', i, c);
                    number = number % 10;
                }
            }
            else if (number >= 10) {
                if (number < 40) {
                    i = y_sanoq('X', number / 10, i, c);
                    number = number % 10;
                }else {
                    i = x_sanoq('X', 'L', i, c);
                    number = number % 10;
                }
            }
            else if (number >= 5) {
                if (number < 9) {
                    i = y_sanoq('V', number / 5, i, c);
                    number = number % 5;
                }


                else {
                    i = x_sanoq('I', 'X', i, c);
                    number = 0;
                }
            }
            else if (number >= 1) {
                if (number < 4) {
                    i = y_sanoq('I', number, i, c);
                    number = 0;
                }
                else {
                    i = x_sanoq('I', 'V', i, c);
                    number = 0;
                }
            }
        }

         System.out.printf("Rim raqami : ");
        for (int j = 0; j < i; j++) {
            System.out.printf("%c", c[j]);
        }
    }

        public static void main(String[] args) {
        Scanner krit=new Scanner(System.in);
        System.out.print("Raqam kiriting: ");
        int number =krit.nextInt();


        rimRaqamChiqar(number);
    }
}
