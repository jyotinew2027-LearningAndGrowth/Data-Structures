package InterviewPreparation.Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateSortedArray {
    public static void main(String[] args) {
        Integer[] arr = {3,7,2,9,10,6,5,4,8,8,2,9,10,3,3,6,6};

        //1.
        HashSet<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(arr));
        /*for (int i=0;i<arr.length;i++) {
            if (!set.contains(arr[i])) {
                set.add(arr[i]);
            }
        }*/
        System.out.println(set);

        //2.
        int j = 1;
        for (int i=1;i<arr.length;i++) {

        }
    }
}
