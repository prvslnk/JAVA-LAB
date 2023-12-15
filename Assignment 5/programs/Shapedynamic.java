class Point {
    private double xCo, yCo;

    public Point(double x, double y) {
        this.xCo = x;
        this.yCo = y;
    }

    public void print() {
        System.out.println("Point: (" + xCo + ", " + yCo + ")");
    }
}

class Circle extends Point {
    private double radius;

    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Radius: " + radius);
    }
}

class Cylinder extends Circle {
    private double height;

    public Cylinder(double x, double y, double radius, double height) {
        super(x, y, radius);
        this.height = height;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Height: " + height);
    }
}

public class Shapedynamic {
    public static void main(String[] args) {
        Point point1 = new Circle(2.0, 3.0, 4.0); // Upcasting
        Point point2 = new Cylinder(5.0, 6.0, 7.0, 10.0); // Upcasting

        // Demonstrate dynamic binding
        printInfo(point1);
        printInfo(point2);
    }

    private static void printInfo(Point point) {
        point.print(); // Calls the overridden method based on the actual object type
    }
}