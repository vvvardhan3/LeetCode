package Strings;

import java.util.Arrays;

public class ransomNote {

    public static boolean canConstructRansomNote() {
        String ransomNote = "aab";
        String magazine = "baa";

        // Convert strings to char arrays and sort them
        char[] ransomNoteChars = ransomNote.toCharArray();
        char[] magazineChars = magazine.toCharArray();
        Arrays.sort(ransomNoteChars);
        Arrays.sort(magazineChars);

        // Use two pointers to compare the characters of both arrays
        int i = 0, j = 0;
        while (i < ransomNoteChars.length && j < magazineChars.length) {
            if (ransomNoteChars[i] == magazineChars[j]) {
                i++; // Found a matching character, move to the next character in ransomNote
            }
            j++; // Always move to the next character in magazine
        }

        // If i reached the end of ransomNoteChars, it means all characters were found in magazine
        return i == ransomNoteChars.length;
    }

    public static void main(String[] args) {
        boolean result = canConstructRansomNote();
        System.out.println("Can construct ransom note: " + result); // Expected: true
    }
}
