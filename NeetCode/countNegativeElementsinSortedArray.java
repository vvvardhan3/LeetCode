package NeetCode;
public class countNegativeElementsinSortedArray {
    public static void negatives(){
        int[][] nums = {{-5,-5,-5},{-5,-5,-5}};
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if (nums[i][j] < 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        negatives();
    }
}
