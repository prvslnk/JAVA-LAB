
/*  Question 2: This question asks to define an interface named Calculator with four basic methods, and a concrete class named DemoCalculator that implements the interface. The question also asks to define the driver class, which creates an object reference of the interface and performs all basic operations of the calculator. */
import java.util.Scanner;

interface Calculator {
    double add(double num1, double num2);

    double sub(double num1, double num2);

    double mul(double num1, double num2);

    double div(double num1, double num2);
}

class DemoCalculator implements Calculator {
    @Override
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    @Override
    public double sub(double num1, double num2) {
        return num1 - num2;
    }

    @Override
    public double mul(double num1, double num2) {
        return num1 * num2;
    }

    @Override
    public double div(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Cannot divide by zero.");
            return Double.NaN;
        }
    }
}

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new DemoCalculator();

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Select operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");

        System.out.print("Enter choice (1-4): ");
        int choice = scanner.nextInt();

        double result = 0;

        switch (choice) {
            case 1:
                result = calculator.add(num1, num2);
                break;
            case 2:
                result = calculator.sub(num1, num2);
                break;
            case 3:
                result = calculator.mul(num1, num2);
                break;
            case 4:
                result = calculator.div(num1, num2);
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }

        System.out.println("Result: " + result);
    }
}
