package binarySearch;

public class minimuminRotatedSortedArray {
    public static void minimum(){
        int nums[] = {3,4,5,1,2};
        int temp = nums[0];
        for (int i = 0; i < nums.length-1; i++) {
            if (temp > nums[i]) {
                temp = nums[i];
            }
        } System.out.println(temp);
    }
    public static void main(String[] args) {
        minimum();
    }
}
