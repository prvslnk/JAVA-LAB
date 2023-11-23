
/*  The body mass index (BMI) of a person is defined as the ratio of body mass in kilograms to
the square of body height in meter. For example, a person of 1.8m tall with weight 55kg has
BMI 55/(1.8)2 = 16.975308641975307. A person with BMI between 20 and 25 is
considered to have a healthy amount of body fat. A person with BMI of less than 20 is
regarded as underweight, and one with a BMI of more than 25 is regarded as overweight.
Write a program to calculate the body mass index (BMI) of the user. Ask the user for their
height and their mass. Allow the user to enter both in inches and meters, and both in pounds
and kilograms. Also output the meaning of the BMI. Note that 1kg = 2.2046lb, and 1inch =
0.0254 meter.
Sample input/output:
What is your weight? 55
In lb or kg? (1=lb, 2=kg) 2
What is your height? 1.8
In in or m? (1=in, 2=m) 2
Your BMI is 16.975308641975307
You are underweight.
 */
import java.util.Scanner;

public class p10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your weight?");
        double weight = scanner.nextDouble();

        System.out.println("In lb or kg? (1=lb, 2=kg)");
        int weightUnit = scanner.nextInt();
        if (weightUnit == 1) {
            weight = weight / 2.2046; // convert lb to kg
        }

        System.out.println("What is your height?");
        double height = scanner.nextDouble();

        System.out.println("In in or m? (1=in, 2=m)");
        int heightUnit = scanner.nextInt();
        if (heightUnit == 1) {
            height = height * 0.0254; // convert in to m
        }

        double bmi = weight / (height * height);
        System.out.println("Your BMI is " + bmi);

        if (bmi < 20) {
            System.out.println("You are underweight.");
        } else if (bmi > 25) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You have a healthy amount of body fat.");
        }
    }
}
