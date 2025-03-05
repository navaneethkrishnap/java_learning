public class o11_printf {
    public static void main(String[] args){
        // printf prints formatted text to the console

        String name = "Thomas";
        char firstLetter = 'T';
        int age = 65;
        double height = 4.1;
        Boolean isCartoon = true;

        // % sign is a placeholder for our variable
        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name first letter is %c\n", firstLetter);
        System.out.printf("Age is %d\n", age);
        System.out.printf("Height is %f\n", height);
        System.out.printf("Cartoon : %b\n", isCartoon);

        System.out.printf("%s is %d years old \n", name, age);
        System.out.printf("%s height is %f inches", name, height);
    }
}
