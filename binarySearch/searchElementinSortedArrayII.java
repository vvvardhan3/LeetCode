package binarySearch;

public class searchElementinSortedArrayII {
    public static boolean search(){
        int[] nums = {7, 8, 1, 2, 3, 3, 3, 4, 5, 6};
        int target = 0;
        for (int i : nums) {
            if (i == target) {
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        System.out.println(search());
    }
}
