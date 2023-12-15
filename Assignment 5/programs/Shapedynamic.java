/*  Demonstrate the dynamic binding by modifying question 3. */
class point {
    protected double xCo, yCo;

    public point() {
        xCo = 4;
        yCo = 2;
    }

    void print() {
        System.out.println("point");
    }
}

class circle extends point {
    protected double r;

    public circle() {
        super();
        double a = xCo * xCo - yCo * yCo;
        r = Math.sqrt(a);
    }

    void print() {
        System.out.println("radius");
    }
}

class cylinder extends circle {
    protected double height;

    public cylinder() {
        super();
        height = 10;
    }

    void print() {
        System.out.println("height");
    }
}

class Shapedynamic {
    public static void main(String[] args) {
        circle c = new cylinder();
        c.print();
    }

}