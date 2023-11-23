/*  Write a java program that will read array of N numbers, and it will remove the duplicate
numbers (if any) and display the array. */

import java.util.*;

public class p3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        // Read the array elements
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Remove duplicates using a set
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int num : array) {
            uniqueNumbers.add(num);
        }

        // Convert the set back to an array
        int[] resultArray = new int[uniqueNumbers.size()];
        int index = 0;
        for (int num : uniqueNumbers) {
            resultArray[index++] = num;
        }

        // Display the modified array
        System.out.println("Array after removing duplicates:");
        System.out.println(Arrays.toString(resultArray));

        scanner.close();
    }
}