package NeetCode;

import java.util.Stack;

public class encodeDecodeAString {
    public static void encode(){
        String[] input = {"Vishnu","Vardhan"};
        String result = " ";
        
        String finalOutput = "";

        

        for (String string : input) {
            String temp = string.length() + "[" + string + "]";
            result = result + temp;
        } System.out.println(result);
        

        Stack<Integer> intstack = new Stack<>();
        Stack<Character> stringstack = new Stack<>();

        char[] charresult = result.toCharArray();

        for (char c : charresult) {   
            if (Character.isDigit(c)) {
                intstack.push(Character.getNumericValue(c));
            } else {
                stringstack.push(c);
            }
        } 
        System.out.println(intstack);
        System.out.println(stringstack);

        
        /* Need to Work on this code more!! */



    }
    public static void main(String[] args) {
        encode();
    }
}
