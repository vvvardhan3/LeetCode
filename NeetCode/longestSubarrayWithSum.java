package NeetCode;

public class longestSubarrayWithSum {
    public static void sum(){
        int nums[] = {2,3,5,1,9};
        int sumNum = 10;
        int len = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i ; j < nums.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += nums[k];
                }
                if (sum == sumNum) {
                    len = Math.max(len,j-i+1);
                }
            }
        }
        System.out.println(len);
    }
    public static void main(String[] args) {
        sum();
    }
}
