import java.util.Scanner;

public class Math_opreation14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers 4 variables for operation: \nw = (a+b)/(c+d)+(a/c)+(b/d)");
        double a, b, c, d;
        double w;

        System.out.print("a = ");
         a = scanner.nextInt();
            while (a==0)
            {
            System.out.println("Invalid number. Try again:");
            a = scanner.nextDouble();
            }

         System.out.println("b = ");
            b = scanner.nextInt();
            while (b==0)
            {
            System.out.println("Invalid number. Try again:");
            b = scanner.nextDouble();
            }

        System.out.print("c = ");
            c = scanner.nextInt();
            while (c==0)
            {
            System.out.println("Invalid number. Try again:");
            c = scanner.nextDouble();
            }

        System.out.print("d = ");
            d = scanner.nextInt();
            while (d==0)
            {
            System.out.println("Invalid number. Try again:");
            d = scanner.nextDouble();
            }


        /*      System.out.println("Enter 5 numbers:");
        double[] tab = new double [3];
        for (int i = 0; i <= tab.length; i++) {
            tab[i] = scanner.nextInt();
        }*/


        w = (a+b)/(c+d)+(a/c)+(b/d);
            System.out.format("w = %.2f ", w);



    }
}