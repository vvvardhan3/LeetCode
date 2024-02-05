package Strings;

public class largestOddNUmber {
    public static String largest(){
        String num = "12345678";

        for (int i = num.length() - 1; i >= 0; i--) {
            if ((num.charAt(i) - '0' % 2) != 0) {
                return num.substring(0,i+1);
            }
        } return "";
       
    }
    public static void main(String[] args) {
        largest();
    }
}
