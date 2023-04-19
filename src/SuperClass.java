public class SuperClass extends AbstractClass { // 2.1.8 Extending the abstract class with its method
    // 2.1.3 Creating variables of different types in the SuperClass
    String name = "SuperClass";
    private int privateInteger = 5;
    public int publicInteger = 6;
    protected int protectedInteger = 7;
    public void print(String str){ // Creating the "print" method

        System.out.println(str);
    }
    public void print(){ // 2.1.4 Overloading the existing "print" method
        System.out.println("SuperClass print");
    }
    public void printMessage(){ // 2.1.5 Creating a SuperClass method to later override it.
        System.out.println("This is a SuperClass");
    }
    public void printMessage2(){ // 2.1.6 Creating a method in the SuperClass to later override it
        System.out.println("This is a SuperClass");
    }

    public SuperClass(){ // 2.1.7 Creating a default constructor for SuperClass
        this("unknown");
        System.out.println("Default constructor for SuperClass call");
    }
    public SuperClass(String name){ // 2.1.7 Creating a custom constructor for SuperClass
        this.name = name;
        System.out.println("Custom constructor for SuperClass call");
    }
    public void abstractMethod(){ // 2.1.8 Implementing the abstract method in SuperClass
        System.out.println("Abstract method implementation in SuperClass");
    }

}
