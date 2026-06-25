interface StreamingService {
    void streamMovie(String movie);

    default void showSubscriptionDetails() {
        System.out.println("Streaming Subscription Active");
    }
}

interface GamingService {
    void playGame(String game);

    default void showSubscriptionDetails() {
        System.out.println("Gaming Subscription Active");
    }
}

class SmartTV implements StreamingService, GamingService {

    public void streamMovie(String movie) {
        System.out.println("Streaming: " + movie);
    }

    public void playGame(String game) {
        System.out.println("Playing: " + game);
    }

    public void showSubscriptionDetails() {
        StreamingService.super.showSubscriptionDetails();
        GamingService.super.showSubscriptionDetails();
    }
}

public class Main {
    public static void main(String[] args) {
        String[] movies = {
                "Inception",
                "Interstellar",
                "Avatar"
        };

        String[] games = {
                "FIFA",
                "Minecraft",
                "PUBG"
        };

        SmartTV tv = new SmartTV();

        tv.showSubscriptionDetails();

        System.out.println("Movies:");
        for (String movie : movies) {
            tv.streamMovie(movie);
        }

        System.out.println("Games:");
        for (String game : games) {
            tv.playGame(game);
        }
    }
}