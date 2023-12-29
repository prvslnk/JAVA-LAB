package mypack;

public class Display {
    public Display(int data) {
        System.out.println("Received int: " + data);
    }

    public Display(float data) {
        System.out.println("Received float: " + data);
    }

    public Display(int[] data) {
        System.out.println("Received int array: " + java.util.Arrays.toString(data));
    }

    public Display(String data) {
        System.out.println("Received String: " + data);
    }

    public Display(String[] data) {
        System.out.println("Received String array: " + java.util.Arrays.toString(data));
    }
}
