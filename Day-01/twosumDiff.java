import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;


public class twosumDiff {
    public static class twosum {
    public static void sum1(){
        Integer[] nums = new Integer[]{3,3};
        Integer target = 6;
        LinkedList<Integer> ll = new LinkedList<>(Arrays.asList(nums));
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < ll.size(); i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    array.add(i);
                    array.add(j);
                    System.out.println(array);
                }
            }
            
        }
        
    }
    public void main(String[] args) {
        sum1();
    }
}

    
}
