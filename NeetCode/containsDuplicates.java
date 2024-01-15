package NeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class containsDuplicates {
    public static boolean duplicate(){
        Integer[] nums = {1,2,3,1,2};
        // int i = 0;
        List<Integer> list = new ArrayList<>(Arrays.asList(nums));

        Collections.sort(list);
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                return true;
            }
        }
        return false; 
        
    }
    public static void main(String[] args) {
        boolean hasDuplicates = duplicate();
        System.out.println("Contains duplicates? " + hasDuplicates);
    
    }
}
