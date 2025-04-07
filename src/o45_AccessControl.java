class Testing{
    int a; // default access
    public int b; // public access
    private int c; // private access

    // methods to access private variables or members in java
    void setC(int i){
        c = i;
    }
    int getC(){
        return c;
    }
}
class AccessTest{
    public static void main(String[] args ){
        Testing ob = new Testing();

        ob.a = 10;
        ob.b = 20;
        // ob.c = 30; will raise you an error as it is protexted
        // you must use functions to set and get c values
        ob.setC(30);
        // above command will set the C value to 30
        System.out.println(ob.getC()); // will print the c value
    }
}

public class o45_AccessControl {
    // how a member can be accessed is determined by access modifiers in java
    // in java access modifiers are private , public and protected

}
