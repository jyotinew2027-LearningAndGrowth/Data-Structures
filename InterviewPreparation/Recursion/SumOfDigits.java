package InterviewPreparation.Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int num = 1013;
        //1.Recursion
        System.out.println("recursive Sum :: " + digitsSum(num));

        //2.Stream
        int sum = String.valueOf(Math.abs(num))
                .chars()
                .map(Character::getNumericValue)
                .sum();
        System.out.println("stream sum :: " + sum);
    }
    public static int digitsSum(int n) {
        if(n == 0) {
            return 0;
        }
        return (n%10)+digitsSum(n/10);
    }
}
