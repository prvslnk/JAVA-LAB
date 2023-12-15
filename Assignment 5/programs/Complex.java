/* Create a class called Complex for performing arithmetic on complex numbers. Complex numbers 
have the form a+bi where a is real part and b is imaginary part and i=√-1. 
Write a program to test your class. Use floating point variables to represent the private data of the 
class. Provide constructor that enable an object to be initialized when it is declared. Provide no 
argument constructor with default values in case no initializers are provided. Provide public 
methods for addition, subtraction, multiplication and division of complex numbers. Pass objects of 
Complex as parameters of the method. 
Input and Output Requirements: 
Program reads real and imaginary parts of two complex numbers through keyboard and displays 
their sum, difference, product and quotient as result.
*/
public class Complex {
    private double real;
    private double imag;

    public Complex() {
        this.real = 0;
        this.imag = 0;
    }

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imag + other.imag);
    }

    public Complex subtract(Complex other) {
        return new Complex(this.real - other.real, this.imag - other.imag);
    }

    public Complex multiply(Complex other) {
        double realPart = this.real * other.real - this.imag * other.imag;
        double imagPart = this.imag * other.real + this.real * other.imag;
        return new Complex(realPart, imagPart);
    }

    public Complex divide(Complex other) {
        double denom = other.real * other.real + other.imag * other.imag;
        double realPart = (this.real * other.real + this.imag * other.imag) / denom;
        double imagPart = (this.imag * other.real - this.real * other.imag) / denom;
        return new Complex(realPart, imagPart);
    }

    @Override
    public String toString() {
        return this.real + " + " + this.imag + "i";
    }

    public static void main(String[] args) {
        Complex c1 = new Complex(3, 2);
        Complex c2 = new Complex(1, 7);

        System.out.println("Complex number 1: " + c1);
        System.out.println("Complex number 2: " + c2);

        System.out.println("Sum: " + c1.add(c2));
        System.out.println("Difference: " + c1.subtract(c2));
        System.out.println("Product: " + c1.multiply(c2));
        System.out.println("Quotient: " + c1.divide(c2));
    }
}