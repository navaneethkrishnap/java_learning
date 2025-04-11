class Form{
    private double width;
    private double height;
    private double depth;

    Form(Form ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Form(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
    Form(double len){
        width = height = depth = len;
    }
    Form(){
        width = height = depth = -1;
    }

    double volume(){
        return height * width * depth;
    }

}
class FormWeight extends Form{
    double weight;

    FormWeight(FormWeight ob){
        super(ob);
        weight = ob.weight;
    }

    FormWeight(double w, double h, double d, double m){
        super(w,h,d);
        weight = m;
    }

    FormWeight(){
        super();
        weight = -1;
    }

    FormWeight(double len, double m){
        super(len);
        weight = m;
    }
}

public class o53_super {
    public static void main(String[] args){
        FormWeight form1 = new FormWeight(10,20,15,34.3);
        FormWeight form2 = new FormWeight(2,3,4,0.076);
        FormWeight form3 = new FormWeight(); // default
        FormWeight form4 = new FormWeight(3,2);
        FormWeight cube = new FormWeight(form1);
        double vol;

        vol = form1.volume();
        System.out.println("Volume of form1 is "+ vol);
        System.out.println("Weight of form1 is "+form1.weight);

        System.out.println();

        vol = form2.volume();
        System.out.println("Volume of form2 is "+vol);
        System.out.println("Weight of form2 is "+form2.weight);

        System.out.println();

        vol = form3.volume();
        System.out.println("Volume of form3 is "+vol);
        System.out.println();

        vol = form4.volume();
        System.out.println("Volume of form4 is "+vol);
        System.out.println("Weight of form4 is "+form4.weight);
        System.out.println();

        vol = cube.volume();
        System.out.println("Volume of cube is "+vol);
        System.out.println("Weight of cube is "+cube.weight);

    }
}
