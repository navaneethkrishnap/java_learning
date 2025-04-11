class X{
    int i;
}
class Y extends X{
    int i; // this instance var of subclass will hide int i variable of same name in superclass X

    Y(int a, int b){
        super.i = a; // this is referring to class A
        i = b; // this is class B member
    }

    void show(){
        System.out.println("i in superclass : "+ super.i);
        System.out.println("i in subclass : "+ i);
    }
}
public class o54_super1 {
    public static void main(String[] args){
        Y subOb = new Y(2,4);
        subOb.show();
    }
}
