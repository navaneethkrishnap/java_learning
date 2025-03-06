import java.util.Scanner;

public class o19_enhanced_Switches {
    public static void main(String[] args){
        // Enhanced switches == replacement to many else if statements -- java14 feature

        Scanner scanner = new Scanner(System.in);
        String day;
        System.out.print("Please enter the day: ");
        day = scanner.nextLine();

        switch(day){

            case "Monday", "Tuesday", "Wednesday" ,"Thursday","Friday"  -> System.out.println("It is a weekday");
            case "Saturday","Sunday" -> System.out.println("Is is a weekend");
            default -> System.out.println(day+ " is not a day");
        }

        scanner.close();
    }
}
