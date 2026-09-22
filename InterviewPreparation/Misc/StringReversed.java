package InterviewPreparation.Misc;

public class StringReversed {
    public static void main(String[] args) {
        //string reverse
        StringBuilder reversedStr = new StringBuilder();
        String input = "Hello World";
        //String input = null;
        if(input == null) {
            return;
        }
        for (int i=input.length()-1;i>=0;i--) {
            reversedStr.append(input.charAt(i));
        }
        System.out.println(reversedStr.toString());
    }
}
