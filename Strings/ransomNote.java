package Strings;

import java.util.Arrays;

public class ransomNote {

    public static boolean note(){
        String ransomNote = "aa";
        char[] ransomNote_c = ransomNote.toCharArray();
        String magazine = "aab";
        char[] magazine_c = magazine.toCharArray();

        int i = 0;
        int j=0;

        Arrays.sort(ransomNote.toCharArray());
        Arrays.sort(magazine.toCharArray());

        while(i<ransomNote.length()&&j<magazine.length()) {
            if (ransomNote_c[i] == magazine_c[j]) {
                i++;
            }
            j++;
        }
        return i == ransomNote.length();

    }
    public static void main(String[] args) {
       System.out.println( note());
    }
}
