public class o39_varargs {
    public static void main(String[] args){

        System.out.println(summation(1,2,3,4,5,10 ));
        System.out.println(mean());
    }
    static int summation(int... numbers ){

        int sum = 0;

        for (int number: numbers){
            sum += number;
        }
        return sum;
    }
    static double mean(double ... numbers){

        double sum = 0;
        if (numbers.length==0){
            return 0;
        }
        double L = numbers.length;
        for (double number : numbers){
            sum += number;

        }
        return sum/L;
    }
}
