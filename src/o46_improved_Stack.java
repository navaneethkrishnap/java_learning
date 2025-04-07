 class Stack1 {
    private int [] stck ;
    private int tos;

    Stack1(int size){
        stck = new int[size];
        tos = -1;
    }

    void push(int a){
        if (tos >= stck.length - 1){
            System.out.println("Stack is full.");
        }
        else {
            stck[++tos] = a;
        }
    }

    int pop(){
        if(tos<0){
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            return stck[tos--];
        }
    }
 }


 class TestStack1 {
    public static void main(String[] args){
        Stack1 mystack3 = new Stack1(10);
        Stack1 mystack4 = new Stack1(10);

        // push some numbers into stack
        for(int i = 0; i<10; i++){
            mystack3.push(i);
        }
        for(int i = 0; i <10; i++){
            mystack4.push(i);
        }
        // these are not legal or possible which will lead to raise in error
        // mystack3.tos = 2;
        // mystack4.stck[4] = 100;
    }
}



public class o46_improved_Stack {
}
