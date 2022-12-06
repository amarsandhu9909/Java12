public class Main {
    public static void main(String[] args) {

        String n = "*";
        //5

        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print(" ");

            };
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print( n +" ");
            }System.out.println();
        }

        //7
        for(int i = 1;i <= 5;i++)
        {
            for(int j = i;j < 5;j++)
            {
                System.out.print(" ");
            }
            for(int k = 1;k <= 2 * i - 1; k++)
            {
                System.out.print(n +" ");
            }
            System.out.println("");
        }
        for(int i = 4;i>=1;i--)
        {
            for(int j = i;j<5;j++)
            {
                System.out.print(" ");
            }
            for(int k = 1;k<=2*i-1;k++)
            {
                System.out.print(n + " ");
            }
          System.out.println(" ");
        }

      //9

        for (int i= 1; i<= 5 ; i++)
        {
            for (int j=i; j <5 ;j++)
            {
                System.out.print(" ");
            }
            for (int k=1; k<=i;k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i=5; i>=1; i--)
        {
            for(int j=i; j<=5;j++)
            {
                System.out.print(" ");
            }
            for(int k=1; k<i ;k++)
            {
                System.out.print("*");
            }
            System.out.println("");

        }

        //12
        for(int i = 1;i<=5;i++)
        {
            for(int j = i;j<=5;j++)
            {
                System .out.print(n +" ");
            }
            System.out.println(" ");
        }
        for(int i = 4;i >= 1;i--)
        {
            for(int j = i;j <= 5;j++)
            {
                System.out.print(n +" ");
            }
            System.out.println(" ");
        }
    }}