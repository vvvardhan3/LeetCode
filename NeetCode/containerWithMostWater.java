package NeetCode;

public class containerWithMostWater {
    public static int container(){
        int[] height = {1,1};
        int area = 0;
        

        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int temp_area = i * height[j];
                area = Math.max(area, temp_area);
            }
        } 
        return area;
    }
    public static void main(String[] args) {
        container();
    }
}
