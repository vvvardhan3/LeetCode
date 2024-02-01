package binarySearch;

public class upperBound {
    public static int upper(){
        int[] nums = {3,5,8,9,15,19};
        int x = 20;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > x) {
                return i;
            }
        }
        return nums.length;
    }
    public static void main(String[] args) {
        System.out.println(upper());
    }
}
