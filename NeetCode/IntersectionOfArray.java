package NeetCode;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfArray {
    public static void Intersection(){
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int n = nums1.length;
        int m = nums2.length;
        int i = 0;
        int j = 0;
        List<Integer> list = new ArrayList<>();
        while (i<n && j<m) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums2[j] < nums1[i]) {
                j++;
            } else {
                list.add(nums1[i]);
                i++;
                j++;
            }
        } 
        int[] result = new int[list.size()];
        int k = 0;
        for (int num : list) {
            result[k++] = num;
        }
        for (int ele : result) {
            System.out.println(ele);
        }
        
       
    }
    public static void main(String[] args) {
        Intersection();
    }
}
