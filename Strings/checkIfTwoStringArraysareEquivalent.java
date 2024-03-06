package Strings;

public class checkIfTwoStringArraysareEquivalent {
    public static boolean check(){
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        String w1 = "";
        String w2 = "";

        for (String s : word1) {
            w1 += s;
        }
        
        for (String s : word2) {
            w2 += s;
        }

        if (w1.equals(w2)) {
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        System.out.println(check());
    }
}
