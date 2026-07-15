import java.util.Scanner;

public class NumberChecker4 {

    public static int countDigits(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    public static int[] getDigitsArray(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }

        return digits;
    }

    public static int[] reverseArray(int[] arr) {
        int[] reverse = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            reverse[i] = arr[arr.length - 1 - i];
        }

        return reverse;
    }

    public static boolean compareArrays(int[] a, int[] b) {

        if (a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i])
                return false;
        }

        return true;
    }

    public static boolean isPalindrome(int[] digits) {
        return compareArrays(digits, reverseArray(digits));
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int number = sc.nextInt();

        int[] digits = getDigitsArray(number);

        System.out.println("Palindrome Number = " + isPalindrome(digits));
        System.out.println("Duck Number = " + isDuckNumber(digits));

        sc.close();
    }
}