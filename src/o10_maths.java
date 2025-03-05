import java.util.Scanner;

public class o10_maths {
    public static void main(String[] args){
        // built in constant of math class
//        System.out.println(Math.PI); // Pi
//        System.out.println(Math.E); // Euler number
//
//        double result;
//        result = Math.pow(2, 5);
//        System.out.println(result);
//
//        int result1 = Math.abs(-5);
//        System.out.println(result1);
//
//        double result2 = Math.sqrt(81);
//        System.out.println(result2);
//
//        double result3 = Math.ceil(81.99);
//        System.out.println(result3);
//
//        double result4 = Math.floor(81.99);
//        System.out.println(result4);
//
//        double result5 = Math.round(81.99);
//        System.out.println(result5);
//
//        int maxmin = Math.max(20,30);
//        System.out.println(maxmin);
//
//        int minmax = Math.min(20,30);
//        System.out.println(minmax);

        // TO find hypotenuse
        // c = Math.sqrt(a^2 + b^2)
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;


        System.out.print("Please enter A side length :");
        a = scanner.nextInt();
        System.out.print("Please enter B side length :");
        b = scanner.nextInt();
        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.println("the hypotenuse of C side is :"+c);

        scanner.close();

    }
}
