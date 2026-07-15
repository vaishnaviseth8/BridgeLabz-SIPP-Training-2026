import java.util.Scanner;

public class CharacterFrequencyUsingUnique {

    public static char[] uniqueCharacters(String text) {
        char[] unique = new char[text.length()];
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            boolean isUnique = true;

            for (int j = 0; j < count; j++) {
                if (text.charAt(i) == unique[j]) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                unique[count] = text.charAt(i);
                count++;
            }
        }

        char[] result = new char[count];

        for (int i = 0; i < count; i++) {
            result[i] = unique[i];
        }

        return result;
    }

    public static String[][] findFrequency(String text) {
        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        char[] unique = uniqueCharacters(text);

        String[][] result = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(frequency[unique[i]]);
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