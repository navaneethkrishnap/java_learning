import java.sql.SQLOutput;
import java.util.Scanner;

public class o15_subString {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String username;

        System.out.print("Please enter your email fully :");
        String email = scanner.nextLine();

        if (email.contains("@")){
            if (email.contains(".")){
                String domain = email.substring(email.indexOf("@") + 1);
                username = email.substring(0, email.indexOf("@"));

                System.out.println(username + " is your username");
                System.out.println(domain + " is your domain");
            }
            else{
                System.out.println("Your email must contain .");
            }

        }
        else{
            System.out.println("your email must contain @");
        }


        scanner.close();

    }
}
