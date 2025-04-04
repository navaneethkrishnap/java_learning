class Stack{
    int[] stck;
    int tos;

    Stack(int size){
        stck = new int[size];
        tos = -1;
    }

    void push(int newItem){
        if (tos == stck.length - 1){
            System.out.println("Stack is full.");
        }
        else {
            stck[++tos] = newItem;
        }
    }
    int pop(){
        if (tos < 0){
            System.out.println("Stack underflow.");
            return 0;
        }
        else return stck[tos--];

    }

  /*
You cannot index an object of a class.
Your mystack1 is an instance of the Stack class — not an array,
even though it contains an array internally (stck).
  */

    int getData(int index){
        if (index >= 0 && index <= tos){
            return stck[index];
        }
        else {
            System.out.println("Invalid index");
            return -1;
        }
    }
}
public class o44_stack {
    public static void main(String[] agrs){
        Stack mystack1 = new Stack(10);
        Stack mystack2 = new Stack(10);

        for (int i = 0; i < 10; i++) mystack1.push(i);
        for (int i = 10; i < 20; i++) mystack2.push(i);

        System.out.println("Data in index is " + mystack1.getData(0));

//        System.out.println("Stack in mystack1:");
//        for (int i = 0; i <10; i++){
//            System.out.println(mystack1.pop());
//        }
//
//        System.out.println("Stack in mystack2.");
//        for (int i = 0; i < 10; i++){
//            System.out.println(mystack2.pop());
//        }
    }
}
