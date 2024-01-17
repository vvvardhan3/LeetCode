package NeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class productOfArrayExceptSelf {
    public static void product(){
        Integer[] nums = {-1, 1, 0, -3, 3};
        ArrayList<Integer> arraylist = new ArrayList<>();

        

        for (Integer integer : nums) {
            List<Integer> list = new ArrayList<>(Arrays.asList(nums));
            list.remove(integer);
            int mul = 1;
            for (Integer integer2 : list) {
                mul *= integer2;
            } arraylist.add(mul);
            
        }

        System.out.println(arraylist);
        
    }
    public static void main(String[] args) {
        product();
    }
}
