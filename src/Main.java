public class Main{
    public static void main(String[] args) {
        SubClass sub = new SubClass(); // 2.1.1 Creating an instance of subclass
        SuperClass a = new SubClass(); // 2.1.2 Subclass as superclass. This can be done because SubClass object is also a SuperClass object(because it extends it) so we can assign it to a type of variable SuperClass
        SuperClass b = new SuperClass(); // Creating a new SuperClass instance to be used in 2.1.5
        System.out.println(a.getClass()); // 2.1.2 Printing result of getClass().

        System.out.println();
        System.out.println(); // Making space
        System.out.println();

        sub.print();
        sub.print(5); // 2.1.4 Call for overloaded methods
        a.print("A");

        System.out.println();
        System.out.println(); // Making space
        System.out.println();

        b.printMessage(); // 2.1.5 Calling for the method inside the SuperClass(not overriden)
        sub.printMessage(); // 2.1.5 Calling for the method inside the SubClass(overriden)

        System.out.println();
        System.out.println(); // Making space
        System.out.println();

        sub.printMessage2(); // 2.1.6 Calling the overriden method with a keyword super, outputs both messages from SuperClass and SubClass

        System.out.println();
        System.out.println(); // Making space
        System.out.println();

        SubClass c = new SubClass("SubClass"); // Demonstrating the use of SuperClass custom constructor in SubClass
        SubClass d = new SubClass(); // Demonstrating the use of the default SuperClass constructor in SubClass

        System.out.println();
        System.out.println(); // Making space
        System.out.println();

        SubClass object = new SubClass();
        object.abstractMethod();
    }
}