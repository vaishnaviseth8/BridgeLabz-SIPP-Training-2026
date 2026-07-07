import java.util.Scanner;

public class EmployeeSalaryMergeSort {

    static void mergeSort(int[] salary, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(salary, left, mid);
            mergeSort(salary, mid + 1, right);
            merge(salary, left, mid, right);
        }
    }

    static void merge(int[] salary, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftPart = new int[n1];
        int[] rightPart = new int[n2];

        for (int i = 0; i < n1; i++)
            leftPart[i] = salary[left + i];

        for (int j = 0; j < n2; j++)
            rightPart[j] = salary[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftPart[i] <= rightPart[j])
                salary[k++] = leftPart[i++];
            else
                salary[k++] = rightPart[j++];
        }

        while (i < n1)
            salary[k++] = leftPart[i++];

        while (j < n2)
            salary[k++] = rightPart[j++];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] salary = new int[n];

        for (int i = 0; i < n; i++)
            salary[i] = sc.nextInt();

        mergeSort(salary, 0, n - 1);

        for (int value : salary)
            System.out.print(value + " ");
    }
}