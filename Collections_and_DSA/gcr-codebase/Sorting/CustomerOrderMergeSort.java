import java.util.Scanner;

public class CustomerOrderMergeSort {

    static void mergeSort(int[] orders, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(orders, left, mid);
            mergeSort(orders, mid + 1, right);
            merge(orders, left, mid, right);
        }
    }

    static void merge(int[] orders, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] first = new int[n1];
        int[] second = new int[n2];

        for (int i = 0; i < n1; i++)
            first[i] = orders[left + i];

        for (int j = 0; j < n2; j++)
            second[j] = orders[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (first[i] <= second[j])
                orders[k++] = first[i++];
            else
                orders[k++] = second[j++];
        }

        while (i < n1)
            orders[k++] = first[i++];

        while (j < n2)
            orders[k++] = second[j++];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] orders = new int[n];

        for (int i = 0; i < n; i++)
            orders[i] = sc.nextInt();

        mergeSort(orders, 0, n - 1);

        for (int value : orders)
            System.out.print(value + " ");
    }
}