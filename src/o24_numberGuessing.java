import java.util.Scanner;
import java.util.Random;

public class o24_numberGuessing {
    public static void main(String[] args){
        Random random  = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int randomNumber = random.nextInt(1,11);


        System.out.println("Number guessing game");
        System.out.println("Guess a number from 1-10");

       do{
           System.out.print("Enter a number: ");
           guess = scanner.nextInt();
           attempts++;

           if(guess < randomNumber){
               System.out.println("TOO LOW, TRY AGAIN!");
           }
           else if(guess > randomNumber){
               System.out.println("TOO HIGH, TRY AGAIN!");
           }
           else{
               System.out.println("CORRECT! The number was "+randomNumber);
               System.out.println("# of attempts "+ attempts);
           }

       } while(guess != randomNumber);

        System.out.println("You have won");
    }
}


