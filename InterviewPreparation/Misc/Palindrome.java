package InterviewPreparation.Misc;

public class Palindrome {
    public static void main(String[] args) {
        String input = "abba";
        System.out.println("isPalindrome :: " + isPalindrome(input));
    }
    public static boolean isPalindrome(String input) {
        if(input == null) {
            return false;
        }
        StringBuilder reversedStr = new StringBuilder();
        for (int i=input.length()-1;i>=0;i--) {
            reversedStr.append(input.charAt(i));
            //System.out.println(reversedStr);
        }
        if (input.equals(reversedStr.toString()))
            return true;
        else
            return false;
    }
}
