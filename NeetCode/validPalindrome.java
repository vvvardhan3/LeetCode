package NeetCode;

public class validPalindrome {
    public static void main(String[] args) {
        String Name = "A man, a plan, a canal: Panama";
        String lower_name = Name.toLowerCase();
        String modified_name = lower_name.replaceAll("[^a-zA-Z0-9]", "");
        int length = modified_name.length();
        String temp = "";
       
        for (int i = length -1 ; i >= 0; i--) {
            String newtemp = String.valueOf(modified_name.charAt(i));
            temp = temp + newtemp;
            
        } 

        if (modified_name.equals(temp)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }


        /* This is Ok Ok Solution, Need to get linear time complexitic solution */

    } 
}
