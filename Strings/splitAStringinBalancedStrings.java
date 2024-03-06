package Strings;

public class splitAStringinBalancedStrings {
    public static void split(){
        String s = "RLRRRLLRLL";

        int r_count = 0;
        int l_count = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                r_count++;              
            } else {
                l_count++;
            }

            if (l_count == r_count) {
                count++;
            }
        }

       

        System.out.println(count);
    }
    public static void main(String[] args) {
        split();
    }
}
