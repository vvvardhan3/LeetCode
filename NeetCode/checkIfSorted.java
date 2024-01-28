package NeetCode;

public class checkIfSorted {
    public static boolean sorted(){
        int nums[] ={5,1,2,3,4};
        int n = nums.length;
        int count = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] > nums[i]) {
                count++;
            }
        } 
        if (nums[n-1] > nums[0]) {
            count++;
        }

        if (count <= 1) {
            return true;
        }
        
        return false;

    }
    public static void main(String[] args) {
        System.out.println("Is sorted:? " + sorted());
        // sorted();
    }
}
