package Queue;

import java.util.HashSet;

public class checkIfTheSentenceIsPangram {
    public static boolean sentence(){
        String s = "thequickbrownfoxjumpsoverthelazydog";

        // if (s.length() > 26) {
        //     return false;
        // } 

        HashSet<Character> character_s = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            character_s.add(s.charAt(i));
        }


        return character_s.size() == 26;
    }
    public static void main(String[] args) {
        System.out.println(sentence());
    }
}
