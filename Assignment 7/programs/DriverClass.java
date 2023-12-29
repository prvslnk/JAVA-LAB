
/*  Create a Package mypack which contains one class Display where constructor will print the the data which it will be received. The data may be int, float, int[], String, String[].
Design a driver class outside the package where Display class of mypack will be imported. 
When object of Display class will be created it will call respective constructor. Demonstrate 
all the constructors in driver class.
 */
import mypack.Display;

public class DriverClass {
    public static void main(String[] args) {
        // Demonstrate different constructors of Display class
        Display display1 = new Display(42);
        Display display2 = new Display(3.14f);
        Display display3 = new Display(new int[] { 1, 2, 3, 4, 5 });
        Display display4 = new Display("Hello, World!");
        Display display5 = new Display(new String[] { "Java", "is", "fun" });

        // You can create and use more Display objects as needed
    }
}
