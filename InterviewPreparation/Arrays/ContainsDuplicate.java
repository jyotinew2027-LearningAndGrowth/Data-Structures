package InterviewPreparation.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2};
        //1.O(N)
        Set<Integer> dup = new HashSet<>(nums.length);
        for(int i=0;i<nums.length;i++) {
            if(dup.add(nums[i]) == false)
                System.out.println("duplicate 1 :: " + nums[i]);
            dup.add(nums[i]);
        }
        //2.O(N2)
        for (int i=0;i<nums.length;i++) {
            for (int j=0;j<i;j++) {
                if (nums[j] == nums[i])
                    System.out.println("duplicate 2 :: " + nums[j]);
            }
        }
        //3. O(n log n)
        Arrays.sort(nums);
        for (int i=0;i<nums.length-1;i++) {
            if (nums[i] == nums[i+1])
                System.out.println("duplicate 3 :: " + nums[i]);
        }
    }
}
