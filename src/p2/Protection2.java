package p2;

import p1.Protection;

public class Protection2 extends p1.Protection{
    Protection2(){
        System.out.println("derived other package constructor");
//        class or package only
//        System.out.println("n = "+ n);
//        class or package only;
//        System.out.println("pri_n = "+pri_n);
        System.out.println("prot_n = "+ prot_n);
        System.out.println("pub_n = "+ pub_n);
    }
}

class OtherPackage {
    OtherPackage(){
        p1.Protection p = new p1.Protection();
        System.out.println("other package constructor");
        // cannot access default access variable or private variable or protected variable
        System.out.println("pub_n = "+p.pub_n);
    }
}
