package InterviewPreparation.Recursion;

import java.util.ArrayList;
import java.util.List;

public class LuckyNum {
    public static void main(String[] args) {
        int n = 19;
        if (isLucky(n)) {
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
    public static boolean isLucky(int n) {
        List<Integer> NumList = new ArrayList<>();
        for (int i=1;i<=n;i++) {
            NumList.add(i);
        }
        int k=2;
        while (k<=NumList.size()) {
            List<Integer> next_num=new ArrayList<>();
            for (int i=0;i<NumList.size();++i) {
                if ((i+1) % k != 0) {
                    next_num.add(NumList.get(i));
                }
            }
            NumList = next_num;
            k++;
        }
        return NumList.contains(n);
    }
}
