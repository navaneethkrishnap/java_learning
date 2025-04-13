class IFTest3 {
    public static void main(String[] args){
        IntStack mystack; // interface reference variable
        DynStack ds = new DynStack(5);
        FixedStack fs = new FixedStack(8);

        mystack =  ds; // load dynamic stack
        for (int i = 0; i < 12; i++) mystack.push(i);

        mystack = fs;
        for (int i = 0; i < 8; i++) mystack.push(i);

        mystack = ds;
        System.out.println("Values in Dynamic Stack :");
        for (int i = 0; i < 12; i++) mystack.pop();

        mystack = fs;
        System.out.println("Values in Fixed Stack :");
        for (int i = 0; i < 8; i++) mystack.pop();
    }
}
