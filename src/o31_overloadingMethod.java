public class o31_overloadingMethod {
    public static void main(String[] args){

        // mutliple methods having same names but different numbers of parameters =-- overloading
        int nums1 = sum(10,10);
        double nums2 = sum(10.00, 19.999);
        System.out.println("int "+nums1);
        System.out.println("double "+nums2);
    }
    static int sum(int x, int y){
        return x + y;
    }
    static double sum(double x, double y){
        return x + y;
    }
}
