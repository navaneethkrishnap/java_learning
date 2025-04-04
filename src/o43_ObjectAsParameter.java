class Test{
    int a,b;

    Test(int i,int j){
        this.a = i;
        this.b = j;
    }

    // return true if it is equal to the invoking object
    boolean isEqual(Test object){
        if (this.a == object.a && this.b == object.b){
            return true;
        }
        else {
            return false;
        }
    }
}

public class o43_ObjectAsParameter {
    public static void main(String[] args){
        Test obj1 = new Test(100,20);
        Test obj2 = new Test(100,20);
        Test obj3 = new Test(20,40);

        System.out.println("Checking whether objects parameters are equal");
        System.out.println("Obj1 parameters is equal to obj2 : "+obj1.isEqual(obj2));
        System.out.println("Obj2 parameters is equal to obj3 : "+obj2.isEqual(obj3));

    }
}
