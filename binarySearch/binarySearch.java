package binarySearch;

public class binarySearch {
    public static int search(){
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        int low = 0;
        int high = nums.length-1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) return mid;
            else if (target > nums[mid]) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(search());
    }
}
