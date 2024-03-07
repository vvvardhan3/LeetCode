package Strings;

public class breakAPalindrome {
    public static String palindrome(){
        String palindrome = "a";

        char[] c = palindrome.toCharArray();
        if (c.length < 2) {
            return "";
        }
        for (int i = 0; i < c.length/2; i++) {
            if (c[i] != 'a') {
                c[i] = 'a';
                return String.valueOf(c);
            }
        }
        c[c.length - 1] = 'b';
        return String.valueOf(c);
    }
    public static void main(String[] args) {
        System.out.println(palindrome());
    }
}
