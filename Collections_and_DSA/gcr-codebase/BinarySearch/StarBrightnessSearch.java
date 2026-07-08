package BinarySearch;

public class Q1_StarBrightnessSearch {

    public static void main(String[] args) {

        int[] brightness = {2, 4, 6, 8, 10, 12};

        System.out.println(binarySearch(brightness, 8));

        int[] rotatedCatalog = {10, 12, 15, 2, 4, 6, 8};

        System.out.println(searchRotated(rotatedCatalog, 6));

        int[] repeated = {1,2,2,2,3,4,5};

        System.out.println(findFirst(repeated,2));
        System.out.println(findLast(repeated,2));

        System.out.println(findMinimum(rotatedCatalog));
    }

    public static int binarySearch(int[] arr,int target){

        int left=0;
        int right=arr.length-1;

        while(left<=right){

            int mid=left+(right-left)/2;

            if(arr[mid]==target)
                return mid;

            else if(arr[mid]<target)
                left=mid+1;

            else
                right=mid-1;
        }

        return -1;
    }

    public static int searchRotated(int[] arr,int target){

        int left=0;
        int right=arr.length-1;

        while(left<=right){

            int mid=left+(right-left)/2;

            if(arr[mid]==target)
                return mid;

            if(arr[left]<=arr[mid]){

                if(target>=arr[left] && target<arr[mid])
                    right=mid-1;
                else
                    left=mid+1;
            }

            else{

                if(target>arr[mid] && target<=arr[right])
                    left=mid+1;
                else
                    right=mid-1;
            }
        }

        return -1;
    }

    public static int findFirst(int[] arr,int target){

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

    public static int findLast(int[] arr,int target){

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

    public static int findMinimum(int[] arr){

        int left=0;
        int right=arr.length-1;

        while(left<right){

            int mid=left+(right-left)/2;

            if(arr[mid]>arr[right])
                left=mid+1;

            else
                right=mid;
        }

        return arr[left];
    }
}