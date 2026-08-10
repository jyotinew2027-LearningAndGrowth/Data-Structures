package InterviewPreparation.Array;

import java.util.HashMap;

//Subarray - consecutive elements
public class SubarraySumEqualsK {
    public static void main(String[] args) {
        System.out.println( "count :: " + subarraySumK(new int[]{2,3,8,4,6,5,5,10},10));
        System.out.println("count :: " + subarraySumK1(new int[]{2,3,8,4,6,5,5,10},10));
    }
    //1.
    public static int subarraySumK(int[] nums,int k) {
        int count = 0,sum =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for (int i=0;i<nums.length;i++) {
            sum += nums[i];
            if (map.containsKey(sum - k))
                count += map.get(sum - k);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }

    //2.
    public static int subarraySumK1(int[] nums,int k) {
        int count = 0;
        for (int start = 0;start<nums.length;start++) {
            int sum =0;
            for (int end = start;end<nums.length;end++) {
                sum+=nums[end];
                if (sum == k)
                    count++;
                System.out.println(start + " : " +end);
            }
        }
        return count;
    }
}
