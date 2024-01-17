package NeetCode;

public class New_productOfArrayExceptSelf {
    public static void product(){
        int[] nums = {1,2,3,4};
        int length = nums.length;
        int[] output = new int[length];

        // Calculate left products
        int leftProduct = 1;
        for (int i = 0; i < length; i++) {
            output[i] = leftProduct;
            leftProduct *= nums[i];
            
        }

        System.out.println(" ");

        // Calculate right products and combine with left products
        int rightProduct = 1;
        for (int i = length - 1; i >= 0; i--) {
            output[i] *= rightProduct;
            rightProduct *= nums[i];
            System.out.println(output[i]);
        }

        
    }
    public static void main(String[] args) {
        product();
    }
}
