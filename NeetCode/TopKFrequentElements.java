package NeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class TopKFrequentElements {
    public static void topKFrequent() {
        int[] nums = {3,3,1,1,1,3,2,3,2,1,1,3};
        int k = 2;

        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i]==nums[j]) {
                    count++; 
                } 
            } map.put(nums[i],count);
        } System.out.println(map);

       Queue<Integer> heap = new PriorityQueue<>((n1, n2) -> map.get(n1) - map.get(n2));

        // Add elements to the heap and maintain only k most frequent elements
        for (int n : map.keySet()) {
            heap.add(n);
            if (heap.size() > k) {
                heap.poll();
            }
        }

        // Extract top k elements from the heap
        int[] topElements = new int[k];
        for (int i = 0; i < k; i++) {
            topElements[i] = heap.poll();
            System.out.println(topElements[i]);
        }

        

        

        
        
    }

    public static void main(String[] args) {
    topKFrequent();
    }
}
