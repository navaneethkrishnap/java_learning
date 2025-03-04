import java.util.Random;
import java.util.Scanner;

public class o9_randomNumbers {
    public static void main(String[] args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int nums = random.nextInt(1,7);
        int guess;

        System.out.println("This is guessing game, if you correctly guess the number that randomly generates you win");
        System.out.print("Input the number between 1 and 6 here -->> ");
        guess = scanner.nextInt();

        if (nums == guess){
            System.out.println("You got it correct");
        } else{
            System.out.println("Better luck next time");
        }
    }
}
