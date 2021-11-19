class box{
    double weight,height,depth;


    // Constructors used when all dimension specified
    public box(double weight,double height, double depth){
        this.weight = weight;
        this.height = height;
        this.depth = depth;
    }

    //When no value is passed.
    public box(){
        System.out.println("Nothing Specified");
    }


    //calculating volume of a box
    public double volume(){
        return weight*height*depth;
    }
}
class boxweight extends box {
    double width;



    public boxweight(double w,double h,double d,double m) {
        weight=w;
        height=h;
        depth=d;
        width=m;
    }
}

public class DemoBox {
    public static void main(String[] args) {
        boxweight b1=new boxweight(12,10,9,11);
        boxweight b2=new boxweight(10,8,6,1);

        double vol,volx;
        vol=b1.volume();
        volx=b2.volume();
        System.out.println("Volume of Box1 "+vol);
        System.out.println("Volume of Box2 "+volx);

    }
}
