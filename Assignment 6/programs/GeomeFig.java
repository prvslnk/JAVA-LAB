/*  Question 1: This question asks to define an abstract class named GeometricFigure with two data members, and extend it to create two concrete classes named Rectangle and Triangle. The question also asks to override the getArea() method in the sub classes and invoke it in the main method of another Driver class. */
abstract class GeometricFigure {
    double dimension1;
    double dimension2;

    GeometricFigure(double d1, double d2) {
        dimension1 = d1;
        dimension2 = d2;
    }

    abstract double getArea();
}

class Rectangle extends GeometricFigure {
    Rectangle(double d1, double d2) {
        super(d1, d2);
    }

    double getArea() {
        return dimension1 * dimension2;
    }
}

class Triangle extends GeometricFigure {
    Triangle(double d1, double d2) {
        super(d1, d2);
    }

    double getArea() {
        return dimension1 * dimension2 / 2;
    }
}

public class GeomeFig {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 10);
        Triangle t = new Triangle(5, 10);

        System.out.println("Area of rectangle: " + r.getArea());
        System.out.println("Area of triangle: " + t.getArea());
    }
}
