package NeetCode;

public class trapingRainWater {
    public static void water(){
        int[] height = {4,2,0,3,2,5};
        
        int result = 0;
        for (int i = 1; i < height.length - 1; i++) {
            int lb = height[i];
            for (int j = 0; j < i ; j++) {
                if (height[j]>lb) {
                    lb = height[j];
                }
            }
            int rb = height[i];
            for (int j = i + 1; j < height.length ; j++) {
                if (height[j]>rb) {
                    rb = height[j];
                }
            }

            int wl = 0;
            if (rb>lb) {
                wl = lb;
            } else {
                wl = rb;
            }
            int tw = wl-height[i];
            result = result + tw;
            
        } System.out.println(result);
        
    }
    public static void main(String[] args) {
        water();
    }
}
