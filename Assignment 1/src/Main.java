import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {

        // 1 . Evaluate. Use a decimal point in your answer if the result is double


      /*  System.out.println((15/6) + (15 % 6));
        System.out.println((3e-1 + 2e1));
        System.out.println(2 / 5 * 8.0);
        System.out.println(1.6 * 20 % 8);
        System.out.println((double) (25/4));
        System.out.println( (int) 2.7 + 6.3);
        System.out.println(20 - 10* (15%4));
        System.out.println(7/(-5) + 4%(-3));
        System.out.println(2*3/(double)4);
        System.out.println((int ) 4.8 % 1.1); */

        //. Suppose that the following declarations have been made.
        //int i = 3, j = 4, k = 2;
        //Using these starting values in each part, find the value of each variable after the given
        //statement has been executed.
        //a) j = ++i * k--; b) i --j + k/2;
        //c) k = i-- - j++; d) j = (2*i++)%(++k + 1);
        //e) i += j -= --k; f) i *= j /= k++;

       /* int i = 3, j = 4, k = 2;

       // System.out.println(j = ++i * k--);
        // System.out.println(i = --j + k/2);
        //System.out.println(k = i-- - j++);
        //System.out.println((j = (2*i++)%(++k + 1)));
       // System.out.println(i += j -= --k);
        System.out.println(i *= j /= k++); */

        /* 4. State the value of each expression.
        a) (char)('b' + 6) b) (int)('M' - 'T') */
        // System.out.println((char)('b' + 6));
        // System.out.println((int)('M' - 'T'));

       /* 5. Evaluate.
                a) Math.round(Math.sqrt(20))
        b) Math.ceil(-4.6)
        c) Math.min(0.0024,1.2e-3)
        d) Math.pow(0.5,-4) */


       // System.out.println( Math.round(Math.sqrt(20)));
       // System.out.println(Math.ceil(-4.6));
       //System.out.println(Math.min(0.0024,1.2e-3));
       // System.out.println(Math.pow(0.5,-4));


        // 6. Write as Java expressions
      /*  int a = 0, b = 0;
        System.out.println(Math.sqrt(Math.PI(Math.pow(a, 2) - Math.pow(b, 2))));*/






        //8 question

       // int x = 7, y = 4;
       // System.out.println(x = y);
      //  System.out.println(y = x);



        //int temp = x;
        //x=y;
       // y= temp;

       // System.out.println(y);







        // 9 question

        Scanner s1 = new Scanner(System.in);
       /* double num1 = s1.nextDouble();
        double num2 = s1.nextDouble();
        double num3 = s1.nextDouble();

        double  mean = (num1+num2 +num3)/3;
        System.out.println(mean); */



        // 10 question

    /*     double value = 47000000;
        double firstYear = value * (0.045);
        System.out.println(firstYear);
        double secondYear = (value + firstYear) * (0.045);
        System.out.println(secondYear);
        double finalvalue = value+firstYear+secondYear;
        System.out.println(finalvalue); */


        /*System.out.println("Enter a three digit number:");
        int number = s1.nextInt();
        int sum ;
        int n;
        sum =0;
        n = number%10;
        sum = sum + number % 10;
        number = number /10 + number /10 + number /10;

        System.out.println("The sum of the number is: " + number);*/

    }
}