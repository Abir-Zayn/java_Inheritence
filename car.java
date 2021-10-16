package overriding;

//method overriding Example 1

class Cars{
	public void  start() {
		System.out.println("car is Started.");
	}
	public void accelarate() {
		System.out.println("Car is Accelarated");
	}
	public void changeGear() {
		System.out.println("Gear is changed succesfully.");
	}
}


class luxuryCar extends Cars{
	public void changeGear() {
		System.out.println("Automatic Gear");
	}
	public void openRoof() {
	  System.out.println("Sun roof verified and installed succesfully.");
	}
	public void nitroBoost() {
		System.out.println("Nitrobost available.");
	}
}


public class car {

	public static void main(String[] args) {
	
		luxuryCar c= new luxuryCar();
		c.start();
		c.accelarate();
		c.changeGear();
		
		/* Here first two method is called from sup class,When you create an object of
		 of child class and call overridden method ,then the method of child class will be call.
		*/

	}

}
