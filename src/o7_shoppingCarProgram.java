import java.util.Scanner;

public class o7_shoppingCarProgram {
    public static void main(String[] args){
        // SHOPPING CART PROGRAM

        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double totalCost;

        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();

        System.out.print("What is the price of each "+ item+" ?: ");
        price = scanner.nextDouble();

        System.out.print("What is the total quantity you purchased?: ");
        quantity = scanner.nextInt();
        totalCost = quantity * price;
        System.out.println("TOTAL COST:"+totalCost);

        scanner.close();
    }
}
