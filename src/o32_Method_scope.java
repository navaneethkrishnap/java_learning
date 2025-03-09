public class o32_Method_scope {
    public static void main(String[] args){
        // Method scope is also called Local scope
        // code cannot use or access x here

        int x = 100;

        // code can use or access x here after
        System.out.println(x);

    }
}
