import java.util.Scanner;
public class o21_logical_Operators {
    public static void main(String[] args){

        // note this is dumb code did while feeling sleepy
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the temperature: ");
        double temp = scanner.nextInt();
        System.out.print("Is it raining(true or false): ");
        boolean isRaining = scanner.nextBoolean();

        if (temp >= 28 && !isRaining) {
            System.out.println("Summer is coming");
        }
        else if (temp <= 26 && isRaining ){
            System.out.println("Rain is coming");
        }
        else if (temp > 30 && isRaining){
            System.out.println("Mixed climate");
        }
        scanner.close();
    }
}
