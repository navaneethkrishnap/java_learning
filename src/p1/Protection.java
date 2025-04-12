package p1;

public class Protection {
    int n = 1;
    private int pri_n = 10;
    protected int prot_n = 100;
    public int pub_n = 1000;

    public Protection(){
        System.out.println("Base constructor");
        System.out.println("n =  "+ n);
        System.out.println("pri_n "+ pri_n);
        System.out.println("prot_n "+prot_n);
        System.out.println("pub_n "+ pub_n);
    }
}


class Derived extends Protection{
    Derived(){
        System.out.println("Derived constructor");
        System.out.println("n = "+n);
        // class only accessible
        // System.out.println("pri_n "+pri_n);
        System.out.println("prot_n = "+prot_n );
        System.out.println("pub_n = "+pub_n);
    }
}

class SamePackage {
    SamePackage(){

        Protection p = new Protection();
        System.out.println("same package constructor");
        System.out.println("n = "+p.n);
        // class only
        // system.out.println("pri_n = "+ p.pri_n);

        System.out.println("prot_n = "+p.prot_n);
        System.out.println("pub_n = "+p.pub_n);

    }
}