package Array;

import java.util.HashSet;

public class intersectionofTwoArrays {
    public static void intersection(){
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
      

        for (Integer i : nums1) {
            set1.add(i);
        }
        
        for (Integer i : nums2) {
            if (set1.contains(i)) {
                set2.add(i);
            }
        }

        int[] result = new int[set2.size()];
        int index = 0;
        for (int num : set2) {
            result[index++] = num;
        }

        System.out.println(result); 

    }
    public static void main(String[] args) {
        intersection();
    }
}
