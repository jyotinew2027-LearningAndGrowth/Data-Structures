package InterviewPreparation.Arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {4,7,9,2,5,1,10,8};
        int n = arr.length;
        int temp =0;
        for (int i=0;i<n/2;i++) {
            temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
        System.out.println("reversed array :: " + Arrays.toString(arr));
    }
}
