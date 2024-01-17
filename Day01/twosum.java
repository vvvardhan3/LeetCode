package Day01;

import java.util.ArrayList;

public class twosum {
    public static void sum(){
        int[] nums = new int[]{2,3,5,7,9};
        int target = 10;
        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    array.add(i);
                    array.add(j);
                    System.out.println(array);
                }
            }
            
        }
        
    }
    public static void main(String[] args) {
        sum();
    }
}
