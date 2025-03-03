import java.util.Scanner;

public class o3_rectangle_area {
    public static void main(String[] args){

//        calculate the area of a rectangle
        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width :");
        width = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter the height :");
        height = scanner.nextDouble();
        scanner.nextLine();

        area = width * height;
        System.out.print("The area is "+ area +" cm^2");

        scanner.close();

    }
}
