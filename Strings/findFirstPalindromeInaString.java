package Strings;

public class findFirstPalindromeInaString {
    public static void palindrome(){
        String[] words = {"abc","car","ada","racecar","cool"};
        StringBuffer sb = new StringBuffer();

        for (String string : words) {
            sb.setLength(0);
            sb.append(string);
           if (sb.toString().equals(sb.reverse().toString())) {
                System.out.println(string);
                return ;
           }
        }
    }
    public static void main(String[] args) {
        palindrome();
    }
}
