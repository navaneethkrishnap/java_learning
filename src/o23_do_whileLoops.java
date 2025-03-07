public class o23_do_whileLoops {
    public static void main(String[] args){
        int i = 0;

        do {
            System.out.println(i);
            i++;
        }
        while(i<5);

        // if the condition is false, only prints once no matter if it is false.
        int x = 0;
        do {
            System.out.println("Last print");
            x ++;
        }
        while( x < 0);
    }
}
