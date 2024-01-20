package NeetCode;

import java.util.HashSet;
import java.util.Set;

public class longestConsecutiveSequence {
    public static int sequence(){
        int[] nums = {100,4,200,1,3,2};
        int n = nums.length;
        int longest = 1;

        if (n == 0) {
            return 0;
        } else {
            Set<Integer> set = new HashSet<>();
            for (Integer integer : nums) {
                set.add(integer);
            }

            for (Integer integer : set) {
                if (!set.contains(integer-1)) {
                    int count = 1;
                    int x = integer;
                    while (set.contains(x+1)) {
                        x++;
                        count++;
                    }
                    longest = Math.max(longest, count);
                }
            }
            return longest;
        }
        
       
       
    } 
    
    public static void main(String[] args) {
        sequence();
    }
}
