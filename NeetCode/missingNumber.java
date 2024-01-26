package NeetCode;

public class missingNumber {
    public static void number(){
        int[] nums = {0,1};
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        } 
        int n = nums.length;
        int totalSum = n*(n+1)/2;
        
        int missingNumber = totalSum - sum;

        System.out.println("Missing Number is: " + missingNumber);


        
    }
    public static void main(String[] args) {
        number();
    }
}
