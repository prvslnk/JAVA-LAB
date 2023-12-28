class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }

    void erase() {
        System.out.println("Erasing a shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }

    void erase() {
        System.out.println("Erasing a circle");
    }
}

class Triangle extends Shape {
    void draw() {
        System.out.println("Drawing a triangle");
    }

    void erase() {
        System.out.println("Erasing a triangle");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Drawing a square");
    }

    void erase() {
        System.out.println("Erasing a square");
    }
}

public class ShapeD {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Triangle();
        Shape s3 = new Square();

        s1.draw();
        s1.erase();

        s2.draw();
        s2.erase();

        s3.draw();
        s3.erase();
    }
}
