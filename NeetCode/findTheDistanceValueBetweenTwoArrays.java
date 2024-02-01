package NeetCode;

public class findTheDistanceValueBetweenTwoArrays {
    public static void distance(){
        int[] nums1 = {1,4,2,3};
        int[] nums2 = {-4,-3,6,10,20,30};
        int d = 3;
        
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            boolean flag = false;
            for (int j = 0; j < nums2.length; j++) {
                if (Math.abs(nums1[i]- nums2[j]) <= d) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                count++;
            }
        }
        System.out.println(count);

    }
    public static void main(String[] args) {
        distance();
    }
}
