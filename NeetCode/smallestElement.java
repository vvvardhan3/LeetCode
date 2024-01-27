package NeetCode;

public class smallestElement {
    public static void main(String[] args) {
        int[] nums = {4,5,3,2,1,6,7,8};
        int smallestNumber = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]<smallestNumber) {
                smallestNumber = nums[i];
            }
        }
        System.out.println(smallestNumber);
    }
}
