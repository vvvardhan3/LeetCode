package binarySearch;

public class countOccurrencesinSortedArray {
    public static void occurrence(){
        int[] nums = {1, 1, 2, 2, 2, 2, 2, 3};
        int target = 2;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                count++;
            } 
        } System.out.println(count);
    }
    public static void main(String[] args) {
        occurrence();
    }
}
