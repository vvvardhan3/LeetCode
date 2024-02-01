package NeetCode;

import java.util.HashSet;

public class firstLetterToApperTwice {
    public static char letter(){
        String s = "abccbaacz";
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char nch = s.charAt(i);
            if (set.contains(nch)) {
                return nch;
            }
            set.add(nch);
        }
        return 0;
    }
    public static void main(String[] args) {
        letter();
    }
    
}
