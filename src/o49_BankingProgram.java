import java.util.Scanner;
public class o49_BankingProgram {

    static Scanner scanner = new Scanner(System.in);



    public static void main(String[] args){
        // Declare variables



        double balance = 100;
        boolean isRunning = true;
        int choice;

        while(isRunning){
            System.out.println("***************");
            System.out.println("BANKING PROGRAM");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit Amount");
            System.out.println("3. Withdraw Amount");
            System.out.println("4. Exit");
            System.out.println("***************");
            System.out.println();
            System.out.print("Enter your choice from 1-4: ");

            choice = scanner.nextInt();

            switch(choice){
                case 1 -> showBalance(balance);
                case 2 -> balance = balance + deposit();
                case 3 -> balance = balance - withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE");
            }




        }

        System.out.println("***************");
        System.out.println("Thank you for banking with us. Have a nice day!");
        scanner.close();
    }

    static void showBalance(double balance){
        System.out.println("**** BALANCE ****");
        System.out.printf("$%.2f\n", balance);
//        System.out.println();
    }
    static double deposit(){
        double amount;
        System.out.print("Enter an amount to be deposited: ");
        amount = scanner.nextDouble();

        if(amount < 0){
            System.out.println("Amount cannot be negative");
            return 0;
        }
        else {
            return amount;
        }

    }
    static double withdraw(double balance){

        double amount;
        System.out.print("Enter amount to be withdrawn: ");
        amount = scanner.nextDouble();

        if(amount > balance){
            System.out.println("Insufficient balance.");
            return 0;
        }
        else if(amount < 0){
            System.out.println("Amount cannot be negative.");
            return 0;
        }
        else {
            return amount;
        }


    }
}
