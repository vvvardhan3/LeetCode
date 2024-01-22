package NeetCode;

public class optimizedtrapingRainWater {
    public static void water(){
        int[] height = {4,2,0,3,2,5};
        int[] lb = new int[height.length];
        int[] rb = new int[height.length];
        int result = 0;

        lb[0] = height[0]; 
        for ( int i = 1; i < rb.length  - 1; i++) {
            lb[i] = Math.max(height[i], lb[i-1]);  
        }

        rb[height .length-1] = height[height.length-1]; 
        for ( int i = height.length-2 ; i >=0; i--) {
            rb[i] = Math.max(height[i], rb[i+1]); 
        }

        for (int i = 1; i < height.length-1; i++) {
            int temp = Math.min(lb[i], rb[i]) - height[i];
            result = result + temp;
        }
        System.out.println(result);


    }
    public static void main(String[] args) {
        water();
    }
}
