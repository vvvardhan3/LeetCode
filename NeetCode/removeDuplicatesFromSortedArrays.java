package NeetCode;

public class removeDuplicatesFromSortedArrays {
    public static void duplicates(){
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int l = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                nums[l] = nums[i];
                l++;
            } 
        } 
    }
    public static void main(String[] args) {
        duplicates();
    }
}
