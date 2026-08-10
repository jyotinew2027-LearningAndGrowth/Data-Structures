package InterviewPreparation.String;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "aabbbavavbbbaa";
        str = str.toLowerCase();
        //1.
        int start = 0;
        int end = str.length()-1;
        while (start < end) {
            if(str.charAt(start) != str.charAt(end)) {
                System.out.println("Not a Palindrome!!");
                return;
            }
            start++;
            end--;
        }
        System.out.println("String is Palindrome !!");

        //2.
        System.out.println(str.equalsIgnoreCase(new StringBuilder(str).reverse().toString()));
    }
}
