package NeetCode;

import java.util.*;

public class threeSum {
    public static void sum(){
        int[] nums = {-1,0,1,2,-1,-4};
        int length = nums.length;
        Set<List<Integer>> st = new HashSet<>();
        
        // for (int i = 0; i < length; i++) {
        //     for (int j = i + 1; j < length; j++) {
        //         for (int k = j +1; k < length; k++) {
        //             if (nums[i] + nums[j] + nums[k] == 0 ) {
        //                 List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k]);
        //                 temp.sort(null);
        //                 st.add(temp);
        //             }
        //         }
        //     } 
        // } System.out.println(st);

        for (int i = 0; i < length; i++) {
            HashSet<Integer> hash = new HashSet<>();
            for (int j = i + 1; j < length; j++) {
                int third = -(nums[i]+nums[j]);
                if (hash.contains(third)) {
                    List<Integer> temp = Arrays.asList(nums[i],nums[j],third);
                    temp.sort(null);
                    st.add(temp);
                }
                hash.add(nums[j]);
            }
        } System.out.println(st);

    }
    public static void main(String[] args) {
        sum();
    }
}
