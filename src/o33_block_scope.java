public class o33_block_scope {
    public static void main(String[] args){
        // block scope is declared within blocks of codes like loops or if statments or just {} curly brackets
        // code cannot access or use x here
        {
            // code cannot access x or use here
            int x = 200;
            // code can access or use x here
            System.out.println(x);
        }
        // code cannot access or use x here
//        System.out.println(x);
    }
}
