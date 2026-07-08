package BinarySearch;

public class Q2_RotationPoint {

    public static void main(String[] args) {

        int arr[]={10,12,15,2,4,6,8};

        int index=findRotation(arr);

        System.out.println(index);
        System.out.println(arr[index]);
    }

    public static int findRotation(int arr[]){

        int left=0;
        int right=arr.length-1;

        while(left<right){

            int mid=left+(right-left)/2;

            if(arr[mid]>arr[right])
                left=mid+1;

            else
                right=mid;
        }

        return left;
    }
}