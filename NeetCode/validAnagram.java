package NeetCode;

import java.util.ArrayList;

import java.util.List;

public class validAnagram {
    public static void anagram(){
        String s = "rat";
        String t = "car";

        if (s.length() > t.length()) {
            System.out.println("False");
        }

        char[] s_char = s.toCharArray();
        char[] t_char = t.toCharArray();

        List<Character> list_s = new ArrayList<>();
        List<Character> list_t = new ArrayList<>();

        for (char string : s_char) {
            list_s.add(string);
            
        }

        for (char string : t_char) {
            list_t.add(string);
            
        }
 
        if (list_s.containsAll(list_t)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        
    }
    public static void main(String[] args) {
        anagram();
    }
}
