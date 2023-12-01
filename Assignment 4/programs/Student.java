import java.util.Scanner;

public class Student {
    private static int studentCount = 0;

    private String name;
    private int roll;
    private Address address;

    class Address {
        String city;
        int pin;

        Address(String city, int pin) {
            this.city = city;
            this.pin = pin;
        }
    }

    public Student(String name, int roll, String city, int pin) {
        this.name = name;
        this.roll = roll;
        this.address = new Address(city, pin);

        System.out.println("Creating student number " + ++studentCount);
    }

    // Display student information
    public void displayInfo() {
        System.out.println("Student Information:");
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Address: " + address.city + ", Pin: " + address.pin);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Roll: ");
            int roll = scanner.nextInt();
            System.out.print("City: ");
            String city = scanner.next();
            System.out.print("Pin: ");
            int pin = scanner.nextInt();

            Student student = new Student(name, roll, city, pin);

            student.displayInfo();
        }

        // Closing the scanner
        scanner.close();
    }
}
