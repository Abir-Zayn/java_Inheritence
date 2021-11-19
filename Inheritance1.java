
class base{
    public  int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("Im in the base sector and This gonna Modify the X");
        this.x = x;
    }

}
class derived extends base{
    public int getY() {
        System.out.println("Im in the derived sector.This gonna modify the Y");
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int y;
}

public class testinheritanceOne {
 public static void main(String[] args) {


    derived d=new derived() ;
    d.setY(10);
    d.setX(7);
    System.out.println(d.getX());
    System.out.println(d.getY());

 }
}
