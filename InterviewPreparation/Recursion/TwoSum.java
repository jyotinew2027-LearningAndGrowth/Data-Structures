package InterviewPreparation.Recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15,3};
        int target = 18;

        //1.O(n^2),O(1)
        List<Integer> result = new ArrayList<Integer>();
        int length = nums.length;
        for (int i=0;i<nums.length;i++) {
            for(int j=i+1;j< nums.length;j++) {
                if(nums[i] == target - nums[j]) {
                    result.add(nums[i]);
                    result.add(nums[j]);
                    break;
                }
            }
        }
        System.out.println(result);

        //2. O(n),O(1)
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i< nums.length;i++) {
            int curr = nums[i];
            int x = target - curr;
            if (map.containsKey(x)) {
                //return new int[] {map.get(x),i};
                break;
            }
            map.put(curr,i);
        }
        System.out.println(map);

        //3.O(n),O(1)
        Map<Integer,Integer> map1 = new HashMap<>();
        for (int i=0;i<nums.length;i++) {
            map1.put(nums[i],i);
        }
        for (int i=0;i<nums.length;i++) {
            int res = target-nums[i];
            if (map.containsKey(res) && map.get(res) != i) {
                System.out.println(i + " , " + map.get(res));
            }
        }
        //return new int[]{};
    }
}
