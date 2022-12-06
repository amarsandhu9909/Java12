import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);


        System.out.println("Enter your family name:");
        String familyName = s1.next();
        System.out.println("Enter your given name:");
        String givenName = s1.next();
        System.out.println("Enter your hourly rate of pay:");
        double salary = s1.nextDouble();
        System.out.println("Enter the number of hours you worked:");
        double hours = s1.nextDouble();
        System.out.println("Enter the tax category:");
        String taxCat = s1.next();
        System.out.println("Do you want to donate $20 to charity y/n:");
        String donate = s1.next();
        double grossPay, netPay = 0 ;

        String deduction = "";


        if (hours > 40) {
            grossPay = hours * (2 * salary);
        } else {
            grossPay = hours * salary;}
         if (taxCat.equals("a")  && donate.equals("y")){
            netPay = grossPay - 20;
            deduction = "$20 charity donation";
        } else if ((taxCat.equals("a")  && donate.equals("n"))) {
             netPay = grossPay;
             deduction = "0% tax";}
         else if ((taxCat.equals("b")  && donate.equals("y"))){
             netPay = grossPay - (0.1 * grossPay) - 20;
             deduction = "$20 charity donation and 10% tax";
        }else if ((taxCat.equals("b")  && donate.equals("n"))) {
             netPay = grossPay - (0.1 * grossPay);
             deduction = "10% tax";}
         else if ((taxCat.equals("c")  && donate.equals("y"))) {
             netPay = grossPay - (0.2 * grossPay) - 20;
             deduction = "$20 charity donation and 20% tax";
         } else if ((taxCat.equals("c")  && donate.equals("n"))) {
             netPay = grossPay - (0.20 * grossPay);
             deduction = "20% tax";}
          else if ((taxCat.equals("d")  && donate.equals("y"))){
             netPay = grossPay - (0.29 * grossPay) - 20;
             deduction = "$20 charity donation and 29% tax";
         }         else if ((taxCat.equals("d")  && donate.equals("n"))) {
             netPay = grossPay - (0.29 * grossPay);
             deduction = "29% tax";}
         else if ((taxCat.equals("e")  && donate.equals("y"))){
             netPay = grossPay - (0.35 * grossPay) - 20;
             deduction = "$20 charity donation and 35% tax";
         }
         else if ((taxCat.equals("e")  && donate.equals("n"))) {
             netPay = grossPay - (0.35 * grossPay);
             deduction = "35% tax";
         }else {
             }
         System.out.println("Gross pay = " + grossPay);
         System.out.println("Net pay = " + netPay);
         System.out.println("Deductions = " + deduction);


    }
}






