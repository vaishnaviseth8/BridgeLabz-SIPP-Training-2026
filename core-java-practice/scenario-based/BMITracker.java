import java.util.Scanner;

public class BMITracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        System.out.print("Enter weight: ");
        double weight = sc.nextDouble();

        double bmi = weight / (height * height);

        System.out.println("BMI = " + bmi);

        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else
            System.out.println("Overweight");
    }
}