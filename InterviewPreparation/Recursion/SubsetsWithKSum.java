package InterviewPreparation.Recursion;

public class SubsetsWithKSum {

    //1. Recursion
    public static int countSubsets(int i,int currentSum,int target,int[] arr) {
        int n = arr.length;
        //all elements processed
        if (i == n) {
            return (currentSum == target) ? 1 : 0;
        }
        //exclude current element
        int exclude = countSubsets(i+1,currentSum,target,arr);
        //include current element
        int include = 0;
        if (currentSum +arr[i] <= target) {
            include = countSubsets(i+1,currentSum+arr[i],target,arr);
        }
        return include+exclude;
    }

    //2.
    static int countSubsets1(int[] arr,int target) {
        int n = arr.length;
        int[] prev = new int[target+1];
        int[] curr = new int[target+1];
        prev[0] = 1;
        for (int i=1;i<=n;i++) {
            System.arraycopy(prev,0,curr,0,target+1);
            for (int j=0;j<=target;j++) {
                if (j >= arr[i-1]) {
                    curr[j] += prev[j - arr[i-1]];
                }
            }
            System.arraycopy(curr,0,prev,0,target+1);
        }
        return curr[target];
    }

    public static void main(String[] args) {
        int target = 1;
        int[] arr = {3,5,2,7,9,1,10,8};
        System.out.println("count :: " + countSubsets(0,0,target,arr));
        System.out.println("count :: " + countSubsets1(arr,1));
    }
}
