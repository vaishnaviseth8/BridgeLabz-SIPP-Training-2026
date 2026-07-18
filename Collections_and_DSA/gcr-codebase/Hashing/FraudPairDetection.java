import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FraudPairDetection {

    public static int[] findFraudPair(int[] amounts, int target) {
        Map<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < amounts.length; i++) {
            int complement = target - amounts[i];

            if (seen.containsKey(complement)) {
                return new int[]{seen.get(complement), i};
            }

            seen.put(amounts[i], i);
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] amounts = {8, 3, 11, 7, 2};
        int target = 10;

        System.out.println(Arrays.toString(findFraudPair(amounts, target)));
    }
}