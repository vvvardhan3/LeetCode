package NeetCode;

import java.util.HashSet;
import java.util.Set;

public class unionOfTwoSortedArrays {
    public static void array(){
        int[] nums1 = {1,1,2,3,4,6};
        int[] nums2 = {1,2,2,4,5,6,7};
        
        Set<Integer> set = new HashSet<>();

        for (Integer integer : nums1) {
            set.add(integer);
        }
        for (Integer integer : nums2) {
            set.add(integer);
        }

        int[] union = new int[set.size()];
        int i = 0;
        for (Integer integer : set) {
           union[i++] = integer;
        }
        for (int integer : union) {
            System.out.println(integer);
        }
    }
    public static void main(String[] args) {
        array();
    }
}
