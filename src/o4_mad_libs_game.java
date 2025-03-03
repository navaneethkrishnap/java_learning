import java.util.Scanner;

// mad libs - game where user inputs random words for fill in the blanks type story

public class o4_mad_libs_game {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String noun1;
        String verb1;
        String adjective2;
        String adjective3;

        System.out.print("Enter an adjective(description) :");
        adjective1 = scanner.nextLine();
        System.out.print("Enter an verb :");
        verb1 = scanner.nextLine();
        System.out.print("Enter an noun :");
        noun1= scanner.nextLine();
        System.out.print("Enter  adjective :");
        adjective2 = scanner.nextLine();
        System.out.print("Enter an adjective :");
        adjective3 = scanner.nextLine();


        System.out.println("Today i went to a "+ adjective1 +" zoo.");
        System.out.println("He was "+ verb1 + " fastly.");
        System.out.println("In an exhibit, I saw a "+noun1);
        System.out.println(noun1 + " was "+ adjective2 + " and "+ verb1+" !");
        System.out.println("I was "+adjective3 +" !");


        scanner.close();

    }
}
