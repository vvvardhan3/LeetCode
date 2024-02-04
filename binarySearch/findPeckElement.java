package binarySearch;

public class findPeckElement {
    public static int peck(){
        int nums[] = {1,2,3,1};
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if ((i == 0 || nums[i-1] < nums[i])
                    && (i == n - 1 || nums[i] > nums[i+1])) {
                        
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(peck());
    }
}
