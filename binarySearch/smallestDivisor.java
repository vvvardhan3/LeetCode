package binarySearch;

public class smallestDivisor {

    public static int findSmallestDivisor() {
        int[] nums = {1, 2, 5, 9};
        int threshold = 6;

        int maxNum = 0;
        for (int num : nums) {
            maxNum = Math.max(maxNum, num);
        }

        int left = 1, right = maxNum;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isValid(nums, mid, threshold)) {
                right = mid; 
            } else {
                left = mid + 1; 
            }
        }
        return left;  
    }

    private static boolean isValid(int[] nums, int divisor, int threshold) {
        int sum = 0;
        for (int num : nums) {
            sum += Math.ceil((double) num / divisor);
        }
        return sum <= threshold;
    }

    public static void main(String[] args) {
        System.out.println(findSmallestDivisor());
    }
}
