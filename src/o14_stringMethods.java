public class o14_stringMethods {
    public static void main(String[] args){
        String name = "Navaneeth Krishnan";

        int length = name.length();
        System.out.println(length); // outputs 18 including whitespaces
        char letter = name.charAt(0); // pass index number
        System.out.println(letter);
        int index = name.indexOf(" ");
        System.out.println(index);
        int lastIndex = name.lastIndexOf("K");
        System.out.println(lastIndex);

        name = name.toUpperCase();
        System.out.println(name);
        name = name.toLowerCase();
        System.out.println(name);

        // to remove whitespace before outputs
//        name = name.trim()

        name = name.replace("n", "N");
        System.out.println(name);

//        System.out.println(name.isEmpty()); // will return false


    }
}
