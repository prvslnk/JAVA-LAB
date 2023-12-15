/*Picture present in qestion pdf */
class Point {
    private double xCo, yCo;

    public Point(double x, double y) {
        this.xCo = x;
        this.yCo = y;
    }

    public void printPoint() {
        System.out.println("Point: (" + xCo + ", " + yCo + ")");
    }
}

class Circle extends Point {
    private double radius;

    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    public void printCircle() {
        super.printPoint();
        System.out.println("Radius: " + radius);
    }
}

class Cylinder extends Circle {
    private double height;

    public Cylinder(double x, double y, double radius, double height) {
        super(x, y, radius);
        this.height = height;
    }

    public void printCylinder() {
        super.printCircle();
        System.out.println("Height: " + height);
    }
}

public class Shape {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(5.0, 6.0, 7.0, 10.0);
        cylinder.printCylinder();
    }
}
