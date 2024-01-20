package NeetCode;

import java.util.ArrayList;

public class twoSum_SortedArray {
    public static void twosum(){
        int[] nums = {2,7,11,15};
        int target = 9;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    list.add(i + 1);
                    list.add(j + 1);
                }
            }
        } System.out.println(list);

    }
    public static void main(String[] args) {
        twosum();
    }
}
