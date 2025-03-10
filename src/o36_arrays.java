import java.util.Arrays;
public class o36_arrays {
    public static void main(String[] args){

        String[] essentials = {"job", "home", "food", "clothes", "vehicle", "savings","investments", "family", "friends", "health", "peace"};
        int L = essentials.length;
        for ( int i = 0; i < L; i++){
            System.out.println(essentials[i]);
        }

        System.out.println();

        // alternate -- enhanced for loop
        Arrays.sort(essentials);
        for ( String essential : essentials){
            System.out.println(essential);
        }
    }
}
