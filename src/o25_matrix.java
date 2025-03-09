import java.util.Scanner;

public class o25_matrix {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int rows;
        int cols;
        char symbol;

        System.out.print("Enter the # of rows: ");
        rows = scanner.nextInt();
        System.out.print("Enter the # of columns: ");
        cols = scanner.nextInt();
        System.out.print("Enter the Symbol (#,$,^,*): ");
        symbol = scanner.next().charAt(0);

        for(int i = 1; i <= rows; i++){
            for (int j = 1; j <= cols; j++){
                System.out.print(symbol+" ");
            }
            System.out.println();
        }



        scanner.close();


    }
}
