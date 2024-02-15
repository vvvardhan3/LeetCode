package Math;

public class signOfProductOfArray {
    public static int product(){
        int[] nums = {1,2,3,-1,-5,-5,-9,-1};
        // int product = 1;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                return 0;
            } else if (nums[i] < 0) {
                count++;
            }
        } 
        if (count == 0 || count % 2 == 0) {
            return 1;
        }

        return -1;
        
        
    }
    public static void main(String[] args) {
        System.out.println(product());
    }
}
