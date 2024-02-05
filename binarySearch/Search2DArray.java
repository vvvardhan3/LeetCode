package binarySearch;

public class Search2DArray {
    public static boolean search() {
        int[][] matrix = {{1, 3}};
        int target = 3;
        int n = matrix.length; 
        
        for (int i = 0; i < n; i++) {
            int m = matrix[i].length; 
            for (int j = 0; j < m; j++) { 
                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        System.out.println(search());
    }
}
