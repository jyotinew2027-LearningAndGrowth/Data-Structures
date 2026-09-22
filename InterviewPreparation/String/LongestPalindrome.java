package InterviewPreparation.String;

public class LongestPalindrome {

    //1. brute force
    public static String longestPalindrome(String s) {
        for (int len = s.length();len > 0;len--) {
            for (int start = 0;start <= s.length()-len;start++) {
                if (check(start,start+len,s)) {
                    return s.substring(start,start+len);
                }
            }
        }
        return "";
    }
    private static boolean check(int i,int j,String s) {
        int left = i;
        int right = j-1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    //2.
    public static String longestPalindrome2(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int[] ans = new int[] {0,0};
        for (int i=0;i<n;i++) {
            dp[i][i] = true;
        }
        for (int i=0;i<n-1;i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                dp[i][i+1] = true;
                ans[0] = i;
                ans[1] = i+1;
            }
        }
        for (int diff = 2;diff <n;diff++) {
            for (int i=0;i<n-diff;i++) {
                int j=i+diff;
                if (s.charAt(i) == s.charAt(j) && dp[i+1][j-1]) {
                    dp[i][j] = true;
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        int i=ans[0];
        int j=ans[1];
        return s.substring(i,j+1);
    }

    //3.
    public static String longestPalindrome3(String s) {
        int[] ans = new int[]{0,0};
        for (int i=0;i<s.length();i++) {
            int oddLength = expand(i,i,s);
            if (oddLength > ans[1] - ans[0]+1) {
                int dist = oddLength/2;
                ans[0] = i-dist;
                ans[1] = i+dist;
            }
            int evenLength = expand(i,i+1,s);
            if (evenLength > ans[1] - ans[0] +1) {
                int dist = (evenLength/2)-1;
                ans[0] = i-dist;
                ans[1] = i+1+dist;
            }
        }
        int i=ans[0];
        int j= ans[1];
        return s.substring(i,j+1);
    }

    private static int expand(int i,int j,String s) {
        int left = i;
        int right = j;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }


    public static void main(String[] args) {
        System.out.println("Longest Palindrome :: " + longestPalindrome("cbbd"));
    }
}
