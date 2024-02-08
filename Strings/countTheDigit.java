package Strings;

public class countTheDigit {
    public static void count(){
        int num = 1248;
        String s = String.valueOf(num);
        char[] c = s.toCharArray();
        int count = 0;

        for (char d : c) {
            if (num % (d - '0') == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        count();
    }
}
