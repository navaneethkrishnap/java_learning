import java.util.Scanner;

public class o17_ternary_Operators {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("please enter the score to assess P/F: ");
        int score = scanner.nextInt();

        String passOrFail = (score >= 30) ? "Pass" : "Fail";

        System.out.printf("Result : %s ", passOrFail);

        scanner.close();
    }
}
