import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class FeedbackAnalyzer {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;

        try {
            System.out.println("Enter 5 feedback messages:");

            for (int i = 1; i <= 5; i++) {
                String feedback = br.readLine();

                if (feedback.toLowerCase().contains("good")) {
                    count++;
                }
            }

            System.out.println("Good Feedback Count = " + count);

        } catch (IOException e) {
            System.out.println("Error reading input.");
        }
    }
}