import java.util.Scanner;

public class o35_recursion {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int input;
        System.out.print("Please enter n number for summation: ");
        input = scanner.nextInt();
        int result = sum(input);
        System.out.println("summation: "+result);

    }
    public static int sum(int k){
        if (k > 0){
            return k + sum(k-1);
        } else {
            return 0;
        }
    }
}
