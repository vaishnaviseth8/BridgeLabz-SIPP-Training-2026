import java.util.Scanner;

public class StoreNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] arr = new double[10];
        double sum = 0.0;
        int index = 0;

        while(true) {
            double num = sc.nextDouble();

            if(num <= 0) {
                break;
            }

            if(index == 10) {
                break;
            }

            arr[index] = num;
            index++;
        }

        for(int i = 0; i < index; i++) {
            sum += arr[i];
            System.out.println(arr[i]);
        }

        System.out.println("Sum = " + sum);
    }
}