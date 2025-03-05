import java.util.Scanner;

public class o13_nested_if {
    public static void main(String[] args){

        // nested if statements

        // if somebody is on training and employee then they get combined discount of 35%
        // if somebody is on just training - only 10%
        // if somebody is just an employee - 20% discount

        Scanner scanner = new Scanner(System.in);

        boolean training;
        boolean employee;

        System.out.print("Are you on training?(true/false) :");
        training = scanner.nextBoolean();
        System.out.print("Are you a employee here? (true/false) :");
        employee = scanner.nextBoolean();
        double price = 199.99;

        if (training){

            if(employee){
                System.out.println("You get a disount of 30%");
                price *= 0.7;

            }
            else {
                System.out.println("You get a training discount of 10%");
                price  *=  0.9;
            }

        }
        else {

            if(employee){
                System.out.println("You get a senior discount of 20%");
                price *= 0.8;
            }
            else {
                price *= 1;
            }
        }
        System.out.printf("The price of a ticket is: Rs%.2f", price);


        scanner.close();


    }
}
