package InterviewPreparation.Array;

public class DigitalRoot {
    public static void main(String[] args) {
        int n = 999999;
        int res = 0;
        System.out.println("Digital Root :: " + digitalRoot(n));

        //2.
        while (n>0 || res>9) {
            if(n == 0) {
                n = res;
                res = 0;
            }
            res += n%10;
            n/=10;
        }
        System.out.println("digitalRoot :: " + res);
    }
    //A number and the sum of its digits always yield the exact same remainder when divided by 9.
    public static int digitalRoot(int n) {
        if(n==0)
            return 0;
        return (n-1)%9+1;
    }
}
