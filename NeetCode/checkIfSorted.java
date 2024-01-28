package NeetCode;

public class checkIfSorted {
    public static boolean sorted(){
        int nums[] ={1,1,1,1};
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[(i+1)%n] < nums[i]) {
                count++;
            } 
            if (count > 1) {
                return false;
            }
        } return true;
    }
    public static void main(String[] args) {
        System.out.println("Is sorted:? " + sorted());
    }
}
