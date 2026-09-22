package InterviewPreparation.Arrays;

public class SecondMax {
    public static void main(String[] args) {
        int max = -1;
        int smax = -1;
        int[] arr = {2,4,6,9,2,10,8,14};
        for (int i=0;i<arr.length;i++) {
            if (arr[i] > max) {
                smax = max;
                max = arr[i];
            }
            if (arr[i] > smax && arr[i] != max) {
                smax = arr[i];
            }
        }
        System.out.println("smax :: " + smax);
    }
}
