class base{
 public int x;
    base(){
     System.out.println("The value of x will be store here");
 }

 base (int a){
     x = a;
     System.out.println("The value of x is "+x);

 }
}

class modified extends base{
    public int y;

    modified() {
        System.out.println("The value of Y will be store here");
    }
    modified(int a, int b){
        super(a);
        System.out.println("The value of x and y is "+ a+" & "+ b);
    }
}

class mod extends modified {
    public int z;
    mod() {
        System.out.println("The value of Z will be store here");
    }
    mod(int a,int b, int c){
        super(a, b);
        System.out.println("The value of x,y,z will be "+a+" "+b+" "+c);
    }
}



public class test {
    public static void main(String[] args) {
        mod m=new mod(2,5,3);
    }
}
