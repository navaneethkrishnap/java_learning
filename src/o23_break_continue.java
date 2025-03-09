public class o23_break_continue {
    public static void main(String[] args){
        for(int i = 0; i <= 10; i++ ){
            if (i == 3){
                continue;
            }
            if (i==7){
                break;
            }
            System.out.print(i+" ");
        }
    }
}
