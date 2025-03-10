import java.util.Scanner;

public class o37_array_Index_Search {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] customers = {"Ben", "Navi", "Ceylon", "joe", "John", "rakesh", "shiva", "jagan", "shakthi", "arun", "manoj"};


        String target;
        System.out.print("Please enter the customer name: ");
        target = scanner.next();

        boolean found = false;
        for (int i = 0; i < customers.length; i++) {
            if (target.equals(customers[i])) {
                System.out.println("Customer index is at: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Customer doesn't exists.");
        }
        scanner.close();

    }
}

