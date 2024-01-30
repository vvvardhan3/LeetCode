package NeetCode;

public class maxConsecutiveOnes {
    public static void ones(){
        int[] nums = {1,1,0,1,1,1,0};
        int count = 0;
        int maximum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count = count + 1;
                maximum = Math.max(maximum, count);
            } else {
                count = 0;
            }
        }
        System.out.println(maximum);
        
    }
    public static void main(String[] args) {
        ones();
    }
}
