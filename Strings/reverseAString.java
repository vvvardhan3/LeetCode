package Strings;

public class reverseAString {
    public static void main(String[] args) {
        String s = " The Sky is blue ";

        String[] s_t = s.trim().split("//s+");
        String Output = "";

        for (int i = s_t.length - 1 ; i > 0 ; i--) {
            Output += s_t[i] + " ";
        }

        System.out.println(Output + s_t[0]);
    }
}
