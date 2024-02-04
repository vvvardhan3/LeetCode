package binarySearch;

public class searchInRotatedSortedArray {
    public static void search(){
        int nums[] = {4,5,6,7,0,1,2};
        int target = 8;
        int count = -1;
        for(int i = 0; i< nums.length; i++){
            if(nums[i] == target){
                count = i;
            } 
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        search();
    }
}
