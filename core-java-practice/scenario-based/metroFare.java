import java.util.*;

public class MetroFare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bal = 100;

        while (bal > 0) {
            int d = sc.nextInt();
            if (d == -1) break;

            int fare = (d <= 10) ? 20 : 40;

            if (bal < fare) break;

            bal -= fare;
            System.out.println(bal);
        }
    }
}