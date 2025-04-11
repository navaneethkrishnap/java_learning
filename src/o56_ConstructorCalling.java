/*
 here we look which constructors are called first whether superclass or subclass -- only in class hierarchy

always note that: superclass constructors are used first whether we use super() or not
 */

class I{
    I(){
        System.out.println("Inside I's constructor");
    }
}
class J extends I{
    J(){
        System.out.println("Inside J's constructor");
    }
}
class K extends J{
    K(){
        System.out.println("Inside K's constructor");
    }
}

public class o56_ConstructorCalling {
    public static void main(String[] agrs){
        K k = new K();
    }

}
