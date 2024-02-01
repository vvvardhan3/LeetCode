package NeetCode;

public class sortZerosOnesTwos {
    public static void sort(){
        int[] nums = {2,0,2,1,1,0};
        int count = 0;
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count++;
            }
            if (nums[i] == 1) {
                count1++;
            }
            if (nums[i] == 2) {
                count2++;
            }
        }

        for (int i = 0; i < count; i++) {
            nums[i] = 0;
        }

        for (int i = count; i < count + count1; i++) {
            nums[i] = 1;
        }
        for (int i = count + count1; i < count + count1 + count2; i++) {
            nums[i] = 2;
        }

        for (int i :nums) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        sort();
    }
}

