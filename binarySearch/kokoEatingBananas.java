package binarySearch;

public class kokoEatingBananas {
    public static int bananas(){
        // int n = 4;
        int nums[] = {7, 15, 6, 3};
        int h = 8;
        int maxi = 0;
        int min = 1;
        
        for (int i = 0; i < nums.length; i++) {
            maxi = Math.max(maxi, nums[i]);
        }
        
        for (int i = min; i < maxi; i++) {
            int reqTime = totalhour(nums,h);
            if (reqTime <= h) {
                return i;
            }
        }
        return maxi;
        
    }
    public static int totalhour(int[] nums,int h){
        int totalH = 0;
        for (int i = 0; i < nums.length; i++) {
            totalH += Math.ceil((double)(nums[i])/(double)(h));
        }
        return totalH;
    }
    public static void main(String[] args) {
        System.out.println(bananas());
    }
}
