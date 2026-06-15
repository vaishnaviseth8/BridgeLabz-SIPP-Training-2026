import java.util.Scanner;

public class ShortestLongestWord {
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

    public static int[] findShortestLongest(String[][] data) {
        int shortest = 0;
        int longest = 0;

        for (int i = 1; i < data.length; i++) {
            int len = Integer.parseInt(data[i][1]);

            if (len < Integer.parseInt(data[shortest][1])) {
                shortest = i;
            }

            if (len > Integer.parseInt(data[longest][1])) {
                longest = i;
            }
        }

        return new int[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[][] data = getWordLengths(splitText(text));
        int[] result = findShortestLongest(data);

        System.out.println("Shortest Word: " + data[result[0]][0]);
        System.out.println("Longest Word: " + data[result[1]][0]);

        sc.close();
    }
}