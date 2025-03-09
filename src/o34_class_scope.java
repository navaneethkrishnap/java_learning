public class o34_class_scope {
    static String why = "This is Class scope";
    static int i = 1000000000;
    public static void main(String[] args){
        int i = 1;
        checking();
    }
    static void checking(){

        int i = 100;

        // if you don't have any variable called i in locally
        // then it will print class variable --- static int i = 100000000;
        System.out.println(i);
        System.out.println(why);
    }
}
