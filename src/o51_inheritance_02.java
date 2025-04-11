class Rectangle{
    double width, height, depth;

    Rectangle(Rectangle ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    Rectangle(double w, double h, double d){
        width = height = depth = -1;
    }

    Rectangle(double len){
        width = height  = depth = len;
    }

    double volume(){
        return width * height * depth;
    }

}

class RecWeight extends Rectangle {
    double weight;

    RecWeight(double w, double h, double d, double m){
        super(w, h, d);
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}

public class o51_inheritance_02 {
    public static void main(String[] agrs){
        RecWeight ob1 = new RecWeight(10,20,15,3);
        RecWeight ob2 = new RecWeight(2,3,4,5);
        double vol;

        vol = ob1.volume();
        System.out.println("Volume of ob1 is : "+vol);
        System.out.println("Weight of ob1 is : "+ob1.weight);
        System.out.println();
        vol = ob2.volume();
        System.out.println("Volume of ob2 is : "+vol);
        System.out.println("Weight of ob2 is : "+ ob2.weight);


    }
}
