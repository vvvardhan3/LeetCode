// Remove Duplicates from the Sorted Array
package Day07;

import java.util.HashSet;
import java.util.Set;

public class removeDuplicatedfromSortedArray {
    public static void nums(){
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int num = 0;
        Set<Integer> set=new HashSet<Integer>();

        if (nums.length == 0) {
            System.out.println(num);
        } else{
            for (int i : nums) {
            set.add(i);
        }
        System.out.println(set);
        }    
    }
    public static void main(String[] args) {
        nums();
    }
    



}
