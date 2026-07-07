import java.util.Scanner;

public class PatientIDMergeSort {

    static void mergeSort(int[] ids, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(ids, left, mid);
            mergeSort(ids, mid + 1, right);
            merge(ids, left, mid, right);
        }
    }

    static void merge(int[] ids, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftIds = new int[n1];
        int[] rightIds = new int[n2];

        for (int i = 0; i < n1; i++)
            leftIds[i] = ids[left + i];

        for (int j = 0; j < n2; j++)
            rightIds[j] = ids[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftIds[i] <= rightIds[j])
                ids[k++] = leftIds[i++];
            else
                ids[k++] = rightIds[j++];
        }

        while (i < n1)
            ids[k++] = leftIds[i++];

        while (j < n2)
            ids[k++] = rightIds[j++];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] ids = new int[n];

        for (int i = 0; i < n; i++)
            ids[i] = sc.nextInt();

        mergeSort(ids, 0, n - 1);

        for (int value : ids)
            System.out.print(value + " ");
    }
}