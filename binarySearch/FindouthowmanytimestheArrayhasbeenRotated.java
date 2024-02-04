package binarySearch;

public class FindouthowmanytimestheArrayhasbeenRotated {
    public static void times(){
        int[] nums = {4,5,6,7,0,1,2,3};
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[count]) {
                count = i;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        times();
    }
}
