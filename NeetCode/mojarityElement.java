package NeetCode;

public class mojarityElement {
    public static void element(){
        int[] nums = {3,3,4};
        int count = 0;
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                count = 1;
                num = nums[i];
            }  else if (num == nums[i]) {
                count ++;
            } else {
                count--;
            }
        }

        int count1 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == num) {
                count1++;
            }
        }

        if (count1 > nums.length/2) {
            System.out.println(num);
        }



    }
    
    
    public static void main(String[] args) {
        element();
    }
}
