interface Callback {
    void callback(int param);
}

class Client implements Callback {
    // when you implement an interface method, it must be declared as publlic
    public void callback(int p){
        System.out.println("callback called with "+p);
    }

    // it is also common for classes that implement interfaces to define additional members of their own
    void non_InterfaceMethod(){
        System.out.println("Classes that implement interfaces may also defines other members too");
    }
}

public class o59_interface {
    public static void main(String[] args){
        Callback c = new Client();
        // variable c is declared as interface type Callback yet was assigned an instance of Client
        c.callback(100);
        // c -> cannot access any other members of Client class, an interface reference variable has only knowledge of
        // of the methods declared by its interface declarations
        // thus c cannot access non_InterfaceMethod() since it is defined by Client but not Callback
    }
}
