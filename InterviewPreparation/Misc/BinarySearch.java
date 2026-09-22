package InterviewPreparation.Misc;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,1,9,3};
        int target = 10;
        System.out.println("binary Search :: " + binarySearch(arr,target));
    }
    public static int binarySearch(int[] arr,int target) {
        int left = 0;
        int right = arr.length-1;
        while (left <= right) {
            int mid = left+(right-left)/2;
            if(arr[mid] == target) {
                return mid;
            }
            if(arr[mid] < target) {
                left = mid+1;
            }
            else {
                right=mid-1;
            }
        }
        return -1;
    }
}
