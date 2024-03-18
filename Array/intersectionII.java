package Array;

import java.util.ArrayList;

public class intersectionII {
    public static void intersection(){
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};

        ArrayList<Integer> list1 = new ArrayList<>();
    
        for (Integer i : nums1) {
            list1.add(i);
        }

        for (Integer i : nums2) {
            if (list1.contains(i)) {
                System.out.println(i);
                
            }
        

        }

        
        
        

    }
    public static void main(String[] args) {
        intersection();
    }
    
}
