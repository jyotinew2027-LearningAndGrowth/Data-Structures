package InterviewPreparation.Arrays;

public class MissingNumber {

    public static int missingNum(int[] num) {
        int expectedSum = num.length*(num.length+1)/2;
        int actualSum = 0;
        for (int i : num)
            actualSum += i;
        return expectedSum - actualSum;
    }
    public static void main(String[] args) {
        System.out.println(missingNum(new int[]{0,1,3}));
    }
}
