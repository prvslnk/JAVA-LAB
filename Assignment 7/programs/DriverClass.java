import mypack.Display;

public class DriverClass {
    public static void main(String[] args) {
        Display display1 = new Display(42);
        Display display2 = new Display(3.14f);
        Display display3 = new Display(new int[] { 1, 2, 3, 4, 5 });
        Display display4 = new Display("Hello, World!");
        Display display5 = new Display(new String[] { "Java", "is", "fun" });
    }
}
