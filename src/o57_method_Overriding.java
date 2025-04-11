/*
Method overriding occurs when the names and type signatures of the 2 or more methods are identical
if they are not the two methods are simply overloaded
 */
class M{
    int i,j;

    M(int a, int b){
        i = a;
        j = b;
    }

    void show(){
        System.out.println("i and j : "+ i + " "+j);
    }
}

class N extends M{
    int k;
    N(int a, int b, int c){
        super(a,b);
        k = c;
    }
    // when you call show() this method will overrides the show() in class M
    void show(){
        // if you wish to access the show() of superclass, then use super
        super.show();
        System.out.println("k : "+ k);
    }
}
public class o57_method_Overriding {
    public static void main(String[] args){
        N subOb = new N(1,2,3);

        subOb.show();
// see for o58_method_Overriding1 for more
    }
}
