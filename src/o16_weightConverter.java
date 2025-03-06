import  java.util.Scanner;

 class o16_weightConverter {
    public static void main(String[] args){
        // weight converter kg to pound or vice versa

        Scanner scanner = new Scanner(System.in);

        String uinput;
        double number = 0;
        double res;

        System.out.print("Please enter the unit (kgs/ibs) :");
        uinput = scanner.nextLine();
        if(uinput.equals("kgs") || uinput.equals("ibs")){
            System.out.printf("Please enter How many the units of %s needs to be converted :", uinput);
            number = scanner.nextDouble();
            if (uinput.equals("kgs")){
                res = number * 2.20462;
                System.out.printf("The weight is %.2f pounds",res);
            }
            else {
                res = number * 0.453592;
                System.out.printf("The weight is %.2f kilograms",res);
            }

        } else {
            System.out.println("Please enter valid unit name either 'kgs or ibs'.");
        }
        












        scanner.close();
    }
}
