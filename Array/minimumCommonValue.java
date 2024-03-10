package Array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

import Strings.breakAPalindrome;

public class minimumCommonValue {
    public static void value(){
        int[] nums1 = {1,2,3,4,5,6}; 
        int[] nums2 = {2,4,5,6};

        HashSet<Integer> set = new HashSet<>();

        for (Integer i : nums1) {
            set.add(i);
        }
        for (Integer i : nums2) {
            if (set.contains(i)) {
                System.out.println(i);
                break;
            }
        }



        
    }
    public static void main(String[] args) {
        value();
    }
}
