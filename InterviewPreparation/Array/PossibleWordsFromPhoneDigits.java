package InterviewPreparation.Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PossibleWordsFromPhoneDigits {
    public static void main(String[] args) {

    }
   /* private List<String> combinations = new ArrayList<>();
    private Map<Character,String> letters =  Map.of(
            '2',"abc",'3',"def",'4',"ghi",'5',"jkl",'6',"mno",'7',"pqrs",'8', " tuv",'9',"wxyz"
    );
    private String phoneDigits;
    String[] possibleWordsFromDigits(int[] arr) {
        String curr = "";
        String[] result;
        possibleWordsFromDigitsUtil(0,arr,curr,result);
        return result;
    }
    void possibleWordsFromDigitsUtil(int i,int[] arr,String curr,String[] result) {
        if (i == arr.length) {
            result[curr];
            return;
        }
        String word = keypad(arr[i]);
        for (char ch : word) {
            curr[ch];
            possibleWordsFromDigitsUtil(i+1,arr,curr,result);
            curr.pop_back();
        }
    } */
}
