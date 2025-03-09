import java.util.Scanner;

public class o30_methods {
    public static void main(String[] agrs){

//        happyBirthday();
        Scanner scanner = new Scanner(System.in);

        double nums;
        int degree;
        double res;
        System.out.print("Enter the number: ");
        nums = scanner.nextDouble();
        System.out.print("Enter the degree of exponent (2 or 3): " );
        degree = scanner.nextInt();

        if(degree == 2){
            res = square(nums);
            System.out.println("result : "+res);
        } else if (degree == 3) {
            res = cube(nums);
            System.out.println("result :"+res);
        } else {
            System.out.println("please enter either 2 or 3 as degree");
        }


        scanner.close();
    }
    static void happyBirthday(){
        Scanner scanner = new Scanner(System.in);

        int x;
        String name;
        System.out.print("Enter name: ");
        name = scanner.next();
        System.out.print("Enter age: ");
        x = scanner.nextInt();
        System.out.println("Happy birthday to you!");
        System.out.println("Happy birthday to"+name+" dear you");
        System.out.println("You are "+x+" years old");
        System.out.println("Happy birthday to you");

        scanner.close();

    }
    static double square(double number){
        return number * number;
    }
    static double cube(double number){
        return number * number * number;
    }
}
