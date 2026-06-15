import java.util.Scanner;

public class WordLength2D {
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

    public static String[][] getWordLengths(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[][] result = getWordLengths(splitText(text));

        System.out.println("Word\tLength");

        for (String[] row : result) {
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
        }

        sc.close();
    }
}