public class SubClass extends SuperClass {
    // 2.1.3 Trying to use public, private and protected variables in the subclass
    public void printPrivate(){
//      System.out.println(privateInteger); // Cannot use as private variables are invisible outside the class they belong to
    }
    public void printPublic(){
        System.out.println(publicInteger);

    }
    public void printProtected(){
        System.out.println(protectedInteger);
    }
    public void print(int integer){ // 2.1.4 Overloading the SuperClass "print" method inside a SubClass
        System.out.println(integer);
    }
    @Override
    public void printMessage(){ // 2.1.5 Overriding a SuperClass method inside its child method
        System.out.println("This is a SubClass");
    }
    public void printMessage2(){ // 2.1.6 Overriding a SuperClass method inside its child method but using the "super" keyword to call the original method
        super.printMessage2();
        System.out.println("This is a SubClass");
    }
    public SubClass(){ // 2.1.7 Adding SubClass constructor that calls the SuperClass default constructor using super
        super();
        System.out.println("Default constructor for SubClass call");
    }
    public SubClass(String name){ // 2.1.7 Adding SubClass constructor that calls the SuperClass custom constructor using super
        super(name);
        System.out.println("Custom constructor for SubClass called");
    }
}
