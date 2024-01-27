package NeetCode;

import java.util.ArrayList;
import java.util.List;

public class moveZeros {
    public static void zeros(){
        int[] nums = {0,1,0,3,12};
        int n = nums.length;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                list.add(nums[i]);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }

        for (int i = list.size(); i < n; i++) {
            nums[i] = 0;
        }

        for (Integer integer : nums) {
            System.out.println(integer);
        }


    }
    public static void main(String[] args) {
        zeros();
    }
}
