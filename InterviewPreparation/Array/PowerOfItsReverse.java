package InterviewPreparation.Array;

public class PowerOfItsReverse {
    public static void main(String[] args) {
        int n =10;
        //1.
        System.out.println(power(10));

        //2.
        int rev =0;
        int temp =n;
        while (temp>0) {
            rev = rev*10+temp%10;
            temp/=10;
        }
        int res = 1;
        for (int i=0;i<rev;i++) {
            res*=n;
        }
        System.out.println("result :: " + res);
    }
    public static long reverseNum(long n) {
        long reversed = 0;
        while(n > 0) {
            reversed = (reversed*10)+n%10;
            n/=10;
        }
        return reversed;
    }
    public static long power(long n) {
        long res = 1;
        for (int i=0;i<reverseNum(n);i++)
            res *= n;
        return res;
    }
}
