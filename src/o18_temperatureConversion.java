import java.util.Scanner;

public class o18_temperatureConversion {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double input;
        double res;
        String unit;

        System.out.print("Enter the temperature: ");
        input = scanner.nextDouble();

        System.out.print("Convert to Celsius/Farenhiet: ");
        unit = scanner.next().toUpperCase();

        // (condition) ? true : false

        res = (unit.equals("C")) ? (input - 32) * 5 / 9 : (input * 5 / 9 ) + 32 ;

        System.out.printf("%.3f %s", res, unit);

        scanner.close();

    }
}
