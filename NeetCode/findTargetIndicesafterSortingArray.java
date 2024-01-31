package NeetCode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findTargetIndicesafterSortingArray {
    public static void indices(){
        int[] nums = {1,2,5,2,3};
        int target = 5;
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                list.add(i);
            }
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        indices();
    }
}
