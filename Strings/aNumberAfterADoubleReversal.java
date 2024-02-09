package Strings;

public class aNumberAfterADoubleReversal {
    public static boolean reversal(){
        int num = 526;
        if (num == 0 || !String.valueOf(num).endsWith("0")) {
            return true;
        }
        return false;



        // int num = 0;
        // char[] c_original = String.valueOf(num).toCharArray();
        // int[] new_original = new int[c_original.length];

        // int j = 0;
        
        // for (int i = c_original.length -1 ; i >= 0; i--) {
        //     new_original[j++] = c_original[i];
        // } 
        
        // for (int i : new_original) {
        //     if ( (i - '0') == 0) {
        //         System.out.println(false);
        //         break;
        //     } else {
        //         System.out.println(true);
        //         break;
        //     }
        // }
        
        
       

        

    }
    public static void main(String[] args) {
        System.out.println(reversal());
    }
}
