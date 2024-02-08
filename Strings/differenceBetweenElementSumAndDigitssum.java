package Strings;

public class differenceBetweenElementSumAndDigitssum {
    public static void difference(){
        int[] nums = {1,2,3,4};
        int elementSum = 0;
        int digitSum = 0;
        for (int i : nums) {
            elementSum = elementSum + i;
            while (i > 0) {
                int temp = i % 10;
                digitSum += temp;
                i = i / 10;
            }
        }

        System.out.println( elementSum - digitSum);

        
        

    }
    public static void main(String[] args) {
        difference();
    }
}
