package InterviewPreparation.String;

import java.util.Arrays;

public class ValidAnagrams {

    //1. O(n log n)
    public static boolean validAnagrams(String s1,String s2) {
        if(s1.length() != s2.length()) {
            return false;
        }
        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
    return Arrays.equals(str1,str2);
    }

    //2.
    public boolean isAnagram(String s1,String s2) {
        if (s1.length() != s2.length()){
            return false;
        }
        int[] counter = new int[26];
        for (int i=0;i< s1.length();i++) {
            counter[s1.charAt(i) - 'a']++;
            counter[s2.charAt(i) - 'a']--;
        }
        for (int count : counter) {
            if (count != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "anagram";
        String s2 = "nagara";
        System.out.println("isValidAnagrams :: " + validAnagrams(s1,s2));
    }
}
