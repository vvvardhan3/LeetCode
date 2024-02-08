package Strings;

public class subtractProductSumDigitsInteger {
    public static void operation(){
        int n = 234;
        String s = String.valueOf(n);
        char[] chars = s.toCharArray();
        int product = 1;
        int sum = 0;
        
        for (char c : chars) {
            product = product * (c - '0');
            sum = sum + (c - '0');
        }
        
        System.out.println(product - sum);
    }
    public static void main(String[] args) {
        operation();
    }
}
