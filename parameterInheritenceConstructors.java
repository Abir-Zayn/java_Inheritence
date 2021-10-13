package Inhertience;



class value{
	public value() {
		System.out.println("value class one");
		System.out.println("No values Assign");
//		System.out.println("");
		
	}
	public value(double x) {
		System.out.println("value class one");
		System.out.println("Single Values asssigned "+x );
	//	System.out.println("");
	}
	public value(double x, double y) {
		System.out.println("value class one");
		System.out.println("Double Values Assigned are in value1 Class "+x +" and "+y);
	//	System.out.println("");
	}
}






class valueTwo extends value{
	public valueTwo() {
		System.out.println("value class Two ");
		System.out.println("No values Assigned");
	//	System.out.println("");
	}
	public valueTwo(double x) {
		super();
		System.out.println("Value class two");
		System.out.println("values are x: "+x);
	}
	public valueTwo(double x, double y) {
		super(x);
		System.out.println("value class two");
		System.out.println("values are x "+x +" and "+y);
//		System.out.println("");
	}
	public valueTwo(double x, double y,double z) {
		super(x, y);
		System.out.println("value class two");
		System.out.println("Values are x: "+x+ " and y: "+ y +" and z: "+z);
		// System.out.println("");
	}
}





public class parameterInheritenceConstructors {
 public static void main(String[] args) {
	 
		 
	 valueTwo val=new valueTwo(2);
	 System.out.println("");
	  
	 valueTwo valu= new valueTwo(3,4);
	 System.out.println("");
	 
	 valueTwo va=new valueTwo(5,6,7);
	 System.out.println("");
	 
}
}
