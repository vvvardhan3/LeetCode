package NeetCode;

public class containerWithMostWater {
    public static void container(){
        int[] height = {1,8,6,2,5,4,8,3,7};
        int area = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                area = Math.max(area, Math.min(height[i], height[j])*(j-i));
            } 
        } System.out.println(area);
        
        // int l = 0;
        // int r = height.length-1;
        // int area = 0;
        
        // while(l<r){
        //     area = Math.max(area, Math.min(height[l], height[r])*(r-l));
        //     if (height[l] < height[r]) {
        //         l +=1;
        //     } else {
        //         r -=1;
        //     } 
        // } System.out.println(area);


    }
    public static void main(String[] args) {
        container();
    }
}
