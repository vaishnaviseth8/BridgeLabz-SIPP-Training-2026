import java.util.Scanner;

public class DigitMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int[] digits = new int[10];
        int index = 0;

        while(number != 0) {
            digits[index] = number % 10;
            number = number / 10;
            index++;
        }

        int largest = 0;
        int secondLargest = 0;

        for(int i = 0; i < index; i++) {
            if(digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if(digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println(largest);
        System.out.println(secondLargest);
    }
}