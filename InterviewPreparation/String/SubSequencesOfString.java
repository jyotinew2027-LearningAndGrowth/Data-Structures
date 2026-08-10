package InterviewPreparation.String;

import java.util.ArrayList;
import java.util.List;

public class SubSequencesOfString {
    public static void main(String[] args) {
        System.out.println("Subsequences :: " + getSubsequences("aab"));
    }
    private static void getSubsequencesUtil(String s,int index,StringBuilder current,List<String> result){
        if (index == s.length()) {
            result.add(current.toString());
            return;
        }
        //exclude current char
        getSubsequencesUtil(s,index+1,current,result);
        //include current character
        current.append(s.charAt(index));
        getSubsequencesUtil(s,index+1,current,result);
        //backtrack by removing last character
        current.deleteCharAt(current.length()-1);
    }
    public static List<String> getSubsequences(String str) {
        List<String> result = new ArrayList<>();
        StringBuilder current = new StringBuilder();
        getSubsequencesUtil(str,0,current,result);
        return result;
    }
}
