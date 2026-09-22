package InterviewPreparation.Arrays;

import java.util.Arrays;
import java.util.List;

public class MergeTwoSortedList {
    public static int[] merger2SortedList(int[] l1,int[] l2) {
        int n = l1.length;
        int m = l2.length;
        int[] result = new int[n+m];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < n && j<m) {
            if (l1[i] <= l2[j]) {
                result[k] = l1[i];
                i++;
            }
            else {
                result[k] = l2[j];
                j++;
            }
            k++;
        }
        while (i<n) {
            result[k] = l1[i];
            i++;
            k++;
        }
        while (j<m) {
            result[k] = l2[j];
            j++;
            k++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] l1 = {1,3,5,7};
        int[] l2 = {2,5,8,9};
        int[] mergeArray = merger2SortedList(l1,l2);
        System.out.println("Merged Array :: " + Arrays.toString(mergeArray));

    }
}
