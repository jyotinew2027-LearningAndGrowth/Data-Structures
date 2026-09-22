package InterviewPreparation.Misc;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        int result = 1;
        if (n == 0){
            return;
        }
        for (int i=1;i<=n;i++) {
            result = result*i;
        }
        System.out.println(result);
    }
}
