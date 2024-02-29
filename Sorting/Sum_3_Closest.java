package Sorting;

public class Sum_3_Closest {
    public static void closest() {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        int answer = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (Math.abs(sum - target) < Math.abs(answer - target)) {
                        answer = sum;
                    }
                }
            }
        }
        System.out.println(answer);
    }

    public static void main(String[] args) {
        closest();
    }
}
