public class o21_continue1 {
    public static void main(String[] args){

        int i = 0;
        do {
            if (i == 3){
                i ++;
                continue;
            }
            System.out.print(i+" ");
            i++;
        } while (i<=5);

    }
}
