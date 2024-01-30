// Returns Unique elements
package NeetCode;

import java.util.HashSet;
import java.util.Set;

public class Intersection {
    public static void Intersections() {
        int[] nums1 = {1,2,2,3,3,4,5,6};
        int[] nums2 = {2,3,3,5,6,6,7};
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            if (set1.contains(num)) {
                intersection.add(num);
            }
        }

        // Convert the intersection set to an array
        int[] result = new int[intersection.size()];
        int k = 0;
        for (int num : intersection) {
            result[k++] = num;
        }

        // Print the result
        for (int ele : result) {
            System.out.println(ele);
        }
    }

    public static void main(String[] args) {
        Intersections();
    }
}
