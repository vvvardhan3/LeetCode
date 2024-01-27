package NeetCode;

public class removeDuplicatesFromSortedArraysII {
    public static void duplicates(){
        int[] nums = {0,0,1,1,1,1,2,3,3,3};
        int count = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[i-2]) {
                nums[count] = nums[i];
                count++;
            }
        } System.out.println(count);
    }
    public static void main(String[] args) {
        duplicates();
    }
}
