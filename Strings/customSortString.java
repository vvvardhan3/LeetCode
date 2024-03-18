package Strings;

public class customSortString {
    public static void custom(){
        String order = "cba";
        String s = "abcd";

        int[] freq = new int[26];

        for (int i : s.toCharArray()) {
            freq[i - 'a']++;
        }

        StringBuffer ans = new StringBuffer();

        for (char i : order.toCharArray()) {
            while (freq[i - 'a'] > 0) {
                ans.append(i);
                freq[i - 'a']--;
            }
        }

        for (int i = 0; i < 26; i++) {
            int freqC = freq[i];
            while (freqC > 0) {
                ans.append((char)(i+'a'));
                freqC--;
            }
        }

        System.out.println(ans.toString());




    }
    public static void main(String[] args) {
        custom();
    }
}
