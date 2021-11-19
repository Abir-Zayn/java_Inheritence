class a{
    public static int i,j;

    public void showij(){
        System.out.println("i: "+i +" and j: "+j);
    }
}

class b extends a{
    public static int k;

    public void show(){
        System.out.println("k : "+k);
    }
    public void sum(int i, int j, int k){
        System.out.println("Sum of i,j,k: "+(i+j+k)); // accessing public variable of parent class a
    }
}

public class Basics {
    public static void main(String[] args) {
        a superclass =new a();
        b subclass= new b();

        // The Superclass may be used by itself( Accessing it with reference)
        a.i = 12;
        a.j = 12;
        superclass.showij();

        //The subclass has access to all public members of its superclass
        b.i=10;
        b.j=11;
        b.k=15;
        subclass.showij();
        subclass.sum(b.i, b.j, b.k);

    }
}
