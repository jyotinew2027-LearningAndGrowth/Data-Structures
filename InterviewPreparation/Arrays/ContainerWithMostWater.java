package InterviewPreparation.Arrays;

public class ContainerWithMostWater {

    //1.
    public static int maxArea1(int[] height) {
        int maxArea = 0;
        for (int left=0;left<height.length;left++) {
            for (int right = left+1;right<height.length;right++) {
                int width = right-left;
                maxArea = Math.max(maxArea,Math.min(height[left],height[right])*width);
            }
        }
        return maxArea;
    }

    //2.
    public static int maxArea2(int[] arr) {
        int left = 0,right = arr.length-1;
        int res = 0;
        while (left < right) {
            int water = Math.min(arr[left],arr[right])*(right-left);
            res = Math.max(res,water);
            if (arr[left] < arr[right])
                left+=1;
            else
                right -=1;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea2(height));
    }
}
