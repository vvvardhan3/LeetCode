package Array;

import java.util.ArrayList;
import java.util.HashMap;

public class countElementswithMaximumFrequency {
    public static int frequency(){
        int[] nums = {1,2,1,3,4,5};
        HashMap<Integer,Integer> map = new HashMap<>();

        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
            if (map.containsKey(nums[i]) && map.get(nums[i]) > max) {
                max = map.get(nums[i]);
            } 
        }

        int count = 0;

        ArrayList<Integer> list = new ArrayList<>(map.values());

        for (Integer i : list) {
            if (i == max) {
                count+=i;
            }
        }
        return count;

        
    }
    public static void main(String[] args) {
        System.out.println(frequency());
    }
}
