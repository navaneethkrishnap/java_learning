public class o40_2d_Arrays {
    public static void main(String[] args){

        int[][] multi_array = {{1,2,3,4},{5,6,7,8}};

        for (int i = 0; i < multi_array.length; i++){
            for (int j = 0; j < multi_array[i].length; j++){
                System.out.print(multi_array[i][j]+" ");

            }
            System.out.println();
        }
    }
}
