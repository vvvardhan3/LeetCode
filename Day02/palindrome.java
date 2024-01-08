// If Given is Palindrome Number, Then return true!
package Day02;
public class palindrome {
    public static boolean number(){

        int input = 121;
        String s_input = Integer.toString(input);

        String new_input = ""; 

        for (int i = s_input.length() - 1; i >= 0; i--) {
            new_input += s_input.charAt(i);
        }
        //System.out.println(new_input);
        System.out.println(s_input.equals(new_input));

        if (s_input.equals(new_input)) {
            
        } 
        return true;
    }
    public static void main(String[] args) {
        number();
    }
}
