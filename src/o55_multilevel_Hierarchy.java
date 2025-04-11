class Shipment extends FormWeight{
    double cost;

    Shipment(Shipment ob){
        super(ob);
        cost = ob.cost;
    }
    Shipment(double w, double h, double d, double m,double c){
        super(w,h,d,m);
        cost = c;
    }

    Shipment(){
        super();
        cost = -1;
    }
    Shipment(double len, double m, double c){
        super(len,m);
        cost = c;
    }
}
class DemoShipment{
    public static void main(String[] args){
        Shipment shipment1 = new Shipment(10,20,15,10,3.4);
        Shipment shipment2 = new Shipment(2,3,4,0.76,1.28);

        double vol;

        vol = shipment1.volume();
        System.out.println("volume of shipment 1 is : "+vol);
        System.out.println("weight of shipment 1 is : "+shipment1.weight);
        System.out.println("cost of shipment 1 is : $"+shipment1.cost);

        System.out.println();

        vol = shipment2.volume();
        System.out.println("Volume of shipment 2 is : "+vol);
        System.out.println("weight of shipment 2 is : "+shipment2.weight);
        System.out.println("cost of shipment 2 is : $"+shipment2.cost);

    }
}

public class o55_multilevel_Hierarchy {
}
