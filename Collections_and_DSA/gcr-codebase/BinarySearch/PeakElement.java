package BinarySearch;

public class Q3_PeakElement {

    public static void main(String[] args) {

        int arr[]={1,3,20,4,1,0};

        System.out.println(findPeak(arr));
    }

    public static int findPeak(int arr[]){

        int left=0;
        int right=arr.length-1;

        while(left<right){

            int mid=left+(right-left)/2;

            if(arr[mid]>arr[mid+1])
                right=mid;

            else
                left=mid+1;
        }

        return left;
    }
}