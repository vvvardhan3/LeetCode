package Strings;
 

public class MInimumSumOfFourDigits {
    public static void minimum(){
        int num = 2932;
        String s = String.valueOf(num);
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i] - '0');
        }

        
        
        


    }
    public static void main(String[] args) {
        minimum();
    }
}
