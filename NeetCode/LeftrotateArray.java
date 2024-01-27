package NeetCode;


public class LeftrotateArray {
    public static void array(){
        int[] nums = {1,2,3,4,5,6,7};
        // int k = 3;
        int temp = nums[0];

        for (int i = 1; i < nums.length; i++) {
            nums[i-1] = nums[i];
        }
        nums[nums.length - 1] = temp;

        for (int i : nums) {
            System.out.println(i);
        }

    }
    public static void main(String[] args) {
        array();
    }
}
