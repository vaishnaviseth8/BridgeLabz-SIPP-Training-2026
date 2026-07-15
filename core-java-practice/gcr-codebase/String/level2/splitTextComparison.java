import java.util.Scanner;

public class SplitTextComparison {
    public static int findLength(String text) {
        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }

        return count;
    }

    public static String[] splitText(String text) {
        int length = findLength(text);
        int wordsCount = 1;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordsCount++;
            }
        }

        int[] spaces = new int[wordsCount + 1];
        spaces[0] = -1;

        int index = 1;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaces[index++] = i;
            }
        }

        spaces[index] = length;

        String[] words = new String[wordsCount];

        for (int i = 0; i < wordsCount; i++) {
            String word = "";

            for (int j = spaces[i] + 1; j < spaces[i + 1]; j++) {
                word += text.charAt(j);
            }

            words[i] = word;
        }

        return words;
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[] userWords = splitText(text);
        String[] builtInWords = text.split(" ");

        System.out.println("Same Result: " + compareArrays(userWords, builtInWords));

        sc.close();
    }
}