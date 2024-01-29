package NeetCode;

public class moveZeros {
    public static void zeros(){
        int[] nums = {0,1,0,3,12};
        int n = nums.length;
        // int az = 0;
        // int z = 0;
        
        // while (az < n) {
        //     if (nums[az] != 0) {
        //         int temp = nums[az];
        //         nums[az] = nums[z];
        //         nums[z] = temp;
        //         az++;
        //         z++;
        //     } else {
        //         az++;
        //     }
        // }
        // for (int i : nums) {
        //     System.out.println(i);
        // }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[count++] = nums[i];
            }    
        }
        while (count < nums.length) {
            nums[count++] = 0;
        }

        for (int i : nums) {
            System.out.println(i);
        }


    }
    public static void main(String[] args) {
        zeros();
    }
}
