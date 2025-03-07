import java.util.Scanner;

public class o20_simple_Calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double nums1;
        double nums2;
        char operator;
        double result = 0;
        boolean validOperation = true;

        System.out.print("Enter the number: ");
        nums1 = scanner.nextDouble();

        System.out.print("Enter the operator(+, -, *, /, ^) : ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter the number: ");
        nums2 = scanner.nextDouble();

        switch (operator){
            case '+' -> result = (nums1 + nums2);
            case '-' -> result = (nums1 - nums2);
            case '/' -> {
                    if (nums2 == 0){
                        System.out.println("You cant divide by zero");
                        validOperation = false;
                    }
                    else {
                        result = nums1 / nums2;
                    }
            }
            case '*' -> result = (nums1 * nums2);
            case '^' -> {
                if (nums2 == 0){
                    result = 1;

                } else {
                    result = Math.pow(nums1, nums2);
                }
            }
            default -> {
                System.out.println("Invalid Operator!");
                validOperation = false;
            }


        }
        if (validOperation){


            System.out.println("result :"+ result);
        }

        scanner.close();


    }
}
