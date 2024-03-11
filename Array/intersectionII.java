package Array;

import java.util.HashMap;
import java.util.Map;

public class intersectionII {
    public static void intersection() {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};

        // Count occurrences of elements in nums1
        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : nums1) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        // Print common elements based on occurrences in nums2
        for (int num : nums2) {
            if (counts.containsKey(num) && counts.get(num) > 0) {
                System.out.println(num);
                counts.put(num, counts.get(num) - 1); // Decrement count
            }
        }
    }

    public static void main(String[] args) {
        intersection();
    }
}
