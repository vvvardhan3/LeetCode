package NeetCode;

import java.util.Arrays;

public class secondSmallestElement {
    public static void main(String[] args) {

        int[] nums = {4,5,3,2,1,6,7,8};
        Arrays.sort(nums);
        int smallestNumber = nums[0];
        int secondSmallestElement = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]<smallestNumber) {
                smallestNumber = nums[i];
            }
        }

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != smallestNumber) {
                secondSmallestElement = nums[i];
                break;
            }
        }
        System.out.println(secondSmallestElement);
    }
}
