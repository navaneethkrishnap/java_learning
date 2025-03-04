import java.util.Scanner;

public class o8_if_Statements {
    public static void main(String[] args){
        // If Statements and Boolean variables
        int age; //23 -- my age while learning java
        String name;
        boolean isStudent;


        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        name = scanner.nextLine();
        if (name.isEmpty()){
            System.out.println("You didn't enter your name");
        } else {
            System.out.println("Hello "+name+" !");
        }

        System.out.print("Please enter your age: ");
        age = scanner.nextInt();

        System.out.print("Are you a student?(true/false) :");
        isStudent = scanner.nextBoolean();

        if (isStudent){
            System.out.println("You are a student");
        } else{
            System.out.println("You are not a student");
        }



        if (age >= 25){
            System.out.println("You are at peak competition now");
        }
        else if (age < 0) {
            System.out.println("You haven't been born yet da");
        }
        else if (age == 0){
            System.out.println("You are just born");
        }
        else if (age > 50){
            System.out.println("Enough now enjoy life");
        }
        else if (age > 1){
            System.out.println("You are reaching competition");
        }
        else {
            System.out.println("I cannot say it, go find it yourself");
        }

        scanner.close();


    }
}
