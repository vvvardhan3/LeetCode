package Strings;

public class reverseWordsinString {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        StringBuffer sb = new StringBuffer();

        String[] st = s.split(" ");

        // System.out.println(st.length);

        for (int i = 0; i < st.length; i++) {
            sb.append(new StringBuffer(st[i]).reverse());
            sb.append(" ");
        }

        System.out.println(sb);
        
    }
}
