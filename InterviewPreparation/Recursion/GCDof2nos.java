package InterviewPreparation.Recursion;

public class GCDof2nos {

    public static void main(String[] args) {
        int a = 20,b=28;
        System.out.println(gcdOf2No(a,b));
    }
    public static int gcdOf2No(int a,int b) {
        return (b==0)?a:gcdOf2No(b,a%b);
    }
}
