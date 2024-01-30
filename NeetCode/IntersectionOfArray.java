package NeetCode;

public class IntersectionOfArray {
    public static void Intersection(){
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int n = nums1.length;
        int m = nums2.length;
        int i = 0;
        int j = 0;
        int temp = 0;
        
        while (i<n && j<m) {
            if (nums1[i] == nums2[j]) {
                temp = nums1[i];
            }
        } System.out.println(temp);
    }
    public static void main(String[] args) {
        Intersection();
    }
}
