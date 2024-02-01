package binarySearch;

public class lowerBound {
    public static int lower(){
        int[] nums = {3,5,8,15,19};
        int x = 9;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= x) {
                return i; // O(log N)
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(lower());
    }
}
