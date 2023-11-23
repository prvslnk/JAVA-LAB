/*  Write a method that takes a number between 0 and 9 as an argument and prints on the
screen “Number green bottles standing on the wall” (where Number is replaced by the word
version of the number). If the numeric parameter is 1 then your method should print bottle
rather than bottles. */

import java.util.Scanner;

public class p8 {
    static void bottle(int a) {
        switch (a) {
            case 1:
                System.out.println("one green bottle standing on wall");

                break;
            case 2:
                System.out.println("two green bottles standing on wall");

                break;
            case 3:
                System.out.println("three green bottles standing on wall");

                break;
            case 4:
                System.out.println("four green bottles standing on wall");

                break;
            case 5:
                System.out.println("five green bottles standing on wall");

                break;
            case 6:
                System.out.println("six green bottles standing on wall");

                break;
            case 7:
                System.out.println("seven green bottles standing on wall");

                break;
            case 8:
                System.out.println("eight green bottles standing on wall");

                break;
            case 9:
                System.out.println("nine green bottles standing on wall");

                break;

            default:
                System.out.println("Invalid input");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter a number");
        int n = obj.nextInt();
        bottle(n);

    }

}