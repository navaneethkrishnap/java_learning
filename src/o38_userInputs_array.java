import java.util.Scanner;

public class o38_userInputs_array  {
    public static void main(String[] args){

        //
        Scanner scanner = new Scanner(System.in);

        String[] food ; // we are setting a empty array that has a size of 3 and can include 3 elements max
        System.out.print("What # of food you would like: ");
        int size = scanner.nextInt();

        food = new String[size];

        for (int i = 0; i < food.length; i ++ ){
            System.out.print("Enter the food: ");
            food[i] = scanner.next();
        }

        System.out.println();

        // enhanced for loop
        System.out.println("Food items ordered are: ");
        for (String eachFood : food ){
            System.out.println(eachFood);
        }

        scanner.close();
    }
}
