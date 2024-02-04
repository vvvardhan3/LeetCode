package binarySearch;

import java.util.Arrays;

public class SquareOfEachElementInSorted {
    public static void squares(){
        int[] nums = {-7,-3,2,3,11};
        int k = 0;
        int[] output = new int[nums.length];
    
        for (int i = 0; i < nums.length; i++) {
            output[k++] = nums[i]*nums[i];
        }
        Arrays.sort(output);
       
    }
    public static void main(String[] args) {
        squares();
    }
}
