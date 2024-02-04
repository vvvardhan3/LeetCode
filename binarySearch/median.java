package binarySearch;

import java.util.Arrays;

public class median {
    public static void main(String[] args) {
        int[] nums1 = {2,4,6};
        int[] nums2 = {1,3};

        int[] output = new int[nums1.length + nums2.length];
        int j = 0;

        for (int i = 0; i < nums1.length; i++) {
            output[j++] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            output[j++] =  nums2[i];  
        }
        Arrays.sort(output);
        int sum = 0;
        for (int i = 0; i < output.length; i++) {
            sum = sum + output[i];
        }

        double median =0;

        if (output.length % 2 == 0) {
            median = ((double)output[output.length / 2] + (double)output[output.length / 2 - 1]) / 2;
        } else {
            median = output[output.length / 2];
        }

        System.out.println(median);


    }
}
