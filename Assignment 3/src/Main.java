import java.util.Scanner;
public class Main
{
 /*   static boolean sumOfCubesNo (int val) {
        int sum = 0, i = val;
        while (i > 0) {
            int digit = i % 10;
            sum += digit * digit * digit;
            i = i / 10;
        }
        return (val == sum);
    }
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++)
            if (sumOfCubesNo (i)) System.out.println (i + " is equal to sum of cubes of its digits");*/




       // Question 3


            static double eX (double x) {
                double ex = 1, numerator = 1;
                double fact = 1;
                for (int i = 1; i <= 20; i++) {     // 20 terms
                    numerator *= x;
                    fact *= i;
                    ex += numerator / fact;
                }
                return ex;
            }
            public static void main(String[] args) {
                Scanner sc = new Scanner (System.in);
                System.out.print ("Enter value of x: ");
                double x = sc.nextDouble ();
                System.out.printf ("e to the power %f is %.10f\n", x, eX (x));
}}