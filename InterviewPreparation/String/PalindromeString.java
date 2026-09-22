package InterviewPreparation.String;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "aabbbavavbbbaa";
        str = str.toLowerCase();
        String str1 = "abba".toLowerCase();
        String str2 = "madaM".toLowerCase();
        System.out.println("IsPalindrome1 :: " + isPalindrome1(str2));
        //2.
        //System.out.println("IsPalindrome2 ::" + str.equalsIgnoreCase(new StringBuilder(str).reverse().toString()));   System.out.println("IsPalindrome3 :: " + isPalindrome2("madam"));
        System.out.println("IsPalindrome3 :: " + isPalindrome2(str2));
    }

    //1.
    public static boolean isPalindrome1(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                //System.out.println("Not a Palindrome!!");
                return false;
            }
            start++;
            end--;
        }
        //System.out.println("String is Palindrome !!");
        return true;
    }
    //3.
    public static boolean isPalindrome2(String s) {
        for (int i=0,j=s.length()-1; i<j; i++,j--) {
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)))
                return false;
        }
        return true;
    }
}
