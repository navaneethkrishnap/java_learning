// even interface can inherits another interface by using "entends" keyword
interface O {
    void meth1();
    void meth2();
}
interface P extends O{
    void meth3();
}
class MyClass implements P{
    public void meth1(){
        System.out.println("meth1() implementation from interface 1");
    }
    public void meth2(){
        System.out.println("meth2() implementation from interface 2");
    }
    public void meth3(){
        System.out.println("meth3() implementation from interface 3");
    }
}
public class o61_interface_extra {
    public static void main(String[] args){
        MyClass ob = new MyClass();
        ob.meth1();
        ob.meth2();
        ob.meth3();
    }
}
