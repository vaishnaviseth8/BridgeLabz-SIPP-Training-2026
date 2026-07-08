package BinarySearch;

import java.util.Arrays;

public class Q5_FirstLastOccurrence {

    public static void main(String[] args) {

        int arr[]={1,2,2,2,3,4,5};

        int first=findFirst(arr,2);
        int last=findLast(arr,2);

        System.out.println(Arrays.toString(new int[]{first,last}));
    }

    public static int findFirst(int arr[],int target){

        int left=0;
        int right=arr.length-1;
        int ans=-1;

        while(left<=right){

            int mid=left+(right-left)/2;

            if(arr[mid]==target){

                ans=mid;
                right=mid-1;
            }

            else if(arr[mid]<target)
                left=mid+1;

            else
                right=mid-1;
        }

        return ans;
    }

    public static int findLast(int arr[],int target){

        int left=0;
        int right=arr.length-1;
        int ans=-1;

        while(left<=right){

            int mid=left+(right-left)/2;

            if(arr[mid]==target){

                ans=mid;
                left=mid+1;
            }

            else if(arr[mid]<target)
                left=mid+1;

            else
                right=mid-1;
        }

        return ans;
    }
}