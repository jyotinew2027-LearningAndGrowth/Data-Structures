package InterviewPreparation.Recursion;

//??????????????
public class JosephusProblem {
    public static void main(String[] args) {
        int n =7;
        int k = 3;
        int survivor = 0;
        for (int i=2;i<=n;i++) {
            survivor = (survivor+k)%i;
        }
        System.out.println("survivor :: " + survivor+1);
    }
}
