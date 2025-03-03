import java.util.Scanner;

public class o2_Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("What is your CGPA? ");
        double cgpa = scanner.nextDouble();

        System.out.print("Are you a student (true/false) :");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello, "+name+"!");
        System.out.println("You are "+age+" years old");
        System.out.println("Your Cgpa is "+cgpa);
//        System.out.println("Student "+isStudent);

        if (isStudent){
            System.out.println("You are a student");
        }
        else {
            System.out.println("You are not a student");
        }
        if (cgpa < 7 ){
            System.out.println("You are not eligible for the job");
        }
        else {
            System.out.println("You are eligible for the job as your cgpa is "+cgpa+" more than our requirement");
        }

        // COMMON ISSUES
        System.out.print("Enter your age: ");
        int age_o1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter your fav color ");
        String color = scanner.nextLine();

        System.out.println("You are "+age_o1+ " years old");
        System.out.println("You like "+ color + " color");
        scanner.close();
    }
}
