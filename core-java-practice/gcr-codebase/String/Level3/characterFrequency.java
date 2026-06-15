import java.util.Scanner;

public class CharacterFrequency {

    public static String[][] findFrequency(String text) {
        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            boolean alreadyAdded = false;

            for (int j = 0; j < i; j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    alreadyAdded = true;
                    break;
                }
            }

            if (!alreadyAdded) {
                count++;
            }
        }

        String[][] result = new String[count][2];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            boolean alreadyAdded = false;

            for (int j = 0; j < i; j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    alreadyAdded = true;
                    break;
                }
            }

            if (!alreadyAdded) {
                result[index][0] = String.valueOf(text.charAt(i));
                result[index][1] = String.valueOf(frequency[text.charAt(i)]);
                index++;
            }
        }

        return result;
    }

    public static void display(String[][] result) {
        System.out.printf("%-10s %-10s%n", "Character", "Frequency");

        for (int i = 0; i < result.length; i++) {
            System.out.printf("%-10s %-10s%n",
                    result[i][0],
                    result[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[][] result = findFrequency(text);

        display(result);

        sc.close();
    }
}