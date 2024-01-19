package NeetCode;

import java.util.Stack;

public class encodeDecodeAString {
    public static void encode(){
        String[] input = {"Vishnu","Vardhan"};
        String result = " ";


        for (String string : input) {
            result = string.length() + "[" + string + "]";
            System.out.println(result);
        }

        Stack<Integer> intstack = new Stack<>();
        Stack<String> stringstack = new Stack<>();

        for (Character c : result.toCharArray()) {
            System.out.println(c);
        }


    }
    public static void main(String[] args) {
        encode();
    }
}
