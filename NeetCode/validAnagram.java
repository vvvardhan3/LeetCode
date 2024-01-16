package NeetCode;

public class validAnagram {
    public static boolean anagram(){

        String s = "anagram" ;
        String t = "nagaram" ;

        if (s.length() != t.length()) {
            return false;
        } else {

            int[] count = new int[26];

            for (int i = 0; i < s.length(); i++) {
                count[s.charAt(i) - 'a']++;
            }

            for (int i = 0; i < t.length(); i++) {
                count[t.charAt(i) - 'a']--;
            }

            for (int i = 0; i < count.length; i++) {
                if (count[i] != 0) {
                    return false;
                }
            }
        }

        return true;
        
    }
    public static void main(String[] args) {
        boolean IsAnagram = anagram();
        System.out.println("Is Anagram?: " + IsAnagram);
    }
}
