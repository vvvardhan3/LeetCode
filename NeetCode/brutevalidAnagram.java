package NeetCode;

import java.util.Arrays;

public class brutevalidAnagram {
    public static boolean anagram(){
        String s = "anagram";
        String t = "nagaram";

        if (s.length() > t.length()) {
            System.out.println("False");
        }

        char[] s_char = s.toCharArray();
        char[] t_char = t.toCharArray();

        

        Arrays.sort(s_char);
        Arrays.sort(t_char);
        //int sum_c_char = 0;
        //int sum_t_char = 0;
        

        // for (int i = 0; i < s_char.length; i++) {
        //     char Character = s_char[i];
        //     // System.out.println(Character);
        //     ascii = (int) Character;
        //     sum_c_char = ascii + sum_c_char;
            
        // }  System.out.println("s_char: " + sum_c_char);

        // for (int i = 0; i < t_char.length; i++) {
        //     char Character = t_char[i];
        //     // System.out.println(Character);
        //     ascii = (int) Character;
        //     sum_t_char = ascii + sum_t_char;
            
        // } System.out.println("t_char: " + sum_t_char);

        // if (sum_c_char == sum_t_char) {
        //     return true;
        // }
        // return false;

        // System.out.println(ascii);

        // List<Character> list_s = new ArrayList<>();
        // List<Character> list_t = new ArrayList<>();

        // for (char string : s_char) {
        //     list_s.add(string);
            
        // }

        // for (char string : t_char) {
        //     list_t.add(string);
            
        // }

        // System.out.println(list_s);


 
        // if (list_s.containsAll(list_t)) {
        //     System.out.println("True");
        // } else {
        //     System.out.println("False");
        // }
        if (Arrays.equals(s_char, t_char)) {
            return true;
        }

        return false;
        
    }
    public static void main(String[] args) {
        boolean isAnagram = anagram();
        System.out.println("Is Anagram?: " + isAnagram);
        
        
        
    }
}
