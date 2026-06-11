import java.util.Scanner;

public class Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] name = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        double[] height = new double[3];

        for(int i = 0; i < 3; i++) {
            age[i] = sc.nextInt();
            height[i] = sc.nextDouble();
        }

        int minAge = age[0];
        double maxHeight = height[0];
        String youngest = name[0];
        String tallest = name[0];

        for(int i = 1; i < 3; i++) {
            if(age[i] < minAge) {
                minAge = age[i];
                youngest = name[i];
            }
            if(height[i] > maxHeight) {
                maxHeight = height[i];
                tallest = name[i];
            }
        }

        System.out.println(youngest);
        System.out.println(tallest);
    }
}