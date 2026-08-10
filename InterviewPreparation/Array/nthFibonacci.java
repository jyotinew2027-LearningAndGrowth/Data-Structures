package InterviewPreparation.Array;

public class nthFibonacci {

    public static void main(String[] args) {
        int n = 9;
        System.out.println("nthFibonacciFun :: " + nthFibonacciFun(n));
    }
    static int nthFibonacciFun(int n) {
        if(n<=1) {
            return n;
        }
        return nthFibonacciFun(n-1)+nthFibonacciFun(n-2);
    }
}
