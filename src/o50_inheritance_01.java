class A{
    int i,j;
    private int n;

    void setij(int x, int y){
        i = x;
        j = y;
    }
    void showij(){
        System.out.println("i and j : "+ i+" "+j );
    }
}
class B extends A{
    int k;

    void showk(){
        System.out.println("K: "+k);
    }
    void sum(){
        System.out.println("i + j+ k : "+  (i+j+k));
    }
}

public class o50_inheritance_01 {
}
