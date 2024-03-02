//
package binarySearch;

import java.util.HashMap;

public class kWeakestRowsInAMatrix {
    public static void matrix() {
        int[][] mat = { { 1, 1, 0, 0, 0 }, { 1, 1, 1, 1, 0 }, { 1, 0, 0, 0, 0 }, { 1, 1, 0, 0, 0 }, { 1, 1, 1, 1, 1 } };
        int k = 3;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] == 1) {
                    count++;
                }
            }
            map.put(i, count);
        }
        System.out.println(map);


    }

    public static void main(String[] args) {
        matrix();
    }
}
