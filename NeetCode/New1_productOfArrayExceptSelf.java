// Product of array except self using division
package NeetCode;

public class New1_productOfArrayExceptSelf {
    public static void product(){
        int[] nums = {-1,1,0,-3,3};

        int product = 1;
        int result;
        for (int i = 0; i < nums.length; i++) {
            product = nums[i] * product;
            //result = product / nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            result = product / nums[i];
            System.out.println(result);
        }
    }
    public static void main(String[] args) {
        product();
    }
}
