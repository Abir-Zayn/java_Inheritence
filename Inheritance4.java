class superclass{

    superclass(){
        System.out.println("New Student Enrolled");
    }
    superclass(int a){
        System.out.println("New Student id is "+a);
    }
}

class subclass extends superclass{

    // super class inherits the default constructors that has parameterized of parent class.
    subclass(){
        super(1001);
        System.out.println("Please take your seat in the classroom");
    }
}

public class ConstructorsInheritance {
    public static void main(String[] args) {
        subclass s=new subclass();
        // Here what happen?
        /* In parent class there were two constructors ,One of them has no parameter.Other one has parameter.In subclass
        at default constructors by using super It's actually ignore the default constructors of parents class and call
        the parameterized constructors of superclass.*/
    }
}
