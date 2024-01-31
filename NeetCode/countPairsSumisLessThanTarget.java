package NeetCode;

public class countPairsSumisLessThanTarget {
    public static void pairs(){
        int[] nums = {-1,1,2,3,1};
        int target = 2;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int k = i + 1; k < nums.length; k++) {
                if (nums[i] + nums[k] < target ) {
                    count++;
                }
            } 
        }
        System.out.println(count);
        
    }
    public static void main(String[] args) {
        pairs();
    }
}
