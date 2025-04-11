class MA{
    int i,j;

    MA(int a, int b){
        i = a;
        j = b;
    }
    void show(){
        System.out.println("i and j : "+ i +" "+j);
    }
}

class NA extends MA{
    int k;

    NA(int a, int b, int c){
        super(a,b);
        k = c;
    }
    // overload show
    void show(String msg){
        System.out.println(msg + k);
    }

}

public class o58_method_Overriding1 {
    public static void main(String[] args){
        NA subOb = new NA(3,2,1);

        subOb.show("This is K :");
        subOb.show(); // this calls show() in MA
    }
}
