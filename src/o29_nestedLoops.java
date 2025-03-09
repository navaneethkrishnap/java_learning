public class o29_nestedLoops {
    public static void main(String[] args){
        // simple matrix
//        for (int i = 1; i <= 5; i++){
//            System.out.print(i+ " ");
//        }
//        System.out.println();
//        for (int i = 1; i <= 5; i++){
//            System.out.print(i+ " ");
//        }
//        System.out.println();
//        for (int i = 1; i <= 5; i++){
//            System.out.print(i+ " ");
//        }
//        System.out.println();
//        for (int i = 1; i <= 5; i++){
//            System.out.print(i+ " ");
//        }
        // instead of doing this we can use nested loop for efficiently printing matrices

        for (int i = 1; i <= 4; i++){
            for (int j = 1; j <= 5; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
