package NeetCode;

import java.util.*;

public class searchInsertPosition {
    public static void position(){
        int[] nums = {1,3,5,6};
        int target = 7;
        int temp = 0;
        List<Integer> list = new ArrayList<>();
        for (Integer integer : nums) {
            list.add(integer);
        }
        
        if (list.contains(target)) {
            for (int i = 0; i < list.size(); i++) {
                if (nums[i] == target) {
                    temp = i;
                }
            }
        } else {
            list.add(target);
            Collections.sort(list);
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == target) {
                    temp = i;
                }
            }
        }
        System.out.println(temp);

        
    }
    public static void main(String[] args) {
        position();
    }
}
