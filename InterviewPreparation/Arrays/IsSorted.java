package InterviewPreparation.Arrays;

public class IsSorted {
    public static void main(String[] args) {
        int[] arr = {3,2,6,8,1,9,10,5};
        for (int i=1;i<arr.length;i++) {
            if(arr[i-1] > arr[i])
                System.out.println("false");
            break;
        }
        System.out.println("true");
    }
}
