package InterviewPreparation.Array;

public class PowerUsingRecursion {
    public static void main(String[] args) {
        int n = 10;
        int p = 2;

    }
    public static int powerUsingRecursion(int n,int p) {
        if(p == 0) {
            return 1;
        }
        return n*powerUsingRecursion(n,p-1);
    }
}
