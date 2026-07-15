import java.util.*;

public class Main {

    static void permute(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            String left = str.substring(0, i);
            String right = str.substring(i + 1);

            String remaining = left + right;

            permute(remaining, ans + ch);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        permute(str, "");
    }
}