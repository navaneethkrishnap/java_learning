class UseStatic{
    static int a = 3;
    static int b;

    static void meth(int x){
        System.out.println("x = "+x);
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
    static{
        System.out.println("Static block initialised");
        b = a * 4;
    }
    // commeneted it because of 2 main();
//    public static void main(String[] args){
//        meth(42);
//    }
}

class StaticDemo{
    static int a = 43;
    static int b = 99;

    static void callme(){
        System.out.println("a = "+a);
    }
}

public class o47_static {
    public static void main(String[] args){
        StaticDemo.callme();
        System.out.println("b = "+StaticDemo.b ); // StaticDemo.b = access and outputs the variable becuase it is static

    }
}
