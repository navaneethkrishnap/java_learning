class Box{
    double width;
    double height;
    double depth;

    Box(double w, double h, double d){
        this.width = w;
        this.height = h;
        this.depth = d;

    }
    Box(){
        width = height = depth = -1;
    }

    Box(double len){
        width = height = depth = len;
    }

    double volume(){
        return width * height * depth;
    }
}

public class o42_constructors {
  public static void main(String[] args){
      Box mybox1 = new Box(2,4,8);
      Box mybox2 = new Box();
      Box mybox3 = new Box(3);

      double vol;
      vol = mybox1.volume();
      System.out.println("Volume of mybox1 is : " + vol);
      vol = mybox2.volume();
      System.out.println("Volume of mybox2 is : " + vol);
      vol = mybox3.volume();
      System.out.println("Volume of mybox3 is : " + vol);

  }
}

// you can also use objects as parameters
