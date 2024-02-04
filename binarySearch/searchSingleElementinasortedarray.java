package binarySearch;

public class searchSingleElementinasortedarray {
    public static void search(){
        int[] nums  = {1,1,3,5,5};
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            
            temp = temp ^ nums[i];
        }
        System.out.println(temp);
    }
    public static void main(String[] args) {
        search();
    }
}
