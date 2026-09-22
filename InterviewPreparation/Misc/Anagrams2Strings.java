package InterviewPreparation.Misc;

import java.util.Arrays;

public class Anagrams2Strings {
    public static void main(String[] args) {
        String s1  = "silent";
        String s2 = "listenn";
        char[] charArr1 = s1.toCharArray();
        char[] charArr2 = s2.toCharArray();
        Arrays.sort(charArr1);
        Arrays.sort(charArr2);
        System.out.println(Arrays.equals(charArr1,charArr2));
    }
}
