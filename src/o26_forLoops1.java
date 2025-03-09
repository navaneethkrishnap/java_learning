import java.util.Scanner;

public class o26_forLoops1 {
    public static void main(String[] args){
        // sum of n natural numbers;

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int n = 0;
        System.out.print("Enter the n number to be summed up: ");
        n = scanner.nextInt();

        for(int i = 0; i <= n ;i++) {
            sum += i; // sum = sum + i
        }
        System.out.println("Sum of first "+n+" natural numbers is "+sum);


        scanner.close();

        }
    }

