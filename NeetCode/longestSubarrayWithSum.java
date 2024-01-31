package NeetCode;

import java.util.HashMap;
import java.util.Map;

public class longestSubarrayWithSum {
    public static void sum(){
                // int len = 0;

        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i ; j < nums.length; j++) {
        //         int sum = 0;
        //         for (int k = i; k <= j; k++) {
        //             sum += nums[k];
        //         }
        //         if (sum == sumNum) {
        //             len = Math.max(len,j-i+1);
        //         }
        //     }
        // }
        // System.out.println(len);
        // int l = 0;
        // int r = 0;
        // int n = nums.length;
        // int sum = nums[0];

        // while (r < n) {
        //     while ( l <= r && sum > sumNum) {
        //         sum = sum - nums[l];
        //         l = l + 1;
        //     }
        //     if (sum == sumNum) {
        //         len = Math.max(len, r - l + 1);   
        //     }
        //     r++;
        //     if (r < n) {
        //         sum = sum + nums[r];
        //     }
        // }
        // System.out.println(len);
        int nums[] = {1,2,1,2,1};
        int k = 3;

        Map<Long,Integer> preSumMap = new HashMap<>();

        long sum = 0;
        int maxlen = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum == k) {
                maxlen = Math.max(maxlen, i + 1);
            }
            long rem = sum - k;

            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxlen = Math.max(maxlen, len);
            }
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum,i);
            }
        }
        System.out.println(maxlen);
    }
    public static void main(String[] args) {
        sum();
    }
}
