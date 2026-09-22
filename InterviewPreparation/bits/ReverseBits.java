package InterviewPreparation.bits;

public class ReverseBits {

    public static int reverseBits(int n) {
        int ret = 0,power = 31;
        while (n != 0) {
            ret += (n & 1) << power;
            n = n >>> 1;
            power -= 1;
        }
        return ret;
    }
    public static void main(String[] args) {

    }
}
