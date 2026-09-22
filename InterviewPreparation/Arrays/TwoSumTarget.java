package InterviewPreparation.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class TwoSumTarget {
    //1.
    public static int[] twoSum1(int[] nums,int target) {
        for (int i=0;i<nums.length;i++) {
            for (int j=i+1;j<nums.length;j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{nums[i],nums[j]};
                }
            }
        }
        return new int[]{};
    }
    //2.
    public static int[] twoSum2(int[] nums,int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++) {
            int curr = nums[i];
            int x = target-curr;
            if(map.containsKey(x)) {
                //System.out.println("map.get(x) ::" + x + " : " + i);
                return new int[]{x,nums[i]};
            }
            map.put(curr,i);
        }
        return null;
    }

    //3.
    public static int[] twoSum3(int[] nums,int target) {
        int low = 0;
        int high = nums.length-1;
        while (low < high) {
            int sum = nums[low] + nums[high];
            if (sum == target) {
                return new int[] {low+1,high+1};
            }
            else if(sum < target) {
                ++low;
            } else {
                --high;
            }
        }
        return new int[] {-1,-1};
    }
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println("result1 :: " + Arrays.toString(twoSum1(nums,target)));
        System.out.println("result2 :: " + Arrays.toString(twoSum2(nums,target)));
        System.out.println("result3 :: " + Arrays.toString(twoSum3(nums,target)));
    }
}
