package InterviewPreparation.Misc;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] num = {1,6,2,4,9};
        bubbleSort(num);
        System.out.println("Bubble sorted elements :: " + Arrays.toString(num));
    }
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i=0;i<n-1;i++) {
            swapped=false;
            for (int j=0;j<n-1-i;j++) {
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) //no elements swapping
                break;
        }
    }
}
