interface TextModeration {
    boolean isOffensive(String post);

    default void displayModerationPolicy() {
        System.out.println("No offensive language allowed");
    }

    static boolean containsRestrictedWords(String post) {
        String text = post.toLowerCase();
        return text.contains("badword") || text.contains("abuse");
    }
}

interface SpamDetection {
    boolean isSpam(String post);

    default void displayModerationPolicy() {
        System.out.println("No spam content allowed");
    }
}

class ContentModerator implements TextModeration, SpamDetection {

    public boolean isOffensive(String post) {
        return TextModeration.containsRestrictedWords(post);
    }

    public boolean isSpam(String post) {
        String text = post.toLowerCase();
        return text.contains("buy now") || text.contains("free money");
    }

    public void displayModerationPolicy() {
        TextModeration.super.displayModerationPolicy();
        SpamDetection.super.displayModerationPolicy();
    }
}

public class Main {
    public static void main(String[] args) {
        String[] posts = {
                "Hello everyone",
                "Buy now and get free money",
                "This contains badword",
                "Learning Java is fun",
                "Free money available today"
        };

        ContentModerator moderator = new ContentModerator();

        moderator.displayModerationPolicy();

        for (String post : posts) {
            if (moderator.isSpam(post)) {
                System.out.println("Spam Post: " + post);
            } else if (moderator.isOffensive(post)) {
                System.out.println("Offensive Post: " + post);
            } else {
                System.out.println("Valid Post: " + post);
            }
        }
    }
}